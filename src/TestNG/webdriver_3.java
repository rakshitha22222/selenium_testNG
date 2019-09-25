package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class webdriver_3 {
  @Test
  public void f() {
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("the title of the webpage is" +driver.getTitle());
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("aravind");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  Assert.assertTrue(driver.getTitle().startsWith("D"));
	  driver.close();
  }
}
