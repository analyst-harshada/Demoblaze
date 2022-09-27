package 
	
public class LoginPage {
	
		public static void main (String []args) {
			
			System.setProperty("webdriver.chrome.driver","E:\\BrowserDriver\\BrowserDrivers\\chromedriver.exe\"");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demoblaze.com/index.html");
			
			// Loging in to browser
			
			WebElement username = driver.findElement(By.xpath("//input@id='loginUsername']"));
			 
		}
	}

}
