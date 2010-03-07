package com.mycompany.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageObject {

	private WebDriver webDriver;

	public PageObject() {
		tryCreateWebDriver();
	}

	protected <T extends PageObject> T openAs(String address, Class<T> pageClass) {
		open(address);
		return pageObjectInstance(pageClass);
	}

	private <T extends PageObject> T pageObjectInstance(Class<T> pageClass) {
		return PageFactory.initElements(webDriver, pageClass);
	}

	private void open(String address) {
		webDriver.navigate().to(address);
	}

	private void tryCreateWebDriver() {
		try {
			webDriver = new WebDriverFacade().getWebDriver();
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
}