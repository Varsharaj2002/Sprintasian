package Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelDataExceuter {
	@Test(dataProvider = "search", dataProviderClass = ExcelDataReader.class)
    public void TestExcel(String search) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
        	driver.manage().window().maximize();
            driver.get("https://www.asianpaints.com/");
            WebElement colname = driver.findElement(By.xpath("//*[@id=\"headerSearch\"]/div/form/div"));
            colname.click();
            Thread.sleep(3000);
            WebElement colourname = driver.findElement(By.xpath("//*[@id=\"headerSearch\"]/div/form/div/input[1]"));
            colourname.sendKeys(search);
 

            WebElement searchs = driver.findElement(By.xpath("//*[@id=\"headerSearch\"]/div/form/div/button/span"));
            searchs.click();
        } 
        finally {
            driver.quit();
        }
    }

}
