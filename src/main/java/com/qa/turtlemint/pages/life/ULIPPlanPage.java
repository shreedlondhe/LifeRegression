package com.qa.turtlemint.pages.life;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;
public class ULIPPlanPage {
   public  ULIPPlanPage(){ PageFactory.initElements(driver, this);}
    TestUtil tl = new TestUtil();
    LeadNamePage leadpage = new LeadNamePage();
    Term_Life_plan tlp = new Term_Life_plan();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Profile_page Pp= new Profile_page();
    @FindBy(xpath = "//div[@aria-label=\"Choose Friday, September 18th, 1987\"]")
    WebElement dateselect18Sep;
    @FindBy(xpath = "//span[text()='Select annual income']")
    WebElement approxAmount;
    @FindBy(xpath = "//li[text()='2 lakhs']")
    WebElement Selecr2lakh;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;
    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement EnterAmount;
    @FindBy(xpath = "//div[@name=\"premiumPaymentTerm\"]")
    WebElement InvestPPT;
    @FindBy(xpath = "//li[text()='12 years']")
    WebElement SelectPPTyear;
    @FindBy(xpath = "//div[@data-auto=\"ulip\"]")
    WebElement ClickonULIP;
    @FindBy(xpath = "//button[@id=\"listItem-P9-viewDetails\"]")
    WebElement ClickonHDFCViewDetailsButton;
    @FindBy(xpath = "//button[@id=\"listItem-P19-viewDetails\"]")
    WebElement ClickonBajajFuturgain;
    @FindBy(xpath = "//button[@id=\"details-page-buy-now-btn\"]")
   public WebElement CLickonBuyNowButton;
    @FindBy(xpath = "//input[@placeholder=\"Mr. / Ms. / Mrs.\"]")
    WebElement title;
    @FindBy(xpath = "//span[text()='Mr.']")
    WebElement mr;
    @FindBy(id = "insuredMemberLName")
    WebElement lastname;
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
    @FindBy(xpath = "//label[@data-auto=\"insuredmemberisnri-no-radio\"]")
    WebElement SelectNRI;
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
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement AddressLine1;
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement AddressLine2;
    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement PinCodeClick;
    @FindBy(xpath = "//input[@id='insuredMemberRegisteredPinCode']")
    WebElement PinCodeEnter;
    @FindBy(xpath = "//div[@aria-selected]//div[contains(.,'umbai')]")
    WebElement MumbaiSelect;
    @FindBy(xpath = "//div[@aria-selected]//div[contains(.,'umbai')]")
    WebElement Mumbai2;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement SameAsRegisteredCheckBox;
    @FindBy(xpath = "//span[.='Get Payment Link']")
    WebElement continu;
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
    @FindBy(xpath = "//div[contains(@placeholder,'Select relationship')]//span[contains(@aria-label,'Select box activate')]")
    WebElement NomineeisMy;
    @FindBy(xpath = "//span[text()='Spouse']")
    WebElement Spouse;
    @FindBy(id = "insuredMemberMobile")
    WebElement mobileNo;
    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;
    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;
    @FindBy(xpath = "//span[text()='Single']")
    WebElement Single;
    @FindBy(xpath = "//label[@data-auto=\"insuredmemberishandicapped-no-radio\"]")
    WebElement Selecthandicapped;
    @FindBy(xpath = "//label[@data-auto=\"insuredmemberhashistoryofconviction-no-radio\"]")
    WebElement Conviction;

    @FindBy(xpath = "//div[@class='sc-eqIVtm cCBzET']")
    WebElement SelectLifeStage;

    @FindBy(xpath = "//li[text()='Married']")
    WebElement Married;
    @FindBy(xpath = "//li[text()='Married With Kids']")
    WebElement MarriedWithKids;
    @FindBy(xpath = "//li[text()='Near Retirement']")
    WebElement NearRetirement;
    @FindBy(xpath = "//div[@name='investmentGoals']")
    WebElement Selectinvestmentgoals;
    @FindBy(xpath = "//li[text()='Wealth Creation']")
    WebElement WealthCreation;
    @FindBy(xpath = "//li[text()='Savings']")
    WebElement Savings;
    @FindBy(xpath = "//li[text()='Medium']")
    WebElement Medium;
    @FindBy(xpath = "//span[text()='Low']")
    WebElement Low;
    @FindBy(xpath = "//span[text()='High']")
    WebElement High;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;
//    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
//    WebElement EnterAmountSutabolity;

    //---------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@name=\"policyTerm\"]")
    WebElement policytermPT;
    @FindBy(xpath = "//li[text()='35 years']")
    WebElement PTThirtyFiveYears;
    @FindBy(xpath = "//li[text()='8 years']")
    WebElement PTEightYears;
    @FindBy(xpath = "//li[text()='12 years']")
    WebElement PTTenYears;
    @FindBy(xpath = "//input[@name=\"insuredFullName\"]")
    WebElement insuredname;
    @FindBy(xpath = "//p[text()='Investment']//parent::div//input")
    WebElement Investment;
    @FindBy(xpath = "//div[text()='₹ 5 Lakh ']")
    WebElement Investment5lakh;
    @FindBy(xpath = "//p[text()='Pay For (Years)']//parent::div//input")
    WebElement PTSelection;
    @FindBy(xpath = "//p[text()='Policy Term in Years']//parent::div//input")
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

    @FindBy(xpath = "//button[@id=\"listItem-P96-viewDetails\"]")
    public WebElement TATASSR;

    public void suitabilityPage1()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(MarriedWithKids,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(WealthCreation,"clicked on MarriedWithKids");

        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage2()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(NearRetirement,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Savings,"clicked on MarriedWithKids");
        TestUtil.click(High,"selecting risk appetite as high");
        TestUtil.sendKeys(EnterAmount, "80000","80,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage3()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(Married,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Savings,"clicked on MarriedWithKids");
        TestUtil.click(Low,"selecting risk appetite as low");
        TestUtil.sendKeys(EnterAmount, "100000","100,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void suitabilityPage4()
    {
        TestUtil.click(SelectLifeStage,"clicked on select life stage");
        TestUtil.click(Single,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(WealthCreation,"clicked on MarriedWithKids");
        TestUtil.click(Low,"selecting risk appetite as low");
        TestUtil.sendKeys(EnterAmount, "500000","500,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }
    public void HDFCClick2InvestProfile() throws InterruptedException, IOException {
        tlp.GenderButtonClick("male");
        TestUtil.sendKeys(insuredname,"Automation test","Entering insure name");
        tlp.datepicker("1987", "Sep", dateselect18Sep);
        TestUtil.click(approxAmount, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(Selecr2lakh, "Select 2 lakh amount");
        WebCommands.staticSleep(3000);
        TestUtil.click(next, "next button click");
        Pp.suitabilityPage4();
        TestUtil.click(EnterAmount, "");
        TestUtil.sendKeys(EnterAmount, "90000", "Enter 90k");
        TestUtil.click(InvestPPT, "");
        TestUtil.click(SelectPPTyear, "Selected 10 years");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years...");
        TestUtil.getScreenShot();
        TestUtil.click(next, "next button click");
       // leadpage.SaveLead(tl.NameGenerator());
        TestUtil.click(next, "next button click");
    }
    public void HDFCClick2InvestProfile_new() throws InterruptedException, IOException {
        tlp.GenderButtonClick("male");
        TestUtil.sendKeys(insuredname,"Automation test","Entering insure name");
        tlp.datepicker("1987", "Sep", dateselect18Sep);
        TestUtil.click(approxAmount, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(Selecr2lakh, "Select 2 lakh amount");
        WebCommands.staticSleep(3000);
        TestUtil.click(next, "next button click");
        Pp.suitabilityPage4();
        TestUtil.click(EnterAmount, "");
        EnterAmount.clear();
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(EnterAmount, "90000", "Enter 90k");
        TestUtil.click(InvestPPT, "");
        TestUtil.click(SelectPPTyear, "Selected 10 years");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years...");
        TestUtil.getScreenShot();
        TestUtil.click(next, "next button click");
        // leadpage.SaveLead(tl.NameGenerator());
        TestUtil.click(next, "next button click");
    }

    public void HDFCClick2InvestResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        WebCommands.staticSleep(1000);
        TestUtil.getFullPageScreenShot();
//        WebCommands.staticSleep(3000);
//        Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
        PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        TestUtil.sendKeys(PTSelection,"12","PT selected as 12");
        PPTSelection.clear();
       act.doubleClick(PPTSelection).build().perform();
        TestUtil.sendKeys(PPTSelection,"12","PPT selected as 12");
        WebCommands.staticSleep(3000);
        //driver.manage().window().maximize();
        js.executeScript("arguments[0].click()", ClickonHDFCViewDetailsButton);//
        // TestUtil.click(ClickonHDFCViewDetailsButton,"Click on View Details");
        TestUtil.getFullPageScreenShot();
        TestUtil.JsClick(CLickonBuyNowButton,"clicked on buynow");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(5000);
      //  HDFCCLick2InvestCheckout();


    }

    public void HDFCCLick2InvestCheckout() throws IOException {
//        WebCommands.staticSleep(1000);
//        TestUtil.sendKeys(title,"Mr","");
        WebCommands.staticSleep(2000);
        //TestUtil.click(mr,"");
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.sendKeys(PlaceofBirth, "AbcD", "Nominee Place of Birth Entered");
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        TestUtil.click(Single, "single clicked");
        TestUtil.sendKeys(FathersFirstName,"random","Father First Name entered");
        TestUtil.sendKeys(FathersLastName,"last","Father Last Name entered");
        TestUtil.sendKeys(MothersFirstName,"mother","Mothers First Name Entered");
        TestUtil.sendKeys(MothersLastName,"mother","Mothers Last Name Entered");
        TestUtil.click(SelectNRI,"Select NRI NO");
        TestUtil.click(JammuResidentNo,"Not a Jammu Resident Selected");
        TestUtil.click(PoliticalExposedNo, "Not Politically Exposed");
        TestUtil.click(Selecthandicapped,"Not Handicapped");
        TestUtil.click(Conviction,"NOT conviction");
        TestUtil.click(QualificationDropDown,"Qualification Dropped Down");
        TestUtil.click(QualificationGraduate,"Graduate selected");
        TestUtil.click(OccupationDropDown,"Occupation Dropped Down");
        TestUtil.click(OccupationSalaried,"Salaried selected");
        TestUtil.sendKeys(PanNumber,"AWQER1233R","Pan Number Entered");
        TestUtil.click(AadharAvailableCheckBox, "Aadhar Radio Button Yes Pressed");
        TestUtil.sendKeys(AadharNumber,"443211234321","Aadhar Number Entered");
        TestUtil.sendKeys(AddressLine1,"jkh","Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2,"jhkh","Address Line 2 Entered");
        TestUtil.click(PinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter,"400055","Pin Entered");
        TestUtil.click(MumbaiSelect,"Mumbai Maharashtra Selected");
        TestUtil.click(SameAsRegisteredCheckBox,"Same as Registered Address Clicked");
        TestUtil.click(continu,"Continue Press after filling details");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(TitleNominee,"Mr","Mr Selected");
        TestUtil.click(NomineeMrSelect,"Nominee Mr Selected");
        TestUtil.sendKeys(NomineeFname,"Fname","Nominee Fname entered");
        TestUtil.sendKeys(NomineeLName,"Lname","Nominee LName entered");
        TestUtil.click(NomineeDOBDropDown,"Calendar opened");
        TestUtil.click(DateSelect, "Date Selected");
        TestUtil.click(NomineeisMy,"Nominee is my drop down opened");
        TestUtil.click(Spouse,"Spouse Selected");
        TestUtil.click(continu,"continue clicked");
        WebCommands.staticSleep(2000);
        tlp.checkmarks();
        LogUtils.info("HDFC CLICK 2 Invest Plan Succesfully Done");
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();

    }

    public void BajajFutureGainProfile() throws InterruptedException, IOException {
        tlp.GenderButtonClick("male");
        TestUtil.sendKeys(insuredname,"Automation test","Entering insure name");
        tlp.datepicker("1987", "Sep", dateselect18Sep);
        TestUtil.click(approxAmount, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(Selecr2lakh, "Select 2 lakh amount");
        WebCommands.staticSleep(3000);
        TestUtil.click(next, "next button click");
        Pp.suitabilityPage2();
        TestUtil.click(EnterAmount, "");
        TestUtil.sendKeys(EnterAmount, "90000", "Enter 90k");
        TestUtil.click(InvestPPT, "");
        TestUtil.click(SelectPPTyear, "Selected 10 years");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years...");
        TestUtil.getScreenShot();
        TestUtil.click(next, "next button click");
        //leadpage.SaveLead(tl.NameGenerator());

    }
    public void BajajFutureGainProfile_New() throws InterruptedException, IOException {
        tlp.GenderButtonClick("male");
        TestUtil.sendKeys(insuredname,"Automation test","Entering insure name");
        tlp.datepicker("1987", "Sep", dateselect18Sep);
        TestUtil.click(approxAmount, "");
        WebCommands.staticSleep(3000);
        TestUtil.click(Selecr2lakh, "Select 2 lakh amount");
        WebCommands.staticSleep(3000);
        TestUtil.click(next, "next button click");
        Pp.suitabilityPage2();
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "90000", "Enter 90k");
        TestUtil.click(InvestPPT, "");
        TestUtil.click(SelectPPTyear, "Selected 10 years");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years...");
        TestUtil.getScreenShot();
        TestUtil.click(next, "next button click");
        //leadpage.SaveLead(tl.NameGenerator());
        TestUtil.click(next, "next button click");


    }
    Actions act = new Actions(driver);
    public void BajajFutureGainResult() throws InterruptedException, IOException {
        leadpage.GotItButton();
        WebCommands.staticSleep(1000);
        TestUtil.getFullPageScreenShot();
//        WebCommands.staticSleep(3000);
//        Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Investment,"70000","Investment amount filled as 70000");
      //  PTSelection.clear();
        act.doubleClick(PTSelection).build().perform();
        PTSelection.clear();
        TestUtil.sendKeys(PTSelection,"20","PT selected as 20");
        //PPTSelection.clear();
        act.doubleClick(PPTSelection).build().perform();
        PPTSelection.clear();
        TestUtil.sendKeys(PPTSelection,"15","PT selected as 15");
        WebCommands.staticSleep(5000);
        WebCommands.staticSleep(3000);
        TestUtil.JsClick(ClickonBajajFuturgain, "Click on Bajaj Future gain Plan");
        Term_Life_plan.GetPaymentLinkCTA();
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        TestUtil.click(CLickonBuyNowButton,"Click on Buy Now button");
        WebCommands.staticSleep(5000);
        //   TestUtil.sendKeys(title,"Mr","");
        //   WebCommands.staticSleep(5000);
        //  TestUtil.click(mr,"");
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");

        TestUtil.sendKeys(AddressLine1,"jkh","Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2,"jhkh","Address Line 2 Entered");
        TestUtil.JsClick(PinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter,"400055","Pin Entered");
        TestUtil.click(Mumbai2,"Mumbai Maharashtra Selected");
        TestUtil.click(SameAsRegisteredCheckBox,"Same as Registered Address Clicked");
        TestUtil.click(continu,"Continue Press after filling details");

//
//        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
//        TestUtil.click(Single, "single clicked");
//        TestUtil.click(continu,"continue clicked");
        //tlp.checkmarks();
        WebCommands.staticSleep(5000);
        TestUtil.getFullPageScreenShot();
        LogUtils.info("Bajaj Future Gain Plan");

    }
    public void clickOn_ULIP_Tab(){
        TestUtil.click(ClickonULIP,"CLick on ULIP button");
        WebCommands.staticSleep(1000);
    }


}
