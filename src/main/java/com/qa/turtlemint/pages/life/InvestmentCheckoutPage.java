package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InvestmentCheckoutPage extends TestBase {

    public InvestmentCheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "insuredMemberLName")
    WebElement lastname;

    @FindBy(id = "insuredMemberMobile")
    WebElement mobileNo;

    @FindBy(id = "insuredMemberEmail")
    WebElement emailId;

    @FindBy(id = "insuredMemberMaritalStatus-uiSelect")
    WebElement maritalstatusDropdown;

    @FindBy(xpath = "//span[text()='Married']")
    WebElement married;

    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress1\"]")
    WebElement Addressline1;
    @FindBy(xpath = "//input[@id=\"insuredMemberRegisteredAddress2\"]")
    WebElement Addresslin2;
    @FindBy(xpath = "//span[text()='Enter 6 digit Pincode']")
    WebElement Clikckpin;
    @FindBy(xpath = "(//input[@placeholder=\"Enter 6 digit Pincode\"])[1]")
    WebElement Pincode;
    @FindBy(xpath = "//span[text()='Mumbai  North West, MAHARASHTRA']")
    WebElement Munbai;

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
    @FindBy(xpath = "//span[@class='checkmark']//parent::span//parent::label")
    WebElement Checkmark;
    @FindBy(xpath = "//button[text()='Submit and Proceed']")
    WebElement SubmitandProceed;
    @FindBy(xpath = "//span[text()='Pay Premium']")
    WebElement PayPremium;


    public void checkout() {
        TestUtil.click(lastname,"last name clicked");
        TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
        TestUtil.click(married, "married click");
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.click(Clikckpin,"Clikced pincode");
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Pincode,"400065","Entering pincode");
        TestUtil.click(Munbai,"Clikced Area..");
        WebCommands.staticSleep(2000);
        TestUtil.click(continu, "Continue button click");
    }
    public void checkout_investment_new() {
        //TestUtil.sendKeys(lastname, "test", "last name entered");
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
//        TestUtil.click(maritalstatusDropdown, "Marital Status dropped down");
//        TestUtil.click(married, "married click");
        WebCommands.staticSleep(3000);
        TestUtil.sendKeys(Addressline1,"Auromation test","Entering address line 1");
        TestUtil.sendKeys(Addresslin2,"Automation test","entering address line 2");
        TestUtil.JsClick(Clikckpin,"Clikced pincode");
        TestUtil.getScreenShot();
        WebCommands.staticSleep(2000);
        TestUtil.sendKeys(Pincode,"400065","Entering pincode");
        TestUtil.click(Munbai,"Clikced Area..");
        WebCommands.staticSleep(1000);
        TestUtil.JsClick(Checkmark,"CLIKCED MARK");
        TestUtil.getScreenShot();
        TestUtil.click(SubmitandProceed,"clicked on continue");
        WebCommands.staticSleep(7000);
    }

    public void checkmarks() {
        WebCommands.staticSleep(3000);
        List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int size = AllCheckboxes.size();
        for (int i = 0; i < size; i++) {
            WebCommands.staticSleep(2000);
            AllCheckboxes.get(i).click();
        }
        TestUtil.click(continu,"Final continue clicked");
        WebCommands.staticSleep(8000);
        TestUtil.getScreenShot();
        TestUtil.waitElementToBeClickable(PayPremium);
        TestUtil.click(PayPremium,"clicked on pay premium");
    }

    public void checkoutDownloadsFunctionality(){
        WebCommands.staticSleep(8000);
        TestUtil.JsClick(Benefit_Illustration,"Clicked on download Benefit Illustration");
        WebCommands.staticSleep(4000);
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);

    }

    public void checkoutDownloadsFunctionalityTATAINVESTMENT(){
        TestUtil.click(Benefit_Illustration,"Clicked on download Benefit Illustration");
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
        TestUtil.JsClick(Benefit_Illustration, "Clicked on download Benefit Illustration");
        WebCommands.staticSleep(4000);
    }

    public void backToHomeFunctionality(){
        TestUtil.click(Back_to_Home,"Back to Home button pressed");
        WebCommands.staticSleep(1000);
        TestUtil.click(Back_to_Home_Confirmation,"Clicked on confirm Back to Home");
        WebCommands.staticSleep(4000);
        String actual_text = AssertingString.getText();
        Assert.assertEquals(actual_text,"Today");
    }

    public void windowSwitch(){
        Set<String> TabSwitch = driver.getWindowHandles();
        Iterator<String> it=TabSwitch.iterator();
        String p=it.next();
        String c=it.next();

        driver.switchTo().window(c);
        driver.close();
        WebCommands.staticSleep(2000);
        driver.switchTo().window(p);
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
        TestUtil.sendKeys(mobileNo, "6888812345", "Mobile No entered");
        TestUtil.sendKeys(emailId, "automationtesting@turtlemint.com", "Email Id entered");
        TestUtil.click(AadharAvailableCheckBox, "Aadhar Radio Button Yes Pressed");
        TestUtil.sendKeys(AadharNumber,"443211234321","Aadhar Number Entered");
        TestUtil.click(PoliticalExposedNo, "Not Politically Exposed");
        TestUtil.click(NoCriminalRecord, "No Criminal Record");
        TestUtil.sendKeys(AddressLine1,"jkh","Address Line 1 Entered");
        TestUtil.sendKeys(AddressLine2,"jhkh","Address Line 2 Entered");
        TestUtil.click(PinCodeClick,"PinCode Clicked");
        TestUtil.sendKeys(PinCodeEnter,"400055","Pin Entered");
        TestUtil.click(MumbaiSelect,"Mumbai Maharashtra Selected");
        TestUtil.click(SameAsRegisteredCheckBox,"Same as Registered Address Clicked");
        TestUtil.click(continu,"Continue Press after filling details");
        try{TestUtil.click(Question1,"Question 1 Answered");}
        catch (Exception e){TestUtil.click(Question1,"Question 1 Answered");}
        TestUtil.click(Question2,"Question 2 Answered");
        TestUtil.click(Question3,"Question 3 Answered");
        TestUtil.click(Question4,"Question 4 Answered");
        TestUtil.click(Question5,"Question 5 Answered");
        TestUtil.click(Question6,"Question 6 Answered");
        TestUtil.sendKeys(IdentificationMark,"dfsees","Identification Mark Entered");
        TestUtil.sendKeys(GrossIncome,"1111111","Gross Income Added");
        TestUtil.sendKeys(NameofPresentEmployer,"Turtlemint","Present Employer Name Added");
        TestUtil.sendKeys(BldgNameOffice,"Bay99","Office Bldg Name Entered");
        TestUtil.sendKeys(CityofWork,"123 Main Street","Address Entered");
        TestUtil.click(IndustryTypeDropDown,"Industry Type Dropped Down");
        TestUtil.click(NoneOfThese,"None Of These Selected");
        WebCommands.staticSleep(3000);
        TestUtil.click(DesignationDropDown,"Designation Dropped Down");
        TestUtil.click(DesignationSelect,"Senior Manager Selected");
        TestUtil.click(IndustrySelectDropDown,"Department Dropped Down");
        TestUtil.click(EngineeringSelect,"Engineering Selected");
        TestUtil.click(OccupationDetailsDropDown,"Present Occupation Details Dropped Down");
        TestUtil.click(SalariedSelect,"Salaried Selected");
        TestUtil.click(continu,"continue clicked");
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

}

