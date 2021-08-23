package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
	     driver.get("http://leaftaps.com/opentaps");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     String updateCmp = "Accenture";
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'/SFA')]")).click();
	     driver.findElement(By.xpath("//a[text()='Leads']")).click();
	     driver.findElement(By.linkText("Find Leads")).click();
	     driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	     driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("test");
	     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	     WebElement firstLead = driver.findElement(By.xpath("//a[text()='testing']"));
	     firstLead.click();
         driver.findElement(By.linkText("Edit")).click();
         WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
         companyName.clear();
         companyName.sendKeys(updateCmp);
         driver.findElement(By.xpath("//input[@value='Update']")).click();
         WebElement changeLead = driver.findElement(By.id("viewLead_companyName_sp"));
         String text = changeLead.getText();
         System.out.println(text);
         String replace = text.replaceAll("\\d", "");
         System.out.println(replace);
         if(replace.contains(updateCmp))
         {
        	 System.out.println("Text is changed");
         }
	}

}
