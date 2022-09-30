package com.assignment10;


import java.util.Scanner;
public class Permutation {
	static int count=0;
	public static void Permutations(int[] array){
		helper(array, 0);
	}

	private static void helper(int[] array, int pos){
		if(pos >= array.length - 1){
			System.out.print("(");
			for(int i = 0; i < array.length - 1; i++){
				System.out.print(array[i] + ", ");
			}
			if(array.length > 0)
				System.out.print(array[array.length - 1]);
			System.out.println(")");
			count=count+1;
			return;
		}

		for(int i = pos; i < array.length; i++){

			int t = array[pos];
			array[pos] = array[i];
			array[i] = t;

			helper(array, pos+1);

			t = array[pos];
			array[pos] = array[i];
			array[i] = t;
		}
	}
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);

		System.out.print("Total number N = ");
		n=sc.nextInt();
		int[] numbers=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Number #"+(i+1)+" : ");
			numbers[i] = sc.nextInt();
		}
		Permutations(numbers);
		System.out.print("The permutations of ( ");
		for(int i=0;i<n;i++)
		{  
			if((i+1)!=n)
				System.out.print(numbers[i]+",");
			else
				System.out.print(numbers[i]+" )");		
		}
		System.out.print(" are : "+count);
		sc.close();
	}
}
