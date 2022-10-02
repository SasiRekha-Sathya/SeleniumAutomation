package com.automationscript;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TeckArchTestsUserMenu extends Driver {
	@Test
	public void TC05() {
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
	}

	@Test
	public static void TC06_a() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		WebElement myprofile = driver.findElement(By.linkText("My Profile"));
		myprofile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement editprofile = driver
				.findElement(By.cssSelector("a[class='contactInfoLaunch editLink'] img[title='Edit Profile']"));
		editprofile.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("contactInfoContent")));
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		WebElement about = driver.findElement(By.id("aboutTab"));
		about.click();
		WebElement lastname = driver.findElement(By.id("lastName"));
		entertext(lastname, "Sathya", "lastname");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Post']")));
		WebElement post = driver.findElement(By.xpath("//span[normalize-space()='Post']"));
		post.click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='cke_wysiwyg_frame cke_reset']")));
		WebElement bodytext = driver.findElement(By.tagName("body"));
		bodytext.click();
		entertext(bodytext, "I am a tester", "potstsext");
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='suggestions']")));
		driver.findElement(By.id("publisherAttachContentPost")).click();
		driver.findElement(By.id("chatterUploadFileAction")).click();
		Path resourceDirectory = Paths.get("src", "test", "resources", "test_upload.txt");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		driver.findElement(By.id("chatterFile")).sendKeys(absolutePath);
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='suggestions']")));
	}

	@Test
	public static void TC06_b() throws URISyntaxException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		WebElement myprofile = driver.findElement(By.linkText("My Profile"));
		myprofile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("img[class='chatter-photo'"))).perform();
		WebElement addphoto = driver.findElement(By.id("uploadLink"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("displayBadge")));
		wait.until(ExpectedConditions.elementToBeClickable(addphoto));
		addphoto.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("uploadPhotoContentId")));
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		Path resourceDirectory = Paths.get("src", "test", "resources", "profile.jpg");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		driver.findElement(By.cssSelector("input[class='fileInput']")).sendKeys(absolutePath);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("j_id0:uploadFileForm:uploadBtn")));
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[class='uploadContainer']")));
		actions.moveToElement(driver.findElement(By.cssSelector("div[class='imgCrop_handle imgCrop_handleNW']")))
				.clickAndHold().moveByOffset(25, 0).release().build().perform();
		driver.findElement(By.id("j_id0:j_id7:save")).click();
	}

	@Test
	public static void TC07() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		WebElement settings = driver.findElement(By.cssSelector("a[class='menuButtonMenuLink'"));
		settings.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='folderText'")));
		WebElement mysettings = driver.findElement(By.cssSelector("span[class='folderText'"));
		mysettings.click();
		driver.findElement(By.id("PersonalInfo_font")).click();
		driver.findElement(By.id("LoginHistory_font")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("DisplayAndLayout_font")));
		driver.findElement(By.id("DisplayAndLayout_font")).click();
		driver.findElement(By.id("CustomizeTabs_font")).click();
		Select content = new Select(driver.findElement(By.id("p4")));
		content.selectByVisibleText("Salesforce Chatter");
		Select selected = new Select(driver.findElement(By.id("duel_select_1")));
		selected.selectByVisibleText("Reports");
		driver.findElement(By.id("duel_select_0_left")).click();
		WebElement email = driver.findElement(By.cssSelector("div[id='EmailSetup'] a[class='header setupFolder'"));
		email.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("EmailSettings_font")));
		driver.findElement(By.id("EmailSettings_font")).click();
		WebElement label = driver.findElement(By.id("sender_name"));
		entertext(label, "Sasi Prabu", "namechange");
		WebElement yesbutton = driver.findElement(By.id("auto_bcc0"));
		yesbutton.click();
		WebElement save = driver.findElement(By.cssSelector("input[class='btn primary'"));
		save.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(250,350)");
		WebElement calendar = driver
				.findElement(By.cssSelector("div[id='CalendarAndReminders'] a[class='header setupFolder'"));
		calendar.click();
		driver.findElement(By.id("Reminders_font")).click();
		driver.findElement(By.id("testbtn")).click();
	}

	@Test
	public static void TC08() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		WebElement dc = driver.findElement(By.cssSelector("a[class='debugLogLink menuButtonMenuLink'"));
		dc.click();
		String base = driver.getWindowHandle();
		Set<String> all_windows = driver.getWindowHandles();
		all_windows.remove(base);
		driver.switchTo().window(all_windows.toArray()[0].toString());
		driver.close();
		driver.switchTo().window(base);
	}

	@Test
	public static void TC09() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
