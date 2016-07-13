package pkgartopt;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class helloworld {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	
	@Test
	public void testAllLinks() throws InterruptedException
	{

		
	System.out.println(driver.getCurrentUrl());
		
	}
}

	
	

