package com.sppl.training.startegy;

public class SearchEngine {
	private SortStrategy strategy;
	
	public SearchEngine(SortStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void search() {
		System.out.println("searching");
		strategy.sort();
	}
}
