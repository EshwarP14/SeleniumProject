package seleniumFindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindElementsURLLinkscheckbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		select.selectByValue("hi");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Get Size of values"+values.size());
		
		for(int i =0 ; i<values.size();i++) {
			
			System.out.println("List of values: "+values.get(i).getAttribute("lang"));
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links : "+ links.size());
		
		for(WebElement link : links)
		{
			System.out.println("List of links: "+link.getText()+"List of URL"+link.getAttribute("href"));
		}
	}

}
