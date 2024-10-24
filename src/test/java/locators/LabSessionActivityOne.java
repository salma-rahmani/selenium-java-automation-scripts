package locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class LabSessionActivityOne {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Which browser do you want to open the link? Chrome/Edge:");
        String userInput = input.next();
        if (userInput.equals("Chrome")) {
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://dev.retail.tekschool-students.com/");
            String title = chromeDriver.getTitle();
            System.out.println(title);
            Thread.sleep(3000);
            chromeDriver.quit();

        } else {


            EdgeDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://dev.retail.tekschool-students.com/");

            String titleForEdge = edgeDriver.getTitle();
            System.out.println(titleForEdge);
            Thread.sleep(3000);

            edgeDriver.quit();


        }
    }
}