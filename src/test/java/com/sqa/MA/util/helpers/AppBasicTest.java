/**
 *   File Name: AppBasicsTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.MA.util.helpers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * AppBasicsTests //ADDD (description of class)
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
public class AppBasicTest {
	static String appName = "MA Test";
	static String userName;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.AppBasics#farewellUser(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFarewellUser() {
		AppBasics.farewellUser(userName, appName);

	}

	/**
	 * Test method for
	 * {@link com.sqa.MA.util.helpers.AppBasics#welcomeUserAndGetUserName(java.lang.String)}
	 * .
	 *
	 * @return
	 */
	@Test
	public void testwelcomeUser() {
		userName = AppBasics.welcomeUserAndGetUserName(appName);

	}

}
