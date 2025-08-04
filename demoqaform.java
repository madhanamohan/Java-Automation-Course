package seleniumfirst;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqaform
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		driver.manage().window().maximize();
// How we can execute java script code in our selenium code  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.findElement(By.id("firstName")).sendKeys("Madhan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mohan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("madhan@gamial.com");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//label[text()='Female']")).click();
//		Thread.sleep(2000);
		
		WebElement radioele=(driver.findElement(By.xpath("//label[text()='Male']")));
		js.executeScript("arguments[0].scrollIntoView(true)",radioele);
		radioele.click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7997178744");
		Thread.sleep(500);
		
		driver.findElement(By.id("dateOfBirth")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(500);
//		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		
		WebElement monthele=(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		monthele.click();
		Select monthselect=new Select(monthele);
		monthselect.selectByContainsVisibleText("January");
		Thread.sleep(500);
		
		WebElement yearele=driver.findElement(By.className("react-datepicker__year-select"));
		yearele.click();
		Select yearselect = new Select(yearele);
		yearselect.selectByValue("1999");
		Thread.sleep(500);
		
		driver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--001']")).click();
		Thread.sleep(500);
		
	//	WebElement key=	driver.findElement(By.className("//div[@id='subjectsContainer']/div/div[@class='ubjects-auto-complete__value-container']"));
		WebElement subjectkey=	driver.findElement(By.id("subjectsInput"));
		subjectkey.sendKeys("Computer science");
		subjectkey.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
	//	driver.findElement(By.xpath("//label[test()='Sports']")).click();
	//	Thread.sleep(2000);
		
/*		WebElement Hobbie_ele1=(driver.findElement(By.xpath("//label[text()='Sports']")));       // using javascript
		js.executeScript("arguments[0].scrollIntoView(true)",Hobbie_ele1);
		Hobbie_ele1.click();		*/
		
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();	
		Thread.sleep(500);
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\kukutla madhanamohan\\Mock.png");
		Thread.sleep(500);
		
		driver.findElement(By.id("currentAddress")).sendKeys("Beeravolu");
		Thread.sleep(500);
		
	    WebElement state= driver.findElement(By.id("react-select-3-input"));
	    state.sendKeys("Haryana");
	    System.out.println("Haryana");
	    state.sendKeys(Keys.ENTER);
	    Thread.sleep(500);
	    
	    WebElement city =driver.findElement(By.id("react-select-4-input"));
	    city.sendKeys("Panipat");
	    System.out.println("Panipat");
	    city.sendKeys(Keys.ENTER);
		Thread.sleep(500);
			
		driver.findElement(By.id("submit")).click();
		System.out.println("Submitted");
		Thread.sleep(100);
		
//->>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<< 	 Form  Validation 	 >>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<

		WebElement aftersub=driver.findElement(By.id("example-modal-sizes-title-lg"));
		String FormValidation = aftersub.getText();	
		if (FormValidation.equals("Thanks for submitting the form"))
		{
			System.out.println("Form Submission Successful Done Good Job My Dear!");
		} 
		else 
		{
		    System.out.println("Form submission failed check it one more time, be patient to get the results");
		}
		
		WebElement D_Validation = driver.findElement(By.className("table-responsive"));
		String tableText = D_Validation.getText();

		if (tableText.contains("Madhan Mohan") && tableText.contains("madhan@gamial.com") && tableText.contains("Male") && tableText.contains("7997178744") && tableText.contains("01 January,1999") &&
		    tableText.contains("Computer Science") && tableText.contains("Sports") && tableText.contains("Mock.png") && tableText.contains("Beeravolu") && tableText.contains("Haryana Panipat")) 
		{
		
		    System.out.println("All form data is validated successfully Good Job!");
		}
		else
		{
		    System.out.println("Form data is not valid check the Data carefully");
		}
		
		driver.quit();
		
	}

}
