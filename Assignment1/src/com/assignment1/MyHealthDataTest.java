/*
 * Student Name: Andre Azevedo
 * Lab Professor: Leanne Seaward
 * Due Date: , 2023
 * Modified: , 2023
 * Description:
 */

package com.assignment1;

import java.util.Scanner;

/**
 * This class creates an instance of the Patient object  
 * with the data that the user inputs for the patient,
 * and then the program displays the user's info plus the BMI, 
 * and minimum and maximum heart rate.
 * 
 * @author Andre Azevedo
 */
public class MyHealthDataTest {

	/**
	 * Main method to run the program, where the user inputs their personal data
	 * and the program displays the user's info plus the BMI, 
	 * and minimum and maximum heart rate.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Patient frouxo = new Patient("Andre", "Rocha", "Male", 1987, 04, 29, 175, 80);
		//frouxo.displayMyHealthData();
		
		//Initializing variables to store user input
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;
		Scanner keyboard = new Scanner (System.in);
		
		// Prompting the user for input and reading input
		System.out.println("First Name: ");
		firstName = keyboard.nextLine();
		
		System.out.println("Last Name: ");
		lastName = keyboard.nextLine();
		
		System.out.println("Gender: ");
		gender = keyboard.nextLine();
		
		System.out.println("Year of Birth: ");
		birthYear = keyboard.nextInt();
		
		System.out.println("Month of Birth: ");
		birthMonth = keyboard.nextInt();
		
		System.out.println("Day of Birth: ");
		birthDay = keyboard.nextInt();
		
		System.out.println("Height (inches): ");
		height = keyboard.nextDouble();
		
		System.out.println("Weight (lb): ");
		weight = keyboard.nextDouble();
		
		//Creating a Patient object with user's input
		Patient patient = new Patient(firstName, lastName, gender, 
							birthYear, birthMonth, birthDay, height, weight);
		System.out.println();
		patient.displayMyHealthData();
		
		keyboard.close();
	}

}
