package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
    private WebElement createcustomer;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
    private WebElement customername;
	
	@FindBy(xpath="//div[@class='scrollableContainer descriptionScrollableWrapper'and@style='overflow-y: hidden; display: block;']")
	private WebElement description;
	
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement selectcustomer;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow selected']")
	private WebElement bigbangcompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcustomerbtn;
	
	@FindBy(xpath="//div[text()='nishu' and @class='title']")
	private WebElement actualcustomercreated;
	
	public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}


	
	public WebElement getAddnew() {
		return addnew;
	}

	
	
	
	public WebElement getCreatecustomer() {
		return createcustomer;
	}

	
	
  public WebElement getCustomername() {
		return customername;
	}

	

	public WebElement getDescription() {
		return description;
	}

	
	public WebElement getSelectcustomer() {
		return selectcustomer;
	}

		public WebElement getBigbangcompany() {
		return bigbangcompany;
	}

	

	
	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}

	public WebElement getActualcustomercreated() {
		return actualcustomercreated;
	}

	}


