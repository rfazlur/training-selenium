package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
    static void main() throws InterruptedException {
        System.out.println("Launch browser");
        WebDriver driver = new ChromeDriver();

        System.out.println("Navigate to url http://automationexercise.com");
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        System.out.println("Verify that home page is visible successfully");
        String title = driver.getTitle();
        System.out.println("title: "+title);

        System.out.println("Click on 'Signup / Login' button");
        // <a href="/login"><i class="fa fa-lock"></i> Signup / Login</a>
        WebElement btnSignUpLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnSignUpLogin.click();

        System.out.println("Verify 'New User Signup!' is visible");
        WebElement txtNewUserSignup = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        txtNewUserSignup.isDisplayed();

        System.out.println("Enter name and email address");
        // <input type="text" data-qa="signup-name" placeholder="Name" name="name" value="" required="">
        WebElement inputName = driver.findElement(By.name("name"));
        inputName.sendKeys("John Doe");

        // <input type="email" data-qa="signup-email" placeholder="Email Address" name="email" value="" required="">
        WebElement inputEmail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        inputEmail.sendKeys("john_doe@mail.com");

        System.out.println("Click 'Signup' button");
        // <button type="submit" data-qa="signup-button" class="btn btn-default">Signup</button>
        WebElement btnSignUp = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        btnSignUp.click();
        Thread.sleep(10000);

        driver.close();
        driver.quit();
    }
}
