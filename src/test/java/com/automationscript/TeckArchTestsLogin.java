package com.automationscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeckArchTestsLogin extends Driver {
	@Test(priority = 1)
	public static void loginSuccess() {
		reports.startSingleTestReport("loginSuccess");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gokila@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("s21111986");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		reports.logTestPassed("rememberMe");
	}

	@Test(priority = 2)
	public static void loginFailure() {
		reports.startSingleTestReport("loginFailure");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("gokila@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		reports.logTestPassed("loginFailure");
	}

	@Test(priority = 3)
	public static void forgetpassword() {
		reports.startSingleTestReport("forgetpassword");
		WebElement forpass = driver.findElement(By.id("forgot_password_link"));
		forpass.click();
		WebElement userrbox = driver.findElement(By.id("un"));
		userrbox.sendKeys("gokila@tekarch.com");
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		reports.logTestPassed("forgetpassword");
	}

	@Test(priority = 4)
	public static void forgetpassword4() {
		reports.startSingleTestReport("forgetpassword4");
		WebElement userrbox = driver.findElement(By.id("username"));
		userrbox.sendKeys("123");
		if(userrbox.equals("gokila.tekarch.com")) {
			reports.logTestFailed("forgetpassword4");}
		else {
			reports.logTestPassed("forgetpassword4");
		}
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22121");
		if(password.equals("s21111986")) {
			reports.logTestFailed("forgetpassword4");
		}else {
			reports.logTestPassed("forgetpassword4");
		}
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		reports.logTestPassed("forgetpassword4");
	}

	@Test(priority = 5)
	public static void rememberMe() {
		reports.startSingleTestReport("rememberMe");
		driver.findElement(By.id("rememberUn")).click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("gokila@tekarch.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("s21111986");
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("userNav")));
		WebElement dropdown = driver.findElement(By.id("userNav"));
		dropdown.click();
		driver.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("idcard-identity")));
		String usernameText = driver.findElement(By.id("idcard-identity")).getText();
		System.out.println(usernameText);
		if (usernameText.equalsIgnoreCase("gokila@tekarch.com")) {
			reports.logTestPassed("rememberMe");
		} else {
			reports.logTestFailed("rememberMe");
		}
		Assert.assertEquals(usernameText, "gokila@tekarch.com");
	}
}
