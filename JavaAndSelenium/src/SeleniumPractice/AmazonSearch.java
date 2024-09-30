package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cyki7\\eclipse-workspace\\SeleniumTraining\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("iPhone");
//		searchBox.submit();
		System.setProperty("webdriver.Edge.driver","C:\\Users\\cyki7\\eclipse-workspace\\SeleniumTraining\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com/");
		Thread.sleep(2000);
		WebElement dismissButton = driver.findElement(By.className("a-button-input"));
		dismissButton.click();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchBox.isDisplayed()) {
			if(searchBox.isEnabled()) {
				searchBox.sendKeys("iPhone");
				String enteredText = searchBox.getAttribute("value");
				System.out.println(enteredText);
				searchBox.submit();
				WebElement searchBox1 = driver.findElement(By.id("twotabsearchtextbox"));
				searchBox1.clear();
				Thread.sleep(3000);
				WebElement searchButton = driver.findElement(By.id("nav-search-submit-text"));
				searchButton.click();
				}
			else {
				System.err.println("SearchBox is not enabled");
				
			}
		}
		else {
			System.err.println("SearchBox is not displayed");
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}
}




