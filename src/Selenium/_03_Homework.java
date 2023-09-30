package Selenium;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Homework extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculator= driver.findElement(By.xpath("//*[contains(text(),'Calculator')][@href='calculator']"));
        calculator.click();

        WebElement input1= driver.findElement(By.xpath("//input[@name='number1']"));
        input1.sendKeys("1");
        WebElement input2= driver.findElement(By.xpath("//input[@id='number2']"));
        input2.sendKeys("3");

        WebElement selectMenu=driver.findElement(By.xpath("//select"));
        Select select=new Select(selectMenu);
        select.selectByVisibleText("minus");

        WebElement calculateButton= driver.findElement(By.xpath("//input[@type='submit']"));
        calculateButton.click();

        WebElement result= driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(result.getText());

        driver.navigate().back();
        driver.navigate().back();


        MyFunctions.Bekle(3);

        Assert.assertTrue("Url uyuşmuyor",driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/index.html"));

        BekleKapat();
    }
}
