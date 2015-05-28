package com.testsel.maventestsel;


import com.testsel.maventestsel.pages.HomePage;
import com.testsel.maventestsel.pages.LoginPage;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
//@Test
public class GitHubTest extends TestCase
  {
   //@TestSuite
    public static void testLogin()
    {
      
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://github.com/login");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage pageTest = new LoginPage(webDriver);
    
     
        User user = new User("MarusyaVP", "marinka3868286");
        pageTest.loginUser(user);
        
       HomePage homePage = new HomePage(webDriver);
        //Assert.assertTrue(homePage.CheckHomePage(user.login.toString()));
        
        webDriver.quit();
    }

  
}
