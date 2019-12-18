package com.here.pageobjects;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class DocumentionPage {
	
	WebDriverWait wait ;
	HttpURLConnection httpuc = null;
    
    int respCode = 200;
	protected WebDriver driver;
	String pageTitle;
	SoftAssert softAssert;
	public void initialisation() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"Drivers" + File.separator
				+ "chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 60);
		driver.manage().window().maximize();
	}
	
	public String lanchTheURL(String url) {
		driver.get(url);
		pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;
	}
	
	
	public void validateAllTheLinksResposeCodeAndAngularJSInitializedOrNot() {
		
		
		List<WebElement> links= driver.findElements(By.xpath("//div[contains(@class,'documentation-link-group')]//a[@href]"));
		
		for(int i=0;i<links.size();i++) {
			WebElement	link=links.get(i);
			String url=link.getAttribute("href");
			//String url=link.getAttribute("href");
			try {
				httpuc =(HttpURLConnection)(new URL(url).openConnection());
				httpuc.setRequestMethod("HEAD");
				httpuc.connect();
				respCode=httpuc.getResponseCode();
				if(respCode!=200) {
					System.out.println("URL : "+url);
					System.out.println("Response Code : "+respCode+"\n");
					System.out.println("URL is not working");
				}else {
					JavascriptExecutor js = (JavascriptExecutor)driver;
					System.out.println("URL : "+url);
					System.out.println("Response Code : "+respCode);
					link.click();
					Boolean falg =Boolean.valueOf((Boolean) js.executeScript("return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)"));
					if(falg==true) {
					}else {
						try{
							softAssert = new SoftAssert();
							softAssert.assertTrue(falg,"Angular JS is not loaded on webPage :"+url+"\n");
							softAssert.assertAll();
					        }catch(AssertionError e)
					        {
					            System.out.println("Assertion error. "+e.getMessage());
					        }
						
					}
					driver.navigate().back();
					 driver.navigate().refresh();
					 
					}
				System.out.println("\n");
			}catch(Exception e) {
			}
			links= driver.findElements(By.xpath("//div[contains(@class,'documentation-link-group')]//a[@href]"));
		}
		
		
	}

}
