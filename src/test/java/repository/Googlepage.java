package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Googlepage {
	 
	 WebDriver driver;
	 
	 @FindBy(how = How.NAME, using = "q")
	 
	 public WebElement searchfeild;
	 
 @FindBy(how = How.XPATH, using = "//a[@href=\"https://en.wikipedia.org/wiki/888_Holdings\"]/h3")
	 
	 public WebElement searchresult;
	 
	 
	 public Googlepage(WebDriver driver){ 
		 
		    this.driver = driver; 
		 
		    } 
		 
		}
