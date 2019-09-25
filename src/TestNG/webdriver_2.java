package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriver_2 {
  @Test
  public void f() {
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("the title of the webpage is" +driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertTrue(driver.getTitle().startsWith("H"));
	  driver.close();
  }
}