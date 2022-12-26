package com.datadriven.tests;

import org.testng.annotations.Test;

import com.datadriven.entity.TestCaseType;
import com.datadriven.entity.TestDataMapper;
import com.datadriven.utils.JsonToPojoConverterUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	private static String MERCHANT_NAME_XPATH = "//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String NEXT1_XPATH = "/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/span/span";
	private static String MERCHANT_TRADING_NAME= "/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Franchise_Radio_Yes = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String NEXT2_XPATH= "/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span";
	private static String Address_1 = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Address_2 = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Business_Name_Radio_No="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String NEXT3_XPATH = "/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span";
	private static String Nominated_Cards_Amex = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/label/div/div[1]/div[2]";
	private static String Import_MPM_Sheet_NO="/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Product_Sell_Radio_Services="/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Selected_Product_CB_Surcharge="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[2]/label/div/div/div[2]";
	private static String Fullfillment_type_Option1 ="/html/body/div/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String Caller_Name_TB="/html/body/div/div[2]/form/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Application_Created_TPS ="/html/body/div/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div[1]/div[3]/label/div/div[1]/div[2]";
	private static String Submit_Button="/html/body/div[1]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span";
	private static String Success_Message ="/html/body/div[1]/div[2]/div[1]/div/div[3]";
	
	
	
	
	
	
	
	
	
	
@BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
      driver.get("https://forms.gle/Zo2C3xqKWJaSZZhV8");
      sleep(3000);
      driver.manage().window().maximize();
  }

 	  
  
  @Test(priority=1)
  public void toVerifyAmexDetailsSubmission()
  {
	  TestDataMapper testData = JsonToPojoConverterUtil
			  .getListOfTestDataMapper(TestCaseType.VISA_TYPE);
	  
	 
	  driver.findElement(By.xpath(MERCHANT_NAME_XPATH)).sendKeys(testData.getBasicInfo().getMerchantName());
	  sleep(2000);
	  driver.findElement(By.xpath(NEXT1_XPATH)).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(MERCHANT_TRADING_NAME)).sendKeys(testData.getEntitySystem().getTradingName());
	  sleep(2000);
	  driver.findElement(By.xpath(Franchise_Radio_Yes)).click();
	  driver.findElement(By.xpath(NEXT2_XPATH)).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(Address_1)).sendKeys(testData.getAddress().getAddressLine1());
	  driver.findElement(By.xpath(Address_2)).sendKeys(testData.getAddress().getAddressLine2());
	  driver.findElement(By.xpath(Business_Name_Radio_No)).click();
	  driver.findElement(By.xpath(NEXT3_XPATH )).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(Nominated_Cards_Amex)).click();
	  driver.findElement(By.xpath(Import_MPM_Sheet_NO)).click();
	  driver.findElement(By.xpath(Product_Sell_Radio_Services)).click();
	  sleep(2000);
	  driver.findElement(By.xpath(Selected_Product_CB_Surcharge)).click();
	  driver.findElement(By.xpath(Fullfillment_type_Option1)).click();
	  driver.findElement(By.xpath(Caller_Name_TB)).sendKeys(testData.getAppType().getCallerName());
	  driver.findElement(By.xpath(Application_Created_TPS)).click();
	  driver.findElement(By.xpath(Submit_Button)).click();
	  sleep(2000);
	  
	  String actual = driver.findElement(By.xpath(Success_Message)).getText();
	  String expected= "Your response has been recorded.";
	  assertEquals(actual,expected);
	  
	  
	  
	  
	  
			  
  
  }
  
  
  public static void sleep(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

  @AfterClass
  public void afterClass() {
	  
	  //driver.close();
  }
  
}
