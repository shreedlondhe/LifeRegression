package com.qa.turtlemint.commands;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class screenGrab {
    public void takeScreenshot(WebDriver webDriver) throws IOException {
        File screenshotAs = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        Allure.addAttachment("Screenshot", new FileInputStream(screenshotAs));
    }

}
