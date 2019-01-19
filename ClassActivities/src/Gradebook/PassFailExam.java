package Gradebook;

public class PassFailExam extends PassFailActivity
{
	private int numQuestions, numMissed;
	private double pointsEach;
	
	/**
	 * The constructor accepts as args the num of questions
	 * on the exam, the num of questions the student missed,
	 * and the minimum passing score.
	 * 
	 */
	public PassFailExam(int questions, int missed, double minPassing)
	{
		// Call the Superclass constructor
		super(minPassing);
		
		// Local value for numeric score
		double numericScore;
		
		numQuestions = questions;
		numMissed = missed;
		
		// Calculate the points for each question and
		// the numeric score for this exam
		pointsEach = 100.00/numQuestions;
		numericScore = 100.00 - (pointsEach * numMissed);
		
		//Call the superclass setScore method to set the numeric score
		setScore(numericScore);
	}
	
	/**
	 * Getters and setters
	 */
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	public double getNumMissed()
	{
		return numMissed;
	}
}
