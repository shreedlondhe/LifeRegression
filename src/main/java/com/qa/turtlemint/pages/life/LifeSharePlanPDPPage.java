package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.Set;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class LifeSharePlanPDPPage extends TestBase {

    public LifeSharePlanPDPPage() {
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

    @FindBy(xpath = "//select[@class=\"sc-iQKALj gwKrYD\"]")
    WebElement yearselect;

    @FindBy(xpath = "(//select[@class=\"sc-iQKALj gwKrYD\"])[2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect;

    @FindBy(xpath="//span[text()= 'Next']")
    WebElement NextButton;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement gotIt;

    @FindBy(xpath = "//button[text()='OK, GOT IT!']")
    WebElement OkGotit;

    @FindBy(xpath = "//span[@id='shareQuotes'][1]")
    WebElement shareplan;

    @FindBy(xpath = "//span[text()=\"Share Plan\"]")
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

    @FindBy(xpath = "//button[@data-auto='viewdetail-MAXLIFELI-Smart Secure Plus']")
    WebElement ClickMaxLifePlan;

    @FindBy(xpath = "//button[@id='details-page-share-plan-btn']")
    WebElement sharePlanPDP;

    @FindBy(xpath = "//a[@title='More']")
    WebElement clickMore;

    @FindBy(xpath = "//div[text()='Share'][@class='ytp-share-title']")
    WebElement shareVideo;

    @FindBy(xpath = "//div[@class='ytp-share-icon']")
    WebElement sv;

    @FindBy(xpath = "//span[text()='Downloads']")
    WebElement downloadBrochure;

    @FindBy(xpath = "//span[@aria-label=\"download\"]//parent::div//span")
    WebElement downloadIcon;

    @FindBy(xpath = "//a[@ng-click='backToPrevious()']//*[name()='svg']")
    WebElement back;

    @FindBy(xpath = "//span[text()='Benefit Illustration']")
    WebElement BI;

    @FindBy(xpath = "//span[@aria-label=\"arrow-left\"]")
    WebElement backBtn;

    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Sampoorna Raksha Supreme (SRS)']")
    WebElement tata;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public String val;


    public void selectGender() throws InterruptedException {
        WebCommands.staticSleep(2000);
    }

    public void scroll() {
        js.executeScript("arguments[0].scrollIntoView();", download);
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

    public void datepicker(){
        TestUtil.click(calender,"caleder select");
        Select yearSelect =new Select(yearselect);
        yearSelect.selectByValue("1992");
        WebCommands.staticSleep(1000);
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Aug");
        WebCommands.staticSleep(1000);
        TestUtil.click(dateselect,"5 aug date select");
        WebCommands.staticSleep(5000);
        TestUtil.click(NextButton, "Clicked on Next button");
    }

    public void SharePlanFromPDPPageTataAIA(String insurere) throws IOException {
        WebCommands.staticSleep(3000);
       // TestUtil.click(tata, "clicked on TATA plan option");
        TestUtil.getFullPageScreenShot();
//button[@id='listItem-P85-viewDetails']
        TestUtil.click(driver.findElement(By.xpath("//button[@id='listItem-"+insurere+"-viewDetails']")), "clicked on max plan option");

       // TestUtil.click(driver.findElement(By.xpath("//button[@data-auto='"+insurere+"']")), "clicked on TATA plan option");
      //  TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
        String parent=driver.getWindowHandle();
        js.executeScript("arguments[0].scrollIntoView();",sharePlanPDP);

        TestUtil.JsClick(sharePlanPDP, "share button clicked");
       // TestUtil.click(sharePlanPDP, "Clicked on share plan option on PDP page");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].scrollIntoView();",sharePlanText);
        WebCommands.staticSleep(3000);
        String sharetext = sharePlanText.getText();
        System.out.println(sharetext + "text for share plan");
        Assert.assertEquals(sharetext, "Share Plan");

        boolean clickbrochure =  TestUtil.clickable(clickBrochure, "Clicked on brochure option on share plan screen");
        Assert.assertEquals(clickbrochure, true);
        WebCommands.staticSleep(3000);
        boolean brochuredownload = TestUtil.clickable(download, " clicked on download button");


        Assert.assertEquals(brochuredownload, true);
        WebCommands.staticSleep(3000);
        driver.switchTo().window(parent);

        // Verify OnePager click and download event
        WebCommands.staticSleep(3000);
        // TestUtil.click(sharePlanPDP, "Clicked on share plan option on PDP page");
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

        TestUtil.JsClick(backBtn, "licked on back button");
       // TestUtil.click(backBtn, "Clicked on back button");
        WebCommands.staticSleep(3000);
        boolean db = TestUtil.clickable(downloadBrochure, "Clicked on download Brochure link");

        Assert.assertEquals(db, true);
        boolean bidownloadicon = TestUtil.clickable(downloadIcon, "clicked on download icon");


        Assert.assertEquals(bidownloadicon, true);
        driver.switchTo().window(parent);
        WebCommands.staticSleep(3000);

        driver.switchTo().frame(0);
        WebCommands.staticSleep(2000);
       // TestUtil.click(shareVideo, "clicked on share video option");
        js.executeScript("arguments[0].click();", shareVideo);
    }

    public void SharePlanFromPDPPageMAxLife(String insurer) throws IOException {

//        TestUtil.click(OkGotit, "Clicked on OK GOT IT button");
//        WebCommands.staticSleep(10000);
//        TestUtil.click(gotIt, "Gotit clicked on result page");
        WebCommands.staticSleep(3000);
       // TestUtil.click(ClickMaxLifePlan, "clicked on max plan option");
        TestUtil.getFullPageScreenShot();
      //  TestUtil.click(driver.findElement(By.xpath("//button[@data-auto='"+insurer+"']")), "clicked on max plan option");

        TestUtil.click(driver.findElement(By.xpath("//button[@id='listItem-"+insurer+"-viewDetails']")), "clicked on max plan option");

        //p[text()='Guaranteed Income For Tomorrow (GIFT)']//parent::div//parent::div//parent::div//parent::div//parent::div//span[text()='View Details']
        WebCommands.staticSleep(2000);
        String parent=driver.getWindowHandle();
        js.executeScript("arguments[0].scrollIntoView();",sharePlanPDP);
        TestUtil.JsClick(sharePlanPDP, "share button clicked");


      //  TestUtil.click(sharePlanPDP, "Clicked on share plan option on PDP page");
        WebCommands.staticSleep(2000);

        js.executeScript("arguments[0].scrollIntoView();",sharePlanText);
        WebCommands.staticSleep(2000);
        String sharetext = sharePlanText.getText();
        System.out.println(sharetext + "text for share plan");
        Assert.assertEquals(sharetext, "Share Plan");

        TestUtil.JsClick(clickBrochure, "Clicked on brochure option on share plan screen");
//        System.out.println(clickBrochure + "clickbrochure++++++++++++++");
//        Assert.assertEquals(clickBrochure, true);
        WebCommands.staticSleep(3000);
        boolean brochuredownload = TestUtil.clickable(download, " clicked on download button");

        System.out.println(brochuredownload  +" "+"brochuredownload++++++++++++++");
        Assert.assertEquals(brochuredownload, true);
        WebCommands.staticSleep(3000);
        driver.switchTo().window(parent);

        // Verify OnePager click and download event
        WebCommands.staticSleep(3000);
        WebCommands.staticSleep(3000);

        try {
            boolean onepager = TestUtil.clickable(OnePager, "One Page text displayed");
            TestUtil.getFullPageScreenShot();
            System.out.println(onepager +" "+"onepager++++++++++++++");
            Assert.assertEquals(onepager, true);
            boolean onepagerdownload = TestUtil.clickable(download, " clicked on download button");

            System.out.println(onepagerdownload +" "+ "onepagerdownload++++++++++++++");
            Assert.assertEquals(onepagerdownload, true);
            WebCommands.staticSleep(3000);
            driver.switchTo().window(parent);
        }catch (Exception e){
            System.out.println("one pager not displayed");
        }


        // Verify copy link event
        //    TestUtil.click(sharePlanPDP, "Clicked on share plan option on PDP page");
        WebCommands.staticSleep(3000);
        boolean cplink = TestUtil.clickable(copyLink, "Clicked on copy link option");
        System.out.println(cplink +" "+ "cplink++++++++++++++");
        Assert.assertEquals(cplink, true);
        // Verify BI click and download event

        try {
            if (driver.findElement(By.xpath("//span[text()='Benefit Illustration']")).isDisplayed()) {
                boolean bi = TestUtil.clickable(BI, "Clicked on Benefit Illustration");
                System.out.println(bi +" "+ "bi++++++++++++++");
                Assert.assertEquals(bi, true);

                boolean bidownload = TestUtil.clickable(download, " clicked on download button");

                System.out.println(bidownload +" "+ "bidownload++++++++++++++");
                Assert.assertEquals(bidownload, true);

            }
        } catch (Exception e) {
            System.out.println("Benefit Illustration in not available for this plan");
        }

       // TestUtil.click(backBtn, "Clicked on back button");
        TestUtil.JsClick(backBtn, "licked on back button");
        WebCommands.staticSleep(3000);
        boolean db = TestUtil.clickable(downloadBrochure, "Clicked on download Brochure link");
        System.out.println(db +" "+ "db++++++++++++++");
        Assert.assertEquals(db, true);
        boolean bidownloadicon = TestUtil.clickable(downloadIcon, "clicked on download icon");
        WebCommands.staticSleep(3000);
        TestUtil.getScreenShot();
        System.out.println(bidownloadicon +" "+ "bidownloadicon++++++++++++++");
        Assert.assertEquals(bidownloadicon, true);
        driver.switchTo().window(parent);
        WebCommands.staticSleep(3000);

        driver.switchTo().frame(0);
        WebCommands.staticSleep(3000);

        js.executeScript("arguments[0].click();", shareVideo);
        //TestUtil.click(shareVideo, "clicked on share video option");
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
}