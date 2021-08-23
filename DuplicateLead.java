package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
	     driver.findElement(By.xpath("//span[text()='Email']")).click();
	     driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc");
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    WebElement firstName = driver.findElement(By.xpath("//a[text()='Rayhan']"));
	     String firstNameText = firstName.getText();
	     System.out.println("First Lead Name" + firstNameText);
	     firstName.click();
	     Thread.sleep(20000);
	     driver.findElement(By.linkText("Duplicate Lead")).click();
	     String title = driver.getTitle();
	     String expectedTitle = "Duplicate Lead | opentabs CRM";
	     if(title.equals(expectedTitle))
	     {
	    	 System.out.println("the page loaded expected");
	     }
	     driver.findElement(By.className("smallSubmit")).click();
	     WebElement duplicateText = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	     String DuplicateName = duplicateText.getText();
	     if(DuplicateName.equals(firstNameText))
	     {
	    	 System.out.println("Test passed");
	     }
	     driver.close();
	     System.out.println("Browser closed succesfully");
	}

}
