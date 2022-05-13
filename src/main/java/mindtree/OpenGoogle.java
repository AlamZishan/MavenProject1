package mindtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//setting path of chrome webdriver.exe file
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\browser driver\\chromedriver.exe");
		//creating object of chromeDriver
		WebDriver driver = new ChromeDriver();
		//using object driver and  get method opening google.com
		driver.get("https://www.google.com");
		driver.getTitle(); //getting title of web page
	}

}
