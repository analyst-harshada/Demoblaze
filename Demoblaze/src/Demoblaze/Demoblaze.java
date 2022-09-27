package Demoblaze;

public class Demoblaze {
	
		
			public static void main (String []args) {
				
				System.setProperty("webdriver.chrome.driver","E:\\BrowserDriver\\BrowserDrivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoblaze.com/index.html");
				
				// Loging in to browser
				
				WebElement username = driver.findElement(By.xpath("//input@id='loginusername']"));
				username.Sendkeys("sctqaautomation@grr.la");
				
				by.id("loginpassword").sendKeys("Spring@123");
				
				WebElement loginbutton = driver.findElement(By.xpath("//input[@type='button']"));
				
				loginbutton.click();
				
				// Selecting categories
				
				WebElement phone = driver.findElement(By.xpath("//input@id='itemc']"));
				phone.click();
				
				// Selecting samsung galaxy s6
				WebElement product = driver.findElement(By.xpath("//input[@class='nav-link']");
				
				product.click();
				
				WebElement selectproduct = driver.findElement(By.xpath("//input[@class='hrefch']");
				
				selectproduct.click();
				
				// Add to cart
				WebElement AddtoCart = driver.findElement(By.xpath("//input[@class='btn btn-success btn-lg']");
				
				AddtoCart.click();
				
				// popup handling
				
				driver.switchTo().alert().accept();
				
				//Home
				
				WebElement Home = driver.findElement(By.xpath("//input[@class='nav-link']");
						
				Home.click();
				
				//Selecting Dell i7 8 GB 
				
				WebElement laptop = driver.findElement(By.xpath("//input@id='itemc']"));
				laptop.click();
				
				
				WebElement Dell = driver.findElement(By.xpath("//input[@class='hrefch']");
						
						Dell.click();
				
			// Add to cart
				
				WebElement AddtoCart1 = driver.findElement(By.xpath("//input[@class='btn btn-success btn-lg']");
				
				AddtoCart1.click();
				// popup handling
				
				driver.switchTo().alert().accept();
				
				
				//Home
				
				WebElement Home1 = driver.findElement(By.xpath("//input[@class='nav-link']");
						
				Home1.click();
				
				//Selecting Asus Full HD
				
				WebElement monitor = driver.findElement(By.xpath("//input[@class='list-group-item'\">Monitors</a>']"));
				monitor.click();
				
				
				WebElement Asus = driver.findElement(By.xpath("//input[@class='hrefch']");
						
				Asus.click();
			 	
			   // Add to cart
				
				WebElement AddtoCart2 = driver.findElement(By.xpath("//input[@class=\'btn btn-success btn-lg']");
				
				AddtoCart2.click();	

				// popup handling
				
				driver.switchTo().alert().accept();
				
				// cart menu
				WebElement OpenCart = driver.findElement(By.xpath("//input@id='cartur']"));
				
				OpenCart.click();	
				
				// Place Order
				
				WebElement PlaceOrder  = driver.findElement(By.xpath("//input[@type='button']"));
				
				PlaceOrder.click();
				
				// Fill details
				
				WebElement name = driver.findElement(By.xpath("//input@id='name']"));
				username.Sendkeys("Harshada");
				
				WebElement country = driver.findElement(By.xpath("//input@id='country']"));
				username.Sendkeys("India");
			
				WebElement city = driver.findElement(By.xpath("//input@id='city']"));
				username.Sendkeys("Pune");
				
				WebElement card = driver.findElement(By.xpath("//input@id='card']"));
				username.Sendkeys("123456789111");
				
				WebElement month = driver.findElement(By.xpath("//input@id='month']"));
				username.Sendkeys("03");
				
				WebElement year = driver.findElement(By.xpath("//input@id='year']"));
				username.Sendkeys("2024");
				
				WebElement Purchase  = driver.findElement(By.xpath("//input[@class='btn btn-primary']");
				
				Purchase.click();
				
                // popup handling
				
				driver.switchTo().alert().accept();
				
				
				
				
				
				
			}
		

	}


