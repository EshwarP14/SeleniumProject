package seleniumFindElements;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLinksURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown =  driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		select.selectByValue("hi");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println(values.size());
		System.out.println(values.get(7).getText());
		
		for(int i=0 ; i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links)
		{
			
			System.out.println("links are  " +link.getText() +" URL is  " +link.getAttribute("href"));
		}
		
		
		List<WebElement> block = driver.findElements(By.tagName("option"));
		
		for(int j=0 ; j<block.size();j++) {
			
			System.out.println(block.get(j).getAttribute("lang"));
		}
	}
	
	

}
