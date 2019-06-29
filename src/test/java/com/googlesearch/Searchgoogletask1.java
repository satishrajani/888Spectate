package com.googlesearch;
import repository.Googlepage;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Searchgoogletask1 {

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

@Test (priority=1)	
public static void testing1() throws IOException, InterruptedException{
driver.get(url);
Googlepage getsearch = PageFactory.initElements(driver, Googlepage.class);
WebElement googlesearch= getsearch.searchfeild;

// w1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//WebElement w1 = driver.findElement(By.name("q"));
googlesearch.sendKeys("888 Holdings - Wikipedia");
googlesearch.submit();

Thread.sleep(2000);

WebElement w2 = getsearch.searchresult;

actual = w2.getText();

Assert.assertEquals(expected, actual);
driver.quit();

}

}
