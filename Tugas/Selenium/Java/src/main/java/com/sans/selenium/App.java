package com.sans.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Hello world!
 *
 */
public class App 
{
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void johntravolta() throws InterruptedException {
        driver.get("https://john-travolta.sanjari.id/");
        Thread.sleep(2000);

        assertEquals("Hitung Gaji Pokok", driver.getTitle());
        assertEquals("Rp. 15.000", driver.findElement(By.id("gn")).getAttribute("value"));
        assertEquals("Rp. 22.500", driver.findElement(By.id("gl")).getAttribute("value"));
        assertEquals("Rp. 600.000", driver.findElement(By.id("pe")).getAttribute("value"));
        assertEquals("40", driver.findElement(By.id("jp")).getAttribute("value"));
        assertEquals("52", driver.findElement(By.id("jk")).getAttribute("value"));


        driver.findElement(By.cssSelector("input:nth-child(6")).click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();

            assertEquals(
                    "Gaji : Rp. 870.000, dan bisa menabung sebesar Rp. 270.000",
                    alert.getText()
            );
        } catch (Exception e) {
            //exception handling
        }

        driver.close();
    }
}
