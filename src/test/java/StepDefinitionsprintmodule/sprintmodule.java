package StepDefinitionsprintmodule;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.exteriortexturespage;
import pagefactory.homepage;

import pagefactory.wallcoveringspage;

public class sprintmodule {
	WebDriver driver;
	//1st moduleS
	@Given("I am on the Asian Paints website")
	public void i_am_on_the_asian_paints_website() {
	   
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		 
		driver = new ChromeDriver(opt);
 
		driver.manage().window().maximize();
 
		String url = ("https://www.asianpaints.com/");
 
		driver.get(url);
		
	}

	@Given("I fill in the form with valid details")
	public void i_fill_in_the_form_with_valid_details() {
	   
		homepage hp=new homepage(driver);
		hp.name_enter();
		
		hp.email_enter();
		
		hp.phone_enter();
	
		hp.pin_enter();
		
	}

	@Then("I submit the form")
	public void i_submit_the_form() {
		
		homepage sb=new homepage(driver);
		sb.submit_enter();
	    
		
		
	}

	@Then("I should receive a confirmation message indicating that my details have been submitted successfully")
	public void i_should_receive_a_confirmation_message_indicating_that_my_details_have_been_submitted_successfully() {
		WebElement head = driver.findElement(By.xpath("//div[@class='thank-you-left-content']/h2[text()=' Thank you!']"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Thank you!");
	    System.out.println(value);
	}
	
	
	//2nd scenario
	
	@Given("I fill in the form with invalid details")
	public void i_fill_in_the_form_with_invalid_details() {
	   
		homepage hp2=new homepage(driver);
		hp2.validname_enter();
		
		hp2.validemail_enter();
		
		hp2.validphone_enter();
		
		hp2.invalidpin_enter();
	}

	@Then("I click submit the form")
	public void i_click_submit_the_form() {
		homepage sb1=new homepage(driver);
		sb1.submit_enter();
	   
		
	}

	@Then("I should receive a error message")
	public void i_should_receive_a_error_message() {
		
	//	//div[@class='form-global__field-message form-text-input__field-message' and text()='Enter a valid 6 digit Zip Code']
		WebElement head = driver.findElement(By.xpath("//div[@class='form-global__field-message form-text-input__field-message' and text()='Enter a valid 6 digit Zip Code']"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Enter a valid 6 digit Zip Code");
	    System.out.println(value);
	}


	
//3th scenario
	
	
	@When("I navigate to the Paints & Colours section and navigate to wallpapers")
	public void i_navigate_to_the_paints_colours_section_and_navigate_to_wallpapers() {
	    
		driver.get("https://www.asianpaints.com/products/wall-coverings.html");
	}

	@Then("I click on good earth wallpapers")
	public void i_click_on_wishlist() {
	   
		
		wallcoveringspage ie=new wallcoveringspage(driver);
		ie.image_enter();
		
		
		
	}

	@Then("I select abstract and botanical and botanicalandfloral filters")
	public void i_enter_valid_credentials() throws InterruptedException {
	    
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		
		wallcoveringspage fc=new wallcoveringspage(driver);
		fc.filter1.click();
		fc.filter2.click();
		fc.filter3.click();
		
		
		
	}

	@Then("the selected wallpaper are filtered")
	public void the_selected_wallpaper_is_added_to_wishlist() {
		
		//span[@class='appliedfilterCount' and text()='(3)']
		WebElement head = driver.findElement(By.xpath("//span[@class='appliedfilterCount' and text()='(3)']"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"3");
	    System.out.println(value);
		
	   
	}

//4th scenario
	
	
	@When("I navigate  to wallpapers and add filters")
	public void i_navigate_to_wallpapers_and_add_filters() {
	  driver.get("https://www.asianpaints.com/products/wall-coverings.html");
	  
	  wallcoveringspage ie2=new wallcoveringspage(driver);
		ie2.image_enter();
		
		
		ie2.filter1_enter();
		ie2.filter2_enter();
		
		
		
	    
	}

	@Then("I click on clear all")
	public void i_click_on_clear_all() {
	   
	
		wallcoveringspage ca=new wallcoveringspage(driver);
		ca.clearall_enter();
	}

	@Then("the selected filteres  are cleared")
	public void the_selected_filteres_are_cleared() {
		WebElement head = driver.findElement(By.xpath("//h3[@class='filter-button js-filterbutton' and text()='FILTER BY']"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"FILTER BY");
	    System.out.println(value);
	    
	}
	
	
//5th scenario
	
	@When("I navigate  to exterior textures")
	public void i_navigate_to_exterior_textures() {
		driver.get("https://www.asianpaints.com/catalogue/exterior-textures.html");
		
		
	   
	}

	@Then("I click on  filters")
	public void i_click_on_filters() throws InterruptedException {
		
		
		
		exteriortexturespage ex=new exteriortexturespage(driver);
	    ex.filter_click();
		
		Thread.sleep(1000);
	   
	}

	@Then("I click on Apex Createx Dholpur and Economy")
	public void i_click_on_calcecruda_paresian_tapestry() throws InterruptedException {
		
		exteriortexturespage fil=new exteriortexturespage(driver);
		fil.apex_fil_click();
	    Thread.sleep(1000);
	    
	    
		JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,300)");
		
		fil.economy_fil_click();
		Thread.sleep(1000);
		
	   
	}

	@Then("I can see the filtered results after clicking submit")
	public void i_can_see_the_filtered_results_after_clicking_submit() {
		
		
		exteriortexturespage filapply=new exteriortexturespage(driver);
		filapply.filter_apply();
		
		
	}

 //6th scenario
	
	@When("I fill in the enquiry form")
	public void i_fill_in_the_enquiry_form() {
	   
	}

	@Then("enters the name {string}")
	public void enters_the_name(String name) {
		
		homepage hp=new homepage(driver);
		hp.Name(name); 
		
	}

	@Then("enters the email {string}")
	public void enters_the_email(String email) {
		
		homepage hp=new homepage(driver);
		hp.Email(email);
		
	}

	@Then("enters the phonenumber {string}")
	public void enters_the_phonenumber(String mobile) {
		
		homepage hp=new homepage(driver);
		hp.Mobile(mobile) ;
	}

	@Then("enter the pincode {string}")
	public void enter_the_pincode(String pincode) {
		
		homepage hp=new homepage(driver);
		hp.Pincode(pincode) ;
	}
	@Then("I click on the Submit button")
	public void i_click_on_the_submit_button() {
		 
		homepage hp=new homepage(driver);
		hp.sosubmit_enter() ;
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		WebElement head = driver.findElement(By.xpath("//div[@class='thank-you-left-content']/h2[text()=' Thank you!']"));
	    String value = head.getText();
	    SoftAssert as = new SoftAssert();
	    as.assertEquals(value,"Thank you!");
	    System.out.println(value);
	}


	
}
