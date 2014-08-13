package com.packtpub.storm.trident.state;

import java.util.Map;

import storm.trident.state.State;
import storm.trident.state.StateFactory;
import backtype.storm.task.IMetricsContext;

@SuppressWarnings("rawtypes")
public class OutbreakTrendFactory implements StateFactory {

	private static final long serialVersionUID = 1L;

	@Override
	public State makeState(Map conf, IMetricsContext metrics, int partitionIndex, int numPartitions) {
		return new OutbreakTrendState(new OutbreakTrendBackingMap());
	}

}
