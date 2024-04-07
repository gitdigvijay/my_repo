package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First {
	private WebDriver driver;
	@BeforeMethod
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
	// Create ChromeOptions object
	ChromeOptions options = new ChromeOptions();
	// Add the --remote-debugging-port argument to allow remote origins
	options.addArguments("--remote-allow-origins=*");
	// Initialize ChromeDriver with ChromeOptions
	driver = new ChromeDriver(options);
	}
	@Test
	public void testCricBuzzTitle() {
	driver.get("https://www.cricbuzz.com/");
	String baseTitle = driver.getTitle();
	System.out.println("CricBuzz Title: " + baseTitle);
	}
	@Test
	public void testGoogleTitle() {
	driver.get("https://www.google.com/");
	String baseTitle = driver.getTitle();
	System.out.println("Google Title: " + baseTitle);
	}
	@Test
	public void testAmazonTitle() {
	driver.get("https://www.amazon.com/");
	String baseTitle = driver.getTitle();
	System.out.println("Amazon Title: " + baseTitle);
	}
	@Test
	public void testNavigateToAboutPage() {
	driver.get("https://www.google.com/");
	WebElement aboutLink = driver.findElement(By.linkText("About"));
	aboutLink.click();
	String pageTitle = driver.getTitle();
	System.out.println("Google About page title: " + pageTitle);
	}
	@Test
	public void testCheckFooterLinks() {
	driver.get("https://www.amazon.com/");
	WebElement footerLink = driver.findElement(By.linkText("Privacy Notice"));
	footerLink.click();
	String pageTitle = driver.getTitle();
	System.out.println("Amazon Privacy Notice page title: " + pageTitle);
	driver.navigate().back();
	footerLink = driver.findElement(By.linkText("Conditions of Use"));
	footerLink.click();
	pageTitle = driver.getTitle();
	System.out.println("Amazon Conditions of Use page title: " + pageTitle);
	}
	@AfterMethod
	public void tearDown() {
	if (driver != null) {
	driver.quit();
	}
	}
}
