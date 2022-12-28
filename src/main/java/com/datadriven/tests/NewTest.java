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

import org.openqa.selenium.Alert;
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
	private static String Franchise_Radio_No = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String NEXT2_XPATH= "/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span";
	private static String Address_1 = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Address_2 = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Business_Name_Radio_No="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Business_Name_Radio_Yes="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String NEXT3_XPATH = "/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span/span";
	private static String Nominated_Cards_Amex = "/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/label/div/div[1]/div[2]";
	private static String Nominated_Cards_Visa="/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/label/div/div[1]/div[2]";
	private static String Nominated_Cards_MasterCard="/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/label/div/div[1]/div[2]";
	private static String Import_MPM_Sheet_NO="/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Import_MPM_Sheet_YES ="/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String Product_Sell_Radio_Services="/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Product_Sell_Radio_Goods="/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String Product_Sell_Radio_Both="/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div[1]/div/span/div/div[3]/label/div/div[1]/div/div[3]/div";
	private static String Selected_Product_CB_Surcharge="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[2]/label/div/div/div[2]";
	private static String Selected_Product_CB_Tipping="/html/body/div/div[2]/form/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[4]/label/div/div/div[2]";
	private static String Fullfillment_type_Option1 ="/html/body/div/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div[1]/div/span/div/div[1]/label/div/div[1]/div/div[3]/div";
	private static String Fullfillment_type_Option2="/html/body/div/div[2]/form/div[2]/div/div[2]/div[6]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div";
	private static String Caller_Name_TB="/html/body/div/div[2]/form/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[1]/input";
	private static String Application_Created_TPS ="/html/body/div/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div[1]/div[3]/label/div/div[1]/div[2]";
	private static String Application_Created_IBS="/html/body/div/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div[1]/div[1]/label/div/div[1]/div[2]";
	private static String Application_Created_CFS="/html/body/div/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div[1]/div[2]/label/div/div[1]/div[2]";
	private static String Application_Created_Digital="/html/body/div/div[2]/form/div[2]/div/div[2]/div[8]/div/div/div[2]/div[1]/div[4]/label/div/div[1]/div[2]";
	private static String Submit_Button="/html/body/div[1]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div[2]/span";
	private static String Success_Message ="/html/body/div[1]/div[2]/div[1]/div/div[3]";
	private static String CLEAR_FORM_BUTTON="/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div[2]/div/span/span";
	
	
	
	
	
	
	
	
	
	
@BeforeMethod
  public void beforeMethod() {
	  
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
	  if (testData.getEntitySystem().getIsFranchise())
	  {
	  driver.findElement(By.xpath(Franchise_Radio_Yes)).click();
	  }
	  else
	  {
		  driver.findElement(By.xpath(Franchise_Radio_No)).click();
	  }
	  driver.findElement(By.xpath(NEXT2_XPATH)).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(Address_1)).sendKeys(testData.getAddress().getAddressLine1());
	  driver.findElement(By.xpath(Address_2)).sendKeys(testData.getAddress().getAddressLine2());
	  if (testData.getAddress().getIsBusinessName())
	  {
		  driver.findElement(By.xpath(Business_Name_Radio_Yes)).click();
	  }
	  else
	  {
	  driver.findElement(By.xpath(Business_Name_Radio_No)).click();
	  }
	  driver.findElement(By.xpath(NEXT3_XPATH )).click();
	  sleep(2000);
	  
	  if (testData.getAppType().getNominatedCard().equals("Visa"))
	  {
		driver.findElement( By.xpath(Nominated_Cards_Visa)).click();  
	  }
	  else if (testData.getAppType().getNominatedCard().equals("Master Card"))
	  {
		  driver.findElement(By.xpath(Nominated_Cards_MasterCard)).click();
	  }
	  else if (testData.getAppType().getNominatedCard().equals("Amex"))
	  {
	  driver.findElement(By.xpath(Nominated_Cards_Amex)).click();
	  }
	if (testData.getAppType().getIsMpmSheet())
	{
		driver.findElement(By.xpath(Import_MPM_Sheet_YES)).click();
	}
	else
	{
	  driver.findElement(By.xpath(Import_MPM_Sheet_NO)).click();
	}
	
	if (testData.getAppType().getProductType().equals("Goods"))
	{
		driver.findElement(By.xpath(Product_Sell_Radio_Goods)).click();
	}
	else if (testData.getAppType().getProductType().equals("Services"))
	{
	  driver.findElement(By.xpath(Product_Sell_Radio_Services)).click();
	}
	else if (testData.getAppType().getProductType().equals("Both"))
	{
		driver.findElement(By.xpath(Product_Sell_Radio_Both)).click();
	}
	  sleep(2000);
	  
	  if (testData.getAppType().getSelectedProduct().equals("Surcharge"))
	  {
	  driver.findElement(By.xpath(Selected_Product_CB_Surcharge)).click();
	  }
	  else 
	  {
		  driver.findElement(By.xpath(Selected_Product_CB_Tipping)).click();
	  }
	  
	  if (testData.getAppType().getFulfilmentType().equals("Option1"))
	  {
		  driver.findElement(By.xpath(Fullfillment_type_Option1)).click();
	  }
	  else 
	  {
		  driver.findElement(By.xpath(Fullfillment_type_Option2)).click();
	  }
	  
	  driver.findElement(By.xpath(Caller_Name_TB)).sendKeys(testData.getAppType().getCallerName());
	  
	  if(testData.getAppType().getApplicationCreatedFor().equals("IBS"))
			  {
		  driver.findElement(By.xpath(Application_Created_IBS)).click();
			  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("CFS"))
	  {
		  driver.findElement(By.xpath(Application_Created_CFS)).click();
	  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("TPS"))
	  {
	  driver.findElement(By.xpath(Application_Created_TPS)).click();
	  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("Digital"))
	  {
		  driver.findElement(By.xpath(Application_Created_Digital)).click();
	  }
	  driver.findElement(By.xpath(Submit_Button)).click();
	  sleep(2000);
	  
	  String actual = driver.findElement(By.xpath(Success_Message)).getText();
	  String expected= "Your response has been recorded.";
	  assertEquals(actual,expected);
	  			  
  
  }
  @Test(priority=2)
  public void toVerifyMCDetailsSubmission()
  {
	  TestDataMapper testData = JsonToPojoConverterUtil
			  .getListOfTestDataMapper(TestCaseType.MASTER_CARD_TYPE);
	  
	 
	  driver.findElement(By.xpath(MERCHANT_NAME_XPATH)).sendKeys(testData.getBasicInfo().getMerchantName());
	  sleep(2000);
	  driver.findElement(By.xpath(NEXT1_XPATH)).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(MERCHANT_TRADING_NAME)).sendKeys(testData.getEntitySystem().getTradingName());
	  sleep(2000);
	  if (testData.getEntitySystem().getIsFranchise())
	  {
	  driver.findElement(By.xpath(Franchise_Radio_Yes)).click();
	  }
	  else
	  {
		  driver.findElement(By.xpath(Franchise_Radio_No)).click();
	  }
	  driver.findElement(By.xpath(NEXT2_XPATH)).click();
	  sleep(2000);
	  
	  driver.findElement(By.xpath(Address_1)).sendKeys(testData.getAddress().getAddressLine1());
	  driver.findElement(By.xpath(Address_2)).sendKeys(testData.getAddress().getAddressLine2());
	  if (testData.getAddress().getIsBusinessName())
	  {
		  driver.findElement(By.xpath(Business_Name_Radio_Yes)).click();
	  }
	  else
	  {
	  driver.findElement(By.xpath(Business_Name_Radio_No)).click();
	  }
	  driver.findElement(By.xpath(NEXT3_XPATH )).click();
	  sleep(2000);
	  if (testData.getAppType().getNominatedCard().equals("Visa"))
	  {
		driver.findElement( By.xpath(Nominated_Cards_Visa)).click();  
	  }
	  else if (testData.getAppType().getNominatedCard().equals("Master Card"))
	  {
		  driver.findElement(By.xpath(Nominated_Cards_MasterCard)).click();
	  }
	  else if (testData.getAppType().getNominatedCard().equals("Amex"))
	  {
	  driver.findElement(By.xpath(Nominated_Cards_Amex)).click();
	  }
	if (testData.getAppType().getIsMpmSheet())
	{
		driver.findElement(By.xpath(Import_MPM_Sheet_YES)).click();
	}
	else
	{
	  driver.findElement(By.xpath(Import_MPM_Sheet_NO)).click();
	}
	
	if (testData.getAppType().getProductType().equals("Goods"))
	{
		driver.findElement(By.xpath(Product_Sell_Radio_Goods)).click();
	}
	else if (testData.getAppType().getProductType().equals("Services"))
	{
	  driver.findElement(By.xpath(Product_Sell_Radio_Services)).click();
	}
	else if (testData.getAppType().getProductType().equals("Both"))
	{
		driver.findElement(By.xpath(Product_Sell_Radio_Both)).click();
	}
	  sleep(2000);
	  
	  if (testData.getAppType().getSelectedProduct().equals("Surcharge"))
	  {
	  driver.findElement(By.xpath(Selected_Product_CB_Surcharge)).click();
	  }
	  else 
	  {
		  driver.findElement(By.xpath(Selected_Product_CB_Tipping)).click();
	  }
	  
	  if (testData.getAppType().getFulfilmentType().equals("Option1"))
	  {
		  driver.findElement(By.xpath(Fullfillment_type_Option1)).click();
	  }
	  else 
	  {
		  driver.findElement(By.xpath(Fullfillment_type_Option2)).click();
	  }
	  
	  driver.findElement(By.xpath(Caller_Name_TB)).sendKeys(testData.getAppType().getCallerName());
	  
	  if(testData.getAppType().getApplicationCreatedFor().equals("IBS"))
			  {
		  driver.findElement(By.xpath(Application_Created_IBS)).click();
			  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("CFS"))
	  {
		  driver.findElement(By.xpath(Application_Created_CFS)).click();
	  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("TPS"))
	  {
	  driver.findElement(By.xpath(Application_Created_TPS)).click();
	  }
	  else if (testData.getAppType().getApplicationCreatedFor().equals("Digital"))
	  {
		  driver.findElement(By.xpath(Application_Created_Digital)).click();
	  }
	  driver.findElement(By.xpath(Submit_Button)).click();
	  sleep(2000);
	  
	  String actual = driver.findElement(By.xpath(Success_Message)).getText();
	  String expected= "Your response has been recorded.";
	  assertEquals(actual,expected);
	  			  
  
  }
  @Test
  public void verifyToClearForm()
  {
	  TestDataMapper testData = JsonToPojoConverterUtil
			  .getListOfTestDataMapper(TestCaseType.MASTER_CARD_TYPE);
	  
	 
	  driver.findElement(By.xpath(MERCHANT_NAME_XPATH)).sendKeys(testData.getBasicInfo().getMerchantName());
	  sleep(2000);
	  
	  driver.findElement(By.xpath(CLEAR_FORM_BUTTON)).click();
	  
	  Alert alertBox=driver.switchTo().alert();
	  String alertMessage =alertBox.getText();
	  sleep(1000);
	  System.out.println(alertMessage);
	  alertBox.accept();
	  
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

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }
  
}
