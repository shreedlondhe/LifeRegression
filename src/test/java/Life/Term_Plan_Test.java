package Life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.pages.Ninja.ninja;
import com.qa.turtlemint.pages.life.ChildSavingUlipPlan;
import com.qa.turtlemint.pages.life.LifeLandingPage;
import com.qa.turtlemint.pages.life.LifePage;
import com.qa.turtlemint.pages.life.Term_Life_plan;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.pages.sell.GrowPageSellButton;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;
import util.RetryAnalyser;
import util.iTestListener;

import java.io.IOException;
import java.util.Iterator;

@Listeners(iTestListener.class)
@Test(groups = {"Term_Plan_Test","Life_Full"})
public class Term_Plan_Test extends TestBase {

    public Term_Plan_Test() {
        super();
    }

    LoginPage Loginpage;
    GrowPageSellButton gp;
    LifePage lp;
    LifeLandingPage llp;
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
        tlp = new Term_Life_plan();
        ninj= new ninja();
        csup=new ChildSavingUlipPlan();
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
        gp.ValidateSellButton();
    }

    @Test()
    public void tataAIA() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.TataSRSLifeProfilePage();
        String uID=csup.getUniqueID();
       // String UID=uID.trim();
        tlp.TataLifeResultPage();
        tlp.checkout();
        tlp. checkmarks();
       tlp.AddID(uID);


        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h2[text()='Tata AIA Life Insurance Sampoorna Raksha Supreme ']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Verified redirection to insurer prod ");
       // tlp.EmailVerification(UID);

     // ninj.cancelPolicyThroughNinjaTATA(uID);
       LogUtils.info("Checkout flow Completed");

    }

    @Test()
    public void BajajSmart() throws Exception {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.BajajSmartProfilePage();
        String uID=csup.getUniqueID();
        tlp.BajajSmartResultPage();
        tlp.checkoutBalic();
        tlp. checkmarks();
        tlp.AddID(uID);
        tlp.LeadCheck();



        //adding below code to verify plan redirection to insurer production
//        TestUtil.waitUntilElementToBeVisible(By.xpath("//h4[text()='Bajaj Allianz Life Smart Protect Goal']"));
//        boolean NsurerProd = driver.findElement(By.xpath("//h4[text()='Bajaj Allianz Life Smart Protect Goal']")).isDisplayed();
//        Assert.assertEquals(NsurerProd,true);
        LogUtils.info("Verified redirection to insurer prod");
       //ninj.cancelpolicyThroughNinja(uID);
        LogUtils.info("Checkout flow Completed");
    }


   // @Test(enabled = false,retryAnalyzer = RetryAnalyser.class)
//    public void MaxLife() throws InterruptedException, IOException {
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
//        tlp.MaxlifeProfilePage(); //buy now not working
//        tlp.MaxlifeResultPage();
//        LogUtils.info("Checkout flow Completed");
//    }

   // @Test()
   @Test(enabled = false,retryAnalyzer = RetryAnalyser.class)
    public void ICIC() throws InterruptedException, IOException {
        TestUtil.lessLogin();
        gp.ValidateSellButton();
        lp.ValidateLifeClick();
        llp.TermLifeClick();
        tlp.TataSRSLifeProfilePage();
        tlp.IcicResult();
        LogUtils.info("Checkout flow Completed");
    }

//    @Test(enabled = true,retryAnalyzer = RetryAnalyser.class)
//    public void HDFC() throws Exception {
//        TestUtil.lessLogin();
//        gp.ValidateSellButton();
//        lp.ValidateLifeClick();
//        llp.TermLifeClick();
//        tlp.HdfcClick_2ProfilePage();
//        String uID=csup.getUniqueID();
//        tlp.HdfcClick_2ResultPage();
//        tlp .HdfcCheckOut();
//        tlp. checkmarks();
////        //adding below code to verify plan redirection to insurer production
////        TestUtil.waitUntilElementToBeVisible(By.xpath("//h2[text()='E-MANDATE REGISTRATION,PAYMENT AND PLAN SUMMARY']"));
////        boolean NsurerProd = driver.findElement(By.xpath("//h2[text()='E-MANDATE REGISTRATION,PAYMENT AND PLAN SUMMARY']")).isDisplayed();
////        Assert.assertEquals(NsurerProd,true);
//        ninj.cancelpolicyThroughNinja(uID);
//        LogUtils.info("Checkout flow Completed");
//    }
    @AfterClass
    public void Close() throws Exception {
//        try{
//        tlp.GetID();
//        }
//        catch(Exception e){
//            System.out.println("No policy cancled");
//        }
                 //   tlp.GetID();
                   driver.quit();
    }

}