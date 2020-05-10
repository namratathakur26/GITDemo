package com.org.restapi.SampleTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HomePage {

	WebDriver driver;

	// System.setProperty("webdriver.chrome.driver","chromedriver.exe");

	@Test(enabled = false)
	public void checkHOmePagetittle() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/SACHIN SANAP/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.infracloud.io/");
		String Str = driver.getTitle();
		System.out.println("Tittle of the page is :" + Str);
		String actualtittle = "Home - InfraCloud - Cloud Native Technologies";
		assertEquals(actualtittle, Str);

	}

	@Test (enabled = false)
	public void redirectoservice() {
		System.setProperty("webdriver.chrome.driver","C:/Users/SACHIN SANAP/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.infracloud.io/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Service = driver.findElement(By.xpath("//*[@id=\"menu-item-571\"]/a"));
		System.out.println("Click on Service link");
		Service.click();
		WebElement Prodt = driver.findElement(By.xpath("//*[@id=\"menu-item-573\"]"));
		Prodt.click();
	String Header = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div[2]/div/div/div/div[1]/div/h1")).getText();
	System.out.println("Header is  :"+ Header);
String actualtittle = "Innovations. Engineered.";
assertEquals(actualtittle, Header);
}

	@Test

	public void clicksearch() {
		// String str;
		System.setProperty("webdriver.chrome.driver", "C:/Users/SACHIN SANAP/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.infracloud.io/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 120);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search-btn\"]"))).click();
		WebElement Entertext = driver.findElement(By.xpath("//*[@id=\"search-box\"]/div/div/form/input"));
		Entertext.sendKeys("Product");
		Entertext.sendKeys(Keys.ENTER);
		
		
	
	

	}
}
