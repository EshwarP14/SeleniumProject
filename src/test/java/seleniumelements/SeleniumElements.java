package seleniumelements;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumElements {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	    String title=driver.getTitle();
	    System.out.println(title);
	    System.out.println(title.length());
	    
	    driver.close();

	}

}
