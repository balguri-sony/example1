package MavenExample.MavenExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenExample1 {
	@Test
	public void maven() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	}
}
