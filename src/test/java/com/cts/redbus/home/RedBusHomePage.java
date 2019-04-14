package com.cts.redbus.home;

import com.cts.hook.HookTest;
import com.cts.red.bus.functionlibrary.FunctionLibrary;
import com.cts.red.bus.pom.PomTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusHomePage extends PomTest {
	FunctionLibrary ft = new FunctionLibrary();
	PomTest pt = new PomTest();
	
	@Given("The user should be in redbus home page")
	public void the_user_should_be_in_redbus_home_page() throws InterruptedException {
		ft.loadURL("https://www.redbus.in/");
		ft.windowMaximize();
		ft.threadSleep();
		ft.webpageNotificationHandle();
		
	}

	@When("The user should select from and to{string},{string}")
	public void the_user_should_select_from_and_to(String from, String to) {
		ft.sendData(pt.getFrom(),from);
		ft.sendData(pt.getTo(),to);
	}

	@Then("The user should select search buses")
	public void the_user_should_select_search_buses() {
	System.out.println("Code executed successfully");
	}



}
