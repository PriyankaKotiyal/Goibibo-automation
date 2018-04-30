package stepsDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends AbstractPage{

	public LandingPage(WebDriver driver) {
		super(driver);
		
	}
	
	/*public LandingPage cancelPopup() {
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
		return new LandingPage(driver);
	}
	*/
	public LandingPage enterFlightDetails(String arg1 , String arg2) throws InterruptedException {
		WebElement fromOptions = driver.findElement(By.id("gosuggest_inputSrc"));
		fromOptions.sendKeys(arg1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-autosuggest-1-suggestion--0']/div/div[2]/div[1]/span[1]")).click();
		
	
	    WebElement toOptions = driver.findElement(By.id("gosuggest_inputDest"));
	    toOptions.sendKeys(arg2);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='react-autosuggest-1-suggestion--0']/div/div[2]/div[1]/span[1]")).click();
	
    
	   
	    return new LandingPage(driver);
  } 

	    public LandingPage chooseDepartDate() {
	    	   	
	    	List<WebElement> dates =  driver.findElements(By.xpath("//div[@id='fare_20180430']"));
	    	  
	    	
	    	 for(int i=0; i<dates.size();i++) {
	 			
	 			String date = dates.get(i).getText();
	 			
	 			if(date.equalsIgnoreCase("30")) 
	 				
	 				dates.get(i).click();
	    	 
	    	 }  
	 			
	 				
		
	    	 
	    	
	    	
	    	 return new LandingPage(driver); 	 
	}  
	    
	  

		public LandingPage chooseReturnDate() {
	    	
		List <WebElement> ele = driver.findElements(By.xpath("//input[@class='form-control inputTxtLarge widgetCalenderTxt']"));
				for(int i=0; i<ele.size(); i++) {
					if(i==1) {
						ele.get(i).click();
					}
				}
	    	List<WebElement> dates =  driver.findElements(By.xpath("//div[@id='fare_20180503']"));
	    	  

	    	 for(int i=0; i<dates.size();i++) {
	 			
	 			String date = dates.get(i).getText();
	
	 			
	 			if(date.equalsIgnoreCase("3")) {
	 				
	 				dates.get(i).click();
	 			
	 					
	 				}
		}
	   
	 
			
			
	    	 return new LandingPage(driver); 	 
	}  
		
		public FlightSearch clickSearch() throws InterruptedException {
			driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();
			Thread.sleep(6000);
			return new FlightSearch(driver);
		}
}


