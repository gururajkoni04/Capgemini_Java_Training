package com.assignment17;


import java.util.Scanner;

/**
 * Assignment 17
 *
 */
public class TeamAndMatchDetail {

	public static void main(String[] args) {

		// --------------------------------------------------------------
		// Creating Player2 array with user input (ie using Player2BO's
		// createPlayer2 method )
		Scanner scan = new Scanner(System.in).useDelimiter(System.lineSeparator());
		System.out.println("Enter the Player2 count ");
		int Player2Count = scan.nextInt();

		Player2[] Player2 = new Player2[Player2Count];
		Player2BO2 Player2BO = new Player2BO2();

		for (int i = 0; i < Player2.length; i++) {

			System.out.println("Enter Player2 " + (i + 1) + " details ");
			String Player2Details = scan.next();

			Player2[i] = Player2BO.createPlayer2(Player2Details);
		}

		// --------------------------------------------------------------
		// Creating team array with user input (ie using TeamBO's createTeam
		// method )
		System.out.println("Enter the team count ");
		int teamCount = scan.nextInt();

		Team[] team = new Team[teamCount];
		TeamBO teamBO = new TeamBO();
		for (int i = 0; i < team.length; i++) {
			System.out.println("Enter team " + (i + 1) + " details ");
			String teamDetails = scan.next();

			team[i] = teamBO.createTeam(teamDetails, Player2);
		}

		// --------------------------------------------------------------
		// Creating match array with user input (ie using MatchBO's createMatch
		// method )
		System.out.println("Enter the match count ");
		int matchCount = scan.nextInt();

		Match[] match = new Match[matchCount];
		MatchBO matchBO = new MatchBO();

		for (int i = 0; i < match.length; i++) {
			System.out.println("Enter match " + (i + 1) + "details ");
			String matchDetails = scan.next();

			match[i] = matchBO.createMatch(matchDetails, team);
		}

		// --------------------------------------------------------------
		// creating menu :
		// Using match array to find specific a team based on user input (ie
		// using MatchBO's findTeam method )
		// Using match array to find all matches specific to a team based on
		// user input (ie using MatchBO's findTeam method )
		boolean menuContinue = true;
		while (menuContinue) {

			System.out.println("Menu : ");

			System.out.println("1) Find Team");
			System.out.println("2) Find All Matches In A Specific Venue");
			System.out.println("Type 1 or 2");
			System.out.println("Enter your choice");
			int menuChoice = scan.nextInt();

			System.out.println("Enter Match date ");
			String matchDate = scan.next();

			if (menuChoice == 1) {

				System.out.println("Team: ");
				
				//since findTeam returns a Team object you have to use the overrided toString() to print the object details
				System.out.println(matchBO.findTeam(matchDate, match).toString()); 

			}

			else {
				System.out.println("Match Details: ");
				System.out.println("Enter Team Name ");
				System.out.println("Date	TeamOne		TeamTwo		Venue");
				String teamName = scan.next();

				matchBO.findAllMatchesOfTeam(teamName, match);
			}

			System.out.println("Do you want to continue? Type Yes or No");
			String continueChoice = scan.next();

			if (continueChoice == "No") {

				menuContinue = false;
			} 
			
		}

	}

}

class Player2 {
	private String name;
	private String country;
	private String skill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Player2(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

}

class Player2BO2 {

	// In this method, construct a Player2 object. Split the comma separated
	// input.
	public Player2 createPlayer2(String data) {

		String[] dataArray = data.split(",");
		String name = dataArray[0];
		String country = dataArray[1];
		String skill = dataArray[2];

		Player2 Player2 = new Player2(name, country, skill);
		return Player2;

	}

}

class Team {
	private String name;
	private Player2 Player2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player2 getPlayer2() {
		return Player2;
	}

	public void setPlayer2(Player2 Player2) {
		this.Player2 = Player2;
	}

	public Team(String name, Player2 Player2) {
		super();
		this.name = name;
		this.Player2 = Player2;
	}

}

class TeamBO {
	/*
	 * In this method, parse the string data using Split method defined in the
	 * string class and and construct a team object. Iterate through the
	 * Player2List and get the Player2 object reference.
	 */
	public Team createTeam(String data, Player2[] Player2List) {
		String[] dataArray = data.split(",");
		String name = dataArray[0];

		for (Player2 p : Player2List) {

			if (p.getName().equals(dataArray[1])) {

				Team team = new Team(name, p);

				return team;

			}

		}

		System.out.println("Team not found");
		return null;
	}
}

class Match {

	String date;
	Team teamone;
	Team teamtwo;
	String venue;
	Team team;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Team getTeamone() {
		return teamone;
	}

	// Override the ToString() method to display the match details in the format
	// specified in the output.
	// Use this format String.format("%-15s %-15s %-15s %s", to display match
	// details);

	@Override
	public String toString() {

		return String.format("%-15s %-15s %-15s %s", date, teamone.toString(), teamtwo.toString(), venue,
				team.toString());
	}

	public void setTeamone(Team teamone) {
		this.teamone = teamone;
	}

	public Team getTeamtwo() {
		return teamtwo;
	}

	public void setTeamtwo(Team teamtwo) {
		this.teamtwo = teamtwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Match(String date, Team teamone, Team teamtwo, String venue) {
		this.date = date;
		this.teamone = teamone;
		this.teamtwo = teamtwo;
		this.venue = venue;
	}

}

class MatchBO {

	/*
	 * In this method, parse the string data using Split method defined in the
	 * string class and and construct a Match object. Iterate through the
	 * teamList and get the team object reference.
	 * 
	 * 
	 * For assignment 17 there's a typo in the Match class. You don't need to
	 * have a 'Team team' object and in� MatchBO method createMatch you don't
	 * need to create a Team team!!!�
	 * 
	 * 
	 */

	public Match createMatch(String data, Team[] teamList) {
		String[] dataArray = data.split(",");
		String date = dataArray[0];
		String venue = dataArray[3];
		Team teamone = null;
		Team teamtwo = null;

		for (Team t : teamList) {

			if (t.getName().equals(dataArray[1])) {

				teamone = t;

			}

			if (t.getName().equals(dataArray[2])) {

				teamtwo = t;
			}

		}

		Match match = new Match(date, teamone, teamtwo, venue);
		return match;

	}

	// In this method, find the Team that plays a particular match
	public Team findTeam(String matchDate, Match[] matchList) {

		for (Match m : matchList) {

			if (m.getDate().equals(matchDate)) {
				return m.getTeam();

			}

		}

		System.out.println("Team not found");
		return null;

	}

	// In this method, display all matches of the given team �teamName�
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {

		for (Match m : matchList) {
			if (m.getTeamone().equals(teamName) || m.getTeamtwo().equals(teamName)) {
				System.out.println(m.getTeam().toString());
			}
		}

	}

}