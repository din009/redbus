package com.cts.hook;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookTest {
public static WebDriver driver;
@Before
public static void openBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\RedBusProject\\driver\\chromedriver.exe");	
driver = new ChromeDriver();


}
@After
public static void closeBrowser() {
	
} 
}
