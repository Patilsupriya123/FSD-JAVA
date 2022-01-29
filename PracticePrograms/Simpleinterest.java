package PracticePrograms;

import java.util.Scanner;
public class Simpleinterest
{ 
	public static void main(String args[]) 
	{ 
		float principle, rateofinterest, time, simpleinterest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		principle = scan.nextFloat();
		System.out.print("Enter the Rate of interest : ");
		rateofinterest = scan.nextFloat();
		System.out.print("Enter the Time period : ");
		time = scan.nextFloat();
		scan.close();
		
		simpleinterest = (principle * rateofinterest * time) / 100;
		System.out.print("Simple Interest is: " +simpleinterest);
		} 
	}