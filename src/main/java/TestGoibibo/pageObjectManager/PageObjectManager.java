package TestGoibibo.pageObjectManager;



import org.openqa.selenium.WebDriver;

import Testgoibibo.pageObjects.*;


public class PageObjectManager {

	private WebDriver driver;

	private AbstractPage abstractPage;

	private LandingPage landingPage;

	private FlightSearch flightsearchPage;

	private BookConfirmationPage bookconfPage;

	

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	

	public AbstractPage getAbsPage(){

		return ( abstractPage== null) ? abstractPage = new AbstractPage(driver) : abstractPage;

	}

	public LandingPage getLandPage() {

		return (landingPage == null) ? landingPage = new LandingPage(driver) : landingPage;

	}
	
	public FlightSearch getFlightPage() {

		return (flightsearchPage == null) ? flightsearchPage = new FlightSearch(driver) : flightsearchPage;

	}

	public BookConfirmationPage getBookConPage() {

		return (bookconfPage == null) ? bookconfPage = new BookConfirmationPage(driver) : bookconfPage;

	}

	

	

	

	
}
