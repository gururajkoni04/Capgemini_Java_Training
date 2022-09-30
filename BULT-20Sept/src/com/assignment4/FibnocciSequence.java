package com.assignment4;

import java.util.Scanner;
public class FibnocciSequence {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {
        	if(counter==0)
        	{
        		System.out.print(num2+" ");
        		counter = counter + 1;
        	}
            int ans= num2 + num1;
            num1 = num2;
            num2 = ans;
            counter = counter + 1;
            if(N>ans && ans>0)
            {
            	System.out.print(ans+ " ");
            }
        }
    }
	public static void main(String[] args) {
		System.out.print("Input :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Fibonacci(a);
		sc.close();
	}
}