package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"CheckForAllInsurer_Test"})
public class CheckForAllInsurer_Test extends TestBase {
    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Term_Life_plan tlp;
    ninja ninj;
    ChildSavingUlipPlan csup;
    Quotes Quotes;
    Negative_test NT;
    Profile_page pp;
    Child_Saving_traditional_Plans_Page CST;
    Retirement_Page RP;
    LeadNamePage lnp;
    ChildSavingUlipPlan childulip;
    TestUtil tl;
    ULIPPlanPage Up;
    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        tlp = new Term_Life_plan();
        ninj= new ninja();
        csup=new ChildSavingUlipPlan();
        Quotes= new Quotes();
        NT=new Negative_test();
        pp = new Profile_page();
        CST=new Child_Saving_traditional_Plans_Page();
        RP=new Retirement_Page();
        childulip=new ChildSavingUlipPlan();
        tl= new TestUtil();
        lnp = new LeadNamePage();
        Up= new ULIPPlanPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
    }
    @Test(priority = 1,enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void __Term_TataAIA__() throws InterruptedException, IOException {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.TataSRSLifeProfilePage();
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TataAIA),true);
        TestUtil.getFullPageScreenShot();
    }
    @Test(priority = 2, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Term_BajajAllianz() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BajajAllianz),true);
    }
    @Test(priority = 3,enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Term_ICIC_ismart() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.ICIC_ismart),true);
    }
    @Test(priority = 4,retryAnalyzer = RetryAnalyser.class)
   public void __Guaranteed_ICICIGIFTLT__() throws InterruptedException, IOException {
       TestUtil.lessLogin();
       gp.ValidateSellButton();
       lp.ValidateLifeClick();
       llp.GuaranteedReturns();
       pp.GenderButtonClick("male");
       pp.profilePageForICICI();
       NT.EditFlowForNonTerm();
       Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFTLT),true);
       TestUtil.getFullPageScreenShot();

   }
   @Test(priority = 5, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_ICICIGIFT() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFT),true);

    }
    @Test(priority = 6, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_TATAGRIP() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAGRIP),true);

    }
    @Test(priority = 7, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_TATAFGPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAFGPlus),true);

    }
    @Test(priority = 8, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_HDFCSanchayPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCSanchayPlus),true);

    }
    @Test(priority = 9, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_BAJAJAWG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJAWG),true);

    }
    @Test(priority = 10, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_BAJAJGIG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJGIG),true);

    }

    @Test(priority = 11, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void __Guaranteed_ULIP_BajajFuturGain__() throws Exception {

        TestUtil.click(Quotes.ULIP(),"Ulip Clicked");
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJFutureGain),true);
        TestUtil.getFullPageScreenShot();
    }
    @Test(priority = 12, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_Ulip_HDFCLIClick2Invest() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIClick2Invest),true);

    }

    @Test(priority = 13, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_Ulip_HDFCLIProGrowthPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIProGrowthPlus),true);

    }
    @Test(priority = 14, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Guaranteed_Ulip_TATAAIALISmartSampoornaRaksha() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAAIALISmartSampoornaRaksha),true);

    }

    @Test(priority = 15,enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void __RetirementICICIGIFT__() throws InterruptedException, IOException {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Retirement();
        RP.RetirementProfileForTATA();
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFT),true);
        TestUtil.getFullPageScreenShot();
    }
    @Test(priority = 16, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_ICICIGIFT() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFT),true);

    }
    @Test(priority = 17, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_TATAGRIP() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAGRIP),true);

    }
    @Test(priority = 18, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_TATAFGPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAFGPlus),true);

    }
    @Test(priority = 19, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_HDFCSanchayPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCSanchayPlus),true);

    }
    @Test(priority = 20, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_BAJAJAWG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJAWG),true);

    }
    @Test(priority = 21, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_BAJAJGIG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJGIG),true);

    }
    @Test(priority = 22, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Retirement_Ulip_HDFCLIClick2Invest() throws InterruptedException, IOException {
        TestUtil.click(Quotes.ULIP(),"Ulip Clicked");
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIClick2Invest),true);

    }

    @Test(priority = 23, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void __ChildICICIGIFT__() throws InterruptedException, IOException
    {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ChildSaving();
        childulip.childSavingUlipProfile();
        lnp.SaveLead(tl.NameGenerator());
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFT),true);
        TestUtil.getFullPageScreenShot();

    }
    @Test(priority = 24, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_ICICIGIFT() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.Guaranteed_ICICIGIFT),true);

    }
    @Test(priority = 25, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_TATAGRIP() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAGRIP),true);

    }
    @Test(priority = 26, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_TATAFGPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAFGPlus),true);

    }
    @Test(priority = 27, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_HDFCSanchayPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCSanchayPlus),true);

    }
    @Test(priority = 28, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_BAJAJAWG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJAWG),true);

    }
    @Test(priority = 29, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_BAJAJGIG() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJGIG),true);

    }
    @Test(priority = 30, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Child_Ulip_HDFCLIClick2Invest() throws InterruptedException, IOException {
        TestUtil.click(Quotes.ULIP(),"Ulip Clicked");
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIClick2Invest),true);

    }
    @Test(priority = 31, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void __ULIP_BajajFuturGain__() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ULIP();
        Up.BajajFutureGainProfile_New();
        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.BAJAJFutureGain),true);
        TestUtil.getFullPageScreenShot();
    }
    @Test(priority = 32, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Ulip_HDFCLIClick2Invest() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIClick2Invest),true);

    }

    @Test(priority = 33, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Ulip_HDFCLIProGrowthPlus() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.HDFCLIProGrowthPlus),true);

    }
    @Test(priority = 34, enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Ulip_TATAAIALISmartSampoornaRaksha() throws InterruptedException, IOException {

        Assert.assertEquals(Quotes.CheckInsurerOf(Quotes.TATAAIALISmartSampoornaRaksha),true);

    }
    @AfterClass
    public void Close() {
        driver.quit();
    }

}
