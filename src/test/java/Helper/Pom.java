package Helper;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Pom {
		
		public static WebDriver driver;
		
		@FindBy(id="username")
		private WebElement name;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="login")
		private WebElement Login;

		
		
		public Pom(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}



		

		

		public WebElement getName() {
			return name;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return Login;
		}
		
		
		

	}


