package mindtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//setting path of chrome webdriver.exe file
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.getTitle();
	}

}
