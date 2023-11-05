package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Navigate {
    public static void main(String[] args) {

    //Set Driver Path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    //Create chrome driver object
    WebDriver driver = new ChromeDriver();
    //Maximize the window
        driver.manage().window().maximize();
    //Open google home page https://www.google.com/
    driver.get("https://www.google.com");
    //Navigate to techproeducation home page https://lms.techproeducation.com/login/index.php
    driver.navigate().to("https://lms.techproeducation.com/login/index.php");
    //Navigate back to google
        driver.navigate().back();
    //Navigate forward to techproeducation
        driver.navigate().forward();
    //Refresh the page
        driver.navigate().refresh();
    //Close/Quit the browser
        driver.quit();

    //And last step : print "ALL OK" on console


    }
}
