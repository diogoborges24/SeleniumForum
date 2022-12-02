package in.magneticautomation.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstScript_Test {
	
	WebDriver driver;
	
	//Before all Methods setup the chrome website 
	@BeforeMethod
	void setUpMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		//driver.get("http://localhost:3000/");//opening url
	}
	
	//After all methods close Browser gio
	@AfterMethod
	void tearDownMethod() {
		driver.quit(); //closing browser
	}
	
	//-------------------------------------------------------------------------------------------------------------------
	@Test(description= "Title test of App")
	public void titleTest() {
		
driver.get("http://localhost:3000/");//opening url
		Assert.assertEquals(driver.getTitle(), "React App");	
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(description= "User inserts a title, should apear the same after pressing button", dataProvider = "titlles", dataProviderClass=TestData.class)
	public void titlle(String input, String expected) {
driver.get("http://localhost:3000/newt");
	WebElement element =driver.findElement(By.id("titlle"));
	element.sendKeys(input);
	element.submit();
	driver.findElement(By.id("button1")).click(); //using Selenium click button method
	
	WebElement result = driver.findElement(By.id("newTitlle"));
	Assert.assertEquals(result.getText(), expected);
	}
	//------------------------------------------------------------------------------------------------------------------------------------------------------
		@Test(description= "User inserts a title, should apear the same after pressing button", dataProvider = "titlles", dataProviderClass=TestData.class)
		public void titlle1(String input, String expected) {
driver.get("http://localhost:3000");
		driver.findElement(By.id("newThread")).click(); 
		WebElement element =driver.findElement(By.id("titlle"));
		element.sendKeys(input);
		element.submit();
		driver.findElement(By.id("button1")).click();
		
		WebElement result = driver.findElement(By.id("newTitlle"));
		Assert.assertEquals(result.getText(), expected);
		}
//--------------------------------------------------------------------------------------------------
	@Test(description= "User inserts a body, should apear the same after pressing button", dataProvider = "titlles", dataProviderClass=TestData.class)
	public void dropDown2(String input, String expected) {

driver.get("http://localhost:3000/post");
		
	WebElement element =driver.findElement(By.id("body"));
	element.sendKeys("input");
	element.submit();
	driver.findElement(By.id("buttonPost")).click(); 
	
	WebElement result = driver.findElement(By.id("bodyPosted"));
	Assert.assertEquals(result.getText(), expected);
	
	}
//--------------------------------------------------------------------------------------------------
	@Test(description= "User clicks on a field thread data should refresh hiperlink")
	public void Threads1() {

driver.get("http://localhost:3000/");
	
	driver.findElement(By.id("tbutton")).click();
	Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:3000/post");
	Assert.assertNotEquals(driver.getCurrentUrl(), "http://localhost:3000/");
	}
	//--------------------------------------------------------------------------------------------------
		@Test(description= "User clicks on a field thread data should refresh hiperlink")
		public void Threads2() {

driver.get("http://localhost:3000/");
		
		driver.findElement(By.id("tbutton")).click();
		Assert.assertNotEquals(driver.getCurrentUrl(), "http://localhost:3000/");
		}


}

