package org.sample;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneDimensionalList {
	static WebDriver driver;
	@Given("The user should be telecom homepage and click the Add Customer")
	public void the_user_should_be_telecom_homepage_and_click_the_Add_Customer() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\RubyCucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given-1");
	   
	}
	//One Dimensional List
/*
	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable onedlist) {
		List<String> oned = onedlist.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(oned.get(0));
	    driver.findElement(By.id("lname")).sendKeys(oned.get(1));
	    driver.findElement(By.id("email")).sendKeys(oned.get(2));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(oned.get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));;
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    System.out.println("When-1");	
	   
	}
*/
	//One dimensional map
	/*
	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable onedmap) {
		Map<String, String> oned = onedmap.asMap(String.class, String.class);
		System.out.println("One dimensional map");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(oned.get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(oned.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(oned.get("email"));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(oned.get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(oned.get("phone"));;
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    System.out.println("When-1");	
	   
	}*/
	//Two dimensional list
/*	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable twodlist) {
		List<List<String>> twod = twodlist.asLists(String.class);
		System.out.println("Two dimensional list");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(twod.get(0).get(0));
	    driver.findElement(By.id("lname")).sendKeys(twod.get(0).get(1));
	    driver.findElement(By.id("email")).sendKeys(twod.get(0).get(2));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twod.get(0).get(3));
	    driver.findElement(By.id("telephoneno")).sendKeys(twod.get(1).get(4));;
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    System.out.println("When-1");	
	}
*/
	//Two dimensional Map
	@When("The user should provide valid details")
	public void the_user_should_provide_valid_details(io.cucumber.datatable.DataTable twodmap) {
		List<Map<String, String>> twod = twodmap.asMaps(String.class, String.class);
		System.out.println("Two dimensional Map");
		System.out.println(twod);
		System.out.println("When-1");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.id("fname")).sendKeys(twod.get(2).get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(twod.get(2).get("lname"));
	    driver.findElement(By.id("email")).sendKeys(twod.get(2).get("email"));
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twod.get(2).get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(twod.get(2).get("phone"));;
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();   
	}
	
	@Then("The user should validate the Customer ID")
	public void the_user_should_validate_the_Customer_ID() {
		System.out.println("Then-1");
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	    
	}



}
