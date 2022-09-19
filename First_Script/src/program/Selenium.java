package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hardi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://nbl.one/login");
		d.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/input")).sendKeys("hardik7393@gmail.com");
		d.findElement(By.xpath("//*[@id=\"login-custom\"]")).click();
		
		String u = d.getCurrentUrl();
		
		if(u.equals("https://nbl.one/"))
		{
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Failed");
		}
		
	}

}
