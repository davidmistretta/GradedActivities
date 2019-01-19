package Gradebook;

public class LabActivity extends GradedActivity
{
	private double score;
	
	public LabActivity(double s)
	{
		score = s;
	}
	
	public double getScore()
	{
		return score;
	}
}
