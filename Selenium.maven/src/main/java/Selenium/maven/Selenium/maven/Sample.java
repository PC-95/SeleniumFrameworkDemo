package Selenium.maven.Selenium.maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	
	WebDriver driver =null;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Python27\\Scripts\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}

	@Test
	public void sampleTest() {
		
		
		String baseUrl = "https://policies.google.com/terms?gl=IN&hl=en";
		driver.get(baseUrl);
		System.out.println( "Title is = "+ driver.getTitle());
		
		
		
		

	}
	@After
	public void Teardown()
	
	{
		driver.close();
		driver.quit();
	}

}
