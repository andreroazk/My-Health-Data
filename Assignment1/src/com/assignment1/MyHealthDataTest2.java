/*
 * Student Name: Andre Azevedo
 * Lab Professor: Leanne Seaward
 * Due Date: , 2023
 * Modified: , 2023
 * Description:
 */

package com.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * 
 * @author andre
 *
 */
public class MyHealthDataTest2 {

	@Test
	public void testGetBMIPass() {
		Patient patientBmi = new Patient
				("Andre", "Rocha", "Male", 1987, 04, 29, 69, 175);
		assertEquals(25.84, patientBmi.getBMI(), 0.1);
	}
	
	@Test
	public void testGetBIMFail() {
		Patient patientBmi = new Patient
				("Andre", "Rocha", "Male", 1987, 04, 29, 69, 175);
		assertEquals(25.84, patientBmi.getBMI(), 0);
	}

}
