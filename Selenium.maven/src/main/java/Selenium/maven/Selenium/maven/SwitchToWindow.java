package Selenium.maven.Selenium.maven;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Python27\\Scripts\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window id is = "+parentWindowHandle);
		
		Set<String> allwin=driver.getWindowHandles();
		
		ArrayList<String> tabs=new ArrayList<>(allwin);
		
		driver.switchTo().window(tabs.get(2));
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(2000);
		
		System.out.println("Title of parent window is = "+driver.getTitle());		

	}

}
