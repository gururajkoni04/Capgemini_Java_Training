package com.assignment31;

import java.util.ArrayList;

public class MatchDetails {
	private String teamOne;
	private String teamTwo;
	private String venue;
	private String matchDate;

	public void setTeamone(String teamOne)
	{
		this.teamOne=teamOne;
	}
	public void setTeamtwo(String teamTwo)
	{
		this.teamTwo=teamTwo;
	}
	public void setVenue(String venue)
	{
		this.venue=venue;
	}
	public void setMatchdate(String matchDate)
	{
		this.matchDate=matchDate;
	}
	public String getTeamone()
	{
		return teamOne;
	}
	public String getTeamtwo()
	{
		return teamTwo;
	}
	public String getVenue()
	{
		return venue;
	}
	public String getMatchdate()
	{
		return matchDate;
	}

	public void displayMatch(ArrayList<String> team1,ArrayList<String> team2,ArrayList<String> ven,ArrayList<String> mdate)
	{
		System.out.println("The Match Details are :");
		int n= team1.size();
		for(int i=0;i<n;i++)
		{
			int x= i+1;
			System.out.println("Match"+" "+ x);
			System.out.println("Teamone: "+ " "+team1.get(i));
			System.out.println("Teamtwo: "+ " "+team2.get(i));
			System.out.println("Venue: "+ " "+ven.get(i));
			System.out.println("MatchDate: "+ " "+mdate.get(i));
		}
	}

}