package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static com.qa.turtlemint.base.TestBase.driver;

public class FlipCartPages{

    public FlipCartPages (WebDriver driver)
    {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@placeholder='Mobile']")
    public WebElement Mobile;
    @FindBy(xpath = "//button[.='Initiate KYC']")
    WebElement InitiateKYC;


    @FindBy(xpath = "//input[@id='kyc-form_dob']")
    WebElement DOB;
    @FindBy(xpath = "//button[@class='ant-picker-year-btn']")
    WebElement Year;
    @FindBy(xpath = "//div[.='2020']")
    WebElement Year2020;
    @FindBy(xpath = "//div[.='15']")
    WebElement Date15th;

    @FindBy(xpath = "//input[@id='kyc-form_pan']")
    WebElement PAN;
    @FindBy(xpath = "//input[@id='kyc-form_name']")
    WebElement Name;
    @FindBy(xpath = "//span[.='Continue']")
    WebElement Continue;



    @FindBy(xpath = "//span[.='Select one...']")
    WebElement Title;
    @FindBy(xpath = "//span[.='Ms']")
    WebElement Ms;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastName;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement Email;
    @FindBy(xpath = "//input[@placeholder='Father / Mother / Spouse name']")
    WebElement Spouse;
    @FindBy(xpath = "//label[.='Relationship Type *']/..//span")
    WebElement RelationshipType;
    @FindBy(xpath = "//span[.='Mother']")
    WebElement Mother;

    @FindBy(xpath = "//input[@placeholder='Engine Number(Petrol Vehicle) / Motor Number(EV)']")
    WebElement EngineNumber;
    @FindBy(xpath = "//input[@placeholder='Chassis Number / VIN']")
    WebElement ChassisNumber;
    @FindBy(xpath = "//input[@placeholder='Date in DD/MM/YYYY format']")
    WebElement PolicyStartDate;
    @FindBy(xpath = "//div[text()='17']")
    WebElement SelectedDate17;
    @FindBy(xpath = "//button[.='Checkout']")
    WebElement Checkout;


public void intitialte(){
    TestUtil.click(Mobile,"Clicked on Mobile");
    TestUtil.sendKeys(Mobile,"7758052054","Filled mobile Number");
    TestUtil.click(InitiateKYC,"Clicked on InitiateKYC");
}

public void kYC(){
    TestUtil.click(DOB,"Clicked on DOB");
    TestUtil.click(Year,"Clicked on Year");
    TestUtil.click(Year2020,"Clicked on Year2020");
    TestUtil.click(Date15th,"Clicked on Date15th");
    TestUtil.sendKeys(PAN,"AREPS1913A","Filled PAN numver");
    TestUtil.sendKeys(Name,"Shrinivas","Filled PAN Name");
    TestUtil.click(Continue,"Clicked on Continue");
}
public void personalDetails(){
    TestUtil.click(Title,"Clicked on Title");
    TestUtil.click(Ms,"Clicked on Ms");
    TestUtil.sendKeys(FirstName,"Shrinivas","Filled firstname as Shrinivas");
    TestUtil.sendKeys(LastName,"Londhe","Filled Lastname as Londhe");
    TestUtil.sendKeys(Email,"Shreedlondhe@gmail.com","Filled Email as Shreedlondhe@gmail.com");
    TestUtil.sendKeys(Spouse,"Spouse","Filled Spouse name as Spouse");
    TestUtil.click(RelationshipType,"Clicked on RelationshipType");
    TestUtil.click(Mother,"Clicked on Mother");
}

public void vehicleDetails(){
    TestUtil.sendKeys(EngineNumber,"PJ12345U123456P","Filled EngineNumber Number");
    TestUtil.sendKeys(ChassisNumber,"1HGCM82633A123456","Filled ChassisNumber");
    TestUtil.click(PolicyStartDate,"Clicked on PolicyStartDate");
    TestUtil.click(SelectedDate17,"Clicked on SelectedDate17");
    TestUtil.click(Checkout,"Clicked on Checkout");
    }


}
