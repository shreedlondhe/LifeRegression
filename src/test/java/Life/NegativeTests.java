package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;

import static com.qa.turtlemint.base.TestBase.driver;
@Listeners(iTestListener.class)
@Test(groups = {"Negative_Tests"})
public class NegativeTests extends TestBase {
    public NegativeTests() {
        PageFactory.initElements(driver, this);
    }
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
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TermTataAIA() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.TataSRSLifeProfilePage();
        NT.ResulutCardModificationForTerm();
        NT.EditFlowForTerm();
        Quotes.ClickedQuiteOf(Quotes.TataAIA);
        NT.DownloadsBrochureFunctionalityPDP();
        NT.DownloadBIonPDP();
        NT.BuyNow();
        NT.Checkout_PDP_result_Edit_Term();
        Quotes.ClickedQuiteOf(Quotes.TataAIA);
        NT.BuyNow();
        NT.checkout();
        NT.checkmarks();
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void GauranteedICICIGIFTLT() throws InterruptedException, IOException {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GuaranteedReturns();
        pp.GenderButtonClick("male");
        pp.profilePageForICICI();
        NT.EditFlowForNonTerm();
        Quotes.ClickedQuiteOf(Quotes.Guaranteed_ICICIGIFTLT);
        NT.PDP_Result();
        NT.EditFlowForNonTerm();
        Quotes.ClickedQuiteOf(Quotes.Guaranteed_ICICIGIFTLT);
        NT.BuyNow();
        NT.Checkout_PDP_result_Edit_Non_term();
        NT.ResulutCardModificationForNonTerm();
        Quotes.ClickedQuiteOf(Quotes.Guaranteed_ICICIGIFTLT);
        NT.DownloadsBrochureFunctionalityPDP();
        NT.DownloadBIonPDP();
        NT.BuyNow();
        NT.DownloadBIonCheckout();
        NT.CheckOutForNotTerm();
        NT.PayPremium();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void ChildICICIGIFT() throws InterruptedException, IOException
    {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ChildSaving();
        CST.tell_us_about_the_Insured();
        CST.Select_the_Sum_Assured_Amount("50000");
        CST.Save_your_quote_now("shree");
        NT.EditFlowForNonTerm();
        NT.ResulutCardModificationForChild();
        Quotes.ClickedQuiteOf(Quotes.Guaranteed_ICICIGIFT);
        NT.DownloadsBrochureFunctionalityPDP();
        NT.BuyNow();
        NT.Checkout_PDP_result_Edit_Non_term();
        NT.ResulutCardModificationForChild();
        Quotes.ClickedQuiteOf(Quotes.Guaranteed_ICICIGIFT);
        NT.DownloadBIonPDP();
        NT.BuyNow();
        CST.checkoutPage();
        WebCommands.staticSleep(5000);
        NT.DownloadBIonCheckout();
        WebCommands.staticSleep(3000);
        NT.PayPremium();
    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void RetirementTATAGRIP() throws InterruptedException, IOException {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Retirement();
        RP.RetirementProfileForTATA();
        Quotes.ClickedQuiteOf(Quotes.TATAGRIP);
        NT.DownloadBIonPDP();
        NT.BacktoHome();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Retirement();
        RP.RetirementProfileForTATA();
        Quotes.ClickedQuiteOf(Quotes.TATAGRIP);
        NT.BuyNow();
        NT.Checkout_PDP_Checkout();
        NT.Checkout_PDP_result_Edit_Non_term();
        Quotes.ClickedQuiteOf(Quotes.TATAGRIP);
        NT.BuyNow();
        NT.DownloadBIonCheckout();
        NT.CheckOutForNotTerm();

    }
    @AfterClass
    public void Close() {
        driver.quit();
    }

}
