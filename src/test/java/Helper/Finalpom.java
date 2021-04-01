package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalpom {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement rb;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	@FindBy(id="first_name")
	private WebElement fn;
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement ad;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement cct;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccm;
	
	@FindBy(id="cc_exp_year")
	private WebElement cey;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bn;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logo;
	
	

//	public Finalpom(WebDriver driver2) {
//		this.driver=driver2;
//		PageFactory.initElements(driver, this);
//	}
	

	public Finalpom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRb() {
		return rb;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAd() {
		return ad;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCct() {
		return cct;
	}

	public WebElement getCcm() {
		return ccm;
	}

	public WebElement getCey() {
		return cey;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBn() {
		return bn;
	}

	public WebElement getLogo() {
		return logo;
	}
	
	
	

}
