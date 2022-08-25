package com.w3school.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public static void initilization() throws IOException {

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C://Users//Microsoft//eclipse-workspace//W3School//src//test//resources//config.properties");
		prop.load(fs);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("fireefox")) {

		} else if (browserName.equalsIgnoreCase("edge")) {

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
}
