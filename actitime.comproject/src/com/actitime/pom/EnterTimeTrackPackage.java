
	package com.actitime.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

	public class EnterTimeTrackPackage extends BaseClass{

		@FindBy(id="logoutLink")
		private WebElement logOut;
		
		@FindBy(xpath="//div[text()='Tasks']")
		private WebElement taskTab;
		
		public EnterTimeTrackPackage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void setLogout() {
			logOut.click();
		}
		public void setTaskTab() {
			taskTab.click();
		}
		
	}



