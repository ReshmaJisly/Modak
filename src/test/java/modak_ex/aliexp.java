package modak_ex;


import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aliexp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://proxyium.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		WebElement poxysearch=driver.findElement(By.id("unique-form-control"));
		poxysearch.sendKeys("https://www.aliexpress.com/");
		driver.findElement(By.id("unique-btn-blue")).click();
		WebElement search=driver.findElement(By.id("search-words"));
		search.sendKeys("instax mini");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		actions.sendKeys(Keys.PAGE_DOWN);
		actions.build().perform();
		WebElement page2=driver.findElement(By.linkText("2"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", page2);
		
		List<WebElement> li = driver.findElements(By.className("cards--storeLink--XkKUQFS"));
		System.out.println(li.size());
		System.out.println(li);
		WebElement second=li.get(2);
		js.executeScript("arguments[0].click();", second);
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tabs.size());
		System.out.println(tabs);
		driver.switchTo().window(tabs.get(1));
		List<WebElement> listofitems = driver.findElements(By.className("sku-item--image--mXsHo3h"));
		System.out.println(listofitems.size());
		System.out.println(listofitems);
		
	
	
	
	}

}
