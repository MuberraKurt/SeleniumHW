package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Homework extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demo.applitools.com/");
        WebElement userName=driver.findElement(By.cssSelector("div>label~input#username"));
        userName.sendKeys("tester@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("div>input#password"));
        password.sendKeys("test1234");

        WebElement signInBtn=driver.findElement(By.cssSelector(".buttons-w>a"));
        signInBtn.click();

        WebElement message=driver.findElement(By.cssSelector(".element-actions+h6"));
        MyFunctions.Bekle(3);
        Assert.assertTrue("Yazı ekranda çıkmadı",message.isDisplayed());

        BekleKapat();

    }

}
