package TestNG;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void Register() {
	  System.out.println("this is register");
  }
  @Test(priority=2)
  public void Login() {
	  System.out.println("this is login");
  }
  @Test(priority=3)
  public void Homepage() {
	  System.out.println("this is homepage");
  }
  @Test(priority=1)
  public void Logout() {
	  System.out.println("this is logout");
  }
}

