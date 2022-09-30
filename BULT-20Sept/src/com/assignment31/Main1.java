package com.assignment31;

import java.io.FileReader;
import java.util.*;
import java.io.*;
class Main1
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("E:\\\\ADAPT\\\\BULT-20Sept\\\\src\\\\com\\\\assignment31\\\\matches.txt");

		BufferedReader br = new BufferedReader(new FileReader(file)); //Reading the file

		List<String> lines1 = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) 
		{
			lines1.add(line);
		}
		br.close();
		String[] lines= lines1.toArray(new String[] {}); //To convert the list to array of string to store the information of Match
		ArrayList<String> team1 = new ArrayList<String>(); //Creating different list for storing the information of the team and venue and Matchdate
		ArrayList<String> team2 = new ArrayList<String>();
		ArrayList<String> ven = new ArrayList<String>();
		ArrayList<String> mdate = new ArrayList<String>();
		for(int k=0;k<lines.length;k++)
		{
			String[] word = lines[k].split("\\s");
			for(int j=0;j<word.length;j++)
			{
				MatchDetails m = new MatchDetails();
				m.setTeamone(word[j]);
				m.setTeamtwo(word[j+1]);
				m.setVenue(word[j+2]);
				m.setMatchdate(word[j+3]);
				String s= m.getTeamone();
				String s1=m.getTeamtwo();
				String s2= m.getVenue();
				String s3= m.getMatchdate();
				team1.add(s);
				team2.add(s1);
				ven.add(s2);
				mdate.add(s3);
				m=null;
				j=word.length;
			}
		}
		MatchDetails fin = new MatchDetails();
		fin.displayMatch(team1,team2,ven,mdate); //Passing the details to display method
	}
}