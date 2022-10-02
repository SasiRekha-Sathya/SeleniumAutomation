package com.automationscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.extentreport.test.Generatereports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static Generatereports reports = null;

	@BeforeSuite
	public void setupBeforeTest() {
		reports=Generatereports.getInstance();
		reports.startExtentReport();
	}

	@BeforeMethod
	@Parameters({"browsername","url"})
	public void setup(String browsername,String url) {
		getDriver(browsername);
		gotoUrl(url);
	}

	public static void gotoUrl(String url) {
		driver.get(url);
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

	@BeforeMethod(groups = "SalesForce",dependsOnMethods = "setup")
	public void login() {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("gokila@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("s21111986");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
	}

	@AfterSuite
	public void endReport() {
		reports.endReport();
	}
	
	public static void getDriver(String browser) {
		switch (browser) {
		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			//This represents running in the background
			firefoxOptions.addPreference("fission.webContentIsolationStrategy", 0);
			firefoxOptions.addPreference("fission.bfcacheInParent", false);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(firefoxOptions);
			break;

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			break;
		}		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//return driver;

	}

	public static void entertext(WebElement element, String text, String objName) {

		if (element.isDisplayed()) {
			clearElement(element, objName);
			element.sendKeys(text);
			System.out.println("text entered in" + objName + "field");
		} else {
			System.out.println("text entered in" + objName + "fail");
		}

	}

	public static void clearElement(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("text entered in" + objName + "field");
		} else {
			System.out.println("text entered in" + objName + "fail");
		}
	}

	/*public static WebDriver getDriverInstance(String browsername) {
		if (driver != null) {
			return driver;
		} else
			return getDriver(browsername);

	}*/

	public static void WaitUntilpageLoads() throws InterruptedException {
		driver.manage().window().wait(30);
	}
	
	static ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      @Override
	      public Boolean apply(WebDriver driver) {
	           return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
	      }
	    };

	public static void WaitUntilVisibilittyOf(By locator, String objName) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		((Wait<WebDriver>) wait).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static String readtext(WebElement element, String objname) {
		WaitUntilVisisble(element, objname);
		String text = element.getText();
		return text;
	}

	public static void WaitUntilAlertIsppresent() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	private static void WaitUntilVisisble(WebElement element, String objname) {
		// TODO Auto-generated method stub

	}

	public static void WaitUntilElementToBeclicked(By locator, String objname) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public static void CloseAllBrowser() {
		driver.quit();
	}

	public static String getAlerrtText(Alert alert) {
		return alert.getText();
	}

	public static void dismissAlert() {
		WaitUntilAlertIsppresent();
		Alert alert = SwitchToAlert();
		alert.dismiss();
	}

	private static Alert SwitchToAlert() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void SwitchToWindowOpened(String mainwindowhandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			if (!mainwindowhandle.equalsIgnoreCase(handle))
				;
			driver.switchTo().window(handle);

		}
	}

}
