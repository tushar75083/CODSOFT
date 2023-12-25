package com.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of subjects");
		int totalSubjects = sc.nextInt();
		
		int totalMarks = 0;
		
		
		
		for(int i=1;i<=totalSubjects;i++)
		{
			System.out.println("Enter marks obtained in subject "+i+" out of 100");
			int marks = sc.nextInt();
			totalMarks = totalMarks+marks;
						
		}
		
		double avgPercentage = (double)totalMarks / totalSubjects;
		
		String grade ;
		
		if(avgPercentage >= 85)
		{
			grade = "O";
		}
		else if(avgPercentage>=70)
		{
			grade = "A";
		}
		else if(avgPercentage>=60)
		{
			grade = "B";
		}
		else if(avgPercentage>=50)
		{
			grade = "C";
		}
		else if(avgPercentage>=40)
		{
			grade = "D";
		}
		
		else{
		  System.out.println("You are Failed");
		  grade = "F";
		}
		System.out.println("Total Marks : " +(totalSubjects*100));
		System.out.println("Total Marks Obtained : "+totalMarks);
		System.out.println("Average Percentage : "+avgPercentage);
		System.out.println("Grade : "+grade);
		
		sc.close();
	}

}
