package com.assignment33;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args) 
	{
		String sentence = null;
		try(FileReader fr = new FileReader("E:\\ADAPT\\BULT-20Sept\\src\\com\\assignment33\\teams.txt");
				BufferedReader br = new BufferedReader(fr)){
			if(br.ready()) {
				sentence = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of words");
		int n = sc.nextInt();
		System.out.println("Enter the strings to be searched");
		String[] words = new String[n];
		for(int i = 0; i < n; i++) {
			words[i] = sc.next();
		}
		System.out.println("\nGiven string is " + sentence);
		for(String word : words) {
			int count = countFrequency(word, sentence);
			System.out.println("\nWord: " + word + " Count: " + count);
		}
		sc.close();
	}
	public static int countFrequency(String word, String sentence) {
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1) {
			lastIndex = sentence.indexOf(word, lastIndex);
			if(lastIndex != -1) {
				count++;
				lastIndex = lastIndex + word.length();
			}
		}
		return count;
	}
}
