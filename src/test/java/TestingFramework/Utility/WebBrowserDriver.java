package TestingFramework.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserDriver {

    public WebDriver webDriver;
    public static WebBrowserDriver object;

    private WebBrowserDriver(){
        System.setProperty("webdriver.chrome.driver","lib/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public static WebBrowserDriver getInstance(){
        if(object == null)
            object = new WebBrowserDriver();
        return object;
    }

}
