package com.cg;


import java.util.Scanner;

public class Permutation
{        
	static void cyclicPermutation(int arr[],int na)   
	{   
		int res=0;
	    for(int i=0;i<na;i++) {
	         res=res*10+arr[i];
	    }
		int num = res;   
		int n = na;  
		
		while (true)   
		{   
			System.out.println(num);   
			int remainder = num % 10;   
			int dev = num / 10;   
			num = (int)((Math.pow(10, n - 1)) * remainder + dev);   
			if (num == res)   
				break;   
		}   
	}   

	public static void main (String args[])   
	{   
		Scanner sc=new Scanner(System.in);  
		int na;
		System.out.print("Total number N =");
		na=sc.nextInt();
		int arr[]=new int[na];
		for(int i=0;i<na;i++) {
			System.out.print("Number #"+i+": ");
			arr[i]=sc.nextInt();	
		}
		System.out.print("The permutations of (");
		for(int i=0;i<na;i++)
			System.out.print(arr[i]+",");	
		System.out.println(") are: "+na*2);
		cyclicPermutation(arr,na);
		int rev[]=new int[na];
		for(int i=na-1;i>=0;i--)
	         rev[i]=arr[i];
		cyclicPermutation(rev,na);
	}   
}   