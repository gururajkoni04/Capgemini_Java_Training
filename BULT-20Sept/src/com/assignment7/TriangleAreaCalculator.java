package com.assignment7;

import java.util.Scanner;
class Point 
{ 
	int x; int y;
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y; 
	} 
}
public class TriangleAreaCalculator {

	public static float area(Point A, Point B, Point C) 
	{
		float area = (A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2.0f; 
		return Math.abs(area);
	}
	public static void main(String[] args) {
		int x1,y1,x2,y2,x3,y3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Point A (x, y):");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.print("Point B (x, y):");
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.print("Point C (x, y):");
		x3=sc.nextInt();
		y3=sc.nextInt();
		Point A = new Point(x1,y1);
		Point B = new Point(x2, y2); 
		Point C = new Point(x3, y3); 
		System.out.println("area of triangle  " + (int)TriangleAreaCalculator.area(A, B, C));
		sc.close();
	}
}
