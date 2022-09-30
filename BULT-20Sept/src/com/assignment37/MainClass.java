package com.assignment37;

import java.util.Scanner;

public class MainClass 
{ 
	public static void main(String[] args)
	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Match :"); 
		String match1 = sc.next(); 
		System.out.println("Enter the Scores :"); 
		String scores1= sc.next(); 
		SortScore thread1 = new SortScore(match1, scores1); thread1.start(); 
		try { 
			thread1.join(); 
		}  
		catch (InterruptedException e) { 
			System.out.println(e); 
		} 
		System.out.println("Enter the Match :"); 
		String match2 = sc.next(); 
		System.out.println("Enter the Scores :"); 
		String scores2= sc.next(); 
		SortScore thread2 = new SortScore(match2, scores2);
		thread2.start(); 
		try { 
			thread2.join(); 
		}  
		catch (InterruptedException e) { 
			System.out.println(e); 
		} 
		System.out.println("Enter the Match :"); 
		String match3 = sc.next(); 
		System.out.println("Enter the Scores :"); 
		String scores3= sc.next(); 
		SortScore thread3 = new SortScore(match3, scores3); thread3.start(); 
		try { 
			thread3.join(); 
		}  
		catch (InterruptedException e) { 
			System.out.println(e); 
		} 
		System.out.println("\nOrdered Score List"); 
		thread1.getScores(); 
		thread2.getScores(); 
		thread3.getScores(); 
		sc.close(); 
	} 
}
