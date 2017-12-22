package com.spike.headless;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class PageTest {

    @Test
    public void screenResolutionDefault() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless","disable-gpu");
        System.setProperty("webdriver.chrome.driver", "./src/test/java/com/spike/headless/chromedriver");
        WebDriver webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriver.Window window = webdriver.manage().window();
        System.out.println("screenResolutionDefault***************************");
        System.out.println("width is " + window.getSize().width);
        System.out.println("height is " + window.getSize().height);
        webdriver.close();
    }

    @Test
    public void screenResolutionMax() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless","disable-gpu");
        System.setProperty("webdriver.chrome.driver", "./src/test/java/com/spike/headless/chromedriver");
        WebDriver webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriver.Window window = webdriver.manage().window();
        window.maximize();
        System.out.println("screenResolutionMax***************************");
        System.out.println("width is " + window.getSize().width);
        System.out.println("height is " + window.getSize().height);
        webdriver.close();
    }

    @Test
    public void screenResolution1200() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless","disable-gpu");
        System.setProperty("webdriver.chrome.driver", "./src/test/java/com/spike/headless/chromedriver");
        WebDriver webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriver.Window window = webdriver.manage().window();
        window.setSize(new Dimension(1200, window.getSize().getHeight()));
        System.out.println("screenResolutionMax***************************");
        System.out.println("width is " + window.getSize().width);
        System.out.println("height is " + window.getSize().height);
        webdriver.close();
    }

    @Test
    public void screenResolution992() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless","disable-gpu");
        System.setProperty("webdriver.chrome.driver", "./src/test/java/com/spike/headless/chromedriver");
        WebDriver webdriver = new ChromeDriver(options);
        webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriver.Window window = webdriver.manage().window();
        window.setSize(new Dimension(992, window.getSize().getHeight()));
        System.out.println("screenResolutionMax***************************");
        System.out.println("width is " + window.getSize().width);
        System.out.println("height is " + window.getSize().height);
        webdriver.close();
    }

}