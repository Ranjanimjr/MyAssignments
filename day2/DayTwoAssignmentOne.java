package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayTwoAssignmentOne {

	public static void main(String[] args) {
		// DAY2:ASSIGNMENT-1
		WebDriverManager.chromedriver().setup(); // Step 1: Download and set the path
		ChromeDriver driver = new ChromeDriver(); // Step 2: Launch the chromebrowser
		driver.get("https://en-gb.facebook.com/"); // Step 3: Load the URL https://en-gb.facebook.com/
		driver.findElement(By.xpath("//button[@title='Only allow essential cookies']")).click();
		driver.manage().window().maximize(); // Step 4: Maximise the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Step 5: Add implicit wait
		driver.findElement(By.linkText("Create New Account")).click(); // Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jana"); // Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ranjani"); // Step 8: Enter the last name
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("08832264571");// Step9:Enter the Mobile number
		// driver.findElement(By.xpath("//div[text()='Mobile number or emailaddress']")).sendKeys("123456789");->why this xpath didn't work?
		driver.findElement(By.id("password_step_input")).sendKeys("abcd123"); // Step 10: Enter the password
		for (int i = 1; i <= 3; i++) // Step 11: Handle all the three drop downs
		{
			WebElement dropDownElement = driver
					.findElement(By.xpath("//div[@class='_5k_5']/span[1]/span/select[" + i + "]"));
			Select select = new Select(dropDownElement);
			if (i == 1) {
				select.selectByVisibleText("12");
			} else {
				if (i == 2) {
					select.selectByVisibleText("Aug");
				} else {
					select.selectByVisibleText("1992");
				}
			}
		}
		driver.findElement(By.xpath("//label[text()='Female']")).click();// Step 12: Select the radio button "Female"
		driver.close();
	}

}
