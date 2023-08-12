package com.actitime.generic;

import java.io.IOException;
import com.actitime.pom.*;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class BaseClass {
	public 	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
	Reporter.log("openBrowser",true);	
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);	
		driver.quit();
	}	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);	
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pw);

}
	@AfterMethod
	public void logOut() {
		Reporter.log("logOut",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		
		e.setLogout();
	}	
}


