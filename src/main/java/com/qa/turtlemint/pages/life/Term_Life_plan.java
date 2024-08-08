package com.qa.turtlemint.pages.life;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.util.LogUtils;
import  com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.qa.turtlemint.base.TestBase.driver;
import static com.qa.turtlemint.base.TestBase.prop;

public class Term_Life_plan {
    public Term_Life_plan() {
        PageFactory.initElements(driver, this);
    }

    TestUtil tl = new TestUtil();
    LeadNamePage leadpage = new LeadNamePage();

    @FindBy(xpath = "//label[@id=\"Radio-M\"]")
    WebElement Maleselected;

    @FindBy(xpath = "//label[@id=\"Radio-F\"]")
    WebElement Femaleselected;

    @FindBy(xpath = "//label[@id=\"Radio-true\"]")
    WebElement yes;

    @FindBy(xpath = "//label[@id=\"Radio-false\"]")
    WebElement no;

    @FindBy(xpath = "//span[text()='5 Lac to 7 Lac']")
    WebElement approxAmount;

    @FindBy(xpath = "//li[text()='7 Lac to 10 Lac']")
    WebElement Amount_7to10lac;

    @FindBy(xpath = "//li[text()='10 Lac to 15 Lac']")
    WebElement Amount_10lacto15lac;


    @FindBy(xpath = "//span[text()='₹1 Crs']")
    WebElement sumassuredamt;

    @FindBy(xpath = "//li[text()='₹1.50 Crs']")
    WebElement sumassuredamt_1_5Crs;

    @FindBy(xpath = "//li[text()='₹1.25 Crs']")
    WebElement sumassuredamt_1_25Crs;

    @FindBy(xpath = "//li[text()='₹3 Crs']")
    WebElement sumassuredamt_3Crs;

    @FindBy(xpath = "//li[text()='₹3.05 Crs']")
    WebElement sumassuredamt_3_05Crs;


    @FindBy(xpath = "//span[text()='Yearly']")
    WebElement paymentFrequency;

    @FindBy(xpath = "//span[text()='Half-Yearly']")
    WebElement halfYearly;

    @FindBy(id = "coverAmount")
    WebElement coverAmount;

    @FindBy(xpath = "//a[text()='₹2 Crs']")
    WebElement coverAmt_2Crs;

    @FindBy(id = "maturityAge")
    WebElement maturityAge;

    @FindBy(xpath = "//a[text()='65 years']")
    WebElement maturityAge_65Yr;

    @FindBy(xpath = "//button[@id=\"premiumPaymentTerm\"]")
    WebElement premiumPaymentTerm;

    @FindBy(xpath = "//li[@data-auto='premiumPaymentTerm-dropdown-list-34']//a[text()='35 years']")
    WebElement premiumPaymentTerm_25yr;



    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calender;

    @FindBy(xpath = "//input[@placeholder=\"Enter Date\"]")
    WebElement calenderchild;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][1]")
    WebElement yearselect;

    @FindBy(xpath = "//select[@class='sc-hrWEMg cDlQIW'][2]")
    WebElement monthselect;

    @FindBy(xpath = "//div[@aria-label=\"Choose Wednesday, August 5th, 1992\"]")
    WebElement dateselect_5Aug;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 1985\"]")
    WebElement dateselect_1Dec;

    @FindBy(xpath = "//div[@aria-label=\"Choose Sunday, December 1st, 2002\"]")
    WebElement dateselect_1dec2002;

    @FindBy(xpath = "//div[@aria-label=\"Choose Saturday, January 1st, 2000\"]")
    WebElement dateselect_1jan2000;

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, October 15th, 1996']")
    WebElement dateselect_15joct1996;



    @FindBy(xpath = "//span[text()='Next']")
    WebElement next;
    // next

    @FindBy(xpath = "//span[text()='Edit']")
    WebElement modify;

    @FindBy(xpath = "//button[@id='details-page-buy-now-btn']")
    WebElement buyNowButton;

    @FindBy(xpath = "//input[@placeholder=\"Mr. / Ms. / Mrs.\"]")
    WebElement title;

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobilrNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(id = "insuredMemberMaritalStatus")
    WebElement maritalstatusDropdown;

    @FindBy(xpath ="//div[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//div[text()='Single']")
    WebElement single;

    @FindBy(xpath = "//span[.=\"Continue\"]")
    WebElement continu;

    @FindBy(xpath = "//button[@data-auto=\"submit-btn\"]")
    WebElement submit;

    @FindBy(xpath = "data-auto=\"proceed to payment-btn\"")
    WebElement ProceedToBuy;

    @FindBy(xpath = "//span[text()='Downloads']")
    WebElement clickDownloads;

    @FindBy(xpath = "//a[@id='download-brochure-btn']//span[@aria-label='download']")
    WebElement BrochureDownload;

//    @FindBy(xpath = "//a[@ng-click=‘downloadFn(item)’]//span[@class=‘download-icon’]")
//    WebElement Benefit_Illustration;
    @FindBy(xpath = "//span[text()='Benefit Illustration']")   //new add
    WebElement Benefit_Illustration;

    @FindBy(xpath = "//button[@id='listItem-P85-viewDetails']")
    WebElement TataAIA;

    @FindBy(xpath = "//button[@id='listItem-P76-viewDetails']")
    WebElement BajajAllianz;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-ICICIPRULI-iProtect Smart\"]")
    WebElement ICIC_ismart;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-MAXLIFELI-Smart Secure Plus\"]")
    WebElement Maxlife_smartSecure;

    @FindBy(xpath = "//button[@data-auto=\"viewdetail-HDFCLI-Click 2 Protect Life\"]")
    WebElement HdfcClick2_protectLife;


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

    @FindBy(xpath = "//label[@data-auto='insuredmemberishandicapped-no-radio']")
    WebElement  PhysicallyDisabled;


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
    @FindBy(xpath = "//label[text()=' Critical Illness - 22 Illness ']/preceding-sibling::input[@type='checkbox']")
    WebElement MaxRider;

    @FindBy(xpath = "//input[@placeholder='Sum Assured']")
    WebElement SumAssured;
    @FindBy(xpath = "//input[@placeholder='Pay For']")
    WebElement PTSelection;
    @FindBy(xpath = "//input[@placeholder='Maturity age']")
    WebElement PPTSelection;
    @FindBy(xpath = "//p[text()='Insurers']/..//span[text()='All']")
    WebElement AllInsurer;
    @FindBy(xpath = "//span[text()='TATAAIALI']")
    WebElement TATAInsurer;
    @FindBy(xpath = "//button[text()='₹ 1.00 Cr']")
    WebElement sumAssured1cr;
    @FindBy(xpath = "//button[text()='80 age']")
    WebElement coverAgeUpto_80;




    @FindBy(xpath = "//span[text()='Leads']")
    WebElement Leads;
    @FindBy(xpath = "//span[text()='Proposal']")
    WebElement Proposal;
    @FindBy(xpath = "//button[text()='Proceed to payment']")
    WebElement Proceedtopayment;

    public String LeadName;

    @FindBy(xpath = "//input[@placeholder='Pincode']")
    WebElement Pincode;

    @FindBy(xpath = "//span[text()='Select Occupation']")
    WebElement SelectOccupation;

    @FindBy(xpath = "//li[text()='Self employed']")
    WebElement Selfemployed;

    @FindBy(xpath = "//span[text()='Select Educational Qualification']")
    WebElement SelectEducationalQualification;

    @FindBy(xpath = "//li[text()='Graduate and above']")
    WebElement Graduateandabove;

    @FindBy(xpath = "//span[.='Get Payment Link']")
    WebElement Submit;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress1']")
    WebElement Add1;

    @FindBy(xpath = "//input[@id='insuredMemberRegisteredAddress2']")
    WebElement Add2;

    @FindBy(xpath = "//span[.='Get Payment Link']")
    static WebElement GetPaymentLink;
    @FindBy(xpath = "//button[@aria-label='Close']//span[@role]")
    static WebElement Cancel;

    public static void GetPaymentLinkCTA(){
        try{
            Thread.sleep(5000);
        if(GetPaymentLink.isDisplayed())
        {
            TestUtil.click(Cancel,"got 'GetPaymentLink' and clicked on cancel");
        }
        }
        catch(Exception e){
            System.out.println("GetPaymentLink not found");

        }
    }



    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void GenderButtonClick(String Gender) {
        WebCommands.staticSleep(1000);
        if (Gender == "male") {
            TestUtil.click(Maleselected, "Male Gender Selected");
        } else
            TestUtil.click(Femaleselected, "Female Gender Selected");
    }

    public void smoke_chewTobaco(String yesNo) {
        WebCommands.staticSleep(500);
        if (yesNo == "yes") {
            TestUtil.click(yes, "Yes Selected");
        } else
            TestUtil.click(no, "No Selected");
    }

    public void datepicker(String year,String Month, WebElement Date) {
        TestUtil.click(calender, "caleder select");
        Select yearSelect = new Select(yearselect);
        yearSelect.selectByValue(year);
        WebCommands.staticSleep(1000);
        Select monthSelect = new Select(monthselect);
        monthSelect.selectByVisibleText(Month);
        WebCommands.staticSleep(1000);
        TestUtil.click(Date, "5 aug date select");
        WebCommands.staticSleep(1000);
    }

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

    public void modifylow() {
        TestUtil.JsClick(modify, "modify clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(7000);
    }
    public void modifylowNew() {
        TestUtil.click(modify, "modify clicked");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(7000);
    }

    public void checkout() {
      //  TestUtil.sendKeys(title, "mr", "");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "T9127198@gmail.com", "Email Id entered");
     //   TestUtil.JsClick(maritalstatusDropdown, "maritalstatusDropdown button click");
     //   TestUtil.JsClick(married, "married click");
        TestUtil.JsClick(continu, "Continue button click");
    }

    public void checkoutBalic() {
        //  TestUtil.sendKeys(title, "mr", "");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "T9127198@gmail.com", "Email Id entered");
        TestUtil.sendKeys(Add1, "Shivaji nagar pune", "Email Id entered");
        TestUtil.sendKeys(Add2, "Kondhva  near surya gympune", "Email Id entered");
        TestUtil.click(Submit, "Continue button click");
    }

    public void checkoutDownloadsFunctionality(){
        TestUtil.JsClick(Benefit_Illustration,"Clicked on download Benefit Illustration");

        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }
    public void downloadsFunctionalityPDP(){
        WebCommands.staticSleep(2000);
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.JsClick(BrochureDownload,"Clicked on Brochure Download");
        WebCommands.staticSleep(10000);
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
    }
    public void downloadsFunctionalityPDPtata(){
        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        WebCommands.staticSleep(10000);
//        Set<String> TabSwitch = driver.getWindowHandles();
//        Iterator<String> it=TabSwitch.iterator();
//        String p=it.next();
//        String c=it.next();

//        driver.switchTo().window(c);
//        driver.close();
//        WebCommands.staticSleep(2000);
//        driver.switchTo().window(p);
    }
    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        try{
        TestUtil.click(continu,"continye clicked");
        }
        catch (Exception e){
            TestUtil.click(Submit,"continye clicked");
        }
        WebCommands.staticSleep(10000);

        TestUtil.getScreenShot();
        }




    public void Submit_ProceedToBuy() {
        WebCommands.staticSleep(6000);
       TestUtil.click(submit,"submit button clicked");
        WebCommands.staticSleep(3000);
       TestUtil.click(ProceedToBuy,"Proceed To Buy clicked");

    }

    public void HdfcCheckOut(){
        TestUtil.sendKeys(lastname, "Test", "Name Entered");
        TestUtil.sendKeys(PlaceofBirth, "amerika","Place of Birth Entered");
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        TestUtil.click(single, "single clicked");
        TestUtil.sendKeys(FathersFirstName,"random","Father First Name entered");
        TestUtil.sendKeys(FathersLastName,"last","Father Last Name entered");
        TestUtil.sendKeys(MothersFirstName,"mother","Mothers First Name Entered");
        TestUtil.sendKeys(MothersLastName,"mother","Mothers Last Name Entered");
        TestUtil.click(JammuResidentNo,"Not a Jammu Resident Selected");
        TestUtil.click(OccupationDropDown,"Occupation Dropped Down");
        TestUtil.click(OccupationSalaried,"Salaried selected");
        TestUtil.click(QualificationDropDown,"Qualification Dropped Down");
        TestUtil.click(QualificationGraduate,"Graduate selected");
        TestUtil.sendKeys(PanNumber,"AWQER1233R","Pan Number Entered");
        TestUtil.sendKeys(mobilrNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(AadharAvailableCheckBox, "Aadhar Radio Button Yes Pressed");
        TestUtil.sendKeys(AadharNumber,"443211234321","Aadhar Number Entered");
        TestUtil.click(PoliticalExposedNo, "Not Politically Exposed");
        TestUtil.click(NoCriminalRecord, "No Criminal Record");
        TestUtil.click(PhysicallyDisabled, "No physically diabled Record");
        TestUtil.sendKeys(AddressLine1,"jkh","Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2,"jhkh","Address Line 2 Entered");
        TestUtil.click(PinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter,"400011","Pin Entered");
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
        TestUtil.sendKeys(nomineePlaceofBirth, "AbcD", "Nominee Place of Birth Entered");
        TestUtil.click(NomineeMaritalStatus,"Nominee Marital Status Dropped Down");
        TestUtil.click(NomineeSingle, "Single Selected");
        TestUtil.click(NomineeisMy,"Nominee is my drop down opened");
        TestUtil.click(Brother,"Brother Selected");
        TestUtil.sendKeys(nomineeFatherFname, "NFname","Nominee Father First Name");
        TestUtil.sendKeys(nomineeFatherLname,"NLname","Nominee Father Last Name");
        TestUtil.sendKeys(nomineeRegisteredAddress1,"random address","Registered Address 1");
        TestUtil.sendKeys(nomineeRegisteredAddress2,"random address2","Registered Address 2");
        TestUtil.click(NomineePinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(NomineePinCodeEnter,"400055","Pin Entered");
        TestUtil.click(NomineeMumbai,"Mumbai Maharashtra Selected");
        TestUtil.click(continu,"Final Continue Pressed");
    }

    public void TataSRSLifeProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("1992", "Aug", dateselect_5Aug);
        TestUtil.sendKeys(Pincode,"431517","Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        TestUtil.click(SelectOccupation, "SelectOccupation");
        TestUtil.click(Selfemployed, "Selfemployed");
        TestUtil.click(SelectEducationalQualification, "SelectEducationalQualification");
        TestUtil.click(Graduateandabove, "Graduateandabove");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(2000);
        leadpage.SaveLead(tl.NameGenerator());
        WebCommands.staticSleep(3000);

    }
    public void TataLifeResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        modifylow();
        TestUtil.clear(SumAssured,"clared sum assured");
        TestUtil.sendKeys(SumAssured,"15000000","Sum assured filled as 15000000");
        TestUtil.clear(PTSelection,"clared PTSelection");
        TestUtil.sendKeys(PTSelection,"20","PT selected as 20");
        TestUtil.clear(PPTSelection,"clared PPTSelection");
        TestUtil.sendKeys(PPTSelection,"15","PT selected as 15");
        TestUtil.click(AllInsurer,"clicked AllInsurer");
        TestUtil.JsClick(TATAInsurer,"clicked TATAInsurer");
        WebCommands.staticSleep(5000);
        TestUtil.click(TataAIA, "view button TataAIA click");
        GetPaymentLinkCTA();
        TestUtil.getFullPageScreenShot();
//        TestUtil.click(clickDownloads,"Clicked Download on PDP Page");
//        TestUtil.click(BrochureDownload,"Clicked on Brochure Download");
        downloadsFunctionalityPDPtata();
        WebCommands.staticSleep(10000);
        js.executeScript("arguments[0].click();", buyNowButton);
        checkoutDownloadsFunctionality();

       // checkoutDownloadsFunctionality();

        String parent = driver.getWindowHandle();
       //TestUtil.click(buyNowButton, "buy Now Button click");
        WebCommands.staticSleep(6000);
        TestUtil.waitElementToBeClickable(Benefit_Illustration);


        WebCommands.staticSleep(1000);
        driver.switchTo().window(parent);


    }

    public void BajajSmartProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("female");
        smoke_chewTobaco("no");
        datepicker("1985", "Dec", dateselect_1Dec);
        TestUtil.sendKeys(Pincode,"431517","Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(1000);
        TestUtil.click(SelectOccupation, "SelectOccupation");
        TestUtil.click(Selfemployed, "Selfemployed");
        TestUtil.click(SelectEducationalQualification, "SelectEducationalQualification");
        TestUtil.click(Graduateandabove, "Graduateandabove");
        TestUtil.click(approxAmount, "");
        TestUtil.click(Amount_7to10lac, "7 to 10 lac amount select");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_1_5Crs, "sum assured amt 1.5 Crs Selected");
        WebCommands.staticSleep(1000);
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(2000);
        LeadName = tl.NameGenerator();
        leadpage.SaveLead(LeadName);
        System.out.println("lead name is =="+LeadName);
    }
    public void LeadCheck() throws InterruptedException, IOException {
        driver.get(System.getProperty("url")); //for jenkins
      // driver.get(prop.getProperty("localurl"));
        TestUtil.JsClick(Leads,"Clicked on leads");
         System.out.println("lead name is =="+LeadName);
        WebElement LeadNamee = driver.findElement(By.xpath("//h3[text()='"+LeadName+"test"+"']"));
        TestUtil.waitElementToBeClickable(LeadNamee);
        TestUtil.JsClick(LeadNamee,"Clicked on leads");
        TestUtil.JsClick(Proposal,"Clicked on Proposal");
        Thread.sleep(3000);
        TestUtil.JsClick(Proceedtopayment,"Clicked on Proceed to payment");

        Thread.sleep(3000);
        TestUtil.getFullPageScreenShot();


    }
    public void BajajSmartResultPage() throws InterruptedException, IOException {

        leadpage.GotItButton();
        TestUtil.click(SumAssured,"clicked assured selected");
        TestUtil.click(sumAssured1cr,"1cr sum assured selected");
        TestUtil.clear(PTSelection,"clared PTSelection");
        WebCommands.staticSleep(1000);
        TestUtil.sendKeys(PTSelection,"45","PT selected as 45");
        TestUtil.JsClick(PPTSelection,"Clicked PT");
        TestUtil.click(coverAgeUpto_80,"selected cover age up to as 80yrs");
        TestUtil.JsClick(paymentFrequency,"Clicked on payment frequency");
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(halfYearly,"Half yearly selected");
      TestUtil.waitElementToBeClickable(BajajAllianz);
        TestUtil.JsClick(BajajAllianz,"Bajaj plan selected");
        GetPaymentLinkCTA();
      TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", buyNowButton);
        WebCommands.staticSleep(5000);
        //checkoutDownloadsFunctionality();
    }

    public void IcicProfile() throws InterruptedException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("2002", "Dec", dateselect_1dec2002);
        TestUtil.sendKeys(Pincode,"431517","Pincode Entered");
        WebCommands.staticSleep(2000);
        TestUtil.click(next, "next button click");
        WebCommands.staticSleep(1000);
        TestUtil.click(approxAmount, "");
        TestUtil.click(Amount_10lacto15lac, "10 to 15 lac amount select");
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_1_25Crs, "sum assured amt 1.25 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }
    public void IcicResult() throws InterruptedException, IOException {

        leadpage.GotItButton();
        modifylow();
        TestUtil.JsClick(ICIC_ismart, "view button TataAIA click");
        GetPaymentLinkCTA();
        TestUtil.getFullPageScreenShot();
//        TestUtil.click(buyNowButton, "buy Now Button click");
//        checkout();
//        checkmarks();
//        WebCommands.staticSleep(10000);
//        TestUtil.getScreenShot();
    }
    public void MaxlifeProfilePage() throws InterruptedException, IOException {
        GenderButtonClick("male");
        smoke_chewTobaco("yes");
        datepicker("2000", "Jan", dateselect_1jan2000);
        TestUtil.click(next, "next button click");
        TestUtil.waitUntilVisibilityOfElement(sumassuredamt);
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_3Crs, "sum assured amt 1.25 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());

    }
    public void MaxlifeResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        modifylow();
        WebCommands.staticSleep(5000);
        TestUtil.waitUntilElementToBeVisible(By.xpath("//div[text()='Certified']"));
        TestUtil.click(MaxRider,"rider selected");
        TestUtil.waitUntilElementToBeVisible(By.xpath("//div[text()='IRDA']"));
        WebCommands.staticSleep(3000);
        TestUtil.JsClick(Maxlife_smartSecure, "view button maxlife click");
        TestUtil.getFullPageScreenShot();
//      TestUtil.click(buyNowButton, "buy Now Button click");
//        checkout();
//        checkmarks();
//        WebCommands.staticSleep(10000);
//        TestUtil.getScreenShot();
    }

    public void HdfcClick_2ProfilePage() throws InterruptedException {
        GenderButtonClick("female");
        smoke_chewTobaco("yes");
        datepicker("1996", "Oct", dateselect_15joct1996);
        TestUtil.click(next, "next button click");
        TestUtil.click(sumassuredamt, "");
        TestUtil.click(sumassuredamt_3_05Crs, "sum assured amt 3.05 Crs Selected");
        TestUtil.click(next, "next button click");
        leadpage.SaveLead(tl.NameGenerator());
    }
    public void HdfcClick_2ResultPage() throws InterruptedException, IOException {
        leadpage.GotItButton();
        WebCommands.staticSleep(10000);

        if(HdfcClick2_protectLife.isDisplayed()) {
            System.out.println("if code ran");
            TestUtil.click(HdfcClick2_protectLife, "Hdfc Sanchay Plan Selected");

        }
        else{
            System.out.println("else code ran");
            WebCommands.staticSleep(3000);
            TestUtil.click(maturityAge,"");
            WebCommands.staticSleep(1000);
            TestUtil.click(maturityAge_65Yr,"Maturity Age 65 is selected");
            WebCommands.staticSleep(10000);
            TestUtil.click(HdfcClick2_protectLife, "Hdfc Sanchay Plan Selected");
        }

        TestUtil.getFullPageScreenShot();
        downloadsFunctionalityPDP();
        js.executeScript("arguments[0].click();", buyNowButton);
        checkoutDownloadsFunctionality();
    }

    public static ArrayList<String> l =new ArrayList<String>();
    static ninja ninj= new ninja();
    public void AddID(String UID)
    {
        l.add(UID);
    }
public void GetID() throws Exception {
    System.out.println("Number of order ID=  " + l.size());

    for (int i = 0; i < l.size(); i++) {
        if(l.size()==0)
        {
            System.out.println(" NO Entry created in Ninja");
        }
else {
            try {
                System.out.println("Id for Ninja Canclation  " + l.get(i));
                driver.get("https://ninja.turtlemint.com/login");
                ninj.cancelpolicyThroughNinja(l.get(i));
                System.out.println("Ninja Cancle Policy Flow Completed for ID= " + l.get(i));
            } catch (Exception e) {
                System.out.println("Unable to cancle Policy  ID= " + l.get(i));
            }
        }

    }

//    Iterator x = l.iterator();
//    while (x.hasNext()) {
//        System.out.println("Ids for Ninja Canclation  " + x.next());
//
//        String str2 = String.valueOf(x.next());
//         ninj.cancelpolicyThroughNinja(str2);
//        System.out.println("first flow completed");

    }

//
//    Email verification functionality
//    @FindBy(xpath = "//input[@type=\"email\"]")
//    WebElement Email;
//    @FindBy(xpath = "//input[@type=\'password\']")
//    WebElement Password;
//    @FindBy(xpath = "//span[text()='Next']")
//    WebElement Next;
//    @FindBy(xpath = "//input[@aria-label='Search mail']")
//    WebElement SearchBar;  //div[text()='Inbox']
//    @FindBy(xpath = "//div[text()='Inbox']")
//    WebElement InboxElement;
//
//    public void EmailVerification(String UID) throws IOException {   WebCommands.staticSleep(2000);
//        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7XB1dmDAi8xfUtymSqVBIp3qpxKmwGrMinO5oATK6hCWY5PGnSNOlICJlzYJRM2vpI2N1Hm&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S872444052%3A1691047664104909#inbox");
//        WebCommands.staticSleep(2000);
//        TestUtil.sendKeys(Email,"T9127198@gmail.com","Email Entered");
//        TestUtil.click(Next,"Clicked on Next");
//        TestUtil.sendKeys(Password,"T9127198@test", "Password Entered");
//        TestUtil.click(Next,"Clicked on Next");
//        TestUtil.waitElementToBeClickable(SearchBar);
//        SearchBar.sendKeys(UID, Keys.ENTER);
//        WebCommands.staticSleep(4000);
//        TestUtil.waitElementToBeClickable(InboxElement);
//        TestUtil.click(InboxElement,"Inbox element clicked");
//        WebCommands.staticSleep(4000);
//        TestUtil.getFullPageScreenShot();
//    }


}