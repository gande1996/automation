package com.ible.frontend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreatePrealert {	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akhil\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://iblesoft.smarteweb.com/");
		        driver.manage().window().maximize();
		        Thread.sleep(2000);
		        driver.findElement(By.id("unameTxt")).sendKeys("IBLEC1032");
		        driver.findElement(By.id("passwordTxt")).sendKeys("Boxon@123");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")).click();
		        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/a")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.id("mnameTxt")).sendKeys("Akhil");
		        driver.findElement(By.id("carrierTxt")).sendKeys("Amazon");
		        driver.findElement(By.id("carriertrackingTxt")).sendKeys("Ama251");
		        driver.findElement(By.id("orderdateTxt")).click();
		        driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[4]/td[4]/a")).click();
		        driver.findElement(By.id("country3Txt")).sendKeys("CANADA");
		        driver.findElement(By.name("anameTxt[]")).sendKeys("Bats");
		        driver.findElement(By.name("quantityTxt[]")).sendKeys("3");
		        driver.findElement(By.name("declaredvalueTxt[]")).sendKeys("100");
		        driver.findElement(By.id("rmavalue_1")).sendKeys("1000101");
		        driver.findElement(By.id("orderidTxt_1")).sendKeys("1000101");
		        driver.findElement(By.xpath("//*[@id=\"addinvoiceTxtMul_1\"]")).sendKeys("C:\\Users\\Sasi\\Desktop\\Screenshot (13).png");
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@id=\"userprofileFormOne\"]/div[7]/div/div/input[2]")).click();
		        driver.findElement(By.xpath("/html/body/div[3]/header/nav/div/div/div[2]/div[2]/div[2]/div/div/ul/li[1]/a")).click();
	}
	}


