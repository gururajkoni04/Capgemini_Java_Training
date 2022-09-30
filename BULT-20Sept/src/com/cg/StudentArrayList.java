package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentArrayList {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("sunil-56-88-23");
		al1.add("bindul-88-70-10");
		al1.add("john-70-49-65");
		System.out.println(al1);
		int a,b,c;
		String current = null,grade = null;
		System.out.println(al1.get(0));
		for (int i = 0; i < al1.size(); i++) {
			 current = al1.get(i);
			 grade = current.split("-")[0].substring(0);
		}
		System.out.println(current+"\n"+grade);
	}
}
