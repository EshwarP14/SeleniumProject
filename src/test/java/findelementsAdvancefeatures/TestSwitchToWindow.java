package findelementsAdvancefeatures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSwitchToWindow {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		for(WebElement frame : frames)
		{
			System.out.println(frame.getAttribute("id"));
		}

	}

}
