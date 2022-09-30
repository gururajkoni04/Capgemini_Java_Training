package com.assignment37;

import java.util.Arrays; 
public class SortScore extends Thread 
{ 
	private String matchType; 
	private String scoreString; 
	private Integer[] scores; 
	public SortScore(String matchType, String scoreString)
	{
		super(); 
		this.matchType = matchType; 
		this.scoreString = scoreString; 
		this.scores = new Integer[5]; 
		String[] temp = this.scoreString.split(","); 
		for(int i = 0; i < 5; i++)
		{ 
			this.scores[i] = Integer.parseInt(temp[i]); 
		} 
	} 
	public void run() 
	{ 
		Arrays.sort(this.scores); 
	}
	public void getScores() 
	{ 
		System.out.println("Match : " + this.matchType); 
		for(Integer score : this.scores) 
		{ 
			System.out.println(score); 
		} 
	} 
} 