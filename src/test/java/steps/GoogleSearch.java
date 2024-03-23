package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageObjects;

public class GoogleSearch extends GoogleBase {
	PageObjects po;

	@Given("I am on a google homepage")
	public void i_am_on_a_google_homepage() {

		launchBrowser();

	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {

		// step 1:identify and locate the element
		// 8 locators: id..name..class name..html..tag..link test..partial link test..x
		// path.css selector
		//WebElement searchBox = driver.findElement(By.id("APjFqb"));
		// Step 2: perform the action
		//searchBox.sendKeys(string);
		
		
		po=new PageObjects(driver);
		po.enterSearch(string);

	}

	@When("i click search button")
	public void i_click_search_button() {
		
		//WebElement searchBtn = driver.findElement(By.name("btnK"));
         po.clicksearch();

	}

	@Then("I receive the result")
	public void i_receive_the_result() {

		WebElement result = driver.findElement(By.id("result-stats"));
		String myResult = result.getText();

		System.out.println("***********");
		System.out.println(myResult);
		System.out.println("************");

		closeBrowser();

	}

}
