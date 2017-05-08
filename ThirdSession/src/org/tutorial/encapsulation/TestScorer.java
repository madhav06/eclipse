package org.tutorial.encapsulation;

public class TestScorer
{
	public static void main(String[] args)
	{
		CricketScorer scorer = new CricketScorer();
		int score = scorer.getScore();
		//scorer.setScore(score + 4);
		
		scorer.four();
		System.out.println(scorer.getScore());
		scorer.six();
		System.out.println(scorer.getScore());
		scorer.one();
		System.out.println(scorer.getScore());
		scorer.one();
		System.out.println(scorer.getScore());
		scorer.four();
		
		System.out.println(scorer.getScore()+ " - Total Score" );
	}
}
