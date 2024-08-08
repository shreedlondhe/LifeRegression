package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.ChildSavingUlipPlan;
import com.qa.turtlemint.pages.life.LifeLandingPage;
import com.qa.turtlemint.pages.life.LifePage;
import com.qa.turtlemint.pages.life.Term_Life_plan;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.RetryAnalyser;
import util.iTestListener;

@Listeners(iTestListener.class)
@Test(groups = {"LifeLandingPge_Test","Life_Full"})
public class LifeLandingPge_Test extends TestBase {
    public LifeLandingPge_Test() {
        super();
    }
    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;

    @BeforeClass()
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void TopSellingPlans() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TopSellingPlans();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void CompleteFinancialPlanner() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.CompleteFinancialPlanner();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void GoalCalculators() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.GoalCalculators();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void ShareContent() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ShareContent();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void SharePlanBrochures() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.SharePlanBrochures();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void ProductGallery() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ProductGallery();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void ProductTrainings() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.ProductTrainings();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void MyRenewals() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.MyRenewals();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void MyBusiness() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.MyBusiness();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Claims() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Claims();

    }
    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Seemoreplans() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Seemoreplans();

    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}
