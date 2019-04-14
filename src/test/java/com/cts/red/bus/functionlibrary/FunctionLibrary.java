package com.cts.red.bus.functionlibrary;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.hook.HookTest;

public class FunctionLibrary extends HookTest {
public void loadURL(String url) {
	HookTest.driver.get(url);
}

public void windowMaximize() {
	HookTest.driver.manage().window().maximize();
}

public void threadSleep() throws InterruptedException {
	Thread.sleep(3000);
	
}


public void waitFunction(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, 300);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void sendData(WebElement element,String data) {
	element.sendKeys(data);
}


public void webpageNotificationHandle() {
	Map<String, Object> prefs = new HashMap<String, Object>();
prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	driver = new ChromeDriver(options);

}

}
