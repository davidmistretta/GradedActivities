package Gradebook;

public class PassFailActivity extends GradedActivity
{
	private double minPassingScore;
	
	public PassFailActivity(double minimumPassingScore)
	{
		minPassingScore = minimumPassingScore;
	}
	
	/**
	 * the getGrade method returns a letter grade
	 * determined from the score field. This method
	 * overrides the superclass method
	 */
	public char getGrade()
	{
		char letterGrade;
		
		if(super.getScore() >= minPassingScore)
			letterGrade = 'P';
		else
			letterGrade = 'F';
		
		return letterGrade;
		
	}
}
