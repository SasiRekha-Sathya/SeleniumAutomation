package com.automationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TekArchTestOpp extends Driver {

	@Test
	public static void TC15() {
		reports.startSingleTestReport("TC15");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement view = driver.findElement(By.cssSelector("select[id='fcf'"));
		view.click();
		reports.logTestPassed("TC15");
	}

	@Test
	public static void TC16() {
		reports.startSingleTestReport("TC16");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement view = driver.findElement(By.cssSelector("select[id='fcf'"));
		view.click();
		WebElement new_opp = driver.findElement(By.cssSelector("input[title='New']"));
		new_opp.click();
		WebElement acc_name = driver.findElement(By.cssSelector("input[id='opp3'"));
		acc_name.sendKeys("Donation Oragnisations");
		WebElement acc_type = driver.findElement(By.cssSelector("input[id='opp4'"));
		acc_type.sendKeys("Savings");
		WebElement cldt = driver.findElement(By.cssSelector("input[id='opp9'"));
		cldt.click();
		// WebElement date=driver.findElement(By.xpath(".weekday.highlight"));
		// date.click();
		WebElement type = driver.findElement(By.cssSelector("#opp5"));
		type.click();
		Select select = new Select(type);
		select.selectByIndex(2);
		WebElement lead = driver.findElement(By.cssSelector("#opp6"));
		lead.click();
		Select select1 = new Select(lead);
		select1.selectByIndex(2);
		reports.logTestPassed("TC16");
	}

	@Test
	public static void TC17() {
		reports.startSingleTestReport("TC17");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement opp_pipeline = driver.findElement(By.linkText("Opportunity Pipeline"));
		opp_pipeline.click();
		reports.logTestPassed("TC17");
	}

	@Test
	public static void TC18() {
		reports.startSingleTestReport("TC18");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement opp_stuck = driver.findElement(By.linkText("Stuck Opportunities"));
		opp_stuck.click();
		reports.logTestPassed("TC18");
	}

	@Test
	public static void TC19() {
		reports.startSingleTestReport("TC19");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		// WebElement quarterly_summary =
		// driver.findElement(By.cssSelector("h3[class=lbHeader"));
		WebElement interval = driver.findElement(By.cssSelector("select[id='quarter_q'"));
		interval.click();
		Select select = new Select(interval);
		select.selectByIndex(2);
		WebElement include = driver.findElement(By.cssSelector("select[id='open'"));
		include.click();
		Select select1 = new Select(include);
		select1.selectByIndex(3);
		reports.logTestPassed("TC19");
	}

	@Test
	public static void TC20() {
		reports.startSingleTestReport("TC20");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Leads Tab'")));
		WebElement opp = driver.findElement(By.cssSelector("a[title='Leads Tab'"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		reports.logTestPassed("TC20");
	}

}
