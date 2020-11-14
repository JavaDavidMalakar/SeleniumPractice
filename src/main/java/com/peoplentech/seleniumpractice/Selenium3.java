package com.peoplentech.seleniumpractice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.peoplentech.seleniumpractice.Selenium2.*;

public class Selenium3 extends TestBase {


    // xpath rules
    //tagName[text()='______'] ---> text
    //tagName[@attribute='_____'] --->id/class/aria-label etc


    @Test
    public static void validateUserCanTypeOnSearchBar() {
        setupDriver();
        navigateToURL("https://www.ebay.com");

        String data = driver.findElement(By.xpath("//select[@id='gh-cat']")).getText();
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        List<WebElement>dropDown = driver.findElements(By.xpath("//select[@id='gh-cat']"));

        sleepFor(2);
        closeDriver();
    }


    @Test
    public static void validateUserCanTypeOnSearchBarAndClickSearchButton() {
        setupDriver();
        navigateToURL("https://www.ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("Java Books");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java Books");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        sleepFor(2);
        closeDriver();
}
}
