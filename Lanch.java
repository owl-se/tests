package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import pages.BasePage;
import pages.MathType;

public class Lanch {
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:\\jva\\geckodriver\\geckodriver.exe");  
		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile(); 
			
	    WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
	    //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.navigate().to("http://www.calculator.net/");  
	    BasePage page = new BasePage(driver);
	    
	    MathType math = page.goMath();
	    System.out.println(math.confirmHeader());
	}
}
