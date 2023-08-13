package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasktab;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setlogout() {
		logoutbtn.click();
	}
		
		public void settasktab() {
			tasktab.click();
			
		}
		
	}
	

