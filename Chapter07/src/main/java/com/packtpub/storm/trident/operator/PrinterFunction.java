package com.packtpub.storm.trident.operator;

import java.util.ArrayList;
import java.util.List;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;

import com.esotericsoftware.minlog.Log;
import com.packtpub.storm.model.FixMessageDto;

public class PrinterFunction extends BaseFunction {

	private static final long serialVersionUID = 1L;

	@Override
	public void execute(TridentTuple tuple, TridentCollector collector) {
		FixMessageDto message = (FixMessageDto) tuple.getValue(0);
		Log.error("MESSAGE RECEIVED [" + message + "]");
		List<Object> values = new ArrayList<>();
		values.add(message);
		collector.emit(values);
	}

}
