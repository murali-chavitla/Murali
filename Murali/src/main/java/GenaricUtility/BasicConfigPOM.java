package GenaricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicConfigPOM {
   
	//1. Decelaration
	@FindBy(xpath="//a[text()=' Signup / Login']")
	private WebElement signup;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	private WebElement logInEmail;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login;
	
	
	@FindBy(xpath="//a[text()=' Products']")
	private WebElement prodcuts;
	
	@FindBy(xpath="//a[@href='/product_details/1']")
	private WebElement prodcut1;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	private WebElement continueToShop;
	
	@FindBy(xpath="//u[text()='View Cart']")
	private WebElement view;
	
	
	@FindBy(xpath="//a[text()=' Logout']")
	private WebElement logout;
	






	// 2. initialization
	public BasicConfigPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
   //3.utilization



	public WebElement getSignup() {
		return signup;
	}



	public WebElement getLogInEmail() {
		return logInEmail;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}



	public WebElement getProdcuts() {
		return prodcuts;
	}



	public WebElement getProdcut1() {
		return prodcut1;
	}



	public WebElement getAddToCart() {
		return addToCart;
	}



	public WebElement getContinueToShop() {
		return continueToShop;
	}



	public WebElement getView() {
		return view;
	}
	
	 public WebElement getLogout() {
		return logout;
	}
	
	
	}
