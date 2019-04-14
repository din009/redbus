package com.cts.red.bus.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.hook.HookTest;
import com.cts.red.bus.functionlibrary.FunctionLibrary;

public class PomTest extends HookTest  {
FunctionLibrary ft = new FunctionLibrary();
public PomTest() {
PageFactory.initElements(driver, this);

}
	
@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement from;
public FunctionLibrary getFt() {
	return ft;
}

public WebElement getFrom() {
	return from;
}

public WebElement getTo() {
	return to;
}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement to;


	
}
