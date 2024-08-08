package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Quotes extends TestBase {

//**************************** Term *************************
    public String TataAIA="viewdetail-TATAAIALI-Sampoorna Raksha Supreme (SRS)";

    public String BajajAllianz="viewdetail-BAJAJLI-Smart Protection Goal";

    public String ICIC_ismart="viewdetail-ICICIPRULI-iProtect Smart";

    public  String Maxlife_smartSecure="viewdetail-MAXLIFELI-Smart Secure Plus";

    public String HdfcClick2_protectLife="viewdetail-HDFCLI-Click 2 Protect Life";
   //*************************** NonTerm ***********************

    public String Guaranteed_ICICIGIFTLT  ="viewdetail-ICICIPRULI-Guaranteed Income For Tomorrow(Long Term)";

    public String Guaranteed_ICICIGIFT="viewdetail-ICICIPRULI-Guaranteed Income For Tomorrow (GIFT)";

    public String TATAGRIP="viewdetail-TATAAIALI-Guaranteed Return Insurance Plan";

    public String TATAFGPlus="viewdetail-TATAAIALI-Fortune Guarantee Plus";

    public String HDFCSanchayPlus="viewdetail-HDFCLI-Sanchay Plus";

    public String BAJAJAWG="viewdetail-BAJAJLI-Assured Wealth Goal";

    public String BAJAJGIG="viewdetail-BAJAJLI-Guaranteed Income Goal";

    //****************************Non-term Lumsum*************************

    public String BAJAJPOS="viewdetail-BAJAJLI-POS Goal Suraksha";

    public String TATAFG="viewdetail-TATAAIALI-Fortune Guarantee";

    public String TATFG="";

    //****************************ULIP*************************

    public String BAJAJFutureGain="viewdetail-BAJAJLI-Future Gain";

    public String HDFCLIClick2Invest="viewdetail-HDFCLI-Click 2 Invest";

    public String HDFCLIProGrowthPlus="viewdetail-HDFCLI-ProGrowth Plus";

    public String TATAAIALISmartSampoornaRaksha="viewdetail-TATAAIALI-Smart Sampoorna Raksha";




    public void ClickedQuiteOf(String Insurer){
        WebCommands.staticSleep(3000);
        WebElement webElement = driver.findElement(By.xpath("//button[@data-auto='"+Insurer+"']"));
        TestUtil.click(webElement, "Clicked insurer= " + Insurer);
    }
    public boolean CheckInsurerOf(String Insurer)
    {
        WebCommands.staticSleep(3000);
        TestUtil.waitUntilElementToBeVisible(By.xpath("//button[@data-auto='"+Insurer+"']"));
        boolean webElement = driver.findElement(By.xpath("//button[@data-auto='"+Insurer+"']")).isDisplayed();
        String[] s = Insurer.split("detail-");
        LogUtils.info("Got Insurer = "+s[1]);
        return webElement;

    }
    public WebElement ULIP()
    {
        return driver.findElement(By.xpath("//span[text()='ULIP']"));
    }
};