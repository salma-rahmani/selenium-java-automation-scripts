package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggedInActivity {

        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//a[@id='signinLink']")).click();

           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahmani049@gmail.com");
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123!!");
           Thread.sleep(1000);
            driver.findElement(
                            By.xpath("//button[text() = 'Login']"))
                    .click();

            Thread.sleep(1000);

            boolean isLogoutDisplayed = driver.findElement(
                            By.xpath("//button[text() = 'Log out']"))
                    .isDisplayed();

            if (isLogoutDisplayed) {
                System.out.println("Yes Logged In");
            }else {
                System.out.println("No");
            }

            driver.findElement(
                            By.xpath("//input[@id='searchInput']"))
                    .sendKeys("Keyboard");
            driver.findElement(
                            By.xpath("//button[@class='search__btn']"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(
                            By.xpath("//div[@class='products']/div[1]/p[@class='products__name']"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(By.xpath("//button[@class='product__btn']")).click();

            WebElement cartCountElement = driver.findElement(By.xpath("//span[@class='top-nav__cart-quantity']"));
            String cartCount = cartCountElement.getText();

            if (cartCount.equals("1")) {
                System.out.println("Keyboard added to cart.");
            } else {
                System.out.println("Not added.");
            }


            driver.quit();
        }
    }


