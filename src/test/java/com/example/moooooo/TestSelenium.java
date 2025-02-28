//package com.example.moooooo;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class TestSelenium {
//
//    ChromeDriver chromeDriver;
//
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//    }
//
//    @Test
//    void test() {
////        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
////
////        WebElement inputName = chromeDriver.findElement(By.xpath("//input[@id='name']"));
////        inputName.sendKeys("Nguyễn Văn Hoàn");
////        WebElement inputPhone = chromeDriver.findElement(By.xpath("//input[@id='phone']"));
////        inputPhone.sendKeys("0363618782");
////
////        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='email']"));
////        inputEmail.sendKeys("zeenolmattroi@gmail.com");
////        WebElement inputPassword = chromeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
////        inputPassword.sendKeys("hoan0363618782");
////        WebElement inputPasswordConfirm = chromeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
////        inputPasswordConfirm.sendKeys("hoan0363618782");
////        WebElement btn = chromeDriver.findElement(By.xpath("//a[@id='register-btn']"));
////        btn.click();
//
//        chromeDriver.get("https://vitimex.com.vn/");
//        WebElement btnShowForm = chromeDriver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']//*[name()='path' and contains(@d,'M3 20C5.33')]"));
//        btnShowForm.click();
//
//        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
//        WebElement inputEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='account']")));
//        inputEmail.sendKeys("zeenolmattroi@gmail.com");
//        WebElement inputPassword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
//        inputPassword.sendKeys("hoan0363618782");
//        WebElement btn = chromeDriver.findElement(By.id("signin-btn"));
//        btn.click();
//
//
//
//    }
//}
