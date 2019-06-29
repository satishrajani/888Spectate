package com.googlesearch;
import repository.Googlepage;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Searchgoogletask2 {

public static String url = "https://google.com";
public static WebDriver driver;
private static WebDriverWait wait; 
public static String expected = "888 Holdings - Wikipedia";

public static String actual= "";


static Googlepage objLogin;

 


@BeforeTest

public void verifycontent() {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");	

driver = new ChromeDriver();



}
@Test (priority=2)	
public static void testing() throws IOException{
	
	driver.get(url);
	Googlepage getsearch = PageFactory.initElements(driver, Googlepage.class);
	 
	
	WebElement googlesearch= getsearch.searchfeild;
	
	
	System.out.println("Enter your username: ");
	Scanner scanner = new Scanner(System.in);
	String searchcriteria = scanner.nextLine();
	System.out.println("Your entered criteria is " + searchcriteria);

	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
		.moveToElement(googlesearch)
		.click()
		.sendKeys(googlesearch, searchcriteria)
		.build();
		
	seriesOfActions.perform();
	googlesearch.submit();

	
	WebElement w2 = getsearch.searchresult;

	actual = w2.getText();

	Assert.assertEquals(expected, searchcriteria);
	driver.quit();

}
}