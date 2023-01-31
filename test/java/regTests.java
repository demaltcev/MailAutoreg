package ru.yandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;



public class regTests extends ru.yandex.WebDriverSettings {




        @Test
        public void testReg1() {

            driver.get("https://account.mail.ru/signup?from=navi&lang=ru_RU&siteid=169&app_id_mytracker=58519");
           // driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("main-signup")));

            driver.findElement(By.id("fname")).sendKeys("Александр");
            driver.findElement(By.id("lname")).sendKeys("Петров");



            driver.findElement(By.cssSelector("[class=\"base-0-2-39 control-0-2-47 secondary-0-2-53\"]")).click();
            Actions builder1 = new Actions(driver);
            builder1.moveToElement(driver.findElement(By.cssSelector("[class=\"base-0-2-39 control-0-2-47 secondary-0-2-53\"]")),
                    4, 350).click().build().perform();

            driver.findElement(By.cssSelector("[data-test-id=\"birth-date__month\"]")).click();
            Actions builder2 = new Actions(driver);
            builder2.moveToElement(driver.findElement(By.cssSelector("[data-test-id=\"birth-date__month\"]")),
                    -32, 300).click().build().perform();

            driver.findElement(By.cssSelector("[data-test-id=\"birth-date__year\"]")).click();
            Actions builder3 = new Actions(driver);
            builder3.moveToElement(driver.findElement(By.cssSelector("[data-test-id=\"birth-date__year\"]")),
                    30, 300).click().build().perform();



            driver.findElement(By.cssSelector("[data-test-id=\"gender-male\"]")).click();


            Random random = new Random();
            int n = random.nextInt(10000)+1;
            String email = "jaromejust" + n;

System.out.println(email);


            driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys(email);

           driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("123123Dagger");
            driver.findElement(By.cssSelector("[name=\"repeatPassword\"]")).sendKeys("123123Dagger");
            driver.findElement(By.cssSelector("[data-test-id=\"phone-number-switch-link\"]")).click();
            driver.findElement(By.cssSelector("[data-test-id=\"extra-email\"]")).sendKeys(email+"1"+"@gmail.com");


            driver.findElement(By.cssSelector("[class=\"base-0-2-242 primary-0-2-256 fluid-0-2-249 touch-0-2-267\"]")).click();
            Actions builder4 = new Actions(driver);
            builder4.moveToElement(driver.findElement(By.cssSelector("[class=\"base-0-2-242 primary-0-2-256 fluid-0-2-249 touch-0-2-267\"]")),
                    30, 450).click().build().perform();





            //driver.findElement(By.cssSelector("[class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b\"]")).click();



        }
}

