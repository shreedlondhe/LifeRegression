
package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;
import java.util.Set;

@Listeners(iTestListener.class)
@Test(groups = {"Share_Plan_Test", "Life_Full"})
public class Life_SharePlan_Test extends TestBase {

    public Life_SharePlan_Test() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Term_Life_plan tlp;
    TermLifeForSharePlanPage tlspp;
    SumAssuredPage sap;
    LifeSharePlanPDPPage lspdp;
    LeadNamePage leadpage;
    TestUtil tl;
    Investment_Ulip_Plan Iup;
    Profile_page Profile_page;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        tl = new TestUtil();
        llp = new LifeLandingPage();
        tlp = new Term_Life_plan();
        tlspp = new TermLifeForSharePlanPage();
        sap = new SumAssuredPage();
        leadpage = new LeadNamePage();
        lspdp = new LifeSharePlanPDPPage();
        Iup = new Investment_Ulip_Plan();
        Profile_page=new Profile_page();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TermLifeSharePlan() throws InterruptedException, IOException { /// Bajaj

        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlspp.GenderButtonClick("male");
        tlspp.smoke_chewTobaco("yes");
        tlspp.datepicker();
        sap.SumAssured();
        tl.NameGenerator();
        leadpage.SaveLead(tl.NameGenerator());
        leadpage.GotItButton();
        tlspp.SharePlan();
        LogUtils.info("Share Page Flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TermLifeSharePlanPDPageTataAIA() throws InterruptedException, IOException { //Tata AIA
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlspp.GenderButtonClick("male");
        tlspp.smoke_chewTobaco("yes");
        tlspp.datepicker();
        sap.SumAssured();
        tl.NameGenerator();
        leadpage.SaveLead(tl.NameGenerator());
        leadpage.GotItButton();
        lspdp.SharePlanFromPDPPageTataAIA("P85");
        LogUtils.info("Share Page Flow Completed");
    }



//    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void TermLifeSharePlanPDPageMaxLife() throws InterruptedException, IOException { // Max Life
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
//        tlspp.GenderButtonClick("male");
//        tlspp.smoke_chewTobaco("yes");
//        tlspp.datepicker();
//        sap.SumAssured();
//        tl.NameGenerator();
//        leadpage.SaveLead(tl.NameGenerator());
//        leadpage.GotItButton();
//        lspdp.SharePlanFromPDPPageMAxLife("viewdetail-MAXLIFELI-Smart Secure Plus");
//        LogUtils.info("Share Page Flow Completed");
//    }

//    @Test()
//    public void TermLifeSharePlanPDPageICIC() throws InterruptedException, IOException { // icic
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
//        tlp.TataSRSLifeProfilePage();
//        leadpage.GotItButton();
//        lspdp.SharePlanFromPDPPageMAxLife("viewdetail-ICICIPRULI-iProtect Smart");
//        LogUtils.info("Share Page Flow Completed");
//    }

//    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void TermLifeSharePlanPDPageHdfc() throws InterruptedException, IOException { // hdfc
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
//        tlp.HdfcClick_2ProfilePage();
//        leadpage.GotItButton();
//        lspdp.SharePlanFromPDPPageMAxLife("viewdetail-HDFCLI-Click 2 Protect Life");
//        LogUtils.info("Share Page Flow Completed");
//  }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Ulip_bajaj() throws InterruptedException, IOException { // hdfc
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ULIP();
        Iup.BajajFutureGainProfile();
        leadpage.GotItButton();
        Iup.clickOn_ULIP_Tab();
        lspdp.SharePlanFromPDPPageMAxLife("P19");
        LogUtils.info("Share Page Flow Completed");
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void GauranteedICICI() throws InterruptedException, IOException { // hdfc
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        Profile_page.GenderButtonClick("male");
        Profile_page.profilePageForBALICPOS();
        leadpage.GotItButton();
        WebCommands.staticSleep(5000);
       // lspdp.SharePlanFromPDPPageMAxLife("viewdetail-ICICIPRULI-Guaranteed Income For Tomorrow (GIFT)");
        lspdp.SharePlanFromPDPPageMAxLife("P89");
        LogUtils.info("Share Page Flow Completed");
    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}