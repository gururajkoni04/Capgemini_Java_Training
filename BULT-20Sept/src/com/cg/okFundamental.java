package com.cg;

import java.util.Scanner;

public class okFundamental {

	
	Scanner sc=new Scanner(System.in);
	public void hello() {
		System.out.println("\"Hello\"");
	}
	
	public void greaterThan() {
		int a = 0,b = 0;
		System.out.println("Enter 2 Numbers (greaterThan()):");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b)
			System.out.println(a+" > "+b);
		else
			System.out.println(a+" < "+b);
	}
	
	public void primeNo() {
		int a;
		System.out.println("Enter a Number (primeNo()):");
		a=sc.nextInt();
		int i,m=0,flag=0;      
		int n=a; 
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=m;i++){      
			    if(n%i==0){      
			    	System.out.println(n+" is not prime number");      
			    	flag=1;      
			    	break;      
			    }      
			}      
			if(flag==0)  
				System.out.println(n+" is prime number");	 
		} 
	}  
	
	public void armstrongNo() {
		int i=100,arm;
		System.out.println("Armstrong numbers between 100 to 999 (armstrongNo())");
		while(i<1000)
		{
			arm=i;
			int num=arm;
			int x,a=0;
			while(num!=0)
			{
				x=num%10;
				a=a+(x*x*x);
				num/=10 ;
			}
			i=a;
			if(arm==i)
				System.out.println(i);
			i++;
		}
	}
	
	public void factNo(){  
		int i;
		double fact=1.0;  
		int number;
		System.out.println("Enter a Number (factNo()):");
		number=sc.nextInt();
		for(i=1;i<=number;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+number+" is: "+fact);    
	} 
	
	public void fibonacciNo()  
	{    
		 int n1=0,n2=1,n3,i,count; 
		 System.out.println("Enter a Number (fibonacciNo()):");
		 count=sc.nextInt();
		 System.out.print(n1+" "+n2);  
		 for(i=2;i<count;++i) 
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }  
		 System.out.println();
	}
	
}
	

