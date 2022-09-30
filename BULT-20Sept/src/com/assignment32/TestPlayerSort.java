package com.assignment32;

import java.util.*;
import java.io.*;
class SortingPlayers {
	String capNumber;
	String playerName;
	String skill;
	String country;
	String matchesPlayed;
	public void setCapnumber(String capNumber) {
		this.capNumber = capNumber;
	}
	public void setPlayername(String playerName) {
		this.playerName = playerName;
	}
	public void setSkill(String skill)
	{
		this.skill = skill;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setMatchesplayed(String matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public String getCapnumber() {
		return capNumber;
	}
	public String getPlayername() {
		return playerName;
	}
	public String getSkill() {
		return skill;
	}
	public String getCountry() {
		return country;
	}
	public String getMatchesplayed() {
		return matchesPlayed;
	}
}
public class TestPlayerSort {
	public static void main(String[] args) throws Exception {
		FileReader fread = new FileReader("E:\\ADAPT\\BULT-20Sept\\src\\com\\assignment32\\input.txt");
		BufferedReader bread = new BufferedReader(fread);
		List<String> lines1 = new ArrayList<String>();
		String line = null;
		while ((line = bread.readLine()) != null) {
			lines1.add(line);
		}
		bread.close();
		String[] lines = lines1.toArray(new String[] {});
		ArrayList<String> capnumber = new ArrayList<String>();
		ArrayList<String> playername = new ArrayList<String>();
		ArrayList<String> skill = new ArrayList<String>();
		ArrayList<String> country = new ArrayList<String>();
		ArrayList<String> matchesplayed = new ArrayList<String>();
		for (int k = 0; k < lines.length; k++) {
			String[] word = lines[k].split(",");
			for (int j = 0; j < word.length; j++) {
				SortingPlayers p = new SortingPlayers();
				p.setCapnumber(word[j]);
				p.setPlayername(word[j + 1]);
				p.setSkill(word[j + 2]);
				p.setCountry(word[j + 3]);
				p.setMatchesplayed(word[j + 4]);
				String s = p.getCapnumber();
				String s1 = p.getPlayername();
				String s2 = p.getSkill();
				String s3 = p.getCountry();
				String s4 = p.getMatchesplayed();
				capnumber.add(s);
				playername.add(s1);
				skill.add(s2);
				country.add(s3);
				matchesplayed.add(s4);
				p = null;
				j = word.length;
			}
		}
		try (PrintWriter writer = new PrintWriter("E:\\ADAPT\\BULT-20Sept\\src\\com\\assignment32\\output.csv"))
		{
			StringBuilder sb = new StringBuilder();
			sb.append(capnumber + "," + playername + "," + skill + "," +
					country + "," + matchesplayed);
			sb.append("\n");
			writer.write(sb.toString());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
