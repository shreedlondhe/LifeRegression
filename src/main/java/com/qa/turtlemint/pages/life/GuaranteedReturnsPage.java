package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GuaranteedReturnsPage extends TestBase {
    public GuaranteedReturnsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobileNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(xpath = "//div[text()='Married with kids']")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//input[@aria-owns='insuredMemberMaritalStatus_list']")
    WebElement married;

    @FindBy(xpath = "//span[text()='Single']")
    WebElement single;

    @FindBy(xpath = "//input[@placeholder='Mr. / Ms. / Mrs.']")
    WebElement title;

    @FindBy(xpath = "//input[@id='insuredMemberPlaceOfBirth']")
    WebElement PlaceofBirth;

    @FindBy(xpath = "//input[@id='insuredMemberFatherFName']")
    WebElement FathersFirstName;

    @FindBy(xpath = "//input[@id='insuredMemberFatherLName']")
    WebElement FathersLastName;

    @FindBy(xpath = "//input[@id='insuredMemberMotherFName']")
    WebElement MothersFirstName;

    @FindBy(xpath = "//input[@id='insuredMemberMotherLName']")
    WebElement MothersLastName;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisjammukashmirresident-no-radio']")
    WebElement JammuResidentNo;

    @FindBy(xpath = "//div[@id='insuredMemberOccupation-uiSelect']//span[@aria-label='Select box activate']")
    WebElement OccupationDropDown;

    @FindBy(xpath = "//div[@id='insuredMemberQualification-uiSelect']//span[@aria-label='Select box activate']")
    WebElement QualificationDropDown;

    @FindBy(xpath = "//span[contains(text(),'Salaried')]")
    WebElement OccupationSalaried;

    @FindBy(xpath = "//span[contains(text(),'Graduate')]")
    WebElement QualificationGraduate;

    @FindBy(xpath = "//input[@id='insuredMemberPanNumber']")
    WebElement PanNumber;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisaadhaarcardavailable-yes-radio']")
    WebElement AadharAvailableCheckBox;

    @FindBy(xpath = "//input[@id='insuredMemberAadhaarNumber']")
    WebElement AadharNumber;

    @FindBy(xpath = "//label[@data-auto='insuredmemberispoliticallyexposed-no-radio']")
    WebElement PoliticalExposedNo;

    @FindBy(xpath = "//label[@data-auto='insuredmemberhashistoryofconviction-no-radio']")
    WebElement NoCriminalRecord;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement AddressLine1;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement AddressLine2;

    @FindBy(xpath = "//div[@id='insuredMemberRegisteredPinCode-uiSelect']//span[@aria-label='Select box activate']")
    WebElement PinCodeClick;

    @FindBy(xpath = "//input[@placeholder='Enter 6 digit Pincode']")
    WebElement PinCodeEnter;

    @FindBy(xpath = "//span[text()='Mumbai, Maharashtra']")
    WebElement MumbaiSelect;

    @FindBy(xpath = "//label[@class='checkout-checkbox flex layout-row']")
    WebElement SameAsRegisteredCheckBox;
    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress1\"]")
    WebElement Addressline1;
    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress2\"]")
    WebElement Addresslin2;
    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement Clikckpin;
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredPinCode']")
    WebElement Pincode;

    @FindBy(xpath = "//span[text()='Mumbai  North West, MAHARASHTRA']")

    WebElement Munbai;
    @FindBy(xpath = "//div[@aria-selected]//div[contains(.,'umbai')]")
    WebElement Selectedstate;

    @FindBy(xpath = "//div[@aria-selected]//div[contains(.,'umbai')]")
    WebElement SelectedstateHDFC;

    @FindBy(xpath = "//button[@data-auto='Continue']")
    WebElement continu;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest1-no-radio']")
    WebElement Question1;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest2-no-radio']")
    WebElement Question2;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest3-no-radio']")
    WebElement Question3;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest4-no-radio']")
    WebElement Question4;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest5-no-radio']")
    WebElement Question5;

    @FindBy(xpath = "//label[@data-auto='insuredmembersmq_quest6-no-radio']")
    WebElement Question6;

    @FindBy(xpath = "//input[@id='insuredMemberUWIdentificationMark']")
    WebElement IdentificationMark;

    @FindBy(xpath = "//input[@id='insuredMemberUWGrossIncome']")
    WebElement GrossIncome;

    @FindBy(xpath = "//input[@id='insuredMemberUWPresentBusiness']")
    WebElement NameofPresentEmployer;

    @FindBy(xpath = "//input[@id='insuredMemberUWAddress']")
    WebElement BldgNameOffice;

    @FindBy(xpath = "//input[@id='insuredMemberUWWorkPlaceCity']")
    WebElement CityofWork;

    @FindBy(xpath = "//div[@id='insuredMemberInjuryDueTo-uiSelect']//span[@aria-label='Select box activate']")
    WebElement IndustryTypeDropDown;

    @FindBy(xpath = "//span[contains(text(),'None of these')]")
    WebElement NoneOfThese;

    @FindBy(xpath = "//div[@id='insuredMemberDesignation-uiSelect']//span[contains(@aria-label,'Select box activate')]")
    WebElement DesignationDropDown;

    @FindBy(xpath = "//span[contains(text(),'Senior Manager')]")
    WebElement DesignationSelect;

    @FindBy(xpath = "//div[@id='insuredMemberOccIndustry-uiSelect']//span[contains(@aria-label,'Select box activate')]")
    WebElement IndustrySelectDropDown;

    @FindBy(xpath = "//span[contains(text(),'Engineering')]")
    WebElement EngineeringSelect;

    @FindBy(xpath = "//div[@id='insuredMemberOccDetails-uiSelect']//span[contains(@aria-label,'Select box activate')]")
    WebElement OccupationDetailsDropDown;

    @FindBy(xpath = "//span[contains(text(),'Salaried')]")
    WebElement SalariedSelect;

    @FindBy(xpath = "//input[@placeholder='Mr. / Ms. / Mrs.']")
    WebElement TitleNominee;

    @FindBy(xpath = "//span[text()='Mr.']")
    WebElement NomineeMrSelect;

    @FindBy(xpath = "//input[@id='nomineeFName']")
    WebElement NomineeFname;

    @FindBy(xpath = "//input[@id='nomineeLName']")
    WebElement NomineeLName;

    @FindBy(xpath = "//input[@id='nomineeDOB-datepicker']")
    WebElement NomineeDOBDropDown;

    @FindBy(xpath = "//td[@data-handler='selectDay']")
    WebElement DateSelect;

    @FindBy(xpath = "//input[@id='nomineePlaceOfBirth']")
    WebElement nomineePlaceofBirth;

    @FindBy(xpath = "//div[@id='nomineeMaritalStatus-uiSelect']//span[@aria-label='Select box activate']")
    WebElement NomineeMaritalStatus;

    @FindBy(xpath = "//span[text()='Single']")
    WebElement NomineeSingle;

    @FindBy(xpath = "//div[contains(@placeholder,'Select relationship')]//span[contains(@aria-label,'Select box activate')]")
    WebElement NomineeisMy;

    @FindBy(xpath = "//span[text()='Brother']")
    WebElement Brother;

    @FindBy(xpath = "//input[@id='nomineeFatherFName']")
    WebElement nomineeFatherFname;

    @FindBy(xpath = "//input[@id='nomineeFatherLName']")
    WebElement nomineeFatherLname;

    @FindBy(xpath = "//input[@id='nomineeRegisteredAddress1']")
    WebElement nomineeRegisteredAddress1;

    @FindBy(xpath = "//input[@id='nomineeRegisteredAddress2']")
    WebElement nomineeRegisteredAddress2;

    @FindBy(xpath = "//span[@class='ui-select-placeholder text-muted ng-binding']")
    WebElement NomineePinCodeClick;

    @FindBy(xpath = "//input[@placeholder='Enter 6 digit Pincode']")
    WebElement NomineePinCodeEnter;

    @FindBy(xpath = "//span[text()='Mumbai, Maharashtra']")
    WebElement NomineeMumbai;

    @FindBy(xpath = "//span[.='Benefit Illustration']")
    WebElement Benefit_Illustration;

    @FindBy(xpath = "//span[text()=' Back to Home']")
    WebElement Back_to_Home;

    @FindBy(xpath = "//button[text()='Ok']")
    WebElement Back_to_Home_Confirmation;

    @FindBy(xpath = "//h2[text()='Today']")
    WebElement AssertingString;

    @FindBy(xpath = "//button[@id=\"listItem-P86-viewDetails\"]")
    WebElement TataFortuneGuarantee;

    @FindBy(xpath = "//button[@id='listItem-P87-viewDetails']")
    WebElement TataFortuneGuaranteePlus;
    @FindBy(xpath = "//button[@id='listItem-P89-viewDetails']")
    WebElement ICICI_GIFT;

    @FindBy(xpath = "//button[@id='listItem-P99-viewDetails']")
    WebElement ICICI_GIFTPRO;

    @FindBy(xpath = "//button[@id='listItem-P88-viewDetails']")
    WebElement BalicPOS;
    @FindBy(xpath = "//button[@id='listItem-P91-viewDetails']")
    WebElement BalicAWG;
    @FindBy(xpath = "//button[@id='listItem-P94-viewDetails']")
    WebElement BalicGIG;

    @FindBy(xpath = "//button[@id='listItem-P95-viewDetails']")
    WebElement HdfcSanchay;

    @FindBy(xpath = "//button[@data-auto='viewdetail-MAXLIFELI-Smart Wealth Plan']")
    WebElement MaxSmartWealth;

    @FindBy(xpath = "//button[@data-auto='viewdetail-LICLI-New Jeevan Anand']")
    WebElement LicNewJeevan;

    @FindBy(xpath = "//button[@data-auto='viewdetail-LICLI-Jeevan Lakshya']")
    WebElement LicJeevanLakshya;

    @FindBy(xpath = "//button[@id=\"details-page-buy-now-btn\"]")
    WebElement CommonBuyNowBtn;

    @FindBy(xpath = "//span[text()='Downloads']")
    WebElement clickDownloads;
    @FindBy(xpath = "//a[@id='download-brochure-btn']//span[@aria-label='download']//parent::div")
    WebElement BrochureDownload;
    @FindBy(xpath = "//span[text()=' Guaranteed Income Goal - Lump-Sum Benefit ']//parent::span//parent::div//parent::div//parent::div//span[text()='See all riders']")
    WebElement seemoreGIG;
    @FindBy(xpath = "//span[text()='See all riders']")
    WebElement seemoreAWG;
    @FindBy(xpath = "//button[text()='CONFIRM']")
    WebElement Confirmbutton;
    @FindBy(xpath = "//span[@class='checkmark']//parent::span//parent::label")
    WebElement CheckBoxOnCheckoutPage;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement Checkmark;

    @FindBy(xpath = "//span[.='Get Payment Link']")
    WebElement SubmitandProceed;
    @FindBy(xpath = "//span[text()=' Back to Details']")
    WebElement BacktoDetails;

    @FindBy(xpath = "//span[text()='Pay Premium']")
    WebElement PayPremium;
    @FindBy(xpath = "//input[@inputmode='numeric']")
    WebElement Investment;
    @FindBy(xpath = "//button[text()='₹ 5.00 L']")
    WebElement Investment5lakh;
    @FindBy(xpath = "//input[@placeholder='Pay For']")
    WebElement PTSelection;
    @FindBy(xpath ="//span[text()='Income']")
    WebElement Income;
    @FindBy(xpath = "//span[text()='Lumpsum']")
    WebElement Lumpsum;
    @FindBy(xpath = "//input[@placeholder='Policy Term']")
    WebElement PPTSelection;
    @FindBy(xpath = "//span[text()='Yearly']")
    WebElement YearlyDropdown;
    @FindBy(xpath = "//span[text()='Half-Yearly']")
    WebElement HalfYearly;
    @FindBy(xpath = "//span[text()='Quarterly']")
    WebElement Quarterly;
    @FindBy(xpath = "//span[text()='Monthly']")
    WebElement Monthly;
    @FindBy(xpath = "//p[text()='Insurers']//following::div")
    WebElement All;
    @FindBy(xpath = "//span[text()='ICICIPRULI']")
    WebElement ICICIPRULI;
    @FindBy(xpath = "//span[text()='BAJAJLI']")
    WebElement BAJAJLI;
    @FindBy(xpath = "//span[text()='TATAAIALI']")
    WebElement TATAAIALI;
    @FindBy(xpath = "//span[text()='Income Start year ']")
    WebElement IncomeStartyear;

    @FindBy(xpath = "//span[text()='15th Year']")
    WebElement FifteenthYear;

    @FindBy(xpath = "//span[text()='Year of MoneyBack Benefit chosen 'and @class='ui-select-placeholder text-muted ng-binding']")

    WebElement YearofMoneyBackBenefitchosen;

    @FindBy(xpath = "//span[text()='MoneyBack Benefit percentage chosen by - 0-100 % ']")
    WebElement MoneyBackBenefitpercentage;

    @FindBy(xpath = "//span[text()='75 %']")
    WebElement SelecedPercentage;

    @FindBy(xpath = "//span[text()='On 20 the Year']")
    WebElement TwentyYrs;

    @FindBy(xpath = "//p[text()='Income Term']//following-sibling::div")
    WebElement IncomeTermAll;

    @FindBy(xpath = "//span[text()='30 years']")
    WebElement IncomeTermThirty;

// ********* result card check
    @FindBy(xpath = "//div[text()='₹ 1.64 L']")
    WebElement yearlyincome;
    @FindBy(xpath = "//div[text()='₹ 9.00 L']")
    WebElement daethcover;
    @FindBy(xpath = "//div[text()='10 yrs/10 yrs']")
    WebElement PtIncomeTerm;
    @FindBy(xpath = "//span[.='4 more plan options  ']/following::span[.='Benefit Illustration']")
    WebElement OptionBI;








    public void raiderGIG(String valu) {
        driver.findElement(By.xpath("//label[text()='" + valu + "']//parent::div//parent::div//parent::div//input")).click();
        WebCommands.staticSleep(2000);
    }


    public void downloadsFunctionalityPDP() {
        TestUtil.JsClick(clickDownloads, "Clicked Download on PDP Page");
        TestUtil.JsClick(BrochureDownload, "Clicked on Brochure Download");
        //WebCommands.staticSleep(4000);

//        WebCommands.staticSleep(10000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }


    public void downloadsFunctionalityPDPTATAINVESTMENT() {
        TestUtil.JsClick(clickDownloads, "Clicked Download on PDP Page");

      //  TestUtil.click(BrochureDownload, "Clicked on Brochure Download");
        WebCommands.staticSleep(4000);
        js.executeScript("arguments[0].click();", BrochureDownload);

//        WebCommands.staticSleep(10000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }


    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions act = new Actions(driver);

    public void TataFortuneGuaranteePlan() throws IOException {
        WebCommands.staticSleep(5000);
      //  Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
       // PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
        TestUtil.click(Income, "Clicked on income");
        TestUtil.click(Lumpsum, "Clicked on Lumpsum");
       // PPTSelection.clear();
        WebCommands.staticSleep(2000);
        act.doubleClick(PPTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PPTSelection,"18","PT selected as 18");
        WebCommands.staticSleep(5000);
        TestUtil.click(YearlyDropdown, "Tata Fortune Guarantee Plan Selected");
        TestUtil.click(HalfYearly, "Tata Fortune Guarantee Plan Selected");
        WebCommands.staticSleep(3000);


//        TestUtil.click(YearlyDropdown, "clicked on payment frequency");
//        TestUtil.click(HalfYearly, "clicked on half-year payment frequency");
//        WebCommands.staticSleep(7000);
        TestUtil.click(TataFortuneGuarantee, "Tata Fortune Guarantee Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void TataFortuneGuaranteePlanPlus() throws IOException {
        WebCommands.staticSleep(7000);
        TestUtil.click(TataFortuneGuaranteePlus, "Tata Fortune Guarantee Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDPTATAINVESTMENT();
        WebCommands.staticSleep(5000);
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
    }


    public void ICICI_GIFT() throws IOException {

       // TestUtil.click(OptionBI,"Clicked on option BI of TATA FG Plus");
        TestUtil.waitUntilVisibilityOfElement(Investment);
       // Investment.clear();
        act.doubleClick(Investment).build().perform();
        TestUtil.sendKeys(Investment,"80000","Investment amount filled as 80000");
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"10","PT selected as 20");
//        PPTSelection.clear();
//        TestUtil.sendKeys(PPTSelection,"15","PT selected as 15");
        TestUtil.click( All, "clicked on all");
        TestUtil.click( ICICIPRULI, "selected ICICI insurer");
        Term_Life_plan.GetPaymentLinkCTA();
//        TestUtil.click(ICICI_GIFT, "Icici Pru Regular Plan Selected");
        WebCommands.staticSleep(5000);
        TestUtil.JsClick(ICICI_GIFT,"Icici Pru Regular Plan Selected");
        TestUtil.JsClick( CommonBuyNowBtn, "clicked on buynow");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
//        downloadsFunctionalityPDP();
//        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
//        WebCommands.staticSleep(3000);
    }
    public void ICICI_GIFTPRO() throws IOException {
        TestUtil.waitUntilVisibilityOfElement(Investment);


        WebCommands.staticSleep(1000);
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"20","PT selected as 20");
        WebCommands.staticSleep(1000);
        TestUtil.click( IncomeTermAll, "clicked on IncomeTermAll");
        TestUtil.click( IncomeTermThirty, "clicked on IncomeTermAll");
        WebCommands.staticSleep(5000);
        TestUtil.click( All, "clicked on all");
        WebCommands.staticSleep(1000);
        TestUtil.click( ICICIPRULI, "selected ICICI insurer");
        WebCommands.staticSleep(5000);
        TestUtil.JsClick(ICICI_GIFTPRO,"Icici Pru Regular Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
       // TestUtil.click(ICICI_GIFTPRO, "Icici Pru Regular Plan Selected");
        TestUtil.JsClick( CommonBuyNowBtn, "clicked on buynow");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();

//        downloadsFunctionalityPDP();
//        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
//        WebCommands.staticSleep(3000);
    }

    public void HdfcSanchayPlan() throws IOException {
        TestUtil.waitUntilVisibilityOfElement(Investment);
       // Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);

        TestUtil.sendKeys(PTSelection,"10","PT selected as 22");
//        PPTSelection.clear();
//        TestUtil.sendKeys(PPTSelection,"18","PT selected as 18");
        TestUtil.JsClick(YearlyDropdown," [Payment frequency Dropdown selected");
        TestUtil.JsClick(Quarterly,"Quartrly payment frequency selected");

        WebCommands.staticSleep(10000);
        try{
            TestUtil.click(HdfcSanchay, "Hdfc Sanchay Plan Selected");
        }catch(Exception e) {
            driver.navigate().refresh();
            TestUtil.click(HdfcSanchay, "Hdfc Sanchay Plan Selected");
        }
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
//        downloadsFunctionalityPDP();
//        windowSwitch();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void MaxSmartWealthPlan() throws IOException {

        TestUtil.click(MaxSmartWealth, "Max Smart Wealth Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
//        downloadsFunctionalityPDP();
//        windowSwitch();
//        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
//        WebCommands.staticSleep(3000);
    }

    public void BalicPOS() throws IOException {
        WebCommands.staticSleep(3000);
       // TestUtil.clear(Investment,"cleared investment");
        //Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(Investment,"50000","Investment amount filled as 70000");
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
        TestUtil.JsClick(Income, "Clicked on income");
        TestUtil.JsClick(Lumpsum, "Clicked on Lumpsum");
//        PPTSelection.clear();
        WebCommands.staticSleep(2000);
        act.doubleClick(PPTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PPTSelection,"18","PT selected as 18");
        WebCommands.staticSleep(5000);
        TestUtil.click(BalicPOS, "Bajaj Allians POS Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void BalicAWG() throws IOException {
        WebCommands.staticSleep(2000);
        TestUtil.click(Investment,"clicked on investment");

        WebCommands.staticSleep(1000);
        TestUtil.JsClick(Investment5lakh,"clicked on investment 5 lakh");
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"25","PT selected as 25");
//        PPTSelection.clear();
//        WebCommands.staticSleep(2000);
//        TestUtil.sendKeys(PPTSelection,"20","PT selected as 20");
//        TestUtil.click(seemoreAWG,"Clikced see more rider..");
//        WebCommands.staticSleep(8000);
//        raiderGIG("Accidental Death Benefit");
//        raiderGIG("Accidental Permanent Total/ Partial Disability Benefit");
        WebCommands.staticSleep(2000);
//        TestUtil.getScreenShot();
//        TestUtil.click(Confirmbutton,"Clikced confirm button");
//        WebCommands.staticSleep(8000);
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();
        TestUtil.JsClick(BalicAWG, "Bajaj Allians POS Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void BalicGIG() throws IOException {
//        TestUtil.click(seemoreGIG, "Clicked see more raider..");
//        WebCommands.staticSleep(2000);
//        raiderGIG("Accidental Death Benefit");
//        raiderGIG("Accidental Permanent Total/ Partial Disability Benefit");
//        raiderGIG("Critical Illness Benefit");
//        raiderGIG("Family Income Benefit");
//        raiderGIG("Waiver of Premium Benefit");
//        WebCommands.staticSleep(2000);
//        TestUtil.getScreenShot();
//        TestUtil.click(Confirmbutton,"Clikced confirm button");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(5000);
//        Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
//        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"22","PT selected as 22");
//        PPTSelection.clear();
//        TestUtil.sendKeys(PPTSelection,"18","PT selected as 18");
        WebCommands.staticSleep(5000);
        TestUtil.click(BalicGIG, "Bajaj Allians POS Plan Selected");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        WebCommands.staticSleep(3000);

        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void LicNewJeevanPlan() throws IOException {
        TestUtil.click(LicNewJeevan, "Lic New Jeevan Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }

    public void LicJeevanLakshyaPlan() throws IOException {
        TestUtil.click(LicJeevanLakshya, "Tata Fortune Guarantee Plan Selected");
        WebCommands.staticSleep(2000);
        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", CommonBuyNowBtn);
        WebCommands.staticSleep(3000);
    }
public void SubmitandProceed() throws IOException {

        TestUtil.click(SubmitandProceed,"clicked on continue");
        WebCommands.staticSleep(5000);
        TestUtil.click(PayPremium, "Clicked pay premium");
        TestUtil.getFullPageScreenShot();
    }
    public void BackFromCheckoutPage()
    {
        TestUtil.JsClick(BacktoDetails,"Clicked on Back to details ");
        TestUtil.waitElementToBeClickable(CommonBuyNowBtn);
        TestUtil.click(CommonBuyNowBtn,"Clicked on buy now");
    }
    public void checkout() throws IOException {
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        WebCommands.staticSleep(3000);
       // TestUtil.JsClick(married, "Marital Status dropped down");
       // WebCommands.staticSleep(3000);
       // TestUtil.click(maritalstatusDropdown, "married click");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.JsClick(Clikckpin,"Clikced pincode");
        WebCommands.staticSleep(2000);

//        TestUtil.sendKeys(Pincode,"400065","Entering pincode");
//        TestUtil.click(Munbai,"Clikced Area..");

        TestUtil.sendKeys(Pincode,"400065","Enter pressed","Entering pincode");
        try{
            TestUtil.JsClick(Selectedstate,"Selected state");

        }
        catch(Exception e)
        {
            TestUtil.JsClick(SelectedstateHDFC,"Selected state");
        }
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(Checkmark,"CLIKCED MARK");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }
    public void CheckoutGiftPro() throws IOException {
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        WebCommands.staticSleep(3000);
        TestUtil.click(married, "married click");
        WebCommands.staticSleep(3000);
        TestUtil.click( IncomeStartyear, "clicked on IncomeStartyear");
        TestUtil.click( FifteenthYear, "selected on FifteenthYear");
        WebCommands.staticSleep(3000);
        TestUtil.JsClick( YearofMoneyBackBenefitchosen, "clicked  on YearofMoneyBackBenefitchosen");
        TestUtil.click( TwentyYrs, "clicked  on TwentyYrs");
        TestUtil.click( MoneyBackBenefitpercentage, "clicked  on MoneyBackBenefitpercentage");
        TestUtil.click( SelecedPercentage, "clicked  on SelecedPercentage");
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.click(Clikckpin,"Clikced pincode");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Pincode,"400065","Enter pressed","Entering pincode");
        TestUtil.click(Selectedstate,"Selected state");

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(Checkmark,"CLIKCED MARK");
        WebCommands.staticSleep(2000);
        TestUtil.getScreenShot();

    }
    public void FullCheckout(String BackToDetails_yes_no) throws IOException {
        if(BackToDetails_yes_no=="yes")
        {
            checkout();
            BackFromCheckoutPage();
            checkout();
            SubmitandProceed();
        }
        else
          {
              checkout();
              SubmitandProceed();


          }
    }
    public void Assisted_Checkout() throws IOException {
        checkout();
        SubmitandProceed();
        WebCommands.staticSleep(5000);
        TestUtil.click(PayPremium, "Clicked pay premium");
        WebCommands.staticSleep(7000);
        TestUtil.getFullPageScreenShot();

    }
    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        TestUtil.click(continu, "Final continue clicked");
        WebCommands.staticSleep(8000);
        TestUtil.getScreenShot();
    }

    public void checkoutDownloadsFunctionality() {

        WebCommands.staticSleep(3000);
        TestUtil.JsClick(Benefit_Illustration, "Clicked on download Benefit Illustration");
//        WebCommands.staticSleep(4000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);

    }

    public void checkoutDownloadsFunctionalityTATAINVESTMENT() {
        TestUtil.click(Benefit_Illustration, "Clicked on download Benefit Illustration");
        WebCommands.staticSleep(4000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();
//
//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);

    }

    public void checkoutDownloadsFunctionalityHdfc() {
        TestUtil.click(Benefit_Illustration, "Clicked on download Benefit Illustration");
        WebCommands.staticSleep(4000);
    }

    public void backToHomeFunctionality() {
        TestUtil.click(Back_to_Home, "Back to Home button pressed");
        WebCommands.staticSleep(1000);
        TestUtil.click(Back_to_Home_Confirmation, "Clicked on confirm Back to Home");
        WebCommands.staticSleep(4000);
        String actual_text = AssertingString.getText();
        Assert.assertEquals(actual_text, "Today");
    }

    public void windowSwitch() {
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it = TabSwitch.iterator();
        String p = it.next();
        String c = it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }


    public void HdfcCheckOut() {
        TestUtil.sendKeys(lastname, "Test", "Name Entered");
        TestUtil.sendKeys(PlaceofBirth, "amerika", "Place of Birth Entered");
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        TestUtil.click(single, "single clicked");
        TestUtil.sendKeys(FathersFirstName, "random", "Father First Name entered");
        TestUtil.sendKeys(FathersLastName, "last", "Father Last Name entered");
        TestUtil.sendKeys(MothersFirstName, "mother", "Mothers First Name Entered");
        TestUtil.sendKeys(MothersLastName, "mother", "Mothers Last Name Entered");
        TestUtil.click(JammuResidentNo, "Not a Jammu Resident Selected");
        TestUtil.click(OccupationDropDown, "Occupation Dropped Down");
        TestUtil.click(OccupationSalaried, "Salaried selected");
        TestUtil.click(QualificationDropDown, "Qualification Dropped Down");
        TestUtil.click(QualificationGraduate, "Graduate selected");
        TestUtil.sendKeys(PanNumber, "AWQER1233R", "Pan Number Entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(AadharAvailableCheckBox, "Aadhar Radio Button Yes Pressed");
        TestUtil.sendKeys(AadharNumber, "443211234321", "Aadhar Number Entered");
        TestUtil.click(PoliticalExposedNo, "Not Politically Exposed");
        TestUtil.click(NoCriminalRecord, "No Criminal Record");
        TestUtil.sendKeys(AddressLine1, "jkh", "Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2, "jhkh", "Address Line 2 Entered");
        TestUtil.click(PinCodeClick, "PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter, "400055", "Pin Entered");
        TestUtil.click(MumbaiSelect, "Mumbai Maharashtra Selected");
        TestUtil.click(SameAsRegisteredCheckBox, "Same as Registered Address Clicked");
        TestUtil.click(continu, "Continue Press after filling details");
        try {
            TestUtil.click(Question1, "Question 1 Answered");
        } catch (Exception e) {
            TestUtil.click(Question1, "Question 1 Answered");
        }
        TestUtil.click(Question2, "Question 2 Answered");
        TestUtil.click(Question3, "Question 3 Answered");
        TestUtil.click(Question4, "Question 4 Answered");
        TestUtil.click(Question5, "Question 5 Answered");
        TestUtil.click(Question6, "Question 6 Answered");
        TestUtil.sendKeys(IdentificationMark, "dfsees", "Identification Mark Entered");
        TestUtil.sendKeys(GrossIncome, "1111111", "Gross Income Added");
        TestUtil.sendKeys(NameofPresentEmployer, "Turtlemint", "Present Employer Name Added");
        TestUtil.sendKeys(BldgNameOffice, "Bay99", "Office Bldg Name Entered");
        TestUtil.sendKeys(CityofWork, "123 Main Street", "Address Entered");
        TestUtil.click(IndustryTypeDropDown, "Industry Type Dropped Down");
        TestUtil.click(NoneOfThese, "None Of These Selected");
        WebCommands.staticSleep(3000);
        TestUtil.click(DesignationDropDown, "Designation Dropped Down");
        TestUtil.click(DesignationSelect, "Senior Manager Selected");
        TestUtil.click(IndustrySelectDropDown, "Department Dropped Down");
        TestUtil.click(EngineeringSelect, "Engineering Selected");
        TestUtil.click(OccupationDetailsDropDown, "Present Occupation Details Dropped Down");
        TestUtil.click(SalariedSelect, "Salaried Selected");
        TestUtil.click(continu, "continue clicked");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(TitleNominee, "Mr", "Mr Selected");
        TestUtil.click(NomineeMrSelect, "Nominee Mr Selected");
        TestUtil.sendKeys(NomineeFname, "Fname", "Nominee Fname entered");
        TestUtil.sendKeys(NomineeLName, "Lname", "Nominee LName entered");
        TestUtil.click(NomineeDOBDropDown, "Calendar opened");
        TestUtil.click(DateSelect, "Date Selected");
        TestUtil.sendKeys(nomineePlaceofBirth, "AbcD", "Nominee Place of Birth Entered");
        TestUtil.click(NomineeMaritalStatus, "Nominee Marital Status Dropped Down");
        TestUtil.click(NomineeSingle, "Single Selected");
        TestUtil.click(NomineeisMy, "Nominee is my drop down opened");
        TestUtil.click(Brother, "Brother Selected");
        TestUtil.sendKeys(nomineeFatherFname, "NFname", "Nominee Father First Name");
        TestUtil.sendKeys(nomineeFatherLname, "NLname", "Nominee Father Last Name");
        TestUtil.sendKeys(nomineeRegisteredAddress1, "random address", "Registered Address 1");
        TestUtil.sendKeys(nomineeRegisteredAddress2, "random address2", "Registered Address 2");
        TestUtil.click(NomineePinCodeClick, "PinCode Clicked");
        TestUtil.sendKeys(NomineePinCodeEnter, "400055", "Pin Entered");
        TestUtil.click(NomineeMumbai, "Mumbai Maharashtra Selected");
        TestUtil.click(continu, "Final Continue Pressed");
    }


}
