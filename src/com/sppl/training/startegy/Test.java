package com.sppl.training.startegy;

public class Test {
	public static void main(String[] args) {
		SortStrategy strategy = new BubbleSort();
		SearchEngine engine =  new SearchEngine(strategy);
		engine.search();
	}
}
