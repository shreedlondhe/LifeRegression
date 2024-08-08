package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;


public class SharePlanPage extends TestBase {

    public SharePlanPage() {
        PageFactory.initElements(driver, this);
    }

    LifeLandingPage hlp =  new LifeLandingPage();;

    @FindBy(xpath = "//span[@id='shareQuotes'][1]")
    WebElement share;

    @FindBy(xpath = "//div[@class='container checkout-mgt']//button[@id='shareQuotes']")
    WebElement shareCheckOutPage;

    @FindBy(xpath = "//button[@id='details-page-share-plan-btn']")
    WebElement sharePlan;

    @FindBy(xpath = "//span[text()='SMS']")
    WebElement sendSMS;

    @FindBy(xpath = "//span[text()='Email']")
    WebElement sendEmail;

    @FindBy(xpath = "//div[text()='Got It!']")
    WebElement gotIt;

    @FindBy(xpath = "//input[@id='paidUserMobile']")
    WebElement number;

    @FindBy(xpath = "//button[text()='Send SMS ']")
    WebElement send;

    @FindBy(xpath = "//button[@class='close ng-click-active']")
    WebElement close;

    @FindBy(xpath = "//button[@type='button'][@data-auto='share-email-sms-close-btn']")
    WebElement sharePlanClose;

    @FindBy(xpath = "//input[@id='paidUserEmail']")
    WebElement mail;

    @FindBy(xpath = "//button[text()='Send Email ']")
    WebElement sendmail;

    @FindBy(xpath = "//button[text()='View Details'][1]")
    WebElement viewDetails;

    @FindBy(xpath = "//span[text()='Download ']")
    WebElement downloadPlan;

    @FindBy(xpath = "//span[text()=' Copy link']")
    WebElement copyLink;

    @FindBy(xpath = "//span[text()='WhatsApp ']")
    WebElement whatsapp;

    @FindBy(xpath = "//span[@class = 'ctaBtn']")
    WebElement ShareVideo;

    @FindBy(xpath = "//button[@ng-if='whatsappShareEnabled']")
    WebElement shareHospital;

    @FindBy(xpath = "//input[@name='searchKey']")
    WebElement hospitalName;

    @FindBy(xpath = "//span[text()='asian heart institute']")
    WebElement selectHospital;

    @FindBy(xpath = "//span[text()='Downloads ']")
    WebElement downloadDoc;

    @FindBy(xpath = "//span[text()='policy brochure']")
    WebElement policyBrochure;

    @FindBy(xpath = "//span[text()='policy wording']")
    WebElement policyWording;

    @FindBy(xpath = "//span[text()='policy prospectus']")
    WebElement policyProspectus;

    @FindBy(xpath = "//span[text()='See more plans']")
    WebElement seeMorePlan;

    @FindBy(xpath = "//input[@type='text']")
    WebElement search;

    @FindBy(xpath = "//span[text()='View Details']")
    WebElement viewDetailsStarPlan;

    @FindBy(xpath = "//div[@class='flex']//button[@type='button']")
    WebElement getQuote;

    @FindBy(xpath = "//button[@id='CTA_SYFG']")
    WebElement starPlanOnResultPage;

    @FindBy(xpath = "//div[@id='Next']")
    WebElement hospitalPinCodSkip;

    @FindBy(xpath = "//span[text()='Call Turtlemint Insurance Expert ']")
    WebElement callExpert;

    @FindBy(xpath = "//span[text()=' Request a Callback']")
    WebElement callBackRequest;

    @FindBy(xpath = "//div[text()=\"Today's Poster\"]//parent::div//img")
    WebElement todayPoster;

    @FindBy(xpath = "//span[text()=\"Today's Poster\"]")
    WebElement todayPosterBack;

    @FindBy(xpath = "//div[text()='Policy Brochures']//parent::div//img")
    WebElement policyBrochurePoster;

    @FindBy(xpath = "//span[text()='Policy Brochures']")
    WebElement backPolicyBrochure;

    @FindBy(xpath = "//div[text()='Shareable Health Guide']//parent::div//img")
    WebElement healthGuide;

    @FindBy(xpath = "//span[text()='Back to Health Landing Page']")
    WebElement backToHealthLandingPage;

    @FindBy(xpath = "//div[@role='button'][1]")
    WebElement shareBrochure;

    @FindBy(xpath = "//button[text()=' Share Guide ']")
    WebElement shareGuide;

    @FindBy(xpath = "//button[text()=' Download ']")
    WebElement download;

    @FindBy(xpath = "//div[@class='new-share-form']//span[text()='Email']")
    WebElement shareEmailCheckout;

    @FindBy(xpath = "//div[@class='logo']//img[@alt='Turtlemint - Online Insurance']")
    WebElement logo;

    @FindBy(xpath ="//a[@target='blank']")
    WebElement smsLink;

    @FindBy(xpath = "//button[@data-auto='Continue']")
    WebElement shareWithAdvisor;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void scroll()
    {
        js.executeScript("arguments[0].scrollIntoView();",logo);
    }

    public String val;

    public void CopyLink()
    {
        TestUtil.click(copyLink, "Clicked on Copy link option");
        WebElement l = driver.findElement(By.id("copytxtInput"));
        val = l.getAttribute("value");
        TestUtil.click(whatsapp, "Clicked on whats app option");
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        driver.get(val);
        WebCommands.staticSleep(15000);
        TestUtil.getScreenShot();
    }

    public void SharePlan()
    {
        gotIt.click();
        WebCommands.staticSleep(10000);
        share.click();
        WebCommands.staticSleep(4000);
        sendSMS.click();
        number.sendKeys("9098007752");
        WebCommands.staticSleep(1000);
        send.click();
        WebCommands.staticSleep(1000);
        close.click();
        WebCommands.staticSleep(1000);
        share.click();
        WebCommands.staticSleep(2000);
        downloadPlan.click();
        sendEmail.click();
        mail.sendKeys("ambrish.balde@turtlemint.com");
        sendmail.click();
        WebCommands.staticSleep(1000);
        close.click();
        WebCommands.staticSleep(3000);
        share.click();
        WebCommands.staticSleep(4000);
        sendSMS.click();
        TestUtil.click(smsLink, "Clicked on SMS link");
        WebCommands.staticSleep(4000);
        close.click();
        WebCommands.staticSleep(1000);
        share.click();
        CopyLink();
    }

    public void SharePlanOnPDP()
    {
        gotIt.click();
        WebCommands.staticSleep(15000);
        viewDetails.click();
        WebCommands.staticSleep(1000);
        sharePlan.click();
        WebCommands.staticSleep(6000);
        sendSMS.click();
        number.sendKeys("9098007752");
        WebCommands.staticSleep(1000);
        send.click();
        WebCommands.staticSleep(1000);
        close.click();
        WebCommands.staticSleep(1000);
        sharePlan.click();
        WebCommands.staticSleep(2000);
        downloadPlan.click();
        sendEmail.click();
        mail.sendKeys("ambrish.balde@turtlemint.com");
        sendmail.click();
        WebCommands.staticSleep(1000);
        close.click();
        WebCommands.staticSleep(4000);
        sharePlan.click();
        WebCommands.staticSleep(4000);
        sendSMS.click();
        TestUtil.click(smsLink, "Clicked on SMS link");
        WebCommands.staticSleep(4000);
        close.click();
        WebCommands.staticSleep(1000);
        sharePlan.click();
        WebCommands.staticSleep(5000);
        CopyLink();
    }

    public void ShareVideoFromPDP()
    {
        gotIt.click();
        WebCommands.staticSleep(15000);
        viewDetails.click();
        WebCommands.staticSleep(3000);
        ShareVideo.click();
        TestUtil.click(copyLink, "Clicked on Copy link option");
        WebElement l = driver.findElement(By.id("copytxtInput"));
        val = l.getAttribute("value");
        TestUtil.click(whatsapp, "Clicked on whats app option");
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        driver.get(val);
        WebCommands.staticSleep(15000);
        TestUtil.getScreenShot();
    }

    public void ShareHospitalFromPDP()
    {
        gotIt.click();
        WebCommands.staticSleep(15000);
        viewDetails.click();
        WebCommands.staticSleep(3000);
        shareHospital.click();
        TestUtil.click(copyLink, "Clicked on Copy link option");
        WebElement l = driver.findElement(By.id("copytxtInput"));
        val = l.getAttribute("value");
        TestUtil.click(whatsapp, "Clicked on whats app option");
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        driver.get(val);
        WebCommands.staticSleep(15000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(hospitalName, "Asian Heart", "Hospital name entered");
        TestUtil.click(selectHospital, "Hospital selected on shared hospital link");
        TestUtil.getScreenShot();
    }

    public void CheckPolicyDocOnPDP()
    {
        gotIt.click();
        WebCommands.staticSleep(15000);
        viewDetails.click();
        String parentWindowId = driver.getWindowHandle();
        WebCommands.staticSleep(3000);
        TestUtil.click(downloadDoc, "Clicked on download link");
        TestUtil.click(policyBrochure, "Clicked on Policy Brochure");
        WebCommands.staticSleep(2000);
        Switch();
        WebCommands.staticSleep(8000);
    //    TestUtil.getScreenShot();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        WebCommands.staticSleep(1000);
        driver.switchTo().window(p);
        TestUtil.click(policyWording, "Clicked on Policy Wording Document");
        Switch();
        WebCommands.staticSleep(5000);
       // TestUtil.getScreenShot();
        driver.switchTo().window(p);
        TestUtil.click(policyProspectus, "Clicked on Policy Prospectus Document");
        Switch();
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
    }

    public void SwitchToParentWindow(String parentWindowId)
    {
        driver.switchTo().window(parentWindowId);
    }

    public void Switch()
    {
        WebCommands.staticSleep(3000);
        String currentHandle= driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles) {
            if(!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
        }
    }

    public void GotIt()
    {
        TestUtil.click(gotIt, "GotIt is clicked");
        WebCommands.staticSleep(3000);
        TestUtil.IsDisplayed(starPlanOnResultPage, "Start plan displayed on result page");
    }

    public void CallExpert()
    {
        WebCommands.staticSleep(4000);
        TestUtil.click(callExpert, "Clicked on Call Turtlemint Insurance Expert Button");
        WebCommands.staticSleep(8000);
        TestUtil.click(callBackRequest, "Clicked on request call back button");
        TestUtil.getScreenShot();
    }

    public void LPPosters()
    {
        WebCommands.staticSleep(10000);
        TestUtil.click(todayPoster, "Clicked on Today's Poster");
        WebCommands.staticSleep(15000);
        TestUtil.getScreenShot();
        TestUtil.click(todayPosterBack, "Back from Today's poster");
        WebCommands.staticSleep(2000);
        TestUtil.click(policyBrochurePoster, "Clicked on Policy Brochures");
        driver.switchTo().frame(0);
        WebCommands.staticSleep(15000);
        TestUtil.click(shareBrochure, "Clicked on policy brochures to share");
        WebCommands.staticSleep(15000);
        TestUtil.getScreenShot();
        driver.switchTo().defaultContent();
        WebCommands.staticSleep(2000);
        TestUtil.click(backPolicyBrochure, "Clicked on back button");
        WebCommands.staticSleep(2000);
        TestUtil.click(healthGuide, "Clicked Share health guide");
        WebCommands.staticSleep(2000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
        WebCommands.staticSleep(5000);
      //  TestUtil.click(shareGuide, "Clicked on share guide");
        js.executeScript("arguments[0].scrollIntoView();",shareGuide);
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        js.executeScript("arguments[0].scrollIntoView();",copyLink);
       // TestUtil.click(copyLink, "Clicked on Copy link option");
        TestUtil.click(close, "clicked on close button");
        WebElement l = driver.findElement(By.id("copytxtInput"));
        val = l.getAttribute("value");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(val);
        WebCommands.staticSleep(5000);
        TestUtil.getScreenShot();
        driver.close();
    }

    public void DownloadPoster()
    {
        WebCommands.staticSleep(15000);
        TestUtil.click(healthGuide, "Clicked Share health guide");
        WebCommands.staticSleep(8000);

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String p = it.next();
        String c = it.next();
        driver.switchTo().window(c);
      //  TestUtil.click(download, "Clicked on download button");
        js.executeScript("arguments[0].scrollIntoView();",download);
        String currentHandle= driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles) {
            if(!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
            WebCommands.staticSleep(5000);
            TestUtil.getScreenShot();
        }
    }

//    public void SharePlanFromCheckout() throws InterruptedException {
//        WebCommands.staticSleep(1000);
//        hlp.HealthInsuranceClick();
//        Profilepage.Profile_page_Compare_Page();
//        leadpage.SaveLead(tl.NameGenerator());
//        resultPage.gotIT();
//        resultPage.comparePlan();
//        WebCommands.staticSleep(10000);
//        Actions a = new Actions(driver);
//        a.moveToElement(shareCheckOutPage).click().build().perform();
//        WebCommands.staticSleep(3000);
//        WebCommands.staticSleep(1000);
//        TestUtil.click(shareEmailCheckout, "Clicked on Email Icon");
//        mail.sendKeys("ambrish.balde@turtlemint.com");
//        sendmail.click();
//        WebCommands.staticSleep(1000);
//        close.click();
//        shareCheckOutPage.click();
//        WebCommands.staticSleep(1000);
//        CopyLink();
//        checkoutPage.CheckoutCompairPlanshare();
//        LogUtils.info("Test completed");
//
//    }
}