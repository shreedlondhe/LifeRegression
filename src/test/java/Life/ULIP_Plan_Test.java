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

@Listeners(iTestListener.class)
@Test(groups = {"ULIP_Plan_Test","Life_Full"},retryAnalyzer = RetryAnalyser.class)
public class ULIP_Plan_Test extends TestBase {
    public ULIP_Plan_Test() {
        super(); }
    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Term_Life_plan tlp;
    ninja ninj;
    ULIPPlanPage Up;
    ChildSavingUlipPlan csup;
    @BeforeClass
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        Up= new ULIPPlanPage();
        ninj = new ninja();
        csup = new ChildSavingUlipPlan();
        tlp=new Term_Life_plan();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void InvestMentULIPHDFCClick2Invest() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ULIP();
        Up.HDFCClick2InvestProfile_new();
       String uID=csup.getUniqueID();
        Up.HDFCClick2InvestResultPage();
        // ninj.cancelpolicyThroughNinja(uID);
        LogUtils.info("Hdfc plan is displayed i.e. flow completed");

    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void BajajFuturGain() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ULIP();
        Up.BajajFutureGainProfile_New();
        String uID=csup.getUniqueID();
        Up.BajajFutureGainResult();
        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h4[text()='Bajaj Allianz Life Future Gain']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h4[text()='Bajaj Allianz Life Future Gain']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
       // ninj.cancelpolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TATASSR() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ULIP();
        Up.BajajFutureGainProfile_New();
        WebCommands.staticSleep(3000);
        String uID=csup.getUniqueID();
        TestUtil.JsClick(Up.TATASSR,"Selected TATA SSR");
        Term_Life_plan.GetPaymentLinkCTA();
        TestUtil.JsClick(Up.CLickonBuyNowButton,"Selected TATA SSR");
        tlp.checkout();
        tlp. checkmarks();
        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h4[text()='Bajaj Allianz Life Future Gain']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h4[text()='Bajaj Allianz Life Future Gain']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
       // ninj.cancelpolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");

    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}
