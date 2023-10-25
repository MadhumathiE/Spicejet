package pagespicejet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectSpiceJet {

//SignUP
	public static final String Signup = null;

	@FindBy(xpath="//div[contains(text(),'Signup')]")
	public static WebElement signup;

	@FindBy(xpath="//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
	public static WebElement select;
	@FindBy(xpath="//input[@id='first_name']")
	public static WebElement firstname;
	@FindBy(xpath="//input[@id='last_name']")
	public static WebElement lastname;
	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	public static WebElement phonenumber;
	@FindBy (xpath="//input[@id='email_id']")
	public static WebElement emailid;
	@FindBy (xpath="//input[@id='new-password']")
	public static WebElement password;
	@FindBy (xpath="//input[@id='c-password']")
	public static WebElement confirmpassword;
	@FindBy (xpath="//input[@id='defaultCheck1']")
	public static WebElement agree;
	@FindBy (xpath="//button[normalize-space()='Submit']")
	public static WebElement submit;
	
	//Login
	@FindBy (xpath="//span[@class='d-none d-lg-block']")
	public static WebElement Login;
	@FindBy(xpath="//input[@id='inlineRadio2']")
	public static WebElement byemailid;
	@FindBy(xpath="//input[@placeholder='example@mail.com']")
	public static WebElement mailid1;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement password2;
	@FindBy(xpath="//div[@class='btn btn-red plr-50']")
	public static WebElement login;
	
	//SearchFlight
	@FindBy(xpath="(//*[name()='circle'])[1]")
	public static WebElement oneway;
	@FindBy(xpath="(//input[@type='text'])[1]")
	public static WebElement from;
	@FindBy(xpath="(//input[@type='text'])[2]")
	public static WebElement destination;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[15]")
	public static WebElement departuredate;
	@FindBy(xpath="(//div[@dir='auto'][normalize-space()='28'])[1]")
	public static WebElement date;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[16]")
	public static WebElement Returndate;
	@FindBy(xpath="(//div[@dir='auto'][normalize-space()='3'])[2]")
	public static WebElement date1;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[17]")
	public static WebElement passanger;
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[20]")
	public static WebElement adult;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	public static WebElement done;
	//@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[20]")
	//public static WebElement adultplusone;
	@FindBy(xpath="(//*[name()='path'][@fill-rule='nonzero'])[8]")
	public static WebElement currency;
	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='INR']")
	public static WebElement inr;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	public static WebElement serchflight;
	@FindBy(xpath="//*[name()='rect' and contains(@width,'100%')]")
	public static WebElement agree1;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	public static WebElement conbutton;
	
	//Booking Flight
	
	@FindBy(xpath="(//*[name()='rect'])[3]")
	public static WebElement agrforpassanger;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1v8vaea r-eqz5dr r-1777fci r-1wyvozj r-1xcajam r-tyizg9 r-70iriu r-1pozq62']")
	public static WebElement con;
	
	//payment method
	@FindBy(id="card_number")
	 public static WebElement cardnumber; 
	@FindBy(id="name_on_card")
	public static WebElement cardholdername;
	@FindBy(id="card_exp_month")
	public static WebElement expmonth;
	@FindBy(id="card_exp_year")
	public static WebElement expyear;
	@FindBy(id="security_code")
	public static WebElement cvv;
	
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	public static WebElement proceedtopay;
	
	}   






//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']
