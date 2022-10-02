package com.automationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TekArchTestContact extends Driver {

	@Test
	public static void TC25() {
		reports.startSingleTestReport("TC25");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement new1 = driver.findElement(By.cssSelector("input[title='New'"));
		new1.click();
		WebElement last_name = driver.findElement(By.cssSelector("input[id='name_lastcon2'"));
		last_name.sendKeys("Last Name");
		WebElement acc_type = driver.findElement(By.cssSelector("input[id='con4'"));
		acc_type.sendKeys("GenePoint");
		WebElement save = driver.findElement(By.cssSelector("input[title='Save'"));
		save.click();
		reports.logTestPassed("TC25");
	}

	@Test
	public static void TC26() {
		reports.startSingleTestReport("TC26");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement createnew = driver.findElement(By.linkText("Create New View"));
		createnew.click();
		WebElement view = driver.findElement(By.cssSelector("input[id='fname'"));
		view.sendKeys("Sakthi");
		WebElement unique_name = driver.findElement(By.cssSelector("input[id='devname'"));
		unique_name.click();
		WebElement save = driver.findElement(By.cssSelector("input[title='Save'"));
		save.click();
		reports.logTestPassed("TC26");
	}

	@Test
	public static void TC27() {
		reports.startSingleTestReport("TC27");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement recent = driver.findElement(By.cssSelector("select[id='hotlist_mode'"));
		recent.click();
		reports.logTestPassed("TC27");
	}

	@Test
	public static void TC28() {
		reports.startSingleTestReport("TC28");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#fcf")));
		WebElement view = driver.findElement(By.cssSelector("#fcf"));
		view.click();
		Select select = new Select(view);
		select.selectByIndex(3);
		reports.logTestPassed("TC28");
	}

	@Test
	public static void TC29() {
		reports.startSingleTestReport("TC29");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement click_name = driver.findElement(By.linkText("Last Name"));
		click_name.click();
		reports.logTestPassed("TC29");

	}

	@Test
	public static void TC30() {
		reports.startSingleTestReport("TC30");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement createnew = driver.findElement(By.linkText("Create New View"));
		createnew.click();
		WebElement view = driver.findElement(By.cssSelector("input[id='fname'"));
		view.sendKeys("Sakthi");
		WebElement unique_name = driver.findElement(By.cssSelector("input[id='devname'"));
		unique_name.click();
		WebElement save = driver.findElement(By.cssSelector("input[title='Save'"));
		save.click();
		reports.logTestPassed("TC30");
	}

	@Test
	public static void TC31() {
		reports.startSingleTestReport("TC31");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement createnew = driver.findElement(By.linkText("Create New View"));
		createnew.click();
		WebElement view = driver.findElement(By.cssSelector("input[id='fname'"));
		view.sendKeys("ABCD");
		WebElement unique_name = driver.findElement(By.cssSelector("input[id='devname'"));
		unique_name.clear();
		unique_name.sendKeys("EFGH");
		WebElement cancel = driver.findElement(By.cssSelector("input[title='Cancel'"));
		cancel.click();
		reports.logTestPassed("TC31");
	}

	@Test
	public static void TC32() {
		reports.startSingleTestReport("TC32");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Contacts Tab'")));
		WebElement contact = driver.findElement(By.cssSelector("a[title='Contacts Tab'"));
		contact.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement new1 = driver.findElement(By.cssSelector("input[title='New'"));
		new1.click();
		WebElement last_name = driver.findElement(By.cssSelector("input[id='name_lastcon2'"));
		last_name.sendKeys("Indian");
		WebElement acc_type = driver.findElement(By.cssSelector("input[id='con4'"));
		acc_type.sendKeys("Global Media");
		WebElement save_new = driver.findElement(By.cssSelector("input[title='Save & New'"));
		save_new.click();
		reports.logTestPassed("TC32");
	}
}
