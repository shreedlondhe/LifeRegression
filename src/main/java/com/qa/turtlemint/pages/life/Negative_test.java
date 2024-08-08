package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.aspectj.apache.bcel.generic.ObjectType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Negative_test extends TestBase {
   public  Negative_test() {
       PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[text()='Edit']")
    WebElement Edit ;
    @FindBy(xpath = "//span[text()='See all Plans']")
    WebElement SeeallPlans ;
    @FindBy(xpath = "//span[text()='Back to Details']")
    WebElement BacktoDetails ;
    @FindBy(xpath = "//span[text()=' Back to Home']")
    WebElement BacktoHome ;
    @FindBy(xpath = "//button[text()='Ok']")
    WebElement OkAfterClickingOnBacktoHome ;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;
    @FindBy(xpath = "//div[text()=' No results found. ']")
    WebElement PinCodeValidation;


public void Checkout_PDP_Checkout()
{
    WebCommands.staticSleep(1000);
    TestUtil.click(BacktoDetails, "BacktoDetails  clicked");
    WebCommands.staticSleep(2000);
    BuyNow();
    WebCommands.staticSleep(2000);

}
    public void EditFlowForTerm() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Edit, "Edit clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
    }
    public void EditFlowForNonTerm() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(Edit, "Edit clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        TestUtil.JsClick(next, "next button click");
        TestUtil.JsClick(next, "next button click");
        TestUtil.JsClick(next, "next button click");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
    }
    public void BacktoHome() {
        WebCommands.staticSleep(2000);
        TestUtil.waitUntilVisibilityOfElement(BacktoHome);
        TestUtil.click(BacktoHome, "back to home  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(OkAfterClickingOnBacktoHome, "ok  clicked");
    }
    public void PDP_Result(){
        WebCommands.staticSleep(2000);
        TestUtil.click(SeeallPlans, "SeeallPlans clicked");
    }
    public void Checkout_PDP_Checkout_Term(){
        TestUtil.click(BacktoDetails, "BacktoDetails  clicked");
    }
    public void Checkout_PDP_result_Edit_Term() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(BacktoDetails, "BacktoDetails  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(SeeallPlans, "SeeallPlans clicked");
        WebCommands.staticSleep(2000);
        EditFlowForTerm();
    }
    public void Checkout_PDP_result_Edit_Non_term() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(BacktoDetails, "BacktoDetails  clicked");
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(SeeallPlans, "SeeallPlans clicked");
        WebCommands.staticSleep(2000);
        EditFlowForNonTerm();
    }

    //*************************** TermResulutCardModification **************************

    @FindBy(xpath = "//div[text()='Sum Assured']//parent::div//input")
    WebElement SumAssured;
    @FindBy(xpath = "//div[text()='Pay For (Years)']//parent::div//input")
    WebElement PTSelection;
    @FindBy(xpath = "//div[text()='Cover Upto Age']//parent::div//input")
    WebElement PPTSelection;
    @FindBy(xpath = "//div[text()='Insurers']//parent::div//div[text()='All']")
    WebElement AllInsurer;
    @FindBy(xpath = "//span[text()='TATAAIALI']")
    WebElement TATAInsurer;
    //div[text()='₹ 1 Cr ']
    public void ResulutCardModificationForTerm()
    {
        WebCommands.staticSleep(5000);
        TestUtil.clear(SumAssured,"clared sum assured");
        TestUtil.sendKeys(SumAssured,"15000000","Sum assured filled as 15000000");
        TestUtil.clear(PTSelection,"clared PTSelection");
        TestUtil.sendKeys(PTSelection,"20","PT selected as 20");
        TestUtil.clear(PPTSelection,"clared PPTSelection");
        TestUtil.sendKeys(PPTSelection,"15","PT selected as 15");
        TestUtil.click(AllInsurer,"clicked AllInsurer");
        TestUtil.JsClick(TATAInsurer,"clicked TATAInsurer");
        WebCommands.staticSleep(5000);

    }
    //*************************** PayoutType Income to Lumpsum to Income **************************
    @FindBy(xpath = "//div[text()='Income']")
    WebElement Income;
    @FindBy(xpath = "//span[text()='Lumpsum']")
    WebElement Lumpsum;
    public void ChangePayOutMode() throws IOException {
        WebCommands.staticSleep(5000);
        TestUtil.click(Income,"Income clicked");
        TestUtil.click(Lumpsum,"Lumsum clicked");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();

    }
    //*************************** ResulutCardModificationForChild**************************
    @FindBy(xpath = "//div[text()='₹ 5 Lakh ']")
    WebElement Investment5lakh;
    @FindBy(xpath = "//div[text()='Pay For (Years)']//parent::div//input")
    WebElement PTSelectionForChild;
     public void ResulutCardModificationForChild() throws IOException {
         WebCommands.staticSleep(3000);
         TestUtil.waitUntilVisibilityOfElement(Investment);
         TestUtil.click(Investment,"clicked on investment");
         TestUtil.waitUntilVisibilityOfElement(Investment5lakh);
         TestUtil.click(Investment5lakh,"clicked on investment 5 lakh");
         PTSelectionForChild.clear();
         TestUtil.sendKeys(PTSelectionForChild,"15","PT selected as 15");
         ChangePayOutMode();
     }
    //*************************** ResulutCardModificationForNonTerm **************************

    @FindBy(xpath = "//div [text()='Investment']//parent::div//input")
    WebElement Investment;
    @FindBy(xpath = "//div[text()='Insurers']/following::div[text()='All']")
    WebElement All;
    @FindBy(xpath = "//span[text()='ICICIPRULI']")
    WebElement ICICIPRULI;
    @FindBy(xpath = "//span[text()='Half-Yearly']")
    WebElement HalfYearly;
    @FindBy(xpath = "//div[text()='Yearly']")
    WebElement YearlyDropdown;
    public void ResulutCardModificationForNonTerm() throws IOException {
        WebCommands.staticSleep(5000);
        TestUtil.waitUntilVisibilityOfElement(Investment);
        Investment.clear();
        TestUtil.sendKeys(Investment,"80000","Investment amount filled as 80000");
        TestUtil.click(YearlyDropdown, "Tata Fortune Guarantee Plan Selected");
        TestUtil.click(HalfYearly, "Tata Fortune Guarantee Plan Selected");
        PTSelection.clear();
        TestUtil.sendKeys(PTSelection,"20","PT selected as 20");
        WebCommands.staticSleep(5000);
        TestUtil.click( All, "clicked on all");
        TestUtil.click( ICICIPRULI, "selected ICICI insurer");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
    }

//*************************** DownloadsBrochureFunctionalityPDP **************************
    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//a[@ng-click='downloadFn(item)']")
    WebElement BrochureDownload;
    public void DownloadsBrochureFunctionalityPDP() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        WebCommands.staticSleep(1000);
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        WebCommands.staticSleep(2000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//        //driver.switchTo().window(c);
//        TestUtil.getFullPageScreenShot();
//       // driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }
    //*************************** Download BI Checkout **************************
    @FindBy(xpath = "//span[@data-auto=\"benefit-illustration\"]")
    WebElement Benefit_Illustratio;
    public void DownloadBIonCheckout() throws IOException {
        TestUtil.JsClick(Benefit_Illustratio,"Clikced on Download BI on PDPD page");
        TestUtil.getFullPageScreenShot();
    }
    //*************************** DownloadBIonPDP **************************
    @FindBy(xpath = "//button[@ng-click='downloadBI()']")   //new add
    WebElement Benefit_Illustration;
    public void DownloadBIonPDP() throws IOException {
        TestUtil.click(Benefit_Illustration,"Clikced on Download BI on PDPD page");
        TestUtil.getFullPageScreenShot();
    }

    //*************************** BuyNowButton **************************
    @FindBy(id = "proceed-btn")
    WebElement BuyNowButton;
    public void BuyNow()
    {
        TestUtil.JsClick(BuyNowButton,"Clicked on BuyNow");
    }
    //*************************** checkout **************************
    @FindBy(xpath = "//input[@placeholder=\"Mr. / Ms. / Mrs.\"]")
    WebElement title;

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobilrNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//span[text()='Single']")
    WebElement single;

    @FindBy(xpath = "//button[@data-auto=\"Continue\"]")
    WebElement continu;
    public void checkout() {

        WebCommands.staticSleep(3000);
        //  TestUtil.sendKeys(title, "mr", "");
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "T9127198@gmail.com", "Email Id entered");
        TestUtil.click(maritalstatusDropdown, "next button click");
        TestUtil.click(married, "married click");
        TestUtil.click(continu, "Continue button click");
    }
    //*************************** checkmarks **************************
    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        TestUtil.click(continu,"continye clicked");
        WebCommands.staticSleep(10000);

        TestUtil.getScreenShot();
    }

    //*************************** CheckOutForNotTerm ***************************
    @FindBy(id = "insuredMemberMobile")
    WebElement mobileNo;
    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress1\"]")
    WebElement Addressline1;
    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress2\"]")
    WebElement Addresslin2;
    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement Clikckpin;
    @FindBy(xpath = "(//input[@placeholder=\"Enter 6 digit Pincode\"])[1]")
    WebElement Pincode;
    @FindBy(xpath = "//span[text()='Mumbai  north west, Maharashtra']")
    WebElement Selectedstate;
    @FindBy(xpath = "//span[@class='checkmark']//parent::span//parent::label")
    WebElement Checkmark;
    @FindBy(xpath = "//button[text()='Submit and Proceed']")
    WebElement SubmitandProceed;

    public void CheckOutForNotTerm() throws IOException {
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting", "Wrong Email Id entered");
        TestUtil.clear(emailId,"Clearing Wrong Email Id");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        WebCommands.staticSleep(3000);
        TestUtil.JsClick(married, "married click");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.click(Clikckpin,"Clikced pincode");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Pincode,"abcghj","Entering Wrong pincode");
        Assert.assertEquals(PinCodeValidation.getText(),"No results found.");
        WebCommands.staticSleep(3000);
        TestUtil.clear(Pincode,"Clearing wrong Pincode");
        TestUtil.sendKeys(Pincode,"400065","Enterted PIN and pressed Enter","Entering pincode");
        WebCommands.staticSleep(1000);
        TestUtil.JsClick(Checkmark,"CLIKCED MARK");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(SubmitandProceed,"clicked on continue");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
    }

    //*************************** PayPremium for Assisted plans ***************************

    @FindBy(xpath = "//span[text()='Pay Premium']")
    WebElement PayPremium;
    public void PayPremium() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(PayPremium, "Clicked pay premium");
        WebCommands.staticSleep(7000);
        TestUtil.getFullPageScreenShot();
    }

}
