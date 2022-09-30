package com.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<>();
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("E:\\ADAPT\\BULT-20Sept\\src\\com\\assignment\\matches.txt"));
//			br.readLine();
			String line;
			
			while ((line = br.readLine()) != null) {
			    for (String word : line.split("\\s")) {
			        if (!word.isEmpty())
			           result.add(word);
			    }
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}
		System.out.println(result);
		Match.displayMatch(new Match(result.get(0),result.get(1),result.get(2),result.get(3)),1);
		Match.displayMatch(new Match(result.get(4),result.get(5),result.get(6),result.get(7)),2);
	}

}
class Match {

	String date;
	String teamone;
	String teamtwo;
	String venue;
	
	public Match(String date, String teamone, String teamtwo, String venue) {
		super();
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeamone() {
		return teamone;
	}

	public void setTeamone(String teamone) {
		this.teamone = teamone;
	}

	public String getTeamtwo() {
		return teamtwo;
	}

	public void setTeamtwo(String teamtwo) {
		this.teamtwo = teamtwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	static void displayMatch(Match m,int in) {
		System.out.println("The Match Details are :");
		for(int i=1;i<=in;i++) {
			System.out.println("Match "+i);
			System.out.println("TeamOne: "+m.teamone);
			System.out.println("TeamTwo: "+m.teamtwo);
			System.out.println("Venue: "+m.venue);
			System.out.println("MatchDate: "+m.date);
			
		}
	}

}