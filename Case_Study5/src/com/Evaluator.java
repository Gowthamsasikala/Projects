package com;

public class Evaluator {

	private Evaluator() {
		
		
	}
	
	public static Evaluator getEvaluator() {
		
		return new Evaluator();
	}
	
	
	public String evaluate(Paper paper) {
		
		return "pass";
	}
}
