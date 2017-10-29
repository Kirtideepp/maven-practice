package ust.global.project.khela;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Judu\\Desktop\\gecko driver\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.get("https://www.google.com");
	  driver.close();
  }
}
