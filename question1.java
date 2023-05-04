package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class question1 {
	
	    public static void main( String[] args ) throws InterruptedException
	    {
	    	WebDriverManager.edgedriver().setup();
	    	
	    	ChromeOptions co=new ChromeOptions(); 
		    co.addArguments("--remote-allow-origins=*");
			
	    	
			WebDriver driver = new ChromeDriver(co);
	        driver.get("https://www.amazon.in/Wall-Clock-Operated-Non-Ticking-Decorative/dp/B09QHN18BR/ref=sr_1_3_sspa?keywords=wall+clock&qid=1683194160&sr=8-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	        driver.manage().window().maximize();
	        String title = driver.getTitle();
	        String webtitle = "Buy STAR WORK Silent Mute Wall Clocks Battery Operated Non-Ticking Quiet Decorative Wall Clocks for Living Room, Bathroom, Kitchen - Thicken Plastics Frame Glass Cover (Blue Digital) Online at Low Prices in India - Amazon.in\r\n";
	        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("sanjitha2903@gmail.com",Keys.ENTER);
	        Thread.sleep(5000);
	        System.out.println(title);
	        if(title.equals(webtitle)) {
	        	System.out.println("The title matches with the webTitle");
	        }
	        else {
	        	System.out.println("The title doesn't match with the WebTitle");
	        }
			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("$@NJITH@",Keys.ENTER);
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	        Thread.sleep(5000); 
	        Boolean bool = driver.findElement(By.xpath("//*[@id=\"sw-atc-details-single-container\"]")).isDisplayed();
	        System.out.println("Is item added to cart:" + bool);
	        
	        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@value=\"Delete\"]")).click();
	        Thread.sleep(2000);
	        String remove = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div/h1")).getText();
	       
	        if(remove.equals("Your Amazon Cart is empty.")) {
	        	System.out.println("Product is successfully removed");
	        }
	        driver.get("https://www.amazon.in/Wall-Clock-Operated-Non-Ticking-Decorative/dp/B09QHN18BR/ref=sr_1_3_sspa?keywords=wall+clock&qid=1683194160&sr=8-3-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	        Thread.sleep(2000);
	        driver.get("https://www.amazon.in/gp/cart/view.html/ref=dp_atch_dss_cart?");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
	        Thread.sleep(1000);
	        
	        
	    }
	}


