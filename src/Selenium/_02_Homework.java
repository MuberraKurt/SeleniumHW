package Selenium;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _02_Homework extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Actions actions=new Actions(driver);

        WebElement personalUseButton= driver.findElement(By.cssSelector("#u_3im_4586_1"));
        String before=personalUseButton.getCssValue("border");
        System.out.println(before);
        Action action1=actions.moveToElement(personalUseButton).click().build();
        action1.perform();
        String after=personalUseButton.getCssValue("border");
        System.out.println(after);

        WebElement discoverXYZ= driver.findElement(By.cssSelector("#u_3im_4588"));
        Select select1=new Select(discoverXYZ);
        select1.selectByValue("Search Engine");

        WebElement oftenButton=driver.findElement(By.cssSelector("#u_3im_89585_2"));
        oftenButton.click();

        WebElement averageButton=driver.findElement(By.cssSelector("#u_3im_4589_1"));
        averageButton.click();

        WebElement longSelect=driver.findElement(By.cssSelector("#u_3im_4597"));
        Select select2=new Select(longSelect);
        select2.selectByIndex(4);

        WebElement text=driver.findElement(By.cssSelector("#u_3im_89597"));
        text.sendKeys("abc");

        BekleKapat();
    }
}
