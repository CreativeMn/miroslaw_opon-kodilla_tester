package com.kodilla.selenium.allegro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]"));
        cookies.click();
        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder=\"czego szukasz?\"]"));

        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
