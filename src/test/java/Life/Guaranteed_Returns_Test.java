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
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;
@Listeners(iTestListener.class)
@Test(groups = {"Guaranteed_Returns_Test","Life_Full"})
public class Guaranteed_Returns_Test extends TestBase {


    public Guaranteed_Returns_Test() {
        super();

    }
    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Profile_page pp;
    LeadNamePage leadpage;
    TestUtil tl;
    GuaranteedReturnsPage ivrp;
    InvestmentCheckoutPage ivcp;
    ninja ninj;
    ChildSavingUlipPlan csup;
    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        pp = new Profile_page();
        leadpage = new LeadNamePage();
        tl = new TestUtil();
        ivrp = new GuaranteedReturnsPage();
        ninj = new ninja();
        csup = new ChildSavingUlipPlan();
        ivcp= new InvestmentCheckoutPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();

    }
    @Test()
    public void BalicPOSGoalSuraksha() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForBALICPOS();
        leadpage.GotItButton();
        ivrp.BalicPOS();
    ivrp.checkoutDownloadsFunctionality();
        ivrp.FullCheckout("yes");
        LogUtils.info("Checkout flow Completed");
    }
   @Test()
    public void BalicAWG() throws Exception {
       TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForBALICPOS();
        leadpage.GotItButton();
        ivrp.BalicAWG();
        ivrp.checkoutDownloadsFunctionality();
       ivrp.FullCheckout("no");
       LogUtils.info("Checkout flow Completed");
    }
   @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void BalicGIG() throws Exception {
       TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForBALICPOS();
        leadpage.GotItButton();
        ivrp.BalicGIG();
        ivrp.checkoutDownloadsFunctionality();
       ivrp.FullCheckout("no");
       LogUtils.info("Checkout flow Completed");
        //ivrp.checkmarks();
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TataFortuneGuaranteePlus() throws Exception  {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
         llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForTataFortuneGuaranteePlus();
        leadpage.GotItButton();
        ivrp.TataFortuneGuaranteePlanPlus();
        ivrp.FullCheckout("no");
        LogUtils.info("Checkout flow Completed");

    }
    @Test
    public void ModifieDTataFortuneGuaranteePlan() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForTataFortuneGuaranteePlus();
        leadpage.GotItButton();
        String uID=csup.getUniqueID();
        pp.modifyTataFortune();
        ivrp.TataFortuneGuaranteePlan();
        ivcp.checkoutDownloadsFunctionality();
        ivcp.checkout_investment_new();
        //ivcp.checkmarks();
        //adding below code to verify plan redirection to insurer production
        TestUtil.waitUntilElementToBeVisible(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']"));
        boolean NsurerProd = driver.findElement(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']")).isDisplayed();
        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Checkout flow Completed");
    }

    @Test()
    public void HDFCSanchayPlus() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForHDFCSanchay();
        leadpage.GotItButton();
        ivrp.HdfcSanchayPlan();
        ivrp.FullCheckout("no");

        LogUtils.info("HDFC is displayed flow Completed");
    }


//    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void MaxSmartWealth() throws InterruptedException, IOException { //Buy Now is Grayed Out
//
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.GuaranteedReturns();
//        pp.GenderButtonClick("male");
//        pp.profilePageForMaxSmartWealth();
//        leadpage.SaveLead(tl.NameGenerator());
//        leadpage.GotItButton();
//        ivrp.MaxSmartWealthPlan();
////        ivcp.checkoutDownloadsFunctionality();
////        ivcp.windowSwitch();
////        ivcp.checkout();
////        ivcp.checkmarks();
//        LogUtils.info("Checkout flow Completed");

//    }

   @Test()
   public void ICICI_GIFTLT() throws InterruptedException, IOException {
        //Buy Now is Grayed Out
       TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForICICI();
        leadpage.GotItButton();

        ivrp.ICICI_GIFT();
        //ivcp.checkoutDownloadsFunctionality();

       ivrp.Assisted_Checkout();
       LogUtils.info("Checkout flow Completed");
    }
    @Test()
    public void ICICI_GIFTLTPRO() throws InterruptedException, IOException {
        //Buy Now is Grayed Out
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForICICI();
        leadpage.GotItButton();
        ivrp.ICICI_GIFTPRO();
        ivrp.CheckoutGiftPro();
        //ivcp.checkoutDownloadsFunctionality();

        LogUtils.info("Checkout flow Completed");
    }

    @AfterClass
    public void Close() {
      driver.quit();
    }
}
