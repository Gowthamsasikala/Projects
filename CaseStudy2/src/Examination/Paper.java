package Examination;

public class Paper {

	public String submit(){
		Evaluator eva = Evaluator.getEvaluator();
		
		String as = eva.evaluate(this);
		
		return as;
	}
	
	
}
