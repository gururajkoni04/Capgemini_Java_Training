package com.assignment6;



import java.util.Scanner;

public class FactorialNumber {

	static String answer;
	static String st1[]={"","one","two","three","four","five","six","seven","eight","nine"};
	static String st2[]={"hundred","thousand","lakh","crore"};
	static String st3[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String st4[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

	static int factorial(int num) {
		if(num == 0 || num ==1) {
			return 1;
		}
		else {
			return (num*factorial(num-1));
		}
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = in.nextInt();
		int result = factorial(num);
		System.out.println(num+"! ="+result+ " "+"("+no_to_word(result)+")");

		in.close();
	}
	public static String no_to_word(int n)
	{
		int word;
		int nu=1;
		answer="";
		while(n!=0)
		{
			switch(nu)
			{
			case 1:
				word=n%100;
				pass(word);
				if(n>100&&n%100!=0)
				{
					show("and ");
				}
				n=n/100;
				break;
			case 2:
				word=n%10;
				if(word!=0)
				{
					show(" ");
					show(st2[0]);
					show(" ");
					pass(word);
				}
				n=n/10;
				break;
			case 3:
				word=n%100;
				if(word!=0)
				{
					show(" ");
					show(st2[1]);
					show(" ");
					pass(word);
				}
				n=n/100;
				break;
			case 4:
				word=n%100;
				if(word!=0)
				{
					show(" ");
					show(st2[2]);
					show(" ");
					pass(word);
				}
				n=n/100;
				break;
			case 5:
				word=n%100;
				if(word!=0)
				{
					show(" ");
					show(st2[3]);
					show(" ");
					pass(word);
				}
				n=n/100;
				break;
			}
			nu++;
		}
		return answer;
	}
	public static void pass(int n)
	{
		int word,q;
		if(n<10)
		{
			show(st1[n]);
		}
		if(n>9&&n<20)
		{
			show(st3[n-10]);
		}
		if(n>19)
		{
			word=n%10;
			if(word==0)
			{
				q=n/10;
				show(st4[q-2]);
			}
			else
			{
				q=n/10;
				show(st1[word]);
				show(" ");
				show(st4[q-2]);
			}
		}
	}
	public static void show(String s)
	{
		String st=answer;
		answer=s+st;
	}
}