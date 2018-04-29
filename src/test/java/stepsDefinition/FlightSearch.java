package stepsDefinition;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightSearch extends AbstractPage{

	public FlightSearch(WebDriver driver) {
		super(driver);
	}
	
	public FlightSearch showAllFlights() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.id("showAllFlights"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		element.click();
		
		Thread.sleep(3000);
		
		
		return new FlightSearch(driver);
		
	}  
	public FlightSearch selectEarliestDeparture() throws InterruptedException {
		String min = "00:00";
		List<String> timelist = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 Object lenOfPage = js.executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
			   boolean match=false;
			        while(match==false) {
			                Object lastCount = lenOfPage;
			                Thread.sleep(2000);
			                lenOfPage = js.executeScript("window.scrollTo(0, document.body.scrollHeight);var lenOfPage=document.body.scrollHeight;return lenOfPage;");
			                List<WebElement> deptime = driver.findElements(By.xpath("//div[@id='onwFltContainer']/div/descendant::span[@class='ico20 db fn'][1]"));
			                    System.out.println(deptime.size());
			                    
			                if (lastCount.equals(lenOfPage)) {
			                	
			                    for(int i=0; i<deptime.size();i++) {
	                    			String dep =  deptime.get(i).getText();
	                    			System.out.println(dep);
	                    			timelist.add(dep);
	                    			match=true;
	                    		}
			                }
			               
			          
			        }
	
		return new FlightSearch(driver);
	}
}
