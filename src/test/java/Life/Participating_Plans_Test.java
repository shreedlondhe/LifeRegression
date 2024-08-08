package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;
@Listeners(iTestListener.class)
@Test(groups = {"Participating_Plans_Test","Life_Full"})
public class Participating_Plans_Test extends TestBase{
    public Participating_Plans_Test() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Profile_page pp;
    LeadNamePage leadpage;
    TestUtil tl;
    InvestmentResultPage ivrp;
    InvestmentCheckoutPage ivcp;
    ninja ninj;
    ChildSavingUlipPlan csup;

    @BeforeMethod()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        pp = new Profile_page();
        leadpage = new LeadNamePage();
        tl = new TestUtil();
        ivrp = new InvestmentResultPage();
        ivcp = new InvestmentCheckoutPage();
        ninj = new ninja();
        csup = new ChildSavingUlipPlan();

        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.Investment();
    }

//   // @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void BacktoHome() throws InterruptedException, IOException {
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ParticipatingPlans();
//        pp.GenderButtonClick("male");
//        pp.profilePageForTataFortuneGuaranteePlus();
//        leadpage.SaveLead(tl.NameGenerator());
//        leadpage.GotItButton();
//        ivrp.TataFortuneGuaranteePlan();
//        ivcp.backToHomeFunctionality();
//    }
//




  //  @Test(enabled = true)
//    public void ICICISavingsSurakshaRegular() throws InterruptedException, IOException { //Buy Now is Grayed Out
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ParticipatingPlans();
//        pp.GenderButtonClick("male");
//        pp.profilePageForICICI();
//        leadpage.GotItButton();
//        ivrp.IciciPrudentialPlan();
////        ivcp.checkoutDownloadsFunctionality();
////        ivcp.checkout();
////        ivcp.checkmarks();
//        LogUtils.info("Saving suraksha is displayed flow Completed");
//    }
//   // @Test(enabled = true)
//    public void ICICISavingsSurakshaLimited() throws InterruptedException, IOException { //Buy Now is Grayed Out
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ParticipatingPlans();
//        pp.GenderButtonClick("male");
//        pp.profilePageForICICI();
//        leadpage.GotItButton();
//        ivrp.IciciPrudentialPlanlimited();
////        ivcp.checkoutDownloadsFunctionality();
////        ivcp.checkout();
////        ivcp.checkmarks();
//        LogUtils.info("Saving suraksha is displayed flow Completed");
//    }
//   // @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void ICICISavingsSurakshaCashAdvantage() throws InterruptedException, IOException { //Buy Now is Grayed Out
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ParticipatingPlans();
//        pp.GenderButtonClick("male");
//        pp.profilePageForICICI();
//        leadpage.GotItButton();
//        ivrp.IciciPrudentialPCashAdvantage();
////        ivcp.checkoutDownloadsFunctionality();
////        ivcp.checkout();
////        ivcp.checkmarks();
//        LogUtils.info("Saving suraksha is displayed flow Completed");
//    }


//    @Test(enabled = true, retryAnalyzer = RetryAnalyser.class)
//    public void BalicPOSGoalSuraksha() throws Exception {
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.ParticipatingPlans();
//        pp.GenderButtonClick("male");
//        pp.profilePageForBALICPOS();
//        leadpage.SaveLead(tl.NameGenerator());
//        leadpage.GotItButton();
//        String uID=csup.getUniqueID();
//        ivrp.BalicPOS();
//        ivcp.checkoutDownloadsFunctionality();
//        ivcp.checkout();
//        ivcp.checkmarks();
//        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h4[text()='Bajaj Allianz Life POS Goal Suraksha']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h4[text()='Bajaj Allianz Life POS Goal Suraksha']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
//        LogUtils.info("Checkout flow Completed");
//    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void LICNewJeevanAnand() throws InterruptedException, IOException { // Buy Now is Grayed Out
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ParticipatingPlans();
        pp.GenderButtonClick("male");
        pp.profilePageForLicNewJeevan("no");
        leadpage.GotItButton();
        TestUtil.getFullPageScreenShot();
        ivrp.LicNewJeevanPlan();
//        ivcp.checkoutDownloadsFunctionality();
//        ivcp.checkoutDownloadsFunctionality();
//        ivcp.checkout();
//        ivcp.checkmarks();
        LogUtils.info("Checkout flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void LICJeevanLakhsya() throws InterruptedException, IOException { // Buy Now is Grayed Out
       //
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ParticipatingPlans();
        pp.GenderButtonClick("male");
        pp.profilePageForLicJeevanLakshya("no");
        leadpage.GotItButton();
        TestUtil.getFullPageScreenShot();
        ivrp.LicJeevanLakshyaPlan();
//        ivcp.checkoutDownloadsFunctionality();
//        ivcp.checkout();
//        ivcp.checkmarks();
        LogUtils.info("Checkout flow Completed");
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }

}
