/**
 *   File Name: MyMathTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.MA.util.helpers.math;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sqa.MA.util.helpers.MyMath;

/**
 * MyMathTests //ADDD (description of class)
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

public class MultiplicationTests {

	@DataProvider
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 50 }, { new double[] { 2.0, 1.0, 5.0 }, 10.0 },
				{ new double[] { 3.0, 1.5 }, 4.5 }, { new double[] { 0.0, 5.0, 15.0, 10.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };

		return data;

	}

	// private double expectedResult;
	// private double[] numbers;
	//
	// public MultiplicationTests(double[] number, double expextedResult) {
	//
	// this.expectedResult = expextedResult;
	// this.numbers = number;
	//
	// }

	@Test(dataProvider = "getData")
	public void testMultiplication(double[] number, double expextedResult) {
		double actualResult = MyMath.multNumbers(number);
		String numbersString = Arrays.toString(number);
		String message = String.format(
				"Error: The result of multiplying all numbers %s is actully  %.2f not exxpected,", numbersString,
				actualResult);
		System.out.println(message);
		assertEquals(actualResult, expextedResult, 2.0, message);

	}

}
