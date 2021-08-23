package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'/SFA')]")).click();
	     driver.findElement(By.xpath("//a[text()='Leads']")).click();
	     driver.findElement(By.linkText("Find Leads")).click();
	     driver.findElement(By.xpath("//span[text()='Phone']")).click();
	     driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     WebElement firstLead = driver.findElement(By.xpath("//a[contains(text(),'108')]"));
	     String text = firstLead.getText();
	     firstLead.click();
	     driver.findElement(By.linkText("Delete")).click();
	     driver.findElement(By.linkText("Find Leads")).click();
	     driver.findElement(By.xpath("(//div[@class='x-form-element'])[18]/input")).sendKeys(text);
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     WebElement display = driver.findElement(By.xpath("//div[text()='No records to display']"));
	     String text1="No records to display";
	     if(display.getText().equals(text1))
	     {
	    	 System.out.println("Record deleted successfully");
	     }
	    driver.close();
	    System.out.println("Browser closed successfully");
	     
	}

}
