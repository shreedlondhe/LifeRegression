package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class ChildSavingUlipPlan extends TestBase{
    public String getUrl;
    public String orderID;

    Term_Life_plan tlp;

    public ChildSavingUlipPlan(){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//label[@id='Radio-M']")
    WebElement male;

    @FindBy(xpath = "//div[@class='sc-VigVT iiCBTs']//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")
    WebElement datepicker;

    @FindBy(xpath = "//select[1]")
    WebElement clickonyear;

    @FindBy(xpath = "//select[2]")
    WebElement clickonmonth;

    @FindBy(xpath = "//div[@aria-label='Choose Sunday, December 1st, 1996']")
    WebElement selectDOB;

    @FindBy(xpath = "//span[text()='Select annual income']")
    WebElement clickonincome;

    @FindBy(xpath = "//li[contains(@value,'1500000')]")
    WebElement selectincome;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement childDatepicker;

    @FindBy(xpath = "//div[@aria-label='Choose Thursday, December 20th, 1990']")
    WebElement selectchildDOB;

    @FindBy(xpath = "//div[@aria-label='Choose Thursday, December 1st, 2022']")
    WebElement childDOB;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextbtn;

    @FindBy(xpath = "//input[@placeholder='Enter Amount']")
    WebElement clickAmount;

    @FindBy(xpath = "//span[text()='10 years']")
    WebElement clickPPT;

    @FindBy(xpath = "//li[@value='10']")
    WebElement selectPPT;

    @FindBy(xpath = "//span[text()='ULIP']")
    WebElement selectULIP;

    @FindBy(xpath = "//button[@id=\"listItem-P9-viewDetails\"]")
    WebElement viewDetails;

    @FindBy(xpath = "//span[@aria-label=\"arrow-left\"]")
    WebElement seeallplans;

    @FindBy(xpath = "//span[normalize-space()='Benefits']")
    WebElement Benefits;

    @FindBy(xpath = "//span[text()='Exclusions']")
    WebElement Exclusions;

    @FindBy(xpath = "//span[text()='Benefit Illustration']")
    WebElement BenefitIllustration;

    @FindBy(xpath = "//span[text()='Eligibility']")
    WebElement Eligibility;

    @FindBy(xpath = "//span[text()='Insurer overview & claim record']")
    WebElement insureroverview;

    @FindBy(xpath = "//span[@class='title-text']")
    WebElement clickDownloads;

    @FindBy(xpath = "//span[@class='download-icon']//*[name()='svg']")
    WebElement BrochureDownload;

    @FindBy(xpath = "//button[@id=\"details-page-buy-now-btn\"]")
    WebElement BuyNow;

    @FindBy(xpath = "//span[text()='Mr.']")
    WebElement Title;

    @FindBy(xpath = "//input[@id='insuredMemberLName']")
    WebElement Lastname;

    @FindBy(xpath = "//input[@id='insuredMemberMobile']")
    WebElement Mobilenumber;

    @FindBy(xpath = "//input[@id='insuredMemberEmail']")
    WebElement email;

    @FindBy(xpath = "//input[@id='insuredMemberPlaceOfBirth']")
    WebElement placeofbirth;

    @FindBy(xpath = "//div[@id='insuredMemberMaritalStatus-uiSelect']")
    WebElement clickmaritialstatus;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement selectmaritialstatus;

    @FindBy(xpath = "//input[@id='insuredMemberFatherFName']")
    WebElement FatherFname;

    @FindBy(xpath = "//input[@id='insuredMemberFatherLName']")
    WebElement FatherLname;

    @FindBy(xpath = "//input[@id='insuredMemberMotherFName']")
    WebElement MotherFname;

    @FindBy(xpath = "//input[@id='insuredMemberMotherLName']")
    WebElement MotherLname;

    @FindBy(xpath = "//input[@id='insuredMemberSpouseFName']")
    WebElement SpouseFname;

    @FindBy(xpath = "//input[@id='insuredMemberSpouseLName']")
    WebElement SpouseLname;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisnri-no-radio']")
    WebElement nri;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisjammukashmirresident-no-radio']")
    WebElement jammu_kashmir;

    @FindBy(xpath = "//label[@data-auto='insuredmemberispoliticallyexposed-no-radio']")
    WebElement politically_exposed;

    @FindBy(xpath = "//label[@data-auto='insuredmemberishandicapped-no-radio']")
    WebElement physically_disabled;

    @FindBy(xpath = "//label[@data-auto='insuredmemberhashistoryofconviction-no-radio']")
    WebElement conviction_history;

    @FindBy(xpath = "//div[@id='insuredMemberQualification-uiSelect']")
    WebElement clickqualification;

    @FindBy(xpath = "//span[text()='Graduate']")
    WebElement selectqualification;

    @FindBy(xpath = "//div[@id='insuredMemberOccupation-uiSelect']")
    WebElement clickoccupation;

    @FindBy(xpath = "//span[contains(text(),'Salaried')]")
    WebElement selectoccupation;

    @FindBy(xpath = "//input[@id='insuredMemberPanNumber']")
    WebElement pancard;

    @FindBy(xpath = "//label[@data-auto='insuredmemberisaadhaarcardavailable-no-radio']")
    WebElement aadhar;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement addressL1;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement addressL2;

    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement clickpin;

    @FindBy(xpath = "//input[@placeholder=\"Enter 6 digit Pincode\"]")
    WebElement clickpincode;

    @FindBy(xpath = "//span[contains(text(),'Mumbai, Maharashtra')]")
    WebElement selectpincode;

    @FindBy(xpath = "//div[text()='Same as registered address']")
    WebElement sameaddress;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continuebtn;

    @FindBy(xpath = "//input[@id='nomineeFName']")
    WebElement nomineeFname;

    @FindBy(xpath = "//input[@id='nomineeLName']")
    WebElement nomineeLname;

    @FindBy(xpath = "//input[@id='nomineeDOB-datepicker']")
    WebElement nomineedatepicker;

    @FindBy(xpath = "//span[@class='ui-select-placeholder text-muted ng-binding']")
    WebElement clicknomineerelationship;

    @FindBy(xpath = "//span[contains(text(),'Mother')]")
    WebElement selectrelationship;

    @FindBy(xpath = "//div[@class='ng-scope userApprovalDisclaimer1-field']")
    WebElement userapproval1;

    @FindBy(xpath = "//div[@class='ng-scope userApprovalDisclaimer2-field']")
    WebElement userapproval2;

    @FindBy(xpath = "//button[normalize-space()='Submit and Proceed']")
    WebElement submitandproceed;

    @FindBy(xpath = "//span[@data-auto='benefit-illustration']")
    WebElement Benefit_Illustration;
    //-----------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@name=\"policyTerm\"]")
    WebElement clickPT;
    @FindBy(xpath = "//li[text()='10 years']")
    WebElement selectTenYearsPT;


    @FindBy(xpath = "//p[text()='Investment']//parent::div//input")
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
    @FindBy(xpath = "//input[@placeholder='Name of Insured']")
    WebElement ChildName;
    @FindBy(xpath = "//input[@placeholder='Name of Proposer']")
    WebElement ProposalName;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calenderchild;

    @FindBy(xpath = "//select[@class='sc-bwCtUz fCTpjO'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//select[@class='sc-bwCtUz fCTpjO'][2]")
    WebElement monthselect;

    JavascriptExecutor js = (JavascriptExecutor) driver;
    Child_Saving_traditional_Plans_Page CP=new Child_Saving_traditional_Plans_Page();
    public void datepickerChild(String year,String Month, WebElement Date) {
        TestUtil.click(calenderchild, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "Date select");
        WebCommands.staticSleep(1000);
    }
    public void childSavingUlipProfile(){
        tlp = new Term_Life_plan();
        TestUtil.click(male,"Male selected as Gender");
        tlp.datepicker("1996","Dec",selectDOB);
        TestUtil.sendKeys(ChildName,"Shree","Child name Entered");
        TestUtil.click(nextbtn,"Clicked on Next");

        TestUtil.sendKeys(ProposalName,"Proposal","Proposal name Entered");
        TestUtil.click(male,"Male selected as Gender");
        TestUtil.waitUntilVisibilityOfElement(clickonincome);
        TestUtil.click(clickonincome,"Clicked in income");
        TestUtil.click(selectincome,"Income Selected");
        datepickerChild("1990","Dec",selectchildDOB);
        TestUtil.JsClick(nextbtn,"Clicked on Next");
        CP.suitabilityPage1();
        TestUtil.click(clickPPT,"Clicked om PPT");
        TestUtil.click(selectPPT,"PPT Selected");
        TestUtil.click(clickPT,"Clicked om PT");
        TestUtil.click(selectTenYearsPT,"PT Selected 10 Years PT...");
        TestUtil.getScreenShot();
        TestUtil.click(nextbtn,"Clicked on Next");
    }
    Actions act = new Actions(driver);

    public void childSavingUlipResultsPage(){
        //Investment.clear();
        act.doubleClick(Investment).build().perform();
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Investment,"90000","Investment amount filled as 70000");
      //  PTSelection.clear();
        WebCommands.staticSleep(3000);
        act.doubleClick(PTSelection).build().perform();
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(PTSelection,"6","PT selected as 6");
        WebCommands.staticSleep(5000);
        TestUtil.JsClick(selectULIP,"Switched to ULIP Plan");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
        TestUtil.click(viewDetails,"Clicked on View HDFCLI-Click 2 Invest - Life Option");
        Term_Life_plan.GetPaymentLinkCTA();
    }

    public void childSavingsUlipPdpPage(){
        TestUtil.getScreenShot();
        TestUtil.JsClick(seeallplans,"Clicked on See all plans");
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(viewDetails,"Clicked on View Details of ProGrowth Plus - Life Option");
        WebCommands.staticSleep(1000);
        TestUtil.JsClick(Benefits,"Clicked in Benefits");
        WebCommands.staticSleep(1000);
        TestUtil.click(Exclusions,"Clicked on Exclusions");
        WebCommands.staticSleep(1000);
        TestUtil.click(BenefitIllustration,"Clicked on Benefit Illustration");
        WebCommands.staticSleep(1000);
        TestUtil.click(Eligibility,"Clicked on Eligibility");
        WebCommands.staticSleep(1000);
        TestUtil.click(insureroverview,"Clicked on Insurer Overview & Claim Record");
        WebCommands.staticSleep(2000);
    }

    public void buyNow(){
        js.executeScript("window.scrollBy(0,-300)");
        TestUtil.JsClick(BuyNow,"Clicked on Buy Now");
    }

    public void downloadsFunctionalityPDP(){
        WebCommands.staticSleep(3000);
       // TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",clickDownloads );
       // clickDownloads.sendKeys(Keys.ENTER);
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }

    public void checkoutPageInsuredDetails(){
        TestUtil.sendKeys(Lastname,"Test","Last name entered");
        TestUtil.sendKeys(Mobilenumber,"6999912346","Mobile number entered");
        TestUtil.sendKeys(email,"automation@turtlemint.com","Email entered");
        TestUtil.sendKeys(placeofbirth,"mumbai","Place of birth entered");
        TestUtil.click(clickmaritialstatus,"clicked on maritial status");
        TestUtil.click(selectmaritialstatus,"Maritial status selected");
        TestUtil.sendKeys(FatherFname,"Father","Father First name entered");
        TestUtil.sendKeys(FatherLname,"Test","Father last name entered");
        TestUtil.sendKeys(MotherFname,"Mother","Mother First name entered");
        TestUtil.sendKeys(MotherLname,"Test","Mother last name entered");
        TestUtil.sendKeys(SpouseFname,"Spouse","Spouse First name entered");
        TestUtil.sendKeys(SpouseLname,"Test","Spouse Last name entered");
//        tlp.checkmarks();
        TestUtil.click(nri,"Are you NRI?: NO");
        TestUtil.click(jammu_kashmir,"Are you a resident of Jammu & Kashmir?: NO");
        TestUtil.click(politically_exposed,"Are you a politically exposed person?: NO");
        TestUtil.click(physically_disabled,"Is the policy primarily to protect a Physically Disabled / Handicapped person?: No");
        TestUtil.click(conviction_history,"Do you have any history of conviction / acquittal under any criminal proceedings in India or abroad?: NO");
        TestUtil.click(clickqualification,"Clicked in Qualification");
        TestUtil.click(selectqualification,"Qualification selected");
        TestUtil.click(clickoccupation,"Clicked on occupation");
        TestUtil.click(selectoccupation,"Occupation selected");
        TestUtil.sendKeys(pancard,"APTPR5666F","Pancard entered");
        TestUtil.click(aadhar,"Do you have aadhaar card?: NO");
        TestUtil.click(sameaddress,"Correspondence Address selected Same as registered address");
        TestUtil.sendKeys(addressL1,"Airport Road","Address Line1 Entered");
        TestUtil.sendKeys(addressL2,"Andheri","Address Line2 Entered");
        WebCommands.staticSleep(3000);
        TestUtil.click(clickpin,"clicked on pincode");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(clickpincode,"400075","Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(selectpincode,"Mumbai, Maharashtra selected");
        TestUtil.click(continuebtn,"Clicked on continue");
    }

    public void checkoutPageNomineeDetails(){
        TestUtil.click(Title,"Title selected");
        TestUtil.sendKeys(nomineeFname,"Nominee", "Nominee name entered");
        TestUtil.sendKeys(nomineeLname,"LName","Last Name entered");
        TestUtil.sendKeys(nomineedatepicker,"30/01/1996","Nominee DOB entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(nomineedatepicker,"clicked on filled date");
        driver.findElement(By.xpath("//a[text()='30']")).click();
        //TestUtil.click(clicknomineerelationship,"clicked on nominee relationship");
        TestUtil.JsClick(clicknomineerelationship,"clicked on nominee relationship");
        WebCommands.staticSleep(1000);
        TestUtil.click(selectrelationship,"Nominee relationship selected");
       // TestUtil.JsClick(selectrelationship,"Nominee relationship selected");
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(continuebtn,"Clicked on continue");
      //  TestUtil.click(continuebtn,"Clicked on continue");
    }

    public void checkoutPageUserApproval(){
        TestUtil.click(userapproval1,"Clicked on first user approval");
        TestUtil.click(userapproval2,"Clicked on second user approval");
        WebCommands.staticSleep(2000);
        TestUtil.click(submitandproceed,"Clicked on submit and proceed");
        WebCommands.staticSleep(4000);
        TestUtil.getScreenShot();
    }

    public void checkoutDownloadsFunctionality(){
        TestUtil.click(Benefit_Illustration,"Clicked on download Benefit Illustration");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }
    public String getUniqueID() throws InterruptedException {
        WebCommands.staticSleep(3000);
        getUrl = driver.getCurrentUrl();
        System.out.println("page URl "+getUrl);

        String[] result = getUrl.split("results/");
        System.out.println("Order ID = " + result[1]);
        orderID = result[1];
        WebCommands.staticSleep(2000);
        return orderID;
    }

}