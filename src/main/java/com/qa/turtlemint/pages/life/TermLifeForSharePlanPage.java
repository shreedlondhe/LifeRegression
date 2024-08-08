package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class TermLifeForSharePlanPage {

    public TermLifeForSharePlanPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect;

    @FindBy(xpath = "//span[text()= 'Next']")
    WebElement NextButton;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement gotIt;

    @FindBy(xpath = "//button[text()='OK, GOT IT!']")
    WebElement OkGotit;

    @FindBy(xpath = "//input[@placeholder='Pincode']")
    WebElement Pincode;

    @FindBy(xpath = "//button[@id='listItem-P76-sharePlan']")
    WebElement shareplan;

    @FindBy(xpath = "//span[text()='Share Plan']")
    WebElement sharePlanText;

    @FindBy(xpath = "//span[text()='Brochure']")
    WebElement clickBrochure;

    @FindBy(xpath = "//span[text()= 'Copy Link']")
    WebElement copyLink;

    @FindBy(xpath = "//div[text()= ' Whatsapp ']")
    WebElement clickWhatsapp;

    @FindBy(xpath = "//span[text()='Download']")
    WebElement download;

    @FindBy(xpath = "//span[text()='One Pager']//parent::div")
    WebElement OnePager;

    @FindBy(xpath = "//a[@ng-click='backToPrevious()']//*[name()='svg']")
    WebElement back;

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Sampoorna Raksha Supreme (SRS)']")
    WebElement tata;

    @FindBy(xpath = "//span[text()='Benefit Illustration']")
    WebElement BI;


    @FindBy(xpath = "//span[text()='Select Occupation']")
    WebElement SelectOccupation;

    @FindBy(xpath = "//li[text()='Self employed']")
    WebElement Selfemployed;

    @FindBy(xpath = "//span[text()='Select Educational Qualification']")
    WebElement SelectEducationalQualification;

    @FindBy(xpath = "//li[text()='Graduate and above']")
    WebElement Graduateandabove;

    public String val;

    public void selectGender() throws InterruptedException {
        WebCommands.staticSleep(2000);
    }

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
            WebCommands.staticSleep(1000);
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
        WebCommands.staticSleep(1000);
    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(1000);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
            WebCommands.staticSleep(1000);
        } else
            TestUtil.click(no, "No Selected");
        WebCommands.staticSleep(1000);
    }

    public void datepicker() {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText("Aug");
        WebCommands.staticSleep(1000);
        TestUtil.click(dateselect, "5 aug date select");
        WebCommands.staticSleep(5000);
        TestUtil.sendKeys(Pincode,"431517","Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Clicked on Next button");
        WebCommands.staticSleep(2000);
        TestUtil.click(SelectOccupation, "SelectOccupation");
        TestUtil.click(Selfemployed, "Selfemployed");
        TestUtil.click(SelectEducationalQualification, "SelectEducationalQualification");
        TestUtil.click(Graduateandabove, "Graduateandabove");
    }

    public void Switch() {
        WebCommands.staticSleep(3000);
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
        }

    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void SharePlan()  {
        WebCommands.staticSleep(3000);
        String parent = driver.getWindowHandle();


        TestUtil.click(shareplan, "clicked on share plan option");
        WebCommands.staticSleep(3000);

        js.executeScript("arguments[0].scrollIntoView();",sharePlanText);
        WebCommands.staticSleep(3000);

        String sharetext = sharePlanText.getText();
        System.out.println(sharetext + "text for share plan");
        Assert.assertEquals(sharetext, "Share Plan");

        // Verify Brochure click and download event
        boolean clickbrochure = TestUtil.clickable(clickBrochure, "Clicked on brochure option on share plan screen");

        Assert.assertEquals(clickbrochure, true);
        WebCommands.staticSleep(3000);
        boolean brochuredownload = TestUtil.clickable(download, " clicked on download button");
        Assert.assertEquals(brochuredownload, true);
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        driver.switchTo().window(parent);

        // Verify OnePager click and download event
        WebCommands.staticSleep(3000);
        boolean onepager = TestUtil.clickable(OnePager, "One Page text displayed");

        Assert.assertEquals(onepager, true);
        boolean onepagerdownload = TestUtil.clickable(download, " clicked on download button");
        Assert.assertEquals(onepagerdownload, true);
        WebCommands.staticSleep(3000);

        driver.switchTo().window(parent);


        // Verify copy link event
        WebCommands.staticSleep(3000);
        boolean cplink = TestUtil.clickable(copyLink, "Clicked on copy link option");

        Assert.assertEquals(cplink, true);

        // Verify BI click and download event
        try {
            if (driver.findElement(By.xpath("//span[text()='Benefit Illustration']")).isDisplayed()) {
                boolean bi = TestUtil.clickable(BI, "Clicked on Benefit Illustration");
                Assert.assertEquals(bi, true);
                boolean bidownload = TestUtil.clickable(download, " clicked on download button");
                Assert.assertEquals(bidownload, true);

            }
        } catch (Exception e) {
            System.out.println("Benefit Illustration in not available for this plan");
        }
    }
}