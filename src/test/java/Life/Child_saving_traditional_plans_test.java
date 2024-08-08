package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.ChildSavingUlipPlan;
import com.qa.turtlemint.pages.life.Child_Saving_traditional_Plans_Page;
import com.qa.turtlemint.pages.life.LifeLandingPage;
import com.qa.turtlemint.pages.life.LifePage;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"Child_Saving_Page_Test", "Life_Full"})
public class Child_saving_traditional_plans_test extends TestBase {
    public Child_saving_traditional_plans_test() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Child_Saving_traditional_Plans_Page pp;
    ninja ninj;
    ChildSavingUlipPlan csup;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        pp = new Child_Saving_traditional_Plans_Page();
        ninj = new ninja();
        csup = new ChildSavingUlipPlan();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
       gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ChildSaving();
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TATA_AIA_Fortune_Guarantee() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ChildSaving();
        pp.tell_us_about_the_Insured();
        pp.Select_the_Sum_Assured_Amount("60000");
        pp.Save_your_quote_now("shree");
        String uID=csup.getUniqueID();
        pp.gotIt();
        pp.check_Edit_functionality(); //share plan pending
        pp.viewdetailstata(); //share plan pending
        pp.seeallplanstata();
        pp.downloadsFunctionalityPDPTATA();
        pp.BuyNow();
        pp.checkoutDownloadsFunctionalityOfLife();
        pp.checkoutPage();
       // pp.submitandProceed();
        WebCommands.staticSleep(2000);
        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//p[text()='ashish xyz']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//p[text()='ashish xyz']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
      //  ninj.cancelpolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");
    }

   // @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void ICICI_Savings_Suraksha_Limited_Pay() throws InterruptedException {
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ChildSaving();
//        pp.tell_us_about_the_Insured_ICICI();
//        pp.Select_the_Sum_Assured_Amount_modify("70000");
//        pp.Save_your_quote_now("shree");
//        pp.gotIt();
//        pp.viewdetailsicici(); //share plan pending
//        pp.DownloadBI();
//        pp.seeallplansicici();
//        pp.downloadsFunctionalityPDPICICI();
//        LogUtils.info("Checkout flow Completed");
//
//    }

//       @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//       public void ICICI_GIFTLT() throws InterruptedException {
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ChildSaving();
//        pp.tell_us_about_the_Insured_ICICI();
//           pp.Select_the_Sum_Assured_Amount_modify("70000");
//        pp.Save_your_quote_now("shree");
//        pp.gotIt();
//        pp.viewdetailsiciciGiftLt();
//           pp.DownloadBI();
//        pp.seeallplansiciciGiftLt();
//        pp.downloadsFunctionalityPDPICICI();
//        LogUtils.info("Checkout flow Completed");
//
//    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}