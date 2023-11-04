package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.configutils;

import java.util.Properties;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.id;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Properties prop = configutils.getProps("data");
        driver.get("https://www.google.com/");
        driver.get(prop.getProperty("URL"));

        Loginpage logpg = new Loginpage(driver);
        logpg.login();
        System.out.println("login successfully");
        logpg.logout();
        System.out.println("logout successfully");
            driver.quit();
        }
    }
