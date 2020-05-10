package Selenium.maven.Selenium.maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Python27\\Scripts\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement ele=driver.findElement(By.name("cars"));
		
		Select sel=new Select(ele);
		
		sel.selectByIndex(0);
		sel.selectByValue("opel");
		sel.selectByVisibleText("Audi");
		
		Thread.sleep(3000);
		
		List<WebElement> selcars=sel.getAllSelectedOptions();
		
		for(WebElement element:selcars)
		{
			System.out.println("selected cars"+element.getText());
			
		}	

	}

}
