package Gradebook;

public class FinalExam extends GradedActivity
{
	private int numQuestions, numMissed;
	private double pointsEach;
	
	public FinalExam(int questions, int missed)
	{
		double numericScore;
		numQuestions = questions;
		numMissed = missed;
	
		 
		pointsEach = 100.0 / numQuestions;
		numericScore = 100.0 - (missed*pointsEach);
		
		setScore(numericScore);
	}
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	public double getNumMissed()
	{
		return numMissed;
	}

}
