package ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab303 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // quit vs close()
//        Thread.sleep(5000);
//        driver.close();
//        // driver.close();
//        // Close the Current Browser Window
//        // Not the full browser
//        // Session ID != NULL


        Thread.sleep(5000);
        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Session = null, Error - Session ID is null


    }
}
