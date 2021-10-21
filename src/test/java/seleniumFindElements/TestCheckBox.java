package seleniumFindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement block = driver.findElement(By.xpath("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
	
	List<WebElement> checkbox = block.findElements(By.name("sports"));
	
	System.out.println("checkbox count : " +checkbox.size());
	
	for(WebElement box : checkbox)
	{
		
		box.click();
	}
	
	}

}
