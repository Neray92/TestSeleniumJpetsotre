package exoEql.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.junit.After;
import org.junit.Test;;

public class TestJpetstoreJcoco {
	 
	WebDriver driver;
	@Test
	public void accesJpetstore() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Installation\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.get("http://localhost:8181/jpetstore");
	
	
	driver.findElement(By.xpath("//a[@href='actions/Catalog.action']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ACID");
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ACID");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.findElement(By.cssSelector("[src='\\.\\.\\/images\\/reptiles_icon\\.gif']")).click();
	driver.findElement(By.cssSelector("[href='\\/jpetstore\\/actions\\/Catalog\\.action\\?viewProduct\\=\\&productId\\=RP-LI-02']")).click();
	driver.findElement(By.cssSelector(".Button")).click();
	driver.findElement(By.cssSelector("[size='3']")).sendKeys("3");
	driver.findElement(By.cssSelector("#Cart .Button:nth-child(3)")).click();
	driver.findElement(By.cssSelector("[name='newOrder']")).click();
	driver.findElement(By.cssSelector(".Button")).click();
	driver.findElement(By.cssSelector("[href='\\/jpetstore\\/actions\\/Account\\.action\\?signoff\\=']")).click();
	
	  
	}
	
	@After
	public void closeNavigator() {
	driver.close();
	
	
	
}
	

}
