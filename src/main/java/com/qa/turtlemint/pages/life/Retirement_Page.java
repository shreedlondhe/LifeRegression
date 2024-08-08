package com.qa.turtlemint.pages.life;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.apache.xerces.impl.xs.identity.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Retirement_Page extends TestBase {
    @FindBy(id = "Radio-M")
    WebElement Gender;

    @FindBy(xpath = "//span[text()='Select annual income']")
    WebElement AproxAnnualIncoDD;

    @FindBy(xpath = "//span[text()='Select retirement age']")
    WebElement RetireAge;

    @FindBy(xpath = "//span[text()='Next']//parent::button")
    WebElement NextButton;

    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement EnterAmount;

    @FindBy(xpath = "//span[text()='15 years']")
    WebElement GetBenifitPeyout;

    @FindBy(xpath = "//input[@name='customerName']")
    WebElement CustomerName;

    @FindBy(xpath = "//button[text()='OK, GOT IT!']")
    WebElement OkGotItButton;

    @FindBy(xpath = "//button[text()='Got it!']")
    WebElement GotIt;

    @FindBy(xpath = "//div[@class='title']")
    WebElement GotitPopTitle;

    @FindBy(xpath = "//div[@class='filter-title']")
    WebElement CustomizePolicyVerify;

    @FindBy(xpath = "//span[text()='ULIP']")
    WebElement ULIP_Verify;

    @FindBy(xpath = "//span[text()='Participating']")
    WebElement ParticipatinglPlansVerify;

    @FindBy(xpath = "//span[text()=' plans found for order ID -']")
    WebElement OrderId;

    @FindBy(xpath = "(//span[@class='anim-loader'])[18]")
    WebElement PolicyTermForTATA;

    @FindBy(xpath = "//span[contains(@data-auto,'death-benefits-TATAAIALI-Guaranteed Return Insurance Plan')]")
    WebElement DeathBenefitsForTATA;

    @FindBy(xpath = "//span[@data-auto='guaranteed-benefits-TATAAIALI-Guaranteed Return Insurance Plan (GRIP)']")
    WebElement GuaranteedBenefitsForTATA;

    @FindBy(xpath = "//span[contains(@data-auto,'policy-premium-TATAAIALI-Guaranteed Return Insurance Plan')]")
    WebElement MaturityBenefitsForTATA;

    @FindBy(xpath = "//span[contains(@data-auto,'claim-settled-display-TATAAIALI-Guaranteed Return Insurance Plan')]")
    WebElement ClaimSettleForTATA;

//    @FindBy(xpath = "(//img[@ng-src='https://resources.turtlemint.com/images/tata-aig.svg'])[3]")
//    WebElement TATAlogo;
    @FindBy(xpath = "//span[text()=' Guaranteed Return Insurance Plan (GRIP) - Endowment ']")
    WebElement TATAlogo;

    @FindBy(xpath = "(//span[@class='anim-loader'])[21]")
    WebElement PolicyTermForICICI;

    @FindBy(xpath = "//span[@data-auto='death-benefits-ICICIPRULI-Assured Savings Insurance Plan (ASIP)']")
    WebElement DeathBenefitsForICICI;

    @FindBy(xpath = "//span[@data-auto='guaranteed-benefits-ICICIPRULI-Assured Savings Insurance Plan (ASIP)']")
    WebElement GuaranteedBenefitsForICICI;

    @FindBy(xpath = "//span[@data-auto='policy-premium-ICICIPRULI-Assured Savings Insurance Plan (ASIP)']")
    WebElement MaturityBenefitsForICICI;

    @FindBy(xpath = "//span[@data-auto='claim-settled-display-ICICIPRULI-Assured Savings Insurance Plan (ASIP)']")
    WebElement ClaimSettleForICICI;

    @FindBy(xpath = "(//img[@ng-src='https://resources.turtlemint.com/images/icici-pru.svg'])[2]")
    WebElement ICICIlogo;

    @FindBy(xpath = "//span[text()='Edit']")
    WebElement ModifyButton;

    @FindBy(xpath = "//button[@id='premiumPaymentTerm']")
    WebElement PayForDD;

//    @FindBy(xpath = "//button[@data-auto='viewdetail-TATAAIALI-Fortune Guarantee Plus']//preceding-sibling::button")
//    WebElement shareQuotesButtonForTATA;

    @FindBy(xpath = "//button[@id=\"listItem-P87-sharePlan\"]")
    WebElement shareQuotesButtonForTATA;


    @FindBy(xpath = "(//span[@class='greenTxt layout-row layout-align-center-center share plan-card-share'])[8]")
    WebElement shareQuotesButtonForICICI;

    @FindBy(xpath = "//p[text()='Brochure']")
    WebElement BroucherButton;

    @FindBy(xpath = "//p[text()='Benefit Illustration']")
    WebElement BenefitIllustrationButton;

    @FindBy(xpath = "//span[text()='Back to Home']")
    WebElement BackToHomeButton;

    @FindBy(xpath = "//span[text()='OK']")
    WebElement BackToHomeOkButton;

    @FindBy(xpath = "//button[@data-auto='viewdetail-ICICIPRULI-Assured Savings Insurance Plan (ASIP)']")
    WebElement ViewDetailButtonForICICI;

    @FindBy(xpath = "//button[@id=\"listItem-P81-viewDetails\"]")
    WebElement ViewDetailButtonForTATA;

    @FindBy(xpath = "//button[@id=\"listItem-P98-viewDetails\"]")
    WebElement ViewDetailButtonForGPPF;

    @FindBy(xpath = "//button[@id=\"listItem-P81-viewDetails\"]")
    WebElement ViewDetailButtonForTATAGRIP;

    @FindBy(xpath = "//button[@id='details-page-share-plan-btn']")
    WebElement ShearPlanButton;

    @FindBy(xpath = "(//span[@class='insurer-overview-panel-text'])[4]")
    WebElement EligiblityTable;

    @FindBy(xpath = "(//span[@class='insurer-overview-panel-text'])[2]")
    WebElement ExclusionStatemnet;

    @FindBy(xpath = "(//span[@class='insurer-overview-panel-text'])[5]")
    WebElement InsurerOverview;

    @FindBy(xpath = "//div[text()='Death of Insured']")
    WebElement DeathOfInsured;

    @FindBy(xpath = "//div[text()='Special Features of this Policy']")
    WebElement SpecialFeaturesOfPolicy;

    @FindBy(xpath = "(//span[@class='insurer-overview-panel-text'])[1]")
    WebElement Benifits;

    @FindBy(xpath = "//span[@class='claim-settlement-text ng-binding']")
    WebElement ClaimSettled;

    @FindBy(xpath = "//button[@ng-click='downloadBI()']")
    WebElement BenifitIllustrationButtonPDP;

    @FindBy(xpath = "//a[@ng-click='backToPrevious()']")
    WebElement SeePlanBackArrow;

    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//div[@class='download-panel ng-scope']//*//a")
    WebElement BrochureDownload;

    @FindBy(xpath = "//span[text()='Benefit Illustration']")
    WebElement Benefit_Illustration;

    @FindBy(xpath = "//div[@aria-label='Choose Thursday, March 20th, 1980']")
    WebElement dateselect;
    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, March 20th, 1985']")
    WebElement dateselectt;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][2]")
    WebElement monthselect;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement calender;

    @FindBy(xpath = "//button[@id=\"details-page-buy-now-btn\"]")
    WebElement BuyNow;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='10 digit Mobile number']")
    WebElement mobile;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//div[@data-auto='insuredmembermaritalstatus-uiSelect']//span[@aria-label='Select box activate']")
    WebElement maritalstatus;

    @FindBy(xpath = "//span[text()='Divorced']")
    WebElement divorsed;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement Continue;

    @FindBy(xpath = "(//span[@class ='checkmark'])[1]")
    WebElement checkmark1;

    @FindBy(xpath = "(//span[@class ='checkmark'])[2]")
    WebElement checkmark2;

    @FindBy(xpath = "(//button[text() ='Submit and Proceed'])[1]")
    WebElement submitandproceed;
//-----------------------------------------------------------

    @FindBy(xpath = "//span[text()='Married With Kids']")
    WebElement SelectLifeStage;
    @FindBy(xpath = "//li[text()='Single']")
    WebElement Single;
    @FindBy(xpath = "//li[text()='Married']")
    WebElement Married;
    @FindBy(xpath = "//li[text()='Married With Kids']")
    WebElement MarriedWithKids;
    @FindBy(xpath = "//li[text()='Near Retirement']")
    WebElement NearRetirement;
    @FindBy(xpath = "//div[@name='investmentGoals']")
    WebElement Selectinvestmentgoals;
    @FindBy(xpath = "//li[text()='Retirement']")
    WebElement Retirement;
    @FindBy(xpath = "//li[text()='Savings']")
    WebElement Savings;
    @FindBy(xpath = "//li[text()='Medium']")
    WebElement Medium;
    @FindBy(xpath = "//span[text()='Low']")
    WebElement Low;
    @FindBy(xpath = "//span[text()='High']")
    WebElement High;
//    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
//    WebElement EnterAmountSutabolity;

    @FindBy(xpath = "//input[@placeholder='House no.,Building name, street name']")
    WebElement Addressline1;
    @FindBy(xpath = "//input[@placeholder='Landmark, Locality']")
    WebElement Addresslin2;
    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement Clikckpin;
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredPinCode']")
    WebElement Pincode;
    @FindBy(xpath = "//div[@aria-selected]//div[contains(.,'umbai')]")
    WebElement Selectedstate;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement CheckBoxOnCheckoutPage;

    @FindBy(xpath = "//span[.='Get Payment Link']")
    WebElement SubmitandProceed;

    @FindBy(xpath = "//p [text()='Investment']//parent::div//input")
    WebElement Investment;
    @FindBy(xpath = "//div[text()='₹ 5 Lakh ']")
    WebElement Investment5lakh;
    @FindBy(xpath = "//p[text()='Pay For (Years)']//parent::div//input")
    WebElement PTSelection;
    @FindBy(xpath = "//div[text()='Policy Term in Years']//parent::div//input")
    WebElement PPTSelection;
    @FindBy(xpath = "//div[text()='Yearly']")
    WebElement YearlyDropdown;
    @FindBy(xpath = "//span[text()='Half-Yearly']")
    WebElement HalfYearly;
    @FindBy(xpath = "//span[text()='Quarterly']")
    WebElement Quarterly;
    @FindBy(xpath = "//span[text()='Monthly']")
    WebElement Monthly;
    @FindBy(xpath = "//div[text()='All']")
    WebElement All;
    @FindBy(xpath = "//span[text()='ICICIPRULI']")
    WebElement ICICIPRULI;
    @FindBy(xpath = "//span[text()='BAJAJLI']")
    WebElement BAJAJLI;
    @FindBy(xpath = "//span[text()='TATAAIALI']")
    WebElement TATAAIALI;

    Actions act = new Actions(driver);

    public void SubmitAndProceed()
    {
        WebCommands.staticSleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", CheckBoxOnCheckoutPage);
        WebCommands.staticSleep(2000);
        // TestUtil.click(CheckBoxOnCheckoutPage, "Clicked on checkbox on checkout page");
        TestUtil.click(SubmitandProceed, "Clicked on Submitand Proceed");

    }

    public  void suitabilityPage1()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(MarriedWithKids,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Retirement,"clicked on MarriedWithKids");

        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public  void suitabilityPage2()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(NearRetirement,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Retirement,"clicked on MarriedWithKids");

        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public Retirement_Page() {
        PageFactory.initElements(driver, this);
    }

    public void datepicker(String year, String month) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(month);
        WebCommands.staticSleep(4000);
        TestUtil.click(dateselectt, "5 aug date select");
        WebCommands.staticSleep(5000);
    }
    public void datepickerForGPPF(String year, String month) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(month);
        WebCommands.staticSleep(4000);
        TestUtil.click(dateselect, "5 aug date select");
        WebCommands.staticSleep(5000);
    }

    public void checkoutDownloadsFunctionality() {
        TestUtil.click(Benefit_Illustration, "Clicked on download Benefit Illustration");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it = TabSwitch.iterator();
        String p = it.next();
        String c = it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void downloadsFunctionalityPDP() {
        TestUtil.click(clickDownloads, "Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload, "Clicked on Brochure Download");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it = TabSwitch.iterator();
        String p = it.next();
        String c = it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void RetirementProfileForTATA() throws InterruptedException {

        TestUtil.click(Gender, "Gender Selected");
        WebCommands.staticSleep(1000);
        datepicker("1985", "Mar");
        WebCommands.staticSleep(1000);
        TestUtil.click(AproxAnnualIncoDD, "Aprox Annual Income Clicked");
        driver.findElement(By.xpath("//li[@value='200000']")).click();
        WebCommands.staticSleep(1000);
        TestUtil.click(RetireAge, "Retire Age Clicked");
        driver.findElement(By.xpath("//li[@value='65']")).click();
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(2000);
        suitabilityPage1();
        WebCommands.staticSleep(2000);
        WebCommands.staticSleep(1000);
        TestUtil.click(GetBenifitPeyout, "Get Benifit Peyout Clicked");
        driver.findElement(By.xpath("//li[@value='10']")).click();
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(CustomerName, "TATAaia", "Customer Name Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(5000);
        try {
            TestUtil.getFullPageScreenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RetirementProfileForICICI() throws InterruptedException {
        TestUtil.click(Gender, "Gender Selected");
        WebCommands.staticSleep(1000);
        datepickerForGPPF("1980", "Mar");
        WebCommands.staticSleep(2000);
        TestUtil.click(AproxAnnualIncoDD, "Aprox Annual Income Clicked");
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("//li[@value='200000']")).click();
        WebCommands.staticSleep(1000);
        TestUtil.click(RetireAge, "Retire Age Clicked");
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("//li[@value='65']")).click();
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(2000);
        suitabilityPage2();
        WebCommands.staticSleep(2000);
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "90000", "Amount Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(GetBenifitPeyout, "Get Benifit Peyout Clicked");
        driver.findElement(By.xpath("//li[@value='10']")).click();
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(CustomerName, "iciciAsip", "Customer Name Entered");
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Next button clicked");
        WebCommands.staticSleep(8000);


    }

    public void RetirementReshultPageForTATA() throws InterruptedException, IOException {

        WebCommands.staticSleep(2000);
        act.doubleClick(Investment).build().perform();
        // Investment.clear();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
      //  PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
        WebCommands.staticSleep(1000);
        ULIP_Verify.isDisplayed();
        WebCommands.staticSleep(1000);
        ParticipatinglPlansVerify.isDisplayed();
        WebCommands.staticSleep(1000);
        OrderId.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ModifyButton, "Modify Button Clicked");
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        TestUtil.click(shareQuotesButtonForTATA, "Shear Button Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        WebCommands.staticSleep(6000);
        TestUtil.waitElementToBeClickable(BackToHomeOkButton);
       TestUtil.JsClick(BackToHomeOkButton, "Back to Home ok Clicked");
       WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        driver.navigate().back();
        WebCommands.staticSleep(2000);
        TestUtil.click(ViewDetailButtonForTATA, "View Detail Clicked");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void RetirementReshultPageForGPPF() throws InterruptedException, IOException {
    //   Investment.clear();
        WebCommands.staticSleep(2000);
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
      //  PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
        WebCommands.staticSleep(1000);
        ULIP_Verify.isDisplayed();
        WebCommands.staticSleep(1000);
        ParticipatinglPlansVerify.isDisplayed();
        WebCommands.staticSleep(1000);
        OrderId.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ModifyButton, "Modify Button Clicked");
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        TestUtil.click(shareQuotesButtonForTATA, "Shear Button Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        WebCommands.staticSleep(6000);
        TestUtil.waitElementToBeClickable(BackToHomeOkButton);
        TestUtil.JsClick(BackToHomeOkButton, "Back to Home ok Clicked");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        driver.navigate().back();
        TestUtil.JsClick(ViewDetailButtonForGPPF, "Shear Button Clicked");
        Term_Life_plan.GetPaymentLinkCTA();
       // TestUtil.click(ViewDetailButtonForGPPF, "View Detail Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
    }
    public void RetirementReshultPageForTATAGRIP() throws InterruptedException, IOException {
       // Investment.clear();
        WebCommands.staticSleep(2000);
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
       // PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
        WebCommands.staticSleep(1000);
        ULIP_Verify.isDisplayed();
        WebCommands.staticSleep(1000);
        ParticipatinglPlansVerify.isDisplayed();
        WebCommands.staticSleep(1000);
        OrderId.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ModifyButton, "Modify Button Clicked");
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        TestUtil.JsClick(shareQuotesButtonForTATA, "Shear Button Clicked");
        WebCommands.staticSleep(5000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        WebCommands.staticSleep(6000);
        TestUtil.waitElementToBeClickable(BackToHomeOkButton);
        TestUtil.JsClick(BackToHomeOkButton, "Back to Home ok Clicked");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        driver.navigate().back();
        WebCommands.staticSleep(5000);
        TestUtil.click(ViewDetailButtonForTATAGRIP, "View Detail Clicked");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);
    }

    public void RetirementReshultPageForICICI() throws InterruptedException, IOException {
        CustomizePolicyVerify.isDisplayed();
        WebCommands.staticSleep(1000);
        ULIP_Verify.isDisplayed();
        WebCommands.staticSleep(1000);
        ParticipatinglPlansVerify.isDisplayed();
        WebCommands.staticSleep(1000);
        OrderId.isDisplayed();
        TestUtil.click(PayForDD, "Pay For DropDown Selected");
        WebCommands.staticSleep(2000);
        driver.findElement(By.xpath("((//ul[@class='dropdown-menu noclose'])[3]/..//li[text()])[5]")).click();
        WebCommands.staticSleep(2000);
        PolicyTermForICICI.isDisplayed();
        DeathBenefitsForICICI.isDisplayed();
        GuaranteedBenefitsForICICI.isDisplayed();
        ClaimSettleForICICI.isDisplayed();
        MaturityBenefitsForICICI.isDisplayed();
        //ICICIlogo.isDisplayed();
        TestUtil.click(ModifyButton, "Modify Button Clicked");
        WebCommands.staticSleep(1000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        TestUtil.click(shareQuotesButtonForICICI, "Shear Button Clicked");
        WebCommands.staticSleep(4000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(BackToHomeOkButton, "Back to Home ok Clicked");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
        TestUtil.click(ViewDetailButtonForICICI, "View Detail Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        WebCommands.staticSleep(2000);


    }

    public void RetirementProductDetaiForTATA() throws InterruptedException {
        TestUtil.click(ShearPlanButton, "Shear Button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(BroucherButton, "Broucher button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(SeePlanBackArrow, "See All Arrow Clicked");
        WebCommands.staticSleep(4000);
        downloadsFunctionalityPDP();
        WebCommands.staticSleep(4000);
        EligiblityTable.isDisplayed();
        ExclusionStatemnet.isDisplayed();
        InsurerOverview.isDisplayed();
        DeathOfInsured.isDisplayed();
        SpecialFeaturesOfPolicy.isDisplayed();
        Benifits.isDisplayed();
        ClaimSettled.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        TestUtil.click(BackToHomeOkButton, "Back to Home ok Clicked");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
    }



    public void RetirementProductDetaiForICICI() throws InterruptedException {
        TestUtil.click(ShearPlanButton, "Shear Button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(BroucherButton, "Broucher button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(BenefitIllustrationButton, "Benefit Illustration Button Clicked");
        WebCommands.staticSleep(2000);
        TestUtil.click(SeePlanBackArrow, "See All Arrow Clicked");
        WebCommands.staticSleep(4000);
        downloadsFunctionalityPDP();
        WebCommands.staticSleep(4000);
        TestUtil.click(BenifitIllustrationButtonPDP, "Benifit Illustration Button on PDP button Clicked");
        WebCommands.staticSleep(2000);
        EligiblityTable.isDisplayed();
        ExclusionStatemnet.isDisplayed();
        InsurerOverview.isDisplayed();
        DeathOfInsured.isDisplayed();
        SpecialFeaturesOfPolicy.isDisplayed();
        Benifits.isDisplayed();
        ClaimSettled.isDisplayed();
        WebCommands.staticSleep(2000);
        TestUtil.click(BackToHomeButton, "Back to Home Clicked");
        TestUtil.click(BackToHomeOkButton, "Back to Home ok Clicked");
        WebCommands.staticSleep(2000);
        driver.navigate().back();
        WebCommands.staticSleep(8000);
    }

    public void RetirementCheckoutForTATA() throws InterruptedException {
//        TestUtil.click(ViewDetailButtonForTATA,"View Detail Clicked");
       WebCommands.staticSleep(2000);
        TestUtil.JsClick(BuyNow, "Buy Now Clicked");
        WebCommands.staticSleep(4000);
        TestUtil.JsClick(Benefit_Illustration,"Clikced benefit");
        //driver.findElement(By.xpath("//span[text()='Benefit Illustration ']")).click();
        WebCommands.staticSleep(4000);
        //checkoutDownloadsFunctionality();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(lastName, "xyz", "last name entered");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(mobile, "9999999999", "mobile no entered");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(email, "xyz.xyz@xyz.xyz", "email entered");
        WebCommands.staticSleep(2000);
//        TestUtil.click(maritalstatus, "clicked on marital status");
//        WebCommands.staticSleep(2000);
//        TestUtil.click(divorsed, "selected divorsed");
//        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.JsClick(Clikckpin,"Clikced pincode");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Pincode,"400065","Enter Pressed","Entering pincode");
      //  TestUtil.sendKeys(Pincode,"400065","Enter pressed","Entering pincode");

            TestUtil.JsClick(Selectedstate,"Selected state");



        SubmitAndProceed();
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
//        TestUtil.click(Continue, "clicked on continue");
//        WebCommands.staticSleep(2000);
//        TestUtil.click(checkmark1, "checkmark1 selected");
//        TestUtil.click(checkmark2, "checkmark2 selected");
//        WebCommands.staticSleep(2000);
//        TestUtil.click(submitandproceed, "clicked on submit and proceed");
//        WebCommands.staticSleep(4000);
//        TestUtil.getScreenShot();

    }

}