package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"Child_Saving_Page_Test","Life_Full"})
public class Child_UlipPlan_Test extends TestBase{

    public Child_UlipPlan_Test(){super();}
    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    LeadNamePage lnp;
    TestUtil tl;
    ChildSavingUlipPlan childulip;
    Term_Life_plan tlp;
    ninja ninj;
    ChildSavingUlipPlan csup;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        lnp = new LeadNamePage();
        tl = new TestUtil();
        childulip = new ChildSavingUlipPlan();
        tlp = new Term_Life_plan();
        ninj = new ninja();
        csup = new ChildSavingUlipPlan();


        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
       gp.ValidateSellButton();

    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void childSavingUlipPlan() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ChildSaving();
        childulip.childSavingUlipProfile();
        lnp.SaveLead(tl.NameGenerator());
        lnp.GotItButton();
       // tlp.modifylowNew();
       // String uID=childulip.getUniqueID();
       // childulip.getUniqueID();
        childulip.childSavingUlipResultsPage();
        childulip.childSavingsUlipPdpPage();
        //childulip.downloadsFunctionalityPDP();
        childulip.buyNow();
       // childulip.checkoutDownloadsFunctionality();
//        childulip.checkoutPageInsuredDetails();
//        childulip.checkoutPageNomineeDetails();
//        childulip.checkoutPageUserApproval();
      //  ninj.cancelPolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");
    }
    @AfterClass
    public void Close() {
        driver.quit();
    }
}