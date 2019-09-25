package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keystrokes_action {
  @Test
  public void f() throws InterruptedException{
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url=("http://demowebshop.tricentis.com/");
	  driver.get(url);
	  driver.manage().window().maximize();
	  WebElement search=driver.findElement(By.id("small-searchterms"));
	  Actions act1=new Actions(driver);
	  Thread.sleep(5000);
	  act1.sendKeys(search, "computer").perform();
	  Thread.sleep(5000);
	  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	 
  }
}
