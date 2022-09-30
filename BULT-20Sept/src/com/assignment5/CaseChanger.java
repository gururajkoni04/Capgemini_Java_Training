package com.assignment5;


import java.util.*;
public class CaseChanger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String s = sc.nextLine();
		System.out.println(AllUpper(s));
		System.out.println(Alllower(s));
		System.out.println(CapitalLetter(s));
		System.out.println(SentenceCase(s));
		System.out.println(InvertCase(s));
		sc.close();
	}
	public static String AllUpper(String s) {
		return s.toUpperCase();
	}
	public static String Alllower(String s) {
		return s.toLowerCase();
	}

	public static String CapitalLetter(String s) {
		char[] charArr = s.toCharArray();
		boolean foundSpace = true;
		for(int i=0; i<charArr.length; i++) {
			if (Character.isLetter(charArr[i])) 
			{
				if (foundSpace) 
				{
					charArr[i] = Character.toUpperCase(charArr[i]);
					foundSpace = false;
				}
			}
			else {
				foundSpace = true;
			}
		}
		s = String.valueOf(charArr);
		return s;
	}

	public static String SentenceCase(String s) {
		String first = s.substring(0,1);
		String remaining = s.substring(1, s.length());
		String firstSentenceString=first.toUpperCase();
		char[] charArr = remaining.toCharArray();

		for(int i=0;i<charArr.length;i++)
		{
			if(charArr[i]=='.')
			{
				charArr[i+2] = Character.toUpperCase(charArr[i+2]);
			}
		}
		String remainingString=String.valueOf(charArr);
		s=firstSentenceString+remainingString;
		return s;
	}

	public static String InvertCase(String s) {
		StringBuffer newStr = new StringBuffer(s);
		for (int i = 0; i < s.length(); i++) {

			if(Character.isLowerCase(s.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		return newStr.toString();
	}
}

