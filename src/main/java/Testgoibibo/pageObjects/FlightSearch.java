package Testgoibibo.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightSearch{

	WebDriver driver;
	
	public FlightSearch(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using = "showAllFlights") 
	 WebElement element;
	
	
	@FindBy(how=How.XPATH,using="//*[@value='BOOK']")
	WebElement bookbut;
	
	List<String> timelistdep = new ArrayList<String>();
	List<String> timelistret = new ArrayList<String>();
	
	
	
	public void showAllFlights() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//WebElement element = driver.findElement(By.id("showAllFlights"));
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		element.click();
		
		Thread.sleep(3000);
		
		
	}  
	public void selectEarliestDeparture() throws InterruptedException {

		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 Object lenOfPage = js.executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
			   boolean match=false;
			        while(match==false) {
			                Object lastCount = lenOfPage;
			                
			                Thread.sleep(2000);
			                
			                lenOfPage = js.executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
			                
			                List<WebElement> deptime = driver.findElements(By.xpath("//div[@id='onwFltContainer']/div/descendant::span[@class='ico20 db fn'][1]"));
			                
			                List<WebElement> retTime = driver.findElements(By.xpath("//div[@id='retFltContainer']/div/descendant::span[@class='ico20 db fn'][1]"));
			                    
			
			                    
			                if (lastCount.equals(lenOfPage)) {
			                	
			                    for(int i=0; i<deptime.size();i++) {
			   
	                    			String dep =  deptime.get(i).getText();
	                    			timelistdep.add(dep);
	                    				
	                    		}
			                    for(int i=0;i<retTime.size();i++) {
			                    	String ret = retTime.get(i).getText();
			                    	timelistret.add(ret);
			                    }
			                	match=true;
			                   Collections.sort(timelistdep);
			                   Collections.sort(timelistret);
			                   
			                   System.out.println(timelistdep);
			                   System.out.println(timelistret);
			                     
			                   	String tld = (String) timelistdep.toArray()[0];
			                   	String tlr = (String) timelistret.toArray()[0];
			                    
			                    System.out.println(tld); 
			                    System.out.println(tlr); 
			                    
			    
		WebElement deprad = driver.findElement(By.xpath("//*[@id ='onwFltContainer']//*[@class = 'card fl width100 marginB10']//*[text()='"+tld+"']/../../../..//*[@class='control__indicator']"));
		WebElement rerad = driver.findElement(By.xpath("//*[@id ='retFltContainer']//*[@class = 'card fl width100 marginB10']//*[text()='"+tlr+"']/../../../..//*[@class='control__indicator']"));				
		deprad.click();
		rerad.click();
			        }
			      }
	
		
	}
	
			public void selectBookOption(){
		
				//WebElement bookbut = driver.findElement(By.xpath("//*[@value=\"BOOK\"]"));
				bookbut.click();
				
	}
}
