package com.cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		ArrayList<Integer> ans=new ArrayList<Integer>();
		System.out.println("Input 1:");
		for(int i=0;i<5;i++)
			al1.add(sc.nextInt());
		System.out.println("Input 2:");
		for(int j=0;j<5;j++)
			al2.add(sc.nextInt());
		ans=Main1.answer(al1,al2);
		//System.out.println(ans);
		for(int k=0;k<3;k++)
			System.out.println(ans.get(k));
	}
}
class Main1 {
	public static ArrayList<Integer> answer (ArrayList<Integer> al1, ArrayList<Integer> al2)
	{
		System.out.println("Merged array list: "+al1.addAll(al2));
		Collections.sort(al1);
		System.out.println("Sorted  array list: "+ al1);
		ArrayList<Integer> ans=new ArrayList<Integer>();
		ans.add(al1.get(2));
		ans.add(al1.get(6));
		ans.add(al1.get(8));
		return ans;
	}
}