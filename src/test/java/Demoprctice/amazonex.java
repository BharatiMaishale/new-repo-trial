package Demoprctice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class amazonex {

	@Test 
	
	public void amazon()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()='✕']")).click();
		 org.openqa.selenium.WebElement data = driver.findElement(By.name("field-keywords"));
	    data.sendKeys("iphone13");
       driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	
	//pull
}
