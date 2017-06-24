/*
 *  author: Priya
 */

package com.cucumber.testSteps;


import java.io.*;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class calcIntegrationTest {

	
		
WebDriver dr;

@Given("^navigate to calchome page$")
public void navigate(){
	System.setProperty("webdriver.chrome.driver", "chromedriver");
      dr=new ChromeDriver();
      dr.manage().deleteAllCookies();
       dr.get("http://localhost:8585/calc");     
       String actualText=dr.findElement(By.xpath("//*[@id='navText']/h2")).getText();
       Assert.assertEquals("Simple Calc", actualText);
     
       }
@When("^user logs in using numberA as \"([^\"]*)\" and numberB as \"([^\"]*)\" and Operator as \"([^\"]*)\"$")
public void login(String Number1,String Number2,String Operator){
	   System.out.println("Am in ");
       dr.findElement(By.xpath("//*[@id='Number1']")).sendKeys(Number1);
       dr.findElement(By.xpath("//*[@id='Number2']")).sendKeys(Number2);
       dr.findElement(By.xpath("//*[@id='"+Operator+"']")).click();
       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       }
@Then("^Result as \"([^\"]*)\" should be displayed$")
public void verifySuccessful(String result){
	try
	{
	System.out.println("The result is: "+result);
	  Thread.sleep(1000);
      String actualText=dr.findElement(By.xpath("//div[@id='header']/div[2]/span/a[1]/b")).getText();
      System.out.println("The actualText is: "+actualText);
      Assert.assertEquals(result,actualText);
      if(dr!=null)
      {
      dr.close();
      }
	}catch(Exception e)
	{
		e.printStackTrace();
	}
      }
}