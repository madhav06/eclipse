package org.tutorial.encapsulation;

public class CricketScorer 
{
	private int score;
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public void four()
	{
		score += 4;
	}
	
	public void six()
	{
		score += 6;
	}
	
	public void one()
	{
		score += 1;
	}
}
