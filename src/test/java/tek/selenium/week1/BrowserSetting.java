package tek.selenium.week1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetting {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/news");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();



    }
}
