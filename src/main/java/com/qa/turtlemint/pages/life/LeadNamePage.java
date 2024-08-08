package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LeadNamePage extends TestBase {

    public LeadNamePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement NextButton;


    @FindBy(xpath = "//Button[text()='OK, GOT IT!']")
    WebElement OkGotItBtn;

    @FindBy(xpath = "//button[.='Got it']")
    WebElement GotItBtn;

    public void SaveLead(String LeadName) throws InterruptedException {
        name.sendKeys(LeadName);
        LogUtils.info("All Details Filled and Lead Name Entered");
        TestUtil.JsClick(NextButton,"clicked on Next");
        WebCommands.staticSleep(10000);
    }

    public void GotItButton() throws InterruptedException, IOException {

        try {
            if(GotItBtn.isDisplayed()){
                TestUtil.JsClick(GotItBtn,"clicked on GotItBtn");
            }
            else{
                LogUtils.info("GotItBtn is not disaplayed");
            }
        } catch (Exception e) {
        e.getMessage();
        }


    }
}


