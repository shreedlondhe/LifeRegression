package com.qa.turtlemint.pages.life;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.commands.WebCommands;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Ambrish Balde 29/06/2022
 * @author ambrish.balde
 * @Project Turtlemint Frontend Automation
 */
public class SumAssuredPage extends TestBase {

    public SumAssuredPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[text()= 'Next']")
    WebElement NextButton;

    public void SumAssured()
    {
        NextButton.click();
        WebCommands.staticSleep(2000);
    }
}