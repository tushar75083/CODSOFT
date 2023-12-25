package com.sms;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;


class Student implements Serializable{
	
	private String name;
	private int rollNumber;
	private String grade;
	
	public Student(String name, int rollNumber, String grade) {
		
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNumber()
	{
		return rollNumber;
	}
	
	public String getGrade()
	{
		return grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
	}
	
}

class StudentManagementSystem{
	private List<Student> students = new ArrayList<>();
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public void removeStudent(int rollNumber)
	{
		students.removeIf(student -> student.getRollNumber() == rollNumber);
	}
	
	public Student findStudent(int rollNumber)
	{
		for(Student student : students)
		{
			if(student.getRollNumber() == rollNumber)
			{
				return student;
			}
		}
		return null;
	}
	
	public List<Student> getAllStudents()
	{
		return students;
	}
	
	public void saveToFile(String filename)
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			oos.writeObject(students);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void loadFromFile(String filename)
	{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			students = (List<Student>) ois.readObject();
		}
		catch(IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("*** Welcome To Student Management System ***");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student ");
			System.out.println("3. search Student");
			System.out.println("4. Display All Student");
			System.out.println("5. Save To File");
			System.out.println("6. Load From File");
			System.out.println("7. Exit");
			
			System.out.println("Select an Option :");
			int choice = scanner.nextInt();
			scanner.nextLine();  //consumes the new line character
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Name :");
					String name = scanner.nextLine();
					System.out.println("Enter Roll Number :");
					int rollNumber = scanner.nextInt();
					System.out.println("Enter Grade :");
					scanner.nextLine();
					String grade = scanner.nextLine();
					 
					Student student = new Student(name, rollNumber, grade);
					sms.addStudent(student);
					System.out.println("Student Details Added Successfully....\n");
					break;
					
				case 2:
					System.out.println("Enter Roll Number To Remove Student :");
					int rollNoToRemove = scanner.nextInt();
					scanner.nextLine();
					sms.removeStudent(rollNoToRemove);
					System.out.println("Student Record Deleted Successfully...\n");
					
					break;
					
				case 3:
					System.out.println("Enter Roll Number To Search Student :");
					int rollNoToSearch = scanner.nextInt();
					scanner.nextLine();
					Student foundStudent = sms.findStudent(rollNoToSearch);
					if(foundStudent != null)
					{
						System.out.println("Student Found :"+foundStudent);
					}
					else
					{
						System.out.println("Student Not Found");
					}
					break;
					
				case 4:
					List<Student> allStudents = sms.getAllStudents();
					if(allStudents.isEmpty())
					{
						System.out.println("No Students In The System");
					}
					else
					{
						System.out.println("All Students Are As Follows :\n");
						for(Student s : allStudents)
						{
							System.out.println(s);
						}
					}
					break;
					
				case 5:
					sms.saveToFile("students.dat");
					System.out.println("Data Saved To File");
					break;
					
				case 6:
					sms.loadFromFile("students.dat");
					System.out.println("data Loaded From The File");
					break;
					
				case 7:
					System.out.println("Exiting Application...Thanks For Visiting...");
					scanner.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Option..Please Try Again");	
					
					
			}
			
		}
	}

}
