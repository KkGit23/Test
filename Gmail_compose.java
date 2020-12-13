import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_compose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY\\driver_webdrivers\\new chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		//Enter email address
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kk1889908@gmail.com");
	        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		//Enter password
		WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
		passwordButton.sendKeys("Abc@1234");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		//Click on compose button
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
 //Enter the receiver mail id
		driver.findElement(By.xpath("//textarea[@id=':9y']")).sendKeys("kk1889908@gmail.com");
 //Enter subject to the mail
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
		driver.findElement(By.xpath("//div[@id=':al']")).sendKeys("Selenium script to send mail");
		
 //Attach the full path of file
 driver.findElement(By.xpath("///div[@id=':ay']")).sendKeys("‪E:\\uplod.txt");
 driver.findElement(By.xpath("//div[@id=':96']")).click(); 


	}

}
