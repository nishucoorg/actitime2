package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.Homepage;
import com.actitime.pom.LoginPage;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@AfterClass
	public void closebrowser() {
		Reporter.log("closebrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.propertyfile("url");
		String un = f.propertyfile("username");
		String pw = f.propertyfile("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setloginpage(un, pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		Homepage h= new Homepage(driver);
		h.setlogout();
	}

}
