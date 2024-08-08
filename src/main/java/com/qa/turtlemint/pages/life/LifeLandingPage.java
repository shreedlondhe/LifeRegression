package com.qa.turtlemint.pages.life;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

import static com.qa.turtlemint.base.TestBase.driver;

public class LifeLandingPage {
    public LifeLandingPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Term Insurance']")
    WebElement termLifeButton;

    @FindBy(xpath = "//p[text()='Child Saving']")
    WebElement childSavingButton;

    @FindBy(xpath = "//p[text()='Retirement']")
    WebElement retirementButton;

    @FindBy(xpath = "//p[text()='Guaranteed Returns']")
    WebElement GuaranteedReturns;

    @FindBy(xpath = "//p[text()='ULIP']")
    WebElement ULIP;

    @FindBy(xpath = "//p[text()='Participating Plans']")
    WebElement ParticipatingPlans;

    @FindBy(xpath = "//div[text()='PoS Product']//parent::div")
    WebElement posProductButton;

    @FindBy(xpath = "//span[text()='See more plans']")
    WebElement SeemorePlan;
    @FindBy(xpath = "//p[text()='Quotes & BI']")
    WebElement QuotesAndBI;

    @FindBy(xpath = "//p[text()='Top Selling Plans']")
    WebElement TopSellingPlans;
    @FindBy(xpath = "//span[text()='TERM']")
    WebElement TopSellingPlansValidation1;
    @FindBy(xpath = "//span[text()='TRADITIONAL']")
    WebElement TopSellingPlansValidation2;
    @FindBy(xpath = "//span[text()='ULIP']")
    WebElement TopSellingPlansValidation3;
    @FindBy(xpath = "//span[text()='View Details']")
    WebElement TopSellingPlansValidation4;

    @FindBy(xpath = "//p[text()='Financial Planner']")
    WebElement CompleteFinancialPlanner;
    @FindBy(xpath = "//span[text()='Male']")
    WebElement CompleteFinancialPlannerValidation;

    @FindBy(xpath = "//p[text()='Goal Calculators']")
    WebElement GoalCalculators;
    @FindBy(xpath = "//div[text()='Child’s Higher Education']")
    WebElement GoalCalculatorsValidation;

    @FindBy(xpath = "//p[text()='Share Content']")
    WebElement ShareContent;
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement ShareContentValidation;

    @FindBy(xpath = "//p[text()='Share Plan Brochures']")
    WebElement SharePlanBrochures;
    @FindBy(xpath = "//span[text()='AEGON Life']")
    WebElement SharePlanBrochuresValidation1;
    @FindBy(xpath = "//span[text()='Life']")
    WebElement SharePlanBrochuresValidation2;

    @FindBy(xpath = "//p[text()='Product Gallery']")
    WebElement ProductGallery;
    @FindBy(xpath = "//span[text()='Plans']")
    WebElement ProductGalleryValidation;

    @FindBy(xpath = "//p[text()='Product Trainings']")
    WebElement ProductTrainings;
    @FindBy(xpath = "//span[text()='Selected Courses']")
    WebElement ProductTrainingsValidation;

    @FindBy(xpath = "//span[text()='My Renewals']")
    WebElement MyRenewals;
    @FindBy(xpath = "//span[text()='Renew Now']")
    WebElement MyRenewalsValidation;

    @FindBy(xpath = "//span[text()='My Business']")
    WebElement MyBusiness;
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement MyBusinessValidation;

    @FindBy(xpath = "//span[text()='Claims']")
    WebElement Claims;
    @FindBy(xpath = "//button[text()='Search']")
    WebElement ClaimsValidation;

    @FindBy(xpath = "//span[text()='See more plans']")
    WebElement Seemoreplans;


    public void TermLifeClick() throws InterruptedException {
        WebCommands.staticSleep(2000);
        TestUtil.JsClick(termLifeButton, "Clicked on Term Life Option");


    }
    public void ULIP() throws InterruptedException {

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ULIP, "Clicked on Term Life Option");


    }
    public void GuaranteedReturns() throws InterruptedException {

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(GuaranteedReturns, "Clicked on Term Life Option");


    }
    public void ParticipatingPlans() throws InterruptedException {

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(ParticipatingPlans, "Clicked on Term Life Option");


    }

    public void ChildSaving() {

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(childSavingButton, "Clicked on Child Saving Option");
    }

    public void Retirement() {

        WebCommands.staticSleep(2000);
        TestUtil.JsClick(retirementButton, "Clicked on Retirement Option");
    }

    public void PoSProduct() {

        WebCommands.staticSleep(2000);
        TestUtil.click(posProductButton, "Clicked on POS Product Option");
    }

    public void SeeMorePlans() {TestUtil.waitUntilVisibilityOfElement(QuotesAndBI);

        WebCommands.staticSleep(2000);
        TestUtil.click(SeemorePlan, "Clicked on POS Product Option");
    }

     public void TopSellingPlans() throws IOException {
         TestUtil.click(TopSellingPlans,"clicked on TopSellingPlans");
         WebCommands.staticSleep(3000);
         TestUtil.getFullPageScreenShot();
         Assert.assertEquals(TopSellingPlansValidation1.isDisplayed(),true);
         Assert.assertEquals(TopSellingPlansValidation2.isDisplayed(),true);
         Assert.assertEquals(TopSellingPlansValidation3.isDisplayed(),true);
         Assert.assertEquals(TopSellingPlansValidation4.isDisplayed(),true);
     }
    public void CompleteFinancialPlanner() throws IOException {
        TestUtil.click(CompleteFinancialPlanner,"clicked on CompleteFinancialPlanner");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(CompleteFinancialPlannerValidation.isDisplayed(),true);
    }
    public void GoalCalculators() throws IOException {
        TestUtil.click(GoalCalculators,"clicked on GoalCalculators");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(GoalCalculatorsValidation.isDisplayed(),true);

    }
    public void ShareContent() throws IOException {
        TestUtil.click(ShareContent,"clicked on ShareContent");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(ShareContentValidation.isDisplayed(),true);
    }
    public void SharePlanBrochures() throws IOException {
        TestUtil.click(SharePlanBrochures,"clicked on SharePlanBrochures");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(SharePlanBrochuresValidation1.isDisplayed(),true);
        Assert.assertEquals(SharePlanBrochuresValidation2.isDisplayed(),true);

    }
    public void ProductGallery() throws IOException {
        TestUtil.click(ProductGallery,"clicked on ProductGallery");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(ProductGalleryValidation.isDisplayed(),true);
    }
    public void ProductTrainings() throws IOException {
        TestUtil.click(ProductTrainings,"clicked on ProductGallery");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(ProductTrainingsValidation.isDisplayed(),true);
    }
    public void MyRenewals() throws IOException {
        TestUtil.click(MyRenewals,"clicked on ProductGallery");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(MyRenewalsValidation.isDisplayed(),true);
    }
    public void MyBusiness() throws IOException {
        TestUtil.click(MyBusiness,"clicked on ProductGallery");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(MyBusinessValidation.isDisplayed(),true);
    }
    public void Claims() throws IOException {
        TestUtil.click(Claims,"clicked on ProductGallery");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(ClaimsValidation.isDisplayed(),true);
    }
    public void Seemoreplans() throws IOException {
        TestUtil.click(Seemoreplans,"clicked on TopSellingPlans");
        WebCommands.staticSleep(3000);
        TestUtil.getFullPageScreenShot();
        Assert.assertEquals(TopSellingPlansValidation1.isDisplayed(),true);
        Assert.assertEquals(TopSellingPlansValidation2.isDisplayed(),true);
        Assert.assertEquals(TopSellingPlansValidation3.isDisplayed(),true);
        Assert.assertEquals(TopSellingPlansValidation4.isDisplayed(),true);
    }

}