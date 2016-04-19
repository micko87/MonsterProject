/**
 *   File Name: RequestInputTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 30, 2016
 *
 */

package com.sqa.MA.util.helpers;

import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * RequestInputTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestInputTests {

	static private String question;
	static private Scanner scanner;
	static private String userName;
	static private Object userValue;

	/**
	 *
	 */
	@AfterClass
	public static void farewellUser() {
		System.out.println("Thank you " + userName + " for executing my RequestInput tests. \nHave a great day!");
		scanner.close();

	}

	/**
	 *
	 */
	@BeforeClass
	public static void welcomeUser() {
		System.out.println("Welcome to my Request Input Tests");
		System.out.println("Could you please provide me your name:");
		scanner = new Scanner(System.in);
		userName = scanner.nextLine();

	}

	/**
	 * @param question
	 * @param userValue
	 */
	@AfterMethod
	public void displayOutput() {
		System.out.println("For the question \"" + question + "\", you have given the value of (" + userValue + ")");

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.RequestInput#getChar(java.lang.String)}.
	 */
	@Test(enabled = false)
	public void testGetCharString() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test(enabled = false)
	public void testGetCharStringCharArray() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test(enabled = false)
	public void testGetDouble() {

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.RequestInput#getInt(java.lang.String, int[])}
	 * .
	 */
	@Test
	public void testGetInt() {
		// fail("Not yet implemented");
		// welcomeUser();
		question = "Please give me your lucky number:";
		userValue = RequestInput.getInt(question, 1, 2, 3, 4, 5, 6, 7);

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	public void testGetString() {
		// fail("Not yet implemented");

		question = "Please give me your favorite color:";
		userValue = RequestInput.getString(question, "red", "white", "blue");
		// displayOutput(question, userValue);
		// farewellUser();

	}

}
