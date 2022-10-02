package com.automationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TekArchTestLeads extends Driver {

	@Test
	public static void TC20() {
		reports.startSingleTestReport("TC20");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement leads = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		leads.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		reports.logTestPassed("TC20");
	}

	@Test
	public static void TC21() {
		reports.startSingleTestReport("TC21");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement opp = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement type = driver.findElement(By.cssSelector("select[id='fcf'"));
		type.click();
		reports.logTestPassed("TC21");
	}

	@Test
	public static void TC22() {
		reports.startSingleTestReport("TC22");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement opp = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement type = driver.findElement(By.cssSelector("select[id='fcf'"));
		type.click();
		Select select = new Select(type);
		select.selectByIndex(3);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		WebElement lodout = driver.findElement(By.linkText("Logout"));
		lodout.click();
		WebElement username1 = driver.findElement(By.id("username"));
		username1.sendKeys("gokila@tekarch.com");
		reports.logTestPassed("TC22");
	}

	@Test
	public static void TC23() {
		reports.startSingleTestReport("TC23");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement lead = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		lead.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement type = driver.findElement(By.cssSelector("select[id='fcf'"));
		type.click();
		Select select = new Select(type);
		select.selectByIndex(3);
		reports.logTestPassed("TC23");
	}

	@Test
	public static void TC24() {
		reports.startSingleTestReport("TC24");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement lead = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		lead.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement new1 = driver.findElement(By.cssSelector("input[title='New'"));
		new1.click();
		WebElement last_name = driver.findElement(By.cssSelector("input[id='name_lastlea2'"));
		last_name.sendKeys("ABCD");
		WebElement com_name = driver.findElement(By.cssSelector("input[id='lea3'"));
		com_name.sendKeys("ABCD");
		WebElement save = driver.findElement(By.cssSelector("input[title='Save'"));
		save.click();
		reports.logTestPassed("TC24");
	}
}
