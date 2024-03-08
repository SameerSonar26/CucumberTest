package com.ss;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword {
	public RemoteWebDriver driver;

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Launching Chrome Driver");
		}else if (browserName.equalsIgnoreCase("FirFox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Launching FireFox Driver");
		}else {
			throw new Error();
		}

	}

}
