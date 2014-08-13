package com.packtpub.druid.firehose;

import java.util.List;

import com.esotericsoftware.minlog.Log;

public class StormCommitRunnable implements Runnable {

	private List<String> partitionIds = null;

	public StormCommitRunnable(List<String> partitionIds) {
		this.partitionIds = partitionIds;
	}

	@Override
	public void run() {
		try {
			StormFirehose.STATUS.complete(partitionIds);
		} catch (Exception e) {
			Log.error("Could not complete transactions.", e);
		}
	}

}
