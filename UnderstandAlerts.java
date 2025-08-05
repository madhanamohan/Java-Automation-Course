package seleniumfirst;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;

public class UnderstandAlerts 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	alert = 1	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		

/*		driver.findElement(By.id("alertButton")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);	*/
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	alert = 2	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<		

/*		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ale = driver.findElement(By.id("timerAlertButton"));
		try
		{
			ale.click();
		}
		catch(Exception e)
		{	
			js.executeScript("arguments[0].scrollIntoView(true)",ale);
			ale.click();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert2 =driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert2.getText());
//		alert2.accept();
//		Thread.sleep(1000);
		alert2.dismiss();
		Thread.sleep(1000);					*/
		
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	alert = 3	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

		
/*		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ale = driver.findElement(By.id("confirmButton"));
		try
		{
			ale.click();
		}
		catch(Exception e)
		{	
			js.executeScript("arguments[0].scrollIntoView(true)",ale);
			ale.click();
		}
		
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert3.getText());
		alert3.dismiss();
		Thread.sleep(1000);	
		
		WebElement conform =driver.findElement(By.id("confirmResult"));
		System.out.println(conform.getText());
		Thread.sleep(1000);			*/

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	alert = 4	<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement promt =driver.findElement(By.id("promtButton"));
		try
		{
			promt.click();
		}
		catch(Exception e)
		{
			js.executeScript("arguments[0].scrollIntoView(true)",promt);
			promt.click();
		}
		
		Alert prmtale =driver.switchTo().alert();
		String inputdata="Madhan";
		prmtale.sendKeys(inputdata);
		Thread.sleep(3000);
		prmtale.accept();
		Thread.sleep(1000);
		
		WebElement prmtconfrm = driver.findElement(By.id("promptResult"));		
		String Actualdata=prmtconfrm.getText();
		System.out.println("Given data in promt="+Actualdata);
		
		Map<Integer,String>Expecteddata=new HashMap<>();
		Expecteddata.put(1,inputdata);
			
       if(Actualdata!=null && Actualdata.contains("You entered"))
       {
    	   String extractname = Actualdata.replace("You entered", "").trim();
    	   System.out.println("After extraction of the name="+extractname);
		
			if(extractname.equals(Expecteddata.get(1)))
			{
				System.out.println("Validation of data is Done");
			}
			else
			{
				System.out.println("Validation of data is not yet done");
			}
       }
       else
       { 
    	   System.out.println("Validation of data is not yet done check the Data one more time");
       }
		
		Thread.sleep(1000);		
		
		driver.quit();		
	}

}
