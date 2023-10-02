package jenkinsMavenIntegration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void lauchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Softwares\\browserDrivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Google"),"Title match");
		
		driver.quit();
	}

}
