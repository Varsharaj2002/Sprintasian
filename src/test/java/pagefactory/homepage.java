package pagefactory;
//1st page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	WebDriver driver;
          public homepage(WebDriver driver) {
             this.driver=driver;
             PageFactory.initElements(driver,this);

	     }
     @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[1]/input")
     WebElement name;
     
     @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[2]/input")
     WebElement email;
     
     @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[3]/input")
     WebElement phone;
     
     @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[4]/input")
     WebElement pin;
     
     
     @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[2]/div[2]/button")
     WebElement submit;
     
     
    
     
    //1st scenario
     
     
     public void name_enter() {
    	 name.sendKeys("varsha");
     }
     public void email_enter() {
    	 email.sendKeys("varsha@gmail.com");
     }
     public void phone_enter() {
    	 phone.sendKeys("9951536055");
     }
     
     public void pin_enter() {
    	 pin.sendKeys("530013");
     }
     
     public void submit_enter() {
    	 submit.click();
     }
     
     
     
    //2nd scenario
     
     public void validname_enter() {
    	 name.sendKeys("varsha");
     }
     public void validemail_enter() {
    	 email.sendKeys("varsha@gmail.com");
     }
     public void validphone_enter() {
    	 phone.sendKeys("9951536055");
     }
     
     public void invalidpin_enter() {
    	 pin.sendKeys("5300");
     }
	
     
     
     
    //scenario outline 6th scenario
     
     @FindBy (xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[1]/input")
	    WebElement soname;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[2]/input")
	    WebElement soemail;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[3]/input")
	    WebElement sophone;
	    
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[4]/input")
	    WebElement sopin;
	    
	    
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div[2]/div[2]/button")
	    WebElement sosubmit;
     
	    public void Name(String name) {
	   	 soname.sendKeys(name);
	    }
	    
	    
	    public void Email(String email) {
	   	 soemail.sendKeys(email);
	    }
	    public void Mobile(String mobile) {
	   	 sophone.sendKeys(mobile);
	    }
	    
	    public void Pincode(String pincode) {
	   	 sopin.sendKeys(pincode);
	    }
	    
	    public void sosubmit_enter() {
	   	 sosubmit.click();
	    }

     
}
