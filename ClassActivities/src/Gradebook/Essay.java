package Gradebook;

public class Essay extends GradedActivity
{
	final static int GRAMMAR = 30,
					SPELLING = 20,
					CORRECT_LENGTH = 20,
					CONTENT = 30;
	
	private double m_grammar, m_spelling, m_correctLength, m_content, score;
	
	public Essay(double grammar, double spelling, double cor_length, double content)
	{
		m_grammar = grammar;
		m_spelling = spelling;
		m_correctLength = cor_length;
		m_content = content;
		score = m_grammar + m_spelling + m_correctLength + m_content;
		setScore(score); //calls graded activities setScore method
	}
	

	
	public String toString()
	{
		String str;
		
		str = "Grammar: " + m_grammar
				+"\nSpelling: " + m_spelling
				+"\nCorrect Length: " + m_correctLength
				+"\nContent: " + m_content
				+"\nScore: " + score;
		return str;
	}
}
