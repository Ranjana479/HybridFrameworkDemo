package NewProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RunFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DE_User\\eclipse-workspace\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
		// TODO Auto-generated method stub
    /*	driver.get("http://128.9.8.26:84/");
    	String Title = driver.getTitle();
    	System.out.println(Title);
    	WebElement userid=driver.findElement(By.className("mat-form-field-infix"));
    //	WebElement password=driver.findElement(By.id("mat-input-1"));
    	 WebElement login=driver.findElement(By.className("mat-raised-button mat-primary"));
    	 userid.getAttribute("SYSTEM");   	 
    //	 Select Store = new Select(driver.findElement(By.name("(S1)STORE NO:1 (2019)")));
    	 login.click();*/
    	
    	 driver.get("https://www.browserstack.com/users/sign_in");
    	 WebElement username=driver.findElement(By.id("user_email_Login"));
    	 WebElement password=driver.findElement(By.id("user_password"));
    	 WebElement login=driver.findElement(By.name("commit"));
    	 username.sendKeys("abc@gmail.com");
    	 password.sendKeys("your_password");
    	 login.click();
    	/* driver.get("https://www.browserstack.com/users/sign_in");
    	 WebElement username=driver.findElement(By.id("user_email_Login"));
    	 WebElement password=driver.findElement(By.id("user_password"));
    	 WebElement login=driver.findElement(By.name("commit"));
    	 
    	 login.click();*/
       
	}

}
