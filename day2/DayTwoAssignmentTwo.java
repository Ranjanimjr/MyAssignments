package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayTwoAssignmentTwo {

	public static void main(String[] args) {
		//  Delete Lead:
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(); 				    		//1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //2	Enter the username
		driver.findElement(By.id("password")).sendKeys("crmsfa");			//3	Enter the password
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); //4	Click Login
		driver.findElement(By.linkText("CRM/SFA")).click();					//5	Click crm/sfa link
		driver.findElement(By.linkText("Create Lead")).click();				//6	Click Leads link
		driver.findElement(By.linkText("Find Leads")).click();				//7	Click Find leads
		driver.findElement(By.xpath("//span[text()='Phone']")).click();		//8	Click on Phone
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210"); //9	Enter phone number
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); //10	Click find leads button
		WebElement elementLead = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']//div/div[1]/table[1]//td[1]//a"));
		String str= elementLead.getText();
		System.out.println(str);
			
		/*11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)*/

	}

}
