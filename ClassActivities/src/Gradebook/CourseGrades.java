package Gradebook;

public class CourseGrades implements Analyzable
{
	
	/*
	 * Fields
	 */
	
	//array of GradedActivity objects
	//grades[0] references a lab activity
	//grades[1] references a Pass or fail exam
	//grades[2] references an Essay
	//grades[3] references a final exam
	//demonstrating polymorphism
	
	public GradedActivity[] grades = new GradedActivity[4];

	 
	/*
	 * Methods
	 */
	public void setLab(GradedActivity g)
	{
		grades[0] = g;
	}
	public void setPassFailExam(PassFailExam pfe)
	{
		grades[1] = pfe;
	}
	public void setEssay(Essay e)
	{
		grades[2] = e;
	}
	public void setFinalExam(FinalExam fe)
	{
		grades[3] = fe;
	}
	public String toString()
	{
		String str;
		str = 	"Lab Activity: \t" + grades[0].getScore() + " " + grades[0].getGrade()
				+"\nPass Fail Exam: " + grades[1].getScore() + " " + grades[1].getGrade() 
				+"\nEssay: \t\t" + grades[2].getScore() +" " + grades[2].getGrade()
				+"\nFinal Exam: \t" + grades[3].getScore() + " " + grades[3].getGrade()
				+"\nHighest Grade: \n" + getHighest().getScore()
				+"\nLowest Grade: \n" + getLowest().getScore()
				+"\nAverage Grade: \n" + getAverage();
		return str;
	}
	
	
	@Override
	public double getAverage() 
	{
		double average = 0;
		for(int i = 0; i < grades.length; i++)
			average += grades[i].getScore();
		
		average /= grades.length;
		return average;
	}
	//Override Analyzable Interface
	public GradedActivity getHighest() 
	{
		int index = 0;//initialize highest
		double highest = grades[0].getScore();
		for(int i = 1; i < grades.length; i++)
		{
			if(grades[i].getScore() > highest)
			{
				highest = grades[i].getScore();
				index = i;
			}
		}
		return grades[index];
	}
	
	
	//Override Analyzable Interface
	public GradedActivity getLowest() 
	{
		int index = 0;
		double lowest = grades[index].getScore(); //initialize highest 
		for(int i = 1; i < grades.length; i++)
		{
			if(grades[i].getScore() < lowest)
			{
				lowest = grades[i].getScore();
				index = i;
			}
		}
		return grades[index];
	}

}
