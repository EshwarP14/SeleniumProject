package findelementsAdvancefeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverEvent {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("flipkart");
	    WebDriverWait wait = new WebDriverWait(driver,5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]"))).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	    
	    WebElement menu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
	   Actions action = new Actions(driver);
	   action.moveToElement(menu).perform();
	   driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]")).click();
	   
	   
	    
	}

}
