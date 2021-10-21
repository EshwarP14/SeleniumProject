package findelementsAdvancefeatures;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenShot {

	public static WebDriver driver;
	public static void captureScreenshot() throws IOException
	{
		
		Date d = new Date();
		String filename = d.toString().replace(":","_").replace(" ", "_")+".jpg";
		
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File(".//screenshot//"+filename));
	}
	
	public static void main(String[] args) throws IOException  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("mySubmit")).click();
		driver.findElement(By.xpath("/html/body/button")).click();
		
		captureScreenshot();
		
	}

}
