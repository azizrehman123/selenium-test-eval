package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.id;

public class Loginpage{
    WebDriver driver;
    By username = new By.ById("user-name");
    By password = new By.ById("password");
    By loginbtn = new By.ById("login-button");
    By logout = new By.ById("react-burger-menu-btn");
    By logoutbtn = new By.ById("logout_sidebar_link");
       public Loginpage(WebDriver driver){
       this.driver= driver;
    }
    public void login()
    {
        driver.findElement(username).sendKeys("standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(loginbtn).click();

    }
    public void logout()
    {
        driver.findElement(logout).click();
        try{
            driver.wait(150000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Wait Complete");
            driver.findElement(logoutbtn).click();
        }
    }
}
