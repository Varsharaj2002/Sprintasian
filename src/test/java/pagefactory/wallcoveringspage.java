package pagefactory;
//2nd page
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wallcoveringspage {
	
	WebDriver driver;
   
    public wallcoveringspage(WebDriver driver2) {
		
    	this.driver=driver2;
        PageFactory.initElements(driver2,this);
	}



	@FindBy(xpath=" /html/body/div[1]/div/div[2]/div/div[5]/div/div/div/div[2]/div[1]/a/div[1]/div/img")
    WebElement image;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/div[1]/label/span[2] ")
	public
    WebElement filter1;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/div[2]/label/span[2]")
	public
    WebElement filter2;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/section/div[2]/div/div[1]/div[2]/form/fieldset[1]/div[3]/label/span[2]")
	public
    WebElement filter3;
    
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/section/div[2]/div/div[1]/div[1]/div/button[1]")
	public
    WebElement clearall;
    
    
    //3rd scenario, 4th scenario
    
    public void image_enter() {
   	 image.click();
    }
    
    public void filter1_enter() {
      	 filter1.click();
       }
    
    public void filter2_enter() {
    	filter2.click();
       }
    
    public void filter3_enter() {
    	filter3.click();
       }
    

	public void clearall_enter() {
		clearall.click();
		
	}

}
