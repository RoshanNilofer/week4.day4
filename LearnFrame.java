package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Alert alert = driver.switchTo().alert();
	        String msg = alert.getText();
	        System.out.println(msg);
	        alert.accept();
	        String msg1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	        System.out.println(msg1);
	}

}
