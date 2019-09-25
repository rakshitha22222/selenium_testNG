package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is test annotation");
  }
  @Test
  public void f1() {
	  System.out.println("this is test1 annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is beforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is afterMethod annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforeTest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is afterTest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is beforesuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is afterSuite annotation");
  }

}
