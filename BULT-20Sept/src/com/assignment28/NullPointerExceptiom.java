package com.assignment28;


import java.util.Scanner;

public class NullPointerExceptiom {
	public static void main(String[] args) {
        String capSkill;
		String dec;
		String capName;
		String capCountry;
		System.out.println("Enter Number of players:");
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		try
		{
			System.out.println("Do you know the details of the captain. Type yes/no:");
			dec=scan.next();
			if(dec.equals("no"))
			{
				throw new NullPointerException();
			}
			else if(dec.equals("yes"))
			{
				System.out.println("Enter Name of the captain:");
				capName=scan.next();
				System.out.println("Enter Country of the captain:");
capCountry=scan.next();
				System.out.println("Enter Skill of the captain:");
				capSkill=scan.next();

				System.out.println("Player Details:");
				Player[] player1=new Player[num];
				for(int i=0;i<num;i++)
				{
					System.out.println("Enter name of player "+(i+1));
					String name1=scan.next();

					System.out.println("Enter country player "+(i+1));
					String country1=scan.next();

					System.out.println("Enter skill of player "+(i+1));
					String skill1=scan.next();
					player1[i]= new Player(name1,country1,skill1);
				}
				System.out.println("Captain Details:");
				System.out.println(capName+" "+capCountry+" "+capSkill);
				System.out.println("Player Details:");
				for(int i=0;i<num;i++)
				{

					System.out.println(player1[i].getName()+" "+player1[i].getCountry()+" "+player1[i].getSkill());

				}
			}
		}
		catch(NullPointerException np)
		{

			System.out.println("Player Details:");

			Player[] p1=new Player[num];
			for(int i=0;i<num;i++)
			{
				System.out.println("Enter name of player "+(i+1));
				String name1=scan.next();

				System.out.println("Enter country of player"+(i+1));
				String country1=scan.next();

				System.out.println("Enter skill of player "+(i+1));
				String skill1=scan.next();

				p1[i]= new Player(name1,country1,skill1);
			}
			System.out.println(np);
			System.out.println("Captains Details not available");
			System.out.println("Player Details:");
			for(int i=0;i<num;i++)
			{

				System.out.println(p1[i].getName()+" "+p1[i].getCountry()+" "+p1[i].getSkill());
			}
		}
	}
}
