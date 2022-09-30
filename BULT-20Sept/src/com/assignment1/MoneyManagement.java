package com.assignment1;

import java.util.Scanner;
public class MoneyManagement {
	int amt;
	int nec,ffa,edu,ltss,play,give;
	public void read()
	{
	System.out.print("Enter your income this month: ");
	Scanner sc=new Scanner(System.in);
	amt=sc.nextInt();
	sc.close();
	}
	public void calculate()
	{
	nec=(55*amt)/100;
	ffa=(10*amt)/100;
	edu=(10*amt)/100;
	ltss=(10*amt)/100;
	play=(10*amt)/100;
	give=(5*amt)/100;
	}
	public void display() {
		calculate();
		System.out.println("NEC: "+nec+"     "+"LTSS: "+ltss);
		System.out.println("FFA: "+ffa+"     "+"PLAY: "+play);
		System.out.println("EDU: "+edu+"     "+"GIVE: "+give);
	}
	public static void main(String[] args) {
		MoneyManagement m=new MoneyManagement();
		m.read();
		m.display();
	}
}