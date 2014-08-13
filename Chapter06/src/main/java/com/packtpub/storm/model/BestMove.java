package com.packtpub.storm.model;

public class BestMove {

	public Board bestMove;
	public Integer score = Integer.MIN_VALUE;

	@Override
	public String toString() {
		return bestMove.toString() + "[" + score + "]";
	}

}
