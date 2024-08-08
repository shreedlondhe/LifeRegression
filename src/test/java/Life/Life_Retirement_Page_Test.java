package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.*;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"Life_Retirement_Page_Test", "Life_Full"})
public class Life_Retirement_Page_Test extends TestBase {
    public Life_Retirement_Page_Test() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
    Retirement_Page RP;
    ninja ninj;
    ChildSavingUlipPlan csup;

    @BeforeClass
    public void start() throws InterruptedException {
        initialization();
        Loginpage = new LoginPage();
        gp = new GrowPageSellButton();
        lp = new LifePage();
        llp = new LifeLandingPage();
        RP = new Retirement_Page();
        ninj= new ninja();
        csup=new ChildSavingUlipPlan();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();

    }

    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
    public void Life_Retirement_ForTATA() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Retirement();
        RP.RetirementProfileForTATA();
        String uID=csup.getUniqueID();
        RP.RetirementReshultPageForTATA();
       RP.RetirementCheckoutForTATA();
        //       //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//p[text()='TATAaia xyz']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//p[text()='TATAaia xyz']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Verified redirection to insurer prod ");
       // ninj.cancelPolicyThroughNinja(uID);
    }

  //  @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void Life_Retirement_ForICICI() throws InterruptedException, IOException {
//
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.Retirement();
//        RP.RetirementProfileForICICI();
//        RP.RetirementReshultPageForICICI();
//        RP.RetirementProductDetaiForICICI();
//    }
  @Test()
  public void Life_Retirement_GPPF() throws Exception {
      TestUtil.lessLogin();
      gp.ValidateSellButton();
      lp.ValidateLifeClick();
      llp.Retirement();
      RP.RetirementProfileForICICI();
      String uID=csup.getUniqueID();
      RP.RetirementReshultPageForGPPF();
      RP.RetirementCheckoutForTATA();
      LogUtils.info("Verified redirection to insurer prod ");
    }
    @Test()
    public void Life_Retirement_TATAGRIP() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.Retirement();
        RP.RetirementProfileForICICI();
        String uID=csup.getUniqueID();
        RP.RetirementReshultPageForTATAGRIP();
        RP.RetirementCheckoutForTATA();
        LogUtils.info("Verified redirection to insurer prod ");
    }
    @AfterClass
    public void Close() {
        driver.quit();
    }

}