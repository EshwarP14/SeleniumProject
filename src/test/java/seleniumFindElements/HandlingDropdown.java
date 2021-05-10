package seleniumFindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("country")).sendKeys("Guyana");
		
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		select.selectByValue("hi");
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Total Size of dropdown values:"+values.size());
		System.out.println(values.get(9).getText());
		
		for(int i=0 ; i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("lang"));

			//System.out.println(values.get(i).getTagName());
			
		}
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-lang-list-button\"]/span")).getText());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();
		
		for(WebElement link: links)
		{
			System.out.println("Links are   " + link.getText()+ "-----URL is----"+ link.getAttribute("href"));
		}
	}

}
