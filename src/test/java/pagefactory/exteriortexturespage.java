package pagefactory;
//3rd page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exteriortexturespage {
	
	WebDriver driver;
	   
    public exteriortexturespage(WebDriver driver3) {
		
    	this.driver=driver3;
        PageFactory.initElements(driver3,this);
	}

    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/section[2]/div[1]/div/div[1]/div/button")
    WebElement filclick;
    
    
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/section[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/button/span[3]")
    WebElement apexfil;
    
    
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/section[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/button/span[3]")
    WebElement economyfil;
    
    
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/section[2]/div[1]/div/div[2]/div[4]/div[2]/button")
    WebElement filterapply;
    
    
    
    
 

//5th scenario
    





	public void filter_click() {
		filclick.click();
		
	}


	public void apex_fil_click() {
		apexfil.click();
	}


	public void economy_fil_click() {
		economyfil.click();
		
	}


	public void filter_apply() {
		
		filterapply.click();
	}
    
    
    
}
