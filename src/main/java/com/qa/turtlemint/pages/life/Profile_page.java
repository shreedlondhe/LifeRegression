package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Profile_page extends TestBase {

    public Profile_page() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@id='Radio-M']")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id='Radio-F']")
    WebElement Femaleselected;

    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement DateDropDown;

    @FindBy(xpath = "//input[@placeholder='Enter Date']")
    WebElement calender;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, December 1st, 2004']")
    WebElement ModifiedDateSelect;


    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, December 2nd, 1992']")
    WebElement dateselectTata;

    @FindBy(xpath = "//div[@aria-label='Choose Thursday, May 3rd, 1979']")
    WebElement dateselectIcici;

    @FindBy(xpath = "//div[@aria-label='Choose Monday, July 18th, 1983']")
    WebElement dateselectHdfc;

    @FindBy(xpath = "//div[@aria-label='Choose Saturday, October 10th, 1987']")
    WebElement dateselectMax;

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, December 7th, 2004']")
    WebElement dateselectBalicPos;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, June 24th, 1992']")
    WebElement dateselectLicNewJeevan;

    @FindBy(xpath = "//div[@aria-label='Choose Wednesday, November 12th, 1980']")
    WebElement dateselectLicJeevanLakhsya;

    @FindBy (xpath = "//label[@id='Radio-false']")
    WebElement SmokeChewTobacco;

    @FindBy (xpath = "//span[text()='Select annual income']")
    WebElement annualIncomeDropdown;

    @FindBy (xpath = "//span[text()='3 lakhs']")
    WebElement annualIncomeDropdownModified;


    @FindBy (xpath = "//li[text()='2 lakhs']")
    WebElement annualIncomeTwoLakhs;

    @FindBy (xpath = "//li[text()='3 lakhs']")
    WebElement annualIncomeThreeLakhs;

    @FindBy(xpath = "//span[text()='Next']//parent::button")
    WebElement NextButton;

    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement EnterAmount;

    @FindBy(xpath = "//div[@name='premiumPaymentTerm']")
    WebElement PPTDropDown;

    @FindBy(xpath = "//li[text()='8 years']")
    WebElement PPTEightYears;

    @FindBy(xpath = "//li[text()='10 years']")
    WebElement PPTTenYears;

    @FindBy(xpath = "//li[text()='12 years']")
    WebElement PPTTwelveYears;

    @FindBy(xpath = "//li[text()='35 years']")
    WebElement PPTThirtyFiveYears;

    @FindBy(xpath = "//span[text()='Edit']")
    WebElement Modify;

    @FindBy(xpath = "//div[@name='policyTerm']")
    WebElement ModifiedPPTDropDown;
    //------------------------------------------------------------------------------
    @FindBy(xpath = "//span[text()='Married With Kids']")
    WebElement SelectLifeStage;
    @FindBy(xpath = "//span[text()='Near Retirement']")
    WebElement SelectLifeStageModify;
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
//    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
//    WebElement EnterAmountSutabolity;

    //--------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@name=\"policyTerm\"]//span")
    WebElement policytermPT;
    @FindBy(xpath = "//li[text()='35 years']")
    WebElement PTThirtyFiveYears;
    @FindBy(xpath = "//li[text()='8 years']")
    WebElement PTEightYears;
    @FindBy(xpath = "//li[text()='10 years']")
    WebElement PTTenYears;
    @FindBy(xpath = "//input[@name=\"insuredFullName\"]")
    WebElement insuredname;
    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement No;
    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement Yes;
    //-----------------------
    @FindBy(xpath = "//input[@name=\"propFullName\"]")
    WebElement Proposername;
    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Male;

    @FindBy(xpath = "//div[text()='Approx. annual Income']")
    WebElement Annualincome;
    @FindBy(xpath = "//div[text()='Proposer Name']")
    WebElement Proposename;





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
    public void suitabilityPageModify()
    {
        TestUtil.click(SelectLifeStageModify,"clicked on select life stage");

        TestUtil.click(NearRetirement,"clicked on Marrital with kids");

        TestUtil.click(Selectinvestmentgoals,"clicked on select Selectinvestmentgoals");
        TestUtil.click(Savings,"clicked on MarriedWithKids");
        TestUtil.click(High,"selecting risk appetite as high");
        TestUtil.sendKeys(EnterAmount, "80000","80,000 Amount Entered for yearly frequency");
        TestUtil.click(NextButton,"click on next");
    }

    public void Proposename()
    {
        TestUtil.sendKeys(Proposername,"Automation test","name entred");
        TestUtil.click(Male,"Clikcd male");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(dateselectTata,"2nd December 1992 Selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
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
    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else {
            TestUtil.click(Femaleselected, "Female Gender Selected");
        }
    }

    public void profilePageForTataFortuneGuaranteePlus(){
        TestUtil.sendKeys(insuredname,"Automation test","Enter insured name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(dateselectTata,"2nd December 1992 Selected");
        try {
            TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
            TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
            LogUtils.info("Clicked Next Button");
        } catch (Exception e) {
            System.out.println("Next Button Not Found: " + e);
        }
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
       // TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTEightYears,"8 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down");
        TestUtil.click(PTEightYears,"8 years selected PT...");
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(1000);
        TestUtil.click(NextButton, "Lead page Next Button Pressed");
    }

    public void profilePageForICICI(){
//        if(persontype_nooryes == "no"){
//            TestUtil.click(No, "Online clicked");
//            WebCommands.staticSleep(2000);
//        }else {
//            TestUtil.click(Yes, "Online clicked");
//            WebCommands.staticSleep(2000);
//        }
        TestUtil.sendKeys(insuredname,"Automation test","Entering insure name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1979");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("May");
        TestUtil.click(dateselectIcici,"5 March date select");
        WebCommands.staticSleep(2000);
        Boolean p = Annualincome.isDisplayed();
        if (p == true){
            TestUtil.click(annualIncomeDropdown, "Annual Income Dropped down");
            TestUtil.click(annualIncomeThreeLakhs, "Annual Income Selected");
            LogUtils.info("Clicked Next Button");
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: ");
        } else {
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: " );
        }
        WebCommands.staticSleep(2000);

        try {
            Proposename();
        } catch (Exception e) {
            System.out.println(" NO button Not Found: " );

        }
            suitabilityPage1();
            EnterAmount.clear();
            TestUtil.sendKeys(EnterAmount, "100000","90,000 Amount Entered for yearly frequency");
            TestUtil.click(PPTDropDown, "PPT Dropped Down");
            TestUtil.click(PPTTenYears,"10 Years Selected");
            TestUtil.click(policytermPT,"PT Dropped Down...");
            TestUtil.click(PTTenYears,"Selected 10 Years PT...");
            TestUtil.getScreenShot();
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next pagee Not Found: ");
            TestUtil.click(NextButton, " Lead page Next Button Pressed");

    }

    public void profilePageForHDFCSanchay(){

        TestUtil.sendKeys(insuredname,"Automation test","Entering insurer name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1983");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Jul");
        TestUtil.click(dateselectHdfc,"18th July date selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage2();
        WebCommands.staticSleep(2000);
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years PT...");
        TestUtil.getScreenShot();
        TestUtil.JsClick(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Lead Page Next Button Pressed");
    }

    public void profilePageForMaxSmartWealth(){
        TestUtil.sendKeys(insuredname,"Automation test", "Entering insurer name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1987");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Oct");
        TestUtil.click(dateselectMax,"10th october date selected");
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeTwoLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage4();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years PT...");
        TestUtil.getScreenShot();
        TestUtil.click(NextButton, "Next Button Pressed");
    }
    public void anualincome(){
        TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
        TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
    }

    public void profilePageForBALICPOS(){
//
//    if(persontype_nooryes == "no"){
//        TestUtil.click(No, "Online clicked");
//        WebCommands.staticSleep(2000);
//    }else {
//        TestUtil.click(Yes, "Online clicked");
//        WebCommands.staticSleep(2000);
//    }
        TestUtil.sendKeys(insuredname,"Automation test","Enter insured name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("2004");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(dateselectBalicPos,"2nd March 1980 date select");
        try {
            TestUtil.click(annualIncomeDropdown,"Annual Income Dropped down");
            TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
            LogUtils.info("Clicked Next Button");
        } catch (Exception e) {
            System.out.println("Next Button Not Found: " + e);
        }
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPage3();
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTThirtyFiveYears,"35 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down");
        TestUtil.click(PTThirtyFiveYears," 35 Years selected PT..");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForLicNewJeevan(String persontype_nooryes){

        if(persontype_nooryes == "no"){
            TestUtil.click(No, "Online clicked");
            WebCommands.staticSleep(2000);
        }else {
            TestUtil.click(Yes, "Online clicked");
            WebCommands.staticSleep(2000);
        }
        TestUtil.sendKeys(insuredname,"Automation test","Enter insured name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1992");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Jun");
        TestUtil.click(dateselectLicNewJeevan,"24th june date select");
        Boolean p = Annualincome.isDisplayed();
        if (p == true){
            TestUtil.click(annualIncomeDropdown, "Annual Income Dropped down");
            TestUtil.click(annualIncomeThreeLakhs, "Annual Income Selected");
            LogUtils.info("Clicked Next Button");
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: ");
        } else {
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: " );
        }
        try {
            Proposename();
        } catch (Exception e) {
            System.out.println(" NO button Not Found: " );

        }
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years PT...");
        TestUtil.getScreenShot();
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void profilePageForLicJeevanLakshya(String persontype_nooryes){
        if(persontype_nooryes == "no"){
            TestUtil.click(No, "Online clicked");
            WebCommands.staticSleep(2000);
        }else {
            TestUtil.click(Yes, "Online clicked");
            WebCommands.staticSleep(2000);
        }
        TestUtil.sendKeys(insuredname,"Automation test","Enter insured name");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("1980");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Nov");
        TestUtil.click(dateselectLicJeevanLakhsya,"12th Nov 1980 date select");
        Boolean p = Annualincome.isDisplayed();
        if (p == true){
            TestUtil.click(annualIncomeDropdown, "Annual Income Dropped down");
            TestUtil.click(annualIncomeThreeLakhs, "Annual Income Selected");
            LogUtils.info("Clicked Next Button");
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: ");
        } else {
            TestUtil.click(NextButton, "Next Button Pressed");
            System.out.println("Next Button Not Found: " );
        }
        try {
            Proposename();
        } catch (Exception e) {
            System.out.println(" NO button Not Found: " );

        }
        WebCommands.staticSleep(2000);
        suitabilityPage2();
        TestUtil.sendKeys(EnterAmount, "90000","90,000 Amount Entered for yearly frequency");
        TestUtil.click(PPTDropDown, "PPT Dropped Down");
        TestUtil.click(PPTTenYears,"10 Years Selected");
        TestUtil.click(policytermPT,"PT Dropped Down...");
        TestUtil.click(PTTenYears,"Selected 10 Years PT...");
        TestUtil.getScreenShot();
        TestUtil.click(NextButton, "Next Button Pressed");
        WebCommands.staticSleep(2000);
        TestUtil.click(NextButton, "Next Button Pressed");
    }

    public void modifyTataFortune(){
        TestUtil.JsClick(Modify,"Modify Button Clicked");
       // TestUtil.click(Modify,"Modify Button Clicked");
        TestUtil.click(Femaleselected,"Female Selected");
        TestUtil.click(calender,"caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue("2004");
        Select monthSelect =new Select(monthselect);
        monthSelect.selectByVisibleText("Dec");
        TestUtil.click(ModifiedDateSelect,"1st Dec 2022 date select");
        TestUtil.click(annualIncomeDropdownModified,"Annual Income Dropped down");
        TestUtil.click(annualIncomeThreeLakhs,"Annual Income Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        suitabilityPageModify();
        WebCommands.staticSleep(2000);
        EnterAmount.clear();
        TestUtil.sendKeys(EnterAmount, "125000","1,25,000 Amount Entered for yearly frequency");
        WebCommands.staticSleep(2000);
        TestUtil.click(ModifiedPPTDropDown, "PPT Dropped Down");

        TestUtil.click(PPTTwelveYears,"12 Years Selected");
        TestUtil.click(NextButton, "Next Button Pressed");
        TestUtil.click(NextButton, "Next Button Pressed");
    }
}