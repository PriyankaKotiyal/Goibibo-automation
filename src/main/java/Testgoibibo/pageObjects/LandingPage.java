package Testgoibibo.pageObjects;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage{
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
		
	@FindBy(how=How.ID,using = "gosuggest_inputSrc") 
	 WebElement fromOptions;
	
	@FindBy(how=How.ID,using="react-autosuggest-1-suggestion--0")
	WebElement enterFrom;
	
	@FindBy(how=How.ID,using = "gosuggest_inputDest") 
	 WebElement toOptions;
	
	@FindBy(how=How.ID,using="react-autosuggest-1-suggestion--0")
	WebElement enterTo;
	
	
	@FindBy(how=How.XPATH,using="//input[@class='form-control inputTxtLarge widgetCalenderTxt']")
	List<WebElement> ele;
	
	@FindBy(how=How.ID,using="gi_search_btn")
	WebElement getsetgo;
	
	
	
	
	public void enterFlightDetails(String arg1 , String arg2) throws InterruptedException {
		//WebElement fromOptions = driver.findElement(By.id("gosuggest_inputSrc"));
		fromOptions.sendKeys(arg1);
		Thread.sleep(2000);
		enterFrom.click();
		
	
	    //WebElement toOptions = driver.findElement(By.id("gosuggest_inputDest"));
	    toOptions.sendKeys(arg2);
	    Thread.sleep(2000);
	    enterTo.click();
	    
  } 

	    public void chooseDepartDate() {
	    	   	
	    	//List<WebElement> dates =  driver.findElements(By.xpath("//div[@id='fare_20180430']"));
	    	LocalDate locdat = LocalDate.now();
			LocalDate locdat1 = locdat.plusDays(1);
			String lc = locdat1.toString();
			String lc1 = lc.replaceAll("-", "");
			
			List<WebElement> dateFrom =  driver.findElements(By.id("fare_"+lc1));
	    	
	    	 for(int i=0; i<dateFrom.size();i++) {
	 			
	 			String date = dateFrom.get(0).getText();
	 			System.out.println(date);
	 			
	 			//if(date.equalsIgnoreCase("1")) 
	 				
	 				dateFrom.get(0).click();
	    	 
	    	 }    	 	 
	}  
	      
		public void chooseReturnDate() {
	    	
		//List <WebElement> ele = driver.findElements(By.xpath("//input[@class='form-control inputTxtLarge widgetCalenderTxt']"));
				for(int i=0; i<ele.size(); i++) {
					if(i==1) {
						ele.get(i).click();
					}
				}
				
				LocalDate locdat = LocalDate.now();
				LocalDate locdat1 = locdat.plusDays(3);
				String lc = locdat1.toString();
				String lc1 = lc.replaceAll("-", "");
				
	    	List<WebElement> dateTo =  driver.findElements(By.id("fare_"+lc1));
	    	  

	    	 for(int i=0; i<dateTo.size();i++) {
	 			
	 			String date = dateTo.get(0).getText();
	 			System.out.println(date);
	 			
	 			//if(date.equalsIgnoreCase("3")) {
	 				
	 				dateTo.get(0).click();
	 			
	 					
	 				//}
		}
	   	 
	}  
		
		public void clickSearch() throws InterruptedException {
			getsetgo.click();
			Thread.sleep(6000);
		}
}


