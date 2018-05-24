package gittest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver = new FirefoxDriver();
	@Test
	public void testgit() {
		driver.get("https://maven.apache.org/plugin-tools/maven-plugin-plugin/examples/generate-descriptor.html");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("maven"));	  
	}
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
		driver.close();
//		driver.quit();
	}

}
