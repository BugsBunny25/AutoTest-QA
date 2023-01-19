package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


import java.io.Console;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dana & Sanya\\Desktop\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://u920152e.beget.tech"); // Загрузка страницы

        WebElement email = driver.findElement(By.name("auth_email")); //Поиск и присваивание элемента в переменную email
        email.sendKeys( "123"); // Установка тестового значения

        WebElement password = driver.findElement(By.name("auth_pass")); //Поиск и присваивание элемента в переменную password
        password.sendKeys( "123"); // Установка тестового значения

        WebElement button = driver.findElement(By.name("form_auth_submit")); //Поиск и присваивание элемента в переменную button
        button.click();

        String expectedUrl = "http://u920152e.beget.tech/"; //Ожидаемый url
        String currentUrl = driver.getCurrentUrl(); //Сохранение текущего url  переменную currenturl
        System.out.println(expectedUrl);
        System.out.println(currentUrl);
        if (expectedUrl.contentEquals(currentUrl)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }



        //driver.close(); // Закрытие драйвера (освобождение оперативной памяти)



    }
}