package com.mycompany.test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageObject {

	@FindBy(how = How.ID, using = "page-heading")
	private WebElement pageHeading;

	public boolean hasPageHeading(String expectedTitle) {
		return expectedTitle.equals(pageHeading.getText());
	}
}