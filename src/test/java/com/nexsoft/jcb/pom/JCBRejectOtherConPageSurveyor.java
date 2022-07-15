package com.nexsoft.jcb.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JCBRejectOtherConPageSurveyor {
	
	WebDriver driver;

	@FindBy(xpath = "//select[@id='resume']")
	private WebElement visitStatusDropDown;

	@FindBy(xpath = "//input[@name='simpan']")
	private WebElement submitBtn;

	@FindBy(xpath = "//input[@id='other_resume']")
	private WebElement textFieldOtherStatus;

	@FindBy(xpath = "//div[@id='header']/ul/li/a/b")
	private WebElement profile;

	@FindBy(xpath = "//div[@id='header']/ul/li/div/a")
	private WebElement btnLogout;

	public JCBRejectOtherConPageSurveyor(WebDriver driver) {
		this.driver = driver;
	}

	public JCBRejectOtherConPageSurveyor selectDropdownListVisitStatusByValue(String value) {
		Select select = new Select(visitStatusDropDown);
		select.selectByValue(value);
		return PageFactory.initElements(driver, JCBRejectOtherConPageSurveyor.class);
	}

	public JCBRejectPage clickBtnSubmit() {
		submitBtn.click();
		return PageFactory.initElements(driver, JCBRejectPage.class);
	}

	public JCBRejectOtherConPageSurveyor inputOtherVisitStatus(String text) {
		textFieldOtherStatus.sendKeys(text);

		return PageFactory.initElements(driver, JCBRejectOtherConPageSurveyor.class);
	}

}
