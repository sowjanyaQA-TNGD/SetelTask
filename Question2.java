package Seteltask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String pth = System.getProperty("user.dir")+"\\Resources\\chromedriver.exe";
System.out.println(pth);
        
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-blink-features=AutomationControlled");
		
		System.setProperty("webdriver.chrome.driver",pth); 
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.lazada.com.my/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys("iphone 11");
		driver.findElement(By.xpath("//*[@class='search-box__button--1oH7']")).click();
		String webpagename=driver.getTitle();
		
		String iphonename=driver.findElement(By.xpath("(//div[@class='c2prKC']/div/div/div/following-sibling::div)[1]/div[2]")).getText();
		
		
		
		String iphoneprice=driver.findElement(By.xpath("(//div[@class='c2prKC']/div/div/div/following-sibling::div)[1]/div[3]/span")).getText();
		
	     
		String iphonelink=driver.findElement(By.xpath("(//div[@class='c2prKC']/div/div/div/div)[1]/a")).getAttribute("href");
		
	     
	     
	
		//webpage2
		driver.navigate().to("https://shopee.com.my/");
		
		driver.findElement(By.xpath("//button[text()='English' and @class='shopee-button-outline shopee-button-outline--primary-reverse ']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='shopee-popup__close-btn']")).click();
		
		
		driver.findElement(By.xpath("//*[@class='shopee-searchbar-input__input']")).sendKeys("iphone 12 pro max");
		
		driver.findElement(By.xpath("//*[@class='btn btn-solid-primary btn--s btn--inline']")).click();
		String webpagename1=driver.getTitle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        
        
        String iphonename1=driver.findElement(By.xpath("((//div[@class='fBhek2 _2xt0JJ']/div/following-sibling::div)/div/div)[1]")).getText();
      
        
        String iphoneprice1=driver.findElement(By.xpath("(//div[@class='fBhek2 _2xt0JJ']/div/following-sibling::div/div/following-sibling::div)[1]/div/span[@class='_29R_un']")).getText();
        
     
        
        String iphonelink1=driver.findElement(By.xpath("(//div[@class='col-xs-2-4 shopee-search-item-result__item']/a)[1]")).getAttribute("href");
		
        
     
		
		 //String p1 = iphoneprice.replaceAll("[RM]","");
        String p1 = iphoneprice.replaceAll("[^a-z0-9]", "");

	     String p2=iphoneprice1.replaceAll("[^A-Z0-9]","");
	      
	      System.out.println("1st device price " + iphoneprice +  " 2nd device price " + iphoneprice1);
	     
	      
	      if(Integer.parseInt(p1)<=Integer.parseInt(p2))
	      {
	    	System.out.println("Webpagename  "+webpagename+ "\n"+ "Webpage1phonename      "+ iphonename + "\n" + "Webpage1phoneprice   "  + iphoneprice +"\n"+"Webpage1phonelink  " + iphonelink);
	    	System.out.println("Webpagename  "+webpagename1+ "\n"+"Webpage2phonename      "+ iphonename1 + "\n" + "Webpage2phoneprice  "  +  iphoneprice1 +"\n" +"Webpage2phonenamelink  " + iphonelink1);
	      }
	      else
	      {
		    	System.out.println("Webpagename  "+webpagename1+ "\n"+"Webpage2phonename      "+ iphonename1 + "\n" + "Webpage2phoneprice  "  +  iphoneprice1 +"\n" +"Webpage2phonenamelink  " + iphonelink1);
		    	System.out.println("Webpagename  "+webpagename+ "\n"+ "Webpage1phonename      "+ iphonename + "\n" + "Webpage1phoneprice   "  + iphoneprice +"\n"+"Webpage1phonelink  " + iphonelink);
	    	  
	      }
			
		driver.close();

	}

}
