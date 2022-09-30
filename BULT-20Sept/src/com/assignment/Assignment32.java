package com.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Assignment32 {
	
	class Player{
		
		int capNumber;
		String playerName,skill,country;
		int mathesPlayed;
		
		public Player(int capNumber, String playerName, String skill, String country, int mathesPlayed) {
			super();
			this.capNumber = capNumber;
			this.playerName = playerName;
			this.skill = skill;
			this.country = country;
			this.mathesPlayed = mathesPlayed;
		}
		
		public int getCapNumber() {
			return capNumber;
		}
		public void setCapNumber(int capNumber) {
			this.capNumber = capNumber;
		}
		public String getPlayerName() {
			return playerName;
		}
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		public String getSkill() {
			return skill;
		}
		public void setSkill(String skill) {
			this.skill = skill;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getMathesPlayed() {
			return mathesPlayed;
		}
		public void setMathesPlayed(int mathesPlayed) {
			this.mathesPlayed = mathesPlayed;
		}
		
	}
	
	class FileUtility{
		List<Player> readFileData(BufferedReader br ){
			List<Player> result = new ArrayList<>();
			String line;
			
			while ((line = br.readLine()) != null) {
			    for (String word : line.split("\\s")) {
			        if (!word.isEmpty())
			           result.add(Player line);
			    }
			}
			return result ;
		};
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileUtility fu=new FileUtility();
		BufferedReader br = new BufferedReader(new FileReader("E:\\ADAPT\\BULT-20Sept\\src\\com\\assignment\\matches.txt"));
		List<Player> playerInfo=fu.readFileData(br);
	}

}
