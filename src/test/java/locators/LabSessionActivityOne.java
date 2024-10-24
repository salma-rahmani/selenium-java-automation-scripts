package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LabSessionActivityOne {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://dev.retail.tekschool-students.com/");

        String title =chromeDriver.getTitle();
        System.out.println(title);
        chromeDriver.quit();

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://dev.retail.tekschool-students.com/");
        String titleForEdge = edgeDriver.getTitle();
        System.out.println(titleForEdge);
        edgeDriver.quit();
    }
}