package findelementsAdvancefeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyBoardButtons {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("identifierId")).sendKeys("Test@testing.com");
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div"))).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).build().perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform();
	}

}
