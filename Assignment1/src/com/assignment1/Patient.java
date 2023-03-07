
/*
 * Student Name: Andre Azevedo
 * Lab Professor: Leanne Seaward
 * Due Date: , 2023
 * Modified: , 2023
 * Description:
 */
package com.assignment1;

import java.time.LocalDate;
import java.time.Period;


/**
 * This class represents a Patient with their personal information. It includes first name, last name, 
 * gender, date of birth, height, and weight. It provides methods to calculate their age, 
 * maximum heart rate, target heart rate range, body mass index (BMI) and display their health data.
 * 
 * @author Andre Azevedo
 *
 */
public class Patient {
	
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height;
	private double weight;
	
	/**
	 * Constructor to create a new Patient object with the given information.
	 * 
	 * @param firstName the first name of the patient
	 * @param lastName the last name of the patient
	 * @param gender the gender of the patient (Male/Female)
	 * @param birthYear the year of birth of the patient
	 * @param birthMonth the month of birth of the patient
	 * @param birthDay the day of birth of the patient
	 * @param height the height of the patient (in inches)
	 * @param weight the weight of the patient (in pounds)
	 */
	public Patient(String firstName, String lastName, String gender,
					int birthYear, int birthMonth, int birthDay, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBrithYear() {
		return birthYear;
	}

	public void setBrithYear(int brithYear) {
		this.birthYear = brithYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Calculate the age of the patient in years.
	 * 
	 * @return age of the patient in years
	 */
	public int calculateAge() {
		int age = 0;
		
		if (birthYear != 0 && birthMonth != 0 && birthDay != 0) {
			LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
			LocalDate today = LocalDate.now();
			Period agePeriod = Period.between(birthday, today);
			age = agePeriod.getYears();
		}
		return age;
	}
	
	/**
	 * Calculates the maximum heart rate of the patient by subtracting the age of 220 BPM.
	 * 
	 * @return subtracts age of 220 BPM.
	 */
	public int maximumHeartRate() {
		return 220 - calculateAge();
	}
	
	/**
	 * Array method that calculates what should be the minimum and 
	 * maximum heart rate range of patient. 
	 * 
	 * @return minimum and maximum heart range.
	 */
	public int[] targetHeartRateRange() {
		
		int minHeartRange = (int) (maximumHeartRate() * 0.5);
		int maxHeartRange = (int) (maximumHeartRate() * 0.85);
		return new int[] {minHeartRange, maxHeartRange};
	}
	
	/**
	 * Calculates the Body Mass Index (BMI) of the patient.
	 * 
	 * @return the BMI.
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	} 
	
	/**
	 * Method to display the summary of all the patient's data.
	 */
	public void displayMyHealthData() { 
		int age = calculateAge();
		int[] heartRateRange = targetHeartRateRange(); 

		System.out.println("\u001B[1m------ Patient Data ------");
		System.out.println();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name:  " + lastName);
		System.out.println("Gender:     " + gender);
		System.out.println("Date of Birth: " + 
							birthYear + "-" +  birthMonth + "-" + birthDay);
		System.out.println("Height:     " + height);
		System.out.println("Weight:     " + weight);
		System.out.println("Age:        " + age + (age == 1 ? " year" : " years"));
		System.out.printf("Body Max Index (BMI): %.2f", getBMI());
		System.out.println();
		System.out.println("Target Heart Rate Range: \n" + "    Minimum: " + heartRateRange[0] + 
						"\n    Maximum: " + heartRateRange[1]);
	
	   System.out.println();
	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   

	} 
	
}
