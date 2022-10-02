package com.automationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TeckArchTestsAccount extends Driver {
	@Test
	public static void TC10() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Account_Tab")));
		WebElement accounts = driver.findElement(By.id("Account_Tab"));
		accounts.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement newc = driver.findElement(By.cssSelector("input[title='New']"));
		newc.click();
		WebElement acc_name = driver.findElement(By.cssSelector("label[for='acc2']"));
		acc_name.click();
		driver.findElement(By.cssSelector("#acc2")).sendKeys("saving");
		Select type = new Select(driver.findElement(By.cssSelector("#acc6")));
		type.selectByVisibleText("Technology Partner");
		Select cp = new Select(driver.findElement(By.id("00N5g00000VQye6")));
		cp.selectByIndex(2);
	}

	@Test
	public static void TC11() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Account_Tab")));
		WebElement accounts = driver.findElement(By.id("Account_Tab"));
		accounts.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement view = driver.findElement(By.xpath("//a[normalize-space()='Create New View']"));
		view.click();
		WebElement view_name = driver.findElement(By.cssSelector("#fname"));
		view_name.sendKeys("Sasi Rekha");
		WebElement view_unique = driver.findElement(By.cssSelector("input[id='devname']"));
		view_unique.sendKeys("Sasi_rekha");
		WebElement save = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		save.click();
	}

	@Test
	public static void TC12() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Account_Tab")));
		WebElement accounts = driver.findElement(By.id("Account_Tab"));
		accounts.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
	}

	@Test
	public static void TC13() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Account_Tab")));
		WebElement accounts = driver.findElement(By.id("Account_Tab"));
		accounts.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement merge = driver.findElement(By.linkText("Merge Accounts"));
		merge.click();
		WebElement acc_name = driver.findElement(By.cssSelector("input[class='btn']"));
		acc_name.sendKeys("Sasi Sathya");
		acc_name.click();
	}

	@Test
	public static void TC14() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Account_Tab")));
		WebElement accounts = driver.findElement(By.id("Account_Tab"));
		accounts.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement calendar = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
		calendar.click();
		WebElement datedp = driver.findElement(By.id("ext-gen147"));
		datedp.click();
		WebElement createdt = driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']"));
		createdt.click();
		WebElement fro_date = driver.findElement(By.cssSelector("#ext-gen152"));
		fro_date.click();
		WebElement date = driver.findElement(By.cssSelector("td[class='x-date-active x-date-today x-date-selected']"));
		date.click();
		// WaitUntilpageLoads();
		WebElement save = driver.findElement(By.cssSelector("td[class='x-btn-mc'"));
		save.click();
		WebElement report = driver.findElement(By.cssSelector("input[id='saveReportDlg_reportNameField'"));
		report.sendKeys("testing");
		WebElement uni_rep = driver.findElement(By.cssSelector("input[id='saveReportDlg_DeveloperName'"));
		uni_rep.clear();
		uni_rep.sendKeys("testing_selenium");
		WebElement savereport = driver.findElement(By.cssSelector("table[id='dlgSaveAndRun'"));
		savereport.click();
	}

	@Test
	public static void TC15() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Opportunity_Tab")));
		WebElement opp = driver.findElement(By.id("Opportunity_Tab"));
		opp.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement view = driver.findElement(By.cssSelector("select[id='fcf'"));
		view.click();
	}
}
