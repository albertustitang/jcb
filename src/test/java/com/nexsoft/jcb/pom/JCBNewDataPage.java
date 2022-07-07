package com.nexsoft.jcb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JCBNewDataPage {
	
	protected WebDriver driver;
	
	@FindBy(xpath = "//select[@id='id_area']")
	private WebElement areaBtn;
	
	@FindBy(xpath = "//button[@id='btn-filter']")
	private WebElement filterBtn;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchField;
	
	@FindBy(xpath = "//button[@id='btnSearch']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id='data-worklist']/tbody/tr/td[2]/a")
	private WebElement visitBtn;
	
	@FindBy(xpath = "//table[@id='data-worklist']/tbody/tr/td[2]/a[2]")
	private WebElement otherConditionBtn;
	
	@FindBy(xpath = "//div[@id='header']/ul/li/a/b")
	private WebElement profile;

	@FindBy(xpath = "//div[@id='header']/ul/li/div/a")
	private WebElement btnLogout;
	
	public JCBNewDataPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public JCBNewDataPage clickBtnFilter() {
		filterBtn.click();
		return PageFactory.initElements(driver, JCBNewDataPage.class);

	}
	
	public JCBNewDataPage clickSearchField(String search) {
		searchField.sendKeys(search);
		return PageFactory.initElements(driver, JCBNewDataPage.class);

	}
	
	public JCBNewDataPage clickBtnSearch() {
		searchBtn.click();
		return PageFactory.initElements(driver, JCBNewDataPage.class);

	}
	
	public JCBReportPage LogOut() {
		profile.click();
		btnLogout.click();
		return PageFactory.initElements(driver, JCBReportPage.class);
	}

	public JCBLoginPage gotoLoginPage() {
		return PageFactory.initElements(driver, JCBLoginPage.class);
	}
	
	public JCBReportPage selectDropdownListEntriesByValue(String value) {
		Select select = new Select(areaBtn);
		select.selectByValue(value);
		return PageFactory.initElements(driver, JCBReportPage.class);
	}
	
	
	
	
	

}
