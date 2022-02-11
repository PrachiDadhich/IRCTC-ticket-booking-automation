package IRCTC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;



public class script {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ok_button = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button"));
		ok_button.click();
		
		Thread.sleep(5000);
		//login button
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		

		driver.findElement(By.xpath("//*[@id=\"userId\"]")).sendKeys("prachidadhich1");
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("afbF62a1@123");

		Thread.sleep(15000);
		//sign in button
		driver.findElement(By.xpath(
		    "//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button")).click();
		
		Thread.sleep(5000);
		
		WebElement from_button = driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		from_button.sendKeys("NEW DELHI - NDLS");
		WebElement to_button = driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input"));
		to_button.sendKeys("PATNA JN - PNBE");
		
		// this for date box and then choose in calendar (fix date)
	    String month = "February";
	    String day = "28";
	    ////*[@id="jDate"]/span/input
	    driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
	    Thread.sleep(2000);
	    
	    while(true) {
	    	String text = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
	    	if(text.equals(month)){
	    		break;
	    	}
	    	
	    	else {
	    		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]")).click();
	    	}
	    }
	    
	    driver.findElement(By.xpath("//a[contains(text(),"+day+")]")).click();
	  
	    Thread.sleep(2000);
	    //search button
	    driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[2]/div[1]/app-jp-input/div/form/div[5]/div/button")).click();
		
	    //WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[2]/app-modify-search/div/form/div[2]/div[1]/div[4]/p-dropdown/div/div[3]/span"));  
	    //Select dropdown = new Select(testDropDown);  
	    //dropdown.selectByVisibleText("AC First Class (1A)");  
	    Thread.sleep(2000);
	    
	    //WebElement textDemo = driver.findElement(By.xpath("//*[text()='AC First Class (1A)']"));
	    //textDemo.click();
	    
	    //if(textDemo.isDisplayed())
	    //{
	    //System.out.println("Element found using text");
	    //}
	    driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div/table/tr/td[3]/div")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div")).click();
	    //driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div")).click();
	    ///html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div/table/tr/td[3]/div
	    
	    //book_now
	    
	    
	    driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[2]/div/span/span/button[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-train-list/p-confirmdialog[1]/div/div/div[3]/button[1]/span[1]")).click();
	    Thread.sleep(1000);
	    WebElement pass = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[4]/p-panel/div/div[2]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[1]/p-autocomplete/span/input"));
	    pass.click();
	    pass.sendKeys("Prachi");
	    
	    Thread.sleep(2000);
	    WebElement age_button = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[4]/p-panel/div/div[2]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[2]/input"));
	    age_button.click();
	    age_button.sendKeys("20");
	    
	    Thread.sleep(2000);
	    WebElement testDropDown = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[4]/p-panel/div/div[2]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[3]/select"));  
	    Select dropdown = new Select(testDropDown);  
	    dropdown.selectByVisibleText("Female");  
	    
	    Thread.sleep(2000);
	    WebElement testDropDown1 = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[4]/p-panel/div/div[2]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[4]/select"));  
	    Select dropdown1 = new Select(testDropDown1);  
	    dropdown1.selectByVisibleText("India"); 
	    
	    WebElement pass_no = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[6]/p-panel/div/div[2]/div/div[2]/div/input"));
	    pass_no.click();
	    pass_no.sendKeys("8696730111");
	    
	    ///html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[1]/input
	    WebElement address = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[1]/input"));
	    address.click();
	    address.sendKeys("49-A, Shanti Vihar, Mansarovar");
	    Thread.sleep(2000);
	    WebElement Pin = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[4]/input"));
	    Pin.click();
	    Pin.sendKeys("302020");
	    Thread.sleep(2000);
	    WebElement State = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[5]/input"));
	    State.click();
	    State.sendKeys("Rajasthan");
	    Thread.sleep(2000);
	    WebElement City = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[6]/select"));
	    City.click();
	    City.sendKeys("Jaipur");
	    
	    Thread.sleep(2000);
	    WebElement testDropDown2 = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[8]/p-panel/div/div[2]/div/app-address-capture/div/div[7]/select"));  
	    Select dropdown2 = new Select(testDropDown2);  
	    dropdown2.selectByVisibleText("S.F.S.Mansarovar S.O");
	    
	    WebElement radiobutton = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[12]/p-panel/div/div[2]/div/div/div/div[2]/label/p-radiobutton/div/div[2]"));
	    radiobutton.click();
	    
	    WebElement radiobutton2 = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[14]/p-panel/div/div[2]/div/table/tr[1]/label/p-radiobutton/div/div[2]"));
	    radiobutton2.click();
	    
	    WebElement conti = driver.findElement(By.xpath("/html/body/app-root/app-home/div[3]/div/app-passenger-input/div[5]/form/div/div[1]/div[16]/div/button[2]"));
	    conti.click();
	    
	}
		
}


