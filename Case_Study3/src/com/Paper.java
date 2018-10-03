package com;

public class Paper {

	public String Submit() {
		
		Evaluator evaluator = Evaluator.getEvaluator();
		
		String s = evaluator.evaluate(this);
		return s;
	}
	
	
}
