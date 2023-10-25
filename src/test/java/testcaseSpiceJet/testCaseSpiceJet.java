package testcaseSpiceJet;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagespicejet.PageObjectSpiceJet;

public class testCaseSpiceJet {
	@Test
	public void spicejet() {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com");
		 PageFactory.initElements(driver,PageObjectSpiceJet.class);
		 
		 //signup
		PageObjectSpiceJet.signup.click();
		
		PageObjectSpiceJet.select.click();

		PageObjectSpiceJet.firstname.sendKeys("Madhumathi");	
		PageObjectSpiceJet.lastname.sendKeys("E");
		PageObjectSpiceJet.phonenumber.sendKeys("123456789");
		PageObjectSpiceJet.emailid.sendKeys("madhuguvistudent@gmail.com");
		PageObjectSpiceJet.password.sendKeys("Guviguvi@2023");
		PageObjectSpiceJet.confirmpassword.sendKeys("Guviguvi@2023");	
		PageObjectSpiceJet.agree.click();
		PageObjectSpiceJet.submit.click();
		
		//Login
		PageObjectSpiceJet.Login.click();
		PageObjectSpiceJet.byemailid.click();
		PageObjectSpiceJet.mailid1.sendKeys("madhuguvistudent@gmail");
		PageObjectSpiceJet.password2.sendKeys("Guviguvi@2023");
		PageObjectSpiceJet.login.click();
		
		//SearchFlight
		PageObjectSpiceJet.oneway.click();
		PageObjectSpiceJet.from.sendKeys("Bengaluru (BLR)");
		PageObjectSpiceJet.destination.sendKeys("Delhi (DEL)");
		PageObjectSpiceJet.departuredate.click();
		PageObjectSpiceJet.date.click();
		PageObjectSpiceJet.Returndate.click();
		PageObjectSpiceJet.date.click();
		
		//payment

        driver.switchTo().frame("card_number_iframe_6LtqisNUGHPguxaX");
        PageObjectSpiceJet.cardnumber.sendKeys("12345678910");
        PageObjectSpiceJet.cardholdername.sendKeys("abcdefgh");
        PageObjectSpiceJet.expmonth.sendKeys("12");
        PageObjectSpiceJet.expyear.sendKeys("25");
        PageObjectSpiceJet.cvv.sendKeys("123");
        PageObjectSpiceJet.proceedtopay.click();
        
        
        
        
        
	}
	
	

}
