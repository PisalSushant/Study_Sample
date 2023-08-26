package E_CommerceWebSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_1 {
  @Test
  public void openAmazon() {
	   Reporter.log("Open Amazon", true);
	   ChromeOptions opt =new ChromeOptions();
  	   opt.addArguments("--remote-allow-origins=*");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(opt);
	   driver.get("https://www.amazon.in/");
	   
  }
}
