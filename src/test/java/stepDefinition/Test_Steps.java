package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {
	
	WebDriver driver;
	String expectedGreeting = "Hello Jayakishore!";
	String expectedTitle = "Adactin.com - Search Hotel";
	String usName = "";
	
	@Given("when user is on the login page")
	public void when_user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Im at login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		WebElement uName= driver.findElement(By.id("username"));
		uName.sendKeys("Jayakishore");
		usName= "Jayakishore";
		driver.findElement(By.id("password")).sendKeys("Test@12345");
	    // Write code here that turns the phrase above into concrete actions
	   // System.out.println("entering username & password");
	}
	
	@When("user enters \"(.*)\",\"(.*)\"$")
	public void  user_enters_username_and_password(String username,String password) {
		WebElement uName= driver.findElement(By.id("username"));
		uName.sendKeys(username);
		usName= username;
		WebElement pWD = driver.findElement(By.id("password"));
		pWD.sendKeys(password);
		System.out.println("Second method for params");
	    // Write code here that turns the phrase above into concrete actions
	   // System.out.println("entering username & password");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Click on Login button ");
	}

	@Then("Login is successfull")
	public void login_is_successfull() {
		String actualGreeting = driver.findElement(By.id("username_show")).getAttribute("value");
		String expectedGreeting = "Hello "+usName+"!";
		assertEquals(expectedGreeting, actualGreeting);
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Login is successfull");
	}

	@Then("Search hotel page is displayed")
	public void search_hotel_page_is_displayed() {
	String actualTitle= driver.getTitle();
    assertEquals(expectedTitle, actualTitle);
    
	    // Write code here that turns the phrase above into concrete actions
	    // System.out.println(greeting);
	}
	
	@When("User selects the \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
	public void user_selects_the(String location, String rooms, String checkin, String checkout, String adults) {
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	//}

	//@When("User selects the  \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\"$")
	//public void user_selects_the(String location, String rooms, String checkin, String checkout, String adults) {
		
		//Drop down  to select Location
		new Select(driver.findElement(By.className("search_combobox"))).selectByValue(location);
			
		//Drop down to select Number of Rooms
		 new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(rooms);
		 
		 //Date picker-Enter check in date
		 WebElement checkinDate = driver.findElement(By.id("datepick_in"));
		 checkinDate.clear();
		 checkinDate.sendKeys(checkin);
		 
		 //Date picker-Enter checkout date
		 WebElement checkoutDate = driver.findElement(By.id("datepick_out"));
		 checkoutDate.clear();
		 checkoutDate.sendKeys(checkout);
         
		 //Select Adults per room
		 new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adults);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on search")
	public void user_clicks_on_search() {
		//Click on Search
		driver.findElement(By.id("Submit")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Search results should be displayed")
	public void search_results_should_be_displayed() {
		System.out.println("Successful search page");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("This is a blank test")
	public void this_is_a_blank_test() {
		System.out.println("Successfull test run");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
