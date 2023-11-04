package org.example.testng;

import com.google.common.annotations.VisibleForTesting;
import org.example.Loginpage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.configutils;

import java.util.Properties;

public class logintest {
    Loginpage logpg;
    WebDriver driver;
    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Properties prop = configutils.getProps("data");
        driver.get("https://www.google.com/");
        driver.get(prop.getProperty("URL"));

        logpg = new Loginpage(driver);
        logpg.login();

    }
    @Test
    public void logout(){
        logpg.logout();
        System.out.println("logout successfully");
        driver.quit();
    }

}
