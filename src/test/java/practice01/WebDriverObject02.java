package practice01;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverObject02 {
    public static void main(String[] args) {

      // WebDriver driver = WebDriverManager.chromedriver().create(); //direkt chrome acar

       // WebDriverManager.chromedriver().setup(); //selenium 4.6 sonrasi gerek yok!!!
        WebDriver driver = new ChromeDriver();
        driver.close();

    }
}
