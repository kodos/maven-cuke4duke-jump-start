package com.mycompany.test.pageObjects;

import org.springframework.stereotype.Component;

@Component
public class WebSite extends PageObject {

	public HomePage openHomePage() {
		return openAs("http://localhost:8080/", HomePage.class);
	}
}