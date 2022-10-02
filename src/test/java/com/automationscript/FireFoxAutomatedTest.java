package com.automationscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FireFoxAutomatedTest extends Driver {
	@Test
	public static void firefoxautomateddriver() {
		reports.startSingleTestReport("firefoxautomateddriver");
		String url = driver.getCurrentUrl();
		System.out.println("url" + url);
		String title = driver.getTitle();
		System.out.println("title" + title);
		WebElement searchelement = driver.findElement(By.name("q"));
		searchelement.clear();
		searchelement.sendKeys("Selenium" + Keys.ENTER);
		reports.logTestPassed("firefoxautomateddriver");
	}
}
