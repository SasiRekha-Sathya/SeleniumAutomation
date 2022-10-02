package com.automationscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class TekArchTestRS extends Driver {

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

	@Test
	public static void TC33() {
		reports.startSingleTestReport("TC33");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Home Tab'")));
		WebElement home = driver.findElement(By.cssSelector("a[title='Home Tab'"));
		home.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.cssSelector("h1[class='currentStatusUserName'] a")).click();;
		reports.logTestPassed("TC33");
	}

	@Test
	public static void TC34() {
		reports.startSingleTestReport("TC34");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Home Tab'")));
		WebElement home = driver.findElement(By.cssSelector("a[title='Home Tab'"));
		home.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement name = driver.findElement(By.cssSelector("h1[class='currentStatusUserName'] a"));
		name.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("div[class='editPen'] a[class='contactInfoLaunch editLink'] img")));
		WebElement edit = driver
				.findElement(By.cssSelector("div[class='editPen'] a[class='contactInfoLaunch editLink'] img"));
		wait.until(jsLoad);
		edit.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("contactInfoContentId")));
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		WebElement about1 = driver.findElement(By.id("aboutTab"));
		about1.click();
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Prabu" + new RandomString(8).nextString());
		driver.findElement(By.cssSelector("input[value='Save All']")).click();
		reports.logTestPassed("TC34");
	}
	
	@Test
	public static void TC35() {
		reports.startSingleTestReport("TC35");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("li[id='AllTab_Tab'] a")));
		driver.findElement(By.cssSelector("li[id='AllTab_Tab'] a")).click();
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector("input[value='Customize My Tabs']")));
		driver.findElement(By.cssSelector("input[value='Customize My Tabs']")).click();
		Select tabs_from = new Select(driver.findElement(By.id("duel_select_0")));
		tabs_from.selectByIndex(0);
		driver.findElement(By.id("duel_select_0_right")).click();
		Select tabs_to = new Select(driver.findElement(By.id("duel_select_1")));
		tabs_to.selectByIndex(tabs_to.getOptions().size() - 1);
		;
		driver.findElement(By.id("duel_select_0_left")).click();
		driver.findElement(By.cssSelector("input[title='Save']")).click();
		reports.logTestPassed("TC35");
	}

	@Test
	public static void TC36() {
		reports.startSingleTestReport("TC36");
		WebElement home = driver.findElement(By.cssSelector("a[title='Home Tab'"));
		home.click();	
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.cssSelector("span[class='pageDescription'] a")).click();
		WebElement pm=driver.findElement(By.cssSelector("div[id='p:f:j_id25:j_id61:28:j_id64'] a"));
		pm.click();
		driver.findElement(By.cssSelector("a[title='Combo (New Window)']")).click();
		Set<String> handles=driver.getWindowHandles();
		handles.remove(driver.getWindowHandle());
		driver.switchTo().window(handles.toArray()[0].toString());
		driver.findElement(By.cssSelector("li[class=listItem4] a")).click();
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		driver.findElement(By.id("EndDateTime_time")).click();
		driver.findElement(By.id("timePickerItem_42")).click();
		driver.findElement(By.cssSelector("input[value=' Save '][title='Save']")).click();
		reports.logTestPassed("TC36");
	}

	@Test
	public static void TC37() {
		reports.startSingleTestReport("TC37");
		WebElement home = driver.findElement(By.cssSelector("a[title='Home Tab'"));
		home.click();	
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.cssSelector("span[class='pageDescription'] a")).click();
		WebElement pm=driver.findElement(By.cssSelector("div[id='p:f:j_id25:j_id61:20:j_id64'] a"));
		pm.click();
		driver.findElement(By.cssSelector("a[title='Combo (New Window)']")).click();
		Set<String> handles=driver.getWindowHandles();
		handles.remove(driver.getWindowHandle());
		driver.switchTo().window(handles.toArray()[0].toString());
		driver.findElement(By.cssSelector("li[class=listItem4] a")).click();
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		driver.findElement(By.id("EndDateTime_time")).click();
		driver.findElement(By.id("timePickerItem_38")).click();
		driver.findElement(By.id("IsRecurrence")).click();
		driver.findElement(By.id("rectypeftw")).click();
		driver.findElement(By.id("RecurrenceEndDateOnly")).click();
		int day=java.time.LocalDate.now().plusWeeks(2).getDayOfMonth();
		//System.out.println(day);
		driver.findElement(By.xpath("//table[@class='calDays']//tbody//tr/td[contains(text(),'"+day+"')]")).click();
		driver.findElement(By.cssSelector("input[value=' Save '][title='Save']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[title='Month View'] img")));
		driver.findElement(By.cssSelector("a[title='Month View'] img")).click();
		reports.logTestPassed("TC37");
	}

}
