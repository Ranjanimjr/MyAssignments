package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClassroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement userElement =driver.findElement(By.xpath("//input[@name='USERNAME']"));//Attribute based Xpath
		userElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.xpath("//input[contains(@name,'PASS')]"));//Partial attribute based Xpath
		passwordElement.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();//Attribute based Xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLaef");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("ranjani");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("jana");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.close();
	}

}
