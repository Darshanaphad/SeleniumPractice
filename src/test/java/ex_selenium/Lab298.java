package ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab298 {


    @Test
    public void test1(){

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://sdet.live");
        driver.quit();
        // Selenium Flow
        // 1. Create SessionID - q09876q789e8wq89we87
        // Client - Java(Program)
        // Server - Webdriver Edge - Command W3C -> Edge browser
        // 2. Session -> Run the commands - GET -> GET Method w3c Protocol
        // 3. EdgeDriver (Server) -> Tell the Edge Browser
        // 4. Open a Fresh copy of the Edge Browser and
        // Open the URL - https//sdet.live
        // 5. Driver - Command (POST) Request - Shutdown the browser. SessionID == null

    }


}
