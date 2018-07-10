package by.htp.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SImpleTestNGExampleSecond {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("============");
	  System.out.println("Test second");
	  System.out.println("============");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod NG Second");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod NG Second");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class NG Second");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class NG Second");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test NG Second");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test NG Second");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suit NG Second");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit NG Second");
  }

}
