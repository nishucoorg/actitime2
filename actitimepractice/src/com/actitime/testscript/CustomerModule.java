package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.generic.FileLib;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.Listner.class)
public class CustomerModule {
	public class customermodule extends Baseclass{
		@Test
		public void testcreatecustomer() throws EncryptedDocumentException, IOException {
			FileLib f=new FileLib();
			String customername = f.ecxelfile("Sheet1", 1, 2);
			String description = f.ecxelfile("Sheet1", 1, 3);
			//Reporter.log("createcustomer",true);
			Homepage h=new Homepage(driver);
			h.settasktab();
			TaskListPage t=new TaskListPage(driver);
			t.getAddnew().click();
			t.getCreatecustomer().click();
			t.getCustomername().sendKeys(customername);
			t.getDescription().sendKeys(description);
			t.getSelectcustomer().click();
			t.getBigbangcompany().click();
			t.getCreatecustomerbtn().click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElement(t.getActualcustomercreated(),customername ));
			String actualtext = t.getActualcustomercreated().getText();
			Assert.assertEquals(actualtext, customername);;
			
		}
		
	}

}
