package GradeDemo;
import Gradebook.*;
public class GradeDemo 
{

	public static void main(String[] args)
	{
		CourseGrades cg = new CourseGrades();
		//create lab activity
		GradedActivity labActivity = new GradedActivity();
		labActivity.setScore(80);
		cg.setLab(labActivity);
		//create pass fail exam
		PassFailExam passFailExam = new PassFailExam(50,6,70);
		cg.setPassFailExam(passFailExam);
		//create essay exam
		Essay essay = new Essay(25,20,20,29);
		cg.setEssay(essay);
		//create final ex
		FinalExam finalEx = new FinalExam(100,10);
		cg.setFinalExam(finalEx);
		
		System.out.println(cg);
		
	
		
	}
}
