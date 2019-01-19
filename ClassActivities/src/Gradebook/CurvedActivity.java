package Gradebook;

public class CurvedActivity extends GradedActivity
{
	private double rawScore;
	private double percentage;
	
	public CurvedActivity(double percent)
	{
		percentage = percent;
		rawScore = 0.0;
	}
	
	/*
	 * setScore overrides the Superclass setScore method
	 */
	public void setScore(double s)
	{
		rawScore = s;
		super.setScore(rawScore * percentage);
	}
	
	public double getRawScore()
	{
		return rawScore;
	}
	public double getPercentage()
	{
		return percentage;
	}
}
