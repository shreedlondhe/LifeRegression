package com.qa.turtlemint.commands;

import com.qa.turtlemint.context.TestContext;
import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.Utils;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static com.qa.turtlemint.base.TestBase.driver;

public class WebCommands {

    private static JavascriptExecutor jsExec;
    public WebDriverWait wait;
    public static boolean isScreenShotCaptured = false;
    public static String parentWindow = "";

    public WebCommands(WebDriver webDrv) {

        jsExec = (JavascriptExecutor) driver;

    }

    private final String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
            + "var elementTop = arguments[0].getBoundingClientRect().top;"
            + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

    private final String scrollElementIntoView = "arguments[0].scrollIntoView(true);";

    public void navigate(String url) {

        try {

            driver.manage().window().maximize();
            driver.navigate().to(url);
            //Allure.step("Navigation to website with URL: " + url + " was successful", Status.PASSED);

            // return this.webDrv;

        } catch (Exception e) {
            getScreenShot();
            //Allure.step("Could not open website " + e.getMessage(), Status.FAILED);
            throw e;
            // return null;
        }
    }

    private void justClick(String locator) {
        waitForElementPresent(locator);
        //waitForElementVisible(locator);
        int retry = 0;
        boolean isClicked = false;
        WebElement element = waitElementToBeClickable(locator);
        while (element == null && retry++ <= 5) {
            try {
                LogUtils.info("Retry for click: " + retry);
                LogUtils.info("Clicking on element:" + locator);
                element = waitElementToBeClickable(locator);
                LogUtils.info("ENABLED: " + element.isEnabled() + ", getAttribute named disable: " + element.getAttribute("disable"));
                if (element.getAttribute("disable") != null)
                    throw new RuntimeException("Element is disabled");
                element.click();
                isClicked = true;
                LogUtils.info("Clicked on element:" + locator);
                LogUtils.info("Retry for click: Success on" + retry);
                break;
            } catch (Exception ex) {
            }
        }
        //final try
        if (!isClicked) {
            try {
                waitElementToBeClickable(locator).click();
            } catch (Exception es) {
                es.printStackTrace();
                throw new RuntimeException("element not clickable + " + locator);
            }
        }

    }

    private void clickError(Exception e, String locator) {
        e.printStackTrace();
        LogUtils.info("Error while clicking on element:" + e.getMessage());
        //Allure.step("Unable to click on element: " + element, Status.FAILED);
        getScreenShot();
//        Assert.assertEquals("",
//                e.toString() + "\nCould not click on element with locator: " + locator + "\n" + e.getMessage());
//

        Assert.assertEquals("", "Error while clicking on element with locator: " + locator);

    }

    public void click(String locator) {
        if (locator == null)
            throw new RuntimeException("Locator must not be null");
        try {
            justClick(locator);
            //Allure.step("Clicked on : " + element, Status.PASSED);
        } catch (StaleElementReferenceException e) {
            try {
                LogUtils.info("StaleElementReferenceException: occured " + locator);
                justClick(locator);
                LogUtils.info("StaleElementReferenceException: handled " + locator);
            } catch (Exception e1) {
                LogUtils.info("StaleElementReferenceException: not handled and came to catch" + locator);

                clickError(e1, locator);
                throw e1;
            }
        } catch (Exception e) {
            clickError(e, locator);
            throw e;
        }
    }

    public String getText(String locator) {

        WebElement element = null;
        String text = "";
        try {

            waitForElementPresent(locator);
            element = getElement(locator);
            text = element.getText();
            waitForAngularLoad();

        } catch (Exception e) {

            e.printStackTrace();
            LogUtils.info("Error while getting value from the element:" + e.getMessage());
            getScreenShot();
            Assert.assertEquals("", "Error while getting value from the element:" + locator);
            throw e;
        }

        return text;

    }


    public void JSscrollIntoMiddle(String locator) {
        try {
            executeJSScript(scrollElementIntoView, locator);
        } catch (Exception e) {
            executeJSScript(scrollElementIntoMiddle, locator);
        }
    }

    public void JSscrollTo(String locator) {
        try {
            executeJSScript(scrollElementIntoMiddle, locator);
        } catch (Exception e) {
            throw new RuntimeException("Can not Scroll to Element" + locator);
        }
    }


    public void doubleclick(String locator) {
        click(locator);
        click(locator);
    }

    public static void staticSleep(long milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public void executeJSScript(String script, String locator) {
        try {
            waitForElementPresent(locator);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement element = getElement(locator);
            //  jse.executeAsyncScript(script, element);
            jse.executeScript(script, element);

        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("Execute Javascript: ERROR");
            getScreenShot();
            throw e;
        }
    }

    public void executeJSScript(String script) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //  jse.executeAsyncScript(script, element);
            jse.executeScript(script);

        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("Execute Javascript: ERROR");
            getScreenShot();
            throw e;
        }
    }


    public void JSClick(String locator) {
        try {
            waitForElementPresent(locator);
            LogUtils.info("JS Click on element:" + locator);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement element = getElement(locator);
            jse.executeScript("arguments[0].click();", element);
            LogUtils.info("JS Clicked on element:" + locator);

        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("JSClick: ERROR");
            getScreenShot();
            throw e;
        }
    }

    public void JSClickList(String locator, int count, int total) {
        try {

            waitForElementPresent(locator);
            LogUtils.info("JS Click on element:" + locator);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            List<WebElement> element = getElements(locator);
            LogUtils.info("Element size:" + element.size());
            if (total > element.size()) {
                int i = total - element.size();
                int index = count % i;
                jse.executeScript("arguments[0].click();", element.get(index));
                LogUtils.info("JS Clicked on element:" + locator + " at index:" + index);
            } else {
                jse.executeScript("arguments[0].click();", element.get(count));
                LogUtils.info("JS Clicked on element:" + locator + " at index:" + count);
            }


        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("JSClick: ERROR");
            getScreenShot();
            throw e;
        }
    }


    public void switchWindow() {
        parentWindow = driver.getWindowHandle();
        Iterator<String> windows = driver.getWindowHandles().iterator();
        while (windows.hasNext()) {
            String newWindow = windows.next();
            driver.switchTo().window(newWindow);
        }
        //Allure.step("Switched to new window successful", Status.PASSED);
    }

    public void closeAllBrowsers() {
        driver.quit();
    }

    public void closeBrowser() {
        driver.close();
    }

    public void waitForElementVisible(String locator) {
        LogUtils.info("waitForElementVisible : Start => " + locator);
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofSeconds(50));
            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator(locator)));
            LogUtils.info("waitForElementVisible : End => " + locator + ", Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("Error while waiting for visibility of element:" + e.getMessage());
            getScreenShot();
            throw new AssertionError("Error while waiting for visibility of element:" + e.getMessage());
        }
    }

    public void waitForElementPresent(String locator) {
        LogUtils.info("waitForElementPresent : Start => " + locator);
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(30), Duration.ofSeconds(50));
            WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locator)));
            LogUtils.info("waitForElementPresent : End => " + locator + ", Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.info("Error while waiting for presence of element:" + e.getMessage());
            getScreenShot();
            Assert.assertEquals("", "Error while waiting for element with locator: " + locator);
            throw e;
        }

    }

    public boolean isElementDisplayed(String locator) {
        try {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(2), Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(getLocator(locator)));
            } catch (Exception e) {
            }
            WebElement element = getElement(locator);
            LogUtils.info("Checking element:" + element);
            if (element == null) {
                return false;
            }
            LogUtils.info("Checking element:" + element.isDisplayed());
            return element.isDisplayed();
        } catch (Exception e) {

            e.printStackTrace();
            LogUtils.info("Error while checking visibility of element:" + e.getMessage());
            //Allure.step("Could not locate element with locator: " + locator + "\n" + e.getMessage(), Status.FAILED);

            getScreenShot();

//            Assert.assertEquals("",
//                    e.toString() + "\nCould not locate element with locator: " + locator + "\n" + e.getMessage());
            Assert.assertEquals("", "Error while trying to locate element with locator: " + locator);
        }
        return false;
    }

    public void setText(String locator, String inputText) {
        WebElement element = null;
        try {

            waitForElementPresent(locator);
            element = getElement(locator);

            waitForElementVisible(locator);

            // waitUntilAngular5Ready();
            waitForAngularLoad();
            element.sendKeys(inputText);
            //Allure.step("Successfully entered text" + " '" + inputText + "'" + " in : " + element, Status.PASSED);

        } catch (Exception e) {

            e.printStackTrace();
            LogUtils.info("Error while setting value in the txtbox:" + e.getMessage());
            //Allure.step("Could not enter " + " '" + inputText + "'" + " in element with locator: " + locator + "\n"
//            +e.getMessage(), Status.FAILED);

            getScreenShot();
//            Assert.assertEquals("", e.toString() + "\nCould not enter " + " '" + inputText + "'"
//                    + " in element with locator: " + locator + "\n" + e.getMessage());
            Assert.assertEquals("", "Error while entering text in element:" + locator);
            throw e;
        }
    }

    public void clearText(String locator) {

        WebElement element = null;
        try {
            waitForElementPresent(locator);
            element = getElement(locator);
            element.clear();

        } catch (Exception e) {
            getScreenShot();
            e.printStackTrace();
            Assert.assertEquals("", "Error while clearing text from element with locator: " + locator + "\n");
            throw e;
        }
    }

    private WebDriver getWebDriver() {
        return driver;
    }

    private void angularWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        }
        // wait.until(AdditionalWait.angularHasFinishedProcessing());
    }

    public WebElement waitElementToBeClickable(String locator) {
//        WebElement element = getElement(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.elementToBeClickable(getLocator(locator)));

    }

    // ------------------------

    private void ajaxComplete() {
        LogUtils.debug("waiting for ajaxComplete");
        jsExec.executeScript("var callback = arguments[arguments.length - 1];" + "var xhr = new XMLHttpRequest();"
                + "xhr.open('GET', '/Ajax_call', true);" + "xhr.onreadystatechange = function() {"
                + "  if (xhr.readyState == 4) {" + "    callback(xhr.responseText);" + "  }" + "};" + "xhr.send();");
        LogUtils.debug("waited for ajaxComplete");
    }

    private void waitForJQueryLoad() {
        LogUtils.debug("waiting for waitForJQueryLoad");
        try {
            ExpectedCondition<Boolean> jQueryLoad = driver -> ((Long) ((JavascriptExecutor) driver)
                    .executeScript("return jQuery.active") == 0);

            boolean jqueryReady = (Boolean) jsExec.executeScript("return jQuery.active==0");

            if (!jqueryReady) {
                wait.until(jQueryLoad);
            }
        } catch (WebDriverException ignored) {
            LogUtils.info(ignored.getMessage());
        }
        LogUtils.debug("waited for waitForJQueryLoad");
    }

    private void waitForAngularLoad() {
        LogUtils.debug("waiting for waitForAngularLoad");
        String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
        angularLoads(angularReadyScript);
        LogUtils.debug("waited for waitForAngularLoad");
    }

    private void waitUntilJSReady() {
        try {
            LogUtils.debug("waiting for waitUntilJSReady");
            ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver)
                    .executeScript("return document.readyState").toString().equals("complete");

            boolean jsReady = jsExec.executeScript("return document.readyState").toString().equals("complete");

            if (!jsReady) {
                wait.until(jsLoad);
            }
        } catch (WebDriverException ignored) {
            LogUtils.info(ignored.getMessage());
        }
        LogUtils.debug("waited for waitUntilJSReady");
    }

    private void waitUntilJQueryReady() {
        LogUtils.debug("waiting for waitUntilJQueryReady");
        Boolean jQueryDefined = (Boolean) jsExec.executeScript("return typeof jQuery != 'undefined'");
        if (jQueryDefined) {
            poll(20);

            waitForJQueryLoad();

            poll(20);
        }
        LogUtils.debug("waited for waitUntilJQueryReady");
    }

    public void waitUntilAngularReady() {
        LogUtils.debug("waiting for waitUntilAngularReady");
        try {
            Boolean angularUnDefined = (Boolean) jsExec.executeScript("return window.angular === undefined");
            LogUtils.debug("waiting for waitUntilAngularReady:" + angularUnDefined);
            if (!angularUnDefined) {
                Boolean angularInjectorUnDefined = (Boolean) jsExec
                        .executeScript("return angular.element(document).injector() === undefined");
                LogUtils.debug("waiting for waitUntilAngularReady:" + angularInjectorUnDefined);
                if (!angularInjectorUnDefined) {
                    poll(20);

                    waitForAngularLoad();

                    poll(20);
                }
            }
        } catch (WebDriverException ignored) {
            LogUtils.info(ignored.getMessage());
        }
        LogUtils.debug("waited for waitUntilAngularReady");
    }

    private void waitUntilAngular5Ready() {
        LogUtils.debug("waiting for waitUntilAngular5Ready");
        try {
            Object angular5Check = jsExec
                    .executeScript("return getAllAngularRootElements()[0].attributes['ng-version']");
            if (angular5Check != null) {
                Boolean angularPageLoaded = (Boolean) jsExec
                        .executeScript("return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1");
                if (!angularPageLoaded) {
                    poll(20);

                    waitForAngular5Load();

                    poll(20);
                }
            }
        } catch (WebDriverException ignored) {
            LogUtils.debug(ignored.getMessage());
        }
        LogUtils.debug("waited for waitUntilAngular5Ready");
    }

    private void waitForAngular5Load() {
        LogUtils.debug("waiting for waitForAngular5Load");
        String angularReadyScript = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1";
        angularLoads(angularReadyScript);
        LogUtils.debug("waited for waitForAngular5Load");
    }

    private void angularLoads(String angularReadyScript) {
        LogUtils.debug("waiting for angularLoads");
        try {
            ExpectedCondition<Boolean> angularLoad = driver -> Boolean
                    .valueOf(((JavascriptExecutor) driver).executeScript(angularReadyScript).toString());

            boolean angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());
            LogUtils.debug("waiting for angularReady:" + angularReady);
            if (!angularReady) {

                while (angularReady != true) {

                    angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());

                    staticSleep(2000);
                    // wait.until(angularLoad);
                }

            }
        } catch (WebDriverException ignored) {
            LogUtils.debug(ignored.getMessage());
        }
        LogUtils.debug("waited for angularLoads");
    }

    public void waitAllRequest() {
        LogUtils.debug("waiting for conditions");
        waitUntilJSReady();
        ajaxComplete();
        waitUntilJQueryReady();
        waitUntilAngularReady();
        // waitUntilAngular5Ready();
        LogUtils.debug("waiting done");
    }

    /**
     * Method to make sure a specific element has loaded on the page
     *
     * @param
     * @param expected
     */
    public void waitForElementAreComplete(String locator, int expected) {
        LogUtils.info("waitin for " + locator);
        ExpectedCondition<Boolean> angularLoad = driver -> {
            int loadingElements = driver.findElements(getLocator(locator)).size();
            LogUtils.info("waitin for " + loadingElements);
            System.out.println(loadingElements >= expected);
            return loadingElements >= expected;
        };
        LogUtils.info("waitin for " + angularLoad);
        wait.until(angularLoad);
    }

    /**
     * Waits for the elements animation to be completed
     *
     * @param css
     */
    private void waitForAnimationToComplete(String css) {
        ExpectedCondition<Boolean> angularLoad = driver -> {
            int loadingElements = driver.findElements(By.cssSelector(css)).size();
            return loadingElements == 0;
        };
        wait.until(angularLoad);
    }

    private void poll(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // ------------------------

    private WebElement getElement(String locator) {
        String[] element = locator.split("__");
        try {
            switch (element[0].toUpperCase()) {

                case "XPATH":
                    return driver.findElement(By.xpath(element[1]));
                case "ID":
                    return driver.findElement(By.id(element[1]));
                case "CLASS":
                    return driver.findElement(By.className(element[1]));
                case "TAG":
                    return driver.findElement(By.tagName(element[1]));
                case "PARTIALLINKTEXT":
                    return driver.findElement(By.partialLinkText(element[1]));
                case "LINKTEXT":
                    return driver.findElement(By.linkText(element[1]));
                case "CSS":
                    return driver.findElement(By.cssSelector(element[1]));
                default:
                    System.err.print("Invalid choice");
                    break;
            }

        } catch (Exception e) {
            return null;
        }
        return null;
    }

    private List<WebElement> getElements(String locator) {
        String[] element = locator.split("__");
        try {
            switch (element[0].toUpperCase()) {

                case "XPATH":
                    return driver.findElements(By.xpath(element[1]));
                case "ID":
                    return driver.findElements(By.id(element[1]));
                case "CLASS":
                    return driver.findElements(By.className(element[1]));
                case "TAG":
                    return driver.findElements(By.tagName(element[1]));
                case "PARTIALLINKTEXT":
                    return driver.findElements(By.partialLinkText(element[1]));
                case "LINKTEXT":
                    return driver.findElements(By.linkText(element[1]));
                case "CSS":
                    return driver.findElements(By.cssSelector(element[1]));
                default:
                    System.err.print("Invalid choice");
                    break;
            }

        } catch (Exception e) {
            return null;
        }
        return null;
    }


    private By getLocator(String locator) {

        try {
            String[] element = locator.split("__");
            switch (element[0].toUpperCase()) {

                case "XPATH":
                    return By.xpath(element[1]);
                case "ID":
                    return By.id(element[1]);
                case "CLASS":
                    return By.className(element[1]);
                case "TAG":
                    return By.tagName(element[1]);
                case "PARTIALLINKTEXT":
                    return By.partialLinkText(element[1]);
                case "LINKTEXT":
                    return By.linkText(element[1]);
                case "CSS":
                    return By.cssSelector(element[1]);
                case "NAME":
                    return By.name(element[1]);
                default:
                    System.err
                            .print("Invalid choice of element locator,kindly check the locator and locator format in OR\n");
                    break;
            }

        } catch (Exception e) {
            LogUtils.error("Could not extract the locator", e);
            throw e;
        }
        return null;
    }

    private void getScreenShot() {

        try {
            if (!isScreenShotCaptured) {


                // Call getScreenshotAs method to create image file
                TakesScreenshot scrShot = ((TakesScreenshot) driver);
                File f = scrShot.getScreenshotAs(OutputType.FILE);

                Allure.addAttachment("Screenshot", FileUtils.openInputStream(f));
                isScreenShotCaptured = true;
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void setText(String locator, Keys keyevent) {

        WebElement element = null;
        try {

            waitForElementPresent(locator);
            element = getElement(locator);

            waitForElementVisible(locator);

            // waitUntilAngular5Ready();
            waitForAngularLoad();
            element.sendKeys(keyevent);

        } catch (Exception e) {
            getScreenShot();
            e.printStackTrace();
            throw e;
        }
    }

    private void click(String locator, @Optional("") String value) {


        if (value == null || value.equals("")) {
            executeJSScript(scrollElementIntoMiddle, locator);
            click(locator);
        } else {
            executeJSScript(scrollElementIntoMiddle, String.format(locator, value));
            click(String.format(locator, value));
        }

    }

    public void perform(String type, String locator, @Optional("") String value) {

        String[] value_arr, DL_arr;
        int counter = 0;

        if (locator == null || type == null)
            throw new RuntimeException("Locator and type can not be null, LOCATOR: " + locator + " , TYPE: " + type);
        LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value);
        switch (type) {
            /*      Use VerifyDropdownList to verify values of a dropdown.
             * 		Make sure to add all values of drodown as iteration will happen for all elements
             * 		Before and after performing below action make sure to click the dropdown element under test.
             */
            case "VerifyDropdownList":
                DL_arr = StringEscapeUtils.unescapeJava(value.replace("[", "").replace("\"", "").replace("]", "")).split(",");
                waitAllRequest();
                List<WebElement> verifyelements = getElements(locator);
                LogUtils.info("Length of elements: " + verifyelements.size() + ", Length of value: " + DL_arr.length);
                if (DL_arr.length == verifyelements.size()) {
                    for (WebElement values : verifyelements) {
                        if (values.getText() != null) {
                            if (DL_arr[counter].trim().equalsIgnoreCase(values.getText().trim())) {
                                LogUtils.info("Dropdown value of locator matches with db value.");
                            } else {
                                Allure.step("And compares dropdown values", Status.FAILED);
                                getScreenShot();
                                throw new AssertionError("Values did not match:"
                                        + "\nActual value: [" + values.getText() + "]  ||  " + "Expected value: [" + DL_arr[counter]
                                        + "]\nLocator: " + locator);
                            }
                        } else {
                            Allure.step("And compares dropdown values", Status.FAILED);
                            getScreenShot();
                            throw new AssertionError("Null value received while iterating."
                                    + "\nActual value: [" + values.getText() + "]  ||  " + "Expected value: [" + DL_arr[counter]
                                    + "]\nLocator: " + locator);
                        }
                        counter++;
                    }
                } else {
                    if (verifyelements.isEmpty()) {
                        Allure.step("And compare dropdown values", Status.FAILED);
                        getScreenShot();
                        LogUtils.error("Make sure squencing of action is correct in schema.");
                        throw new AssertionError("Given locator is giving empty value : "
                                + "\nActual value: [" + verifyelements.size() + "]  ||  " + "Expected value: [" + DL_arr.length
                                + "]\nLocator: " + locator);
                    } else {
                        for (WebElement values : verifyelements) {
                            LogUtils.info(values.getText());
                        }
                        Allure.step("And compare dropdown values", Status.FAILED);
                        getScreenShot();
                        throw new AssertionError("Mismatch in number of values in db as compared with elements on page: "
                                + "\nActual value: [" + verifyelements.size() + "]  ||  " + "Expected value: [" + DL_arr.length
                                + "]\nLocator: " + locator);
                    }
                }
                Allure.step("And compare dropdown values", Status.PASSED);
                break;
            case "TextBoxList":

                value = value.trim();
                value = value.substring(1, value.length() - 1);
                value_arr = value.split(",");
                List<WebElement> elements = getElements(locator);

                for (int i = 0; i < value_arr.length; i++) {
                    LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value_arr[i]);
                    //clearText(locator);
                    elements.get(i).clear();
                    elements.get(i).sendKeys(value_arr[i]);
                }
                //	click(locator, value)

                break;
            case "DropdownList":
                value = value.trim();
                value = value.substring(1, value.length() - 1);
                value_arr = value.split(",");
                System.out.println("Size of Value Array is" + value_arr.length);

                for (int i = 0; i < value_arr.length; i++) {
                    LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value_arr[i]);
                    JSClickList(String.format(locator, value_arr[i]), i, value_arr.length);
                }
                break;

            case "DatePickerList":
                value = value.trim();
                value = value.substring(1, value.length() - 1);
                value_arr = value.split(",");
                System.out.println("Size of Value Array is" + value_arr.length);
                List<WebElement> dobElements = getElements(locator);

                for (int i = 0; i < value_arr.length; i++) {

                    LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value_arr[i]);
                    WebElement dob = dobElements.get(i);
                    dob.sendKeys(Keys.TAB);
                    dob.click();
                    dob.sendKeys(Utils.calculateDateToString("dd/MM/yyyy", value_arr[i]));
                    dob.sendKeys(Keys.TAB);


                }
                break;

            case "DatePickerReact":
                waitAllRequest();
                getElement(locator).click();
                waitAllRequest();
                String Day, Month, Year;
                Month = "//div[@class='react-datepicker__month-container']/div/div/select/following::select/option[" + value.split("/")[1] + "]";
                Year = "XPATH__//div/select[1]/option[@value=" + value.split("/")[2] + "]";
                Day = "//div[@class='react-datepicker__week']/div[@class='react-datepicker__day react-datepicker__day--0" + value.split("/")[0];

//            	Select Year
                System.out.println(Year);
                getElement(Year).click();
//            	Select Month
                System.out.println(Month);
                driver.findElement(By.xpath(Month)).click();

//            	Identifying day
                waitAllRequest();
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, Integer.parseInt(value.split("/")[2]));
                cal.set(Calendar.MONTH, Integer.parseInt(value.split("/")[1]) - 1);
                cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(value.split("/")[0]));
                Date df = cal.getTime();
                SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
                String stringDay = sdf.format(df);
                LogUtils.info("For given date day is: " + stringDay);

//            	Select Day
                if (stringDay.equalsIgnoreCase("Sunday") || stringDay.equalsIgnoreCase("Saturday")) {
                    driver.findElement(By.xpath(Day + " react-datepicker__day--weekend" + "']")).click();
                } else {
                    driver.findElement(By.xpath(Day + "']")).click();
                }
                break;

            case "HealthNomineeList":
                value = value.trim();
                value = value.substring(1, value.length() - 1);
                value_arr = value.split(",");
                System.out.println("Size of Value Array is" + value_arr.length);

                List<WebElement> element = getElements("XPATH__//div[@data-auto='relationship']");
                System.out.println("Size of Nominee List is" + element.size());
                Actions actions = new Actions(driver);
                JavascriptExecutor jse = (JavascriptExecutor) driver;


                for (int i = 0; i < value_arr.length; i++) {

                    LogUtils.info("TYPE: " + type + ", Locator: " + element.get(i).getLocation());
                    actions.moveToElement(element.get(i)).click().build().perform();
                    staticSleep(500);
                    LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value_arr[i]);
                    JSClick(String.format(locator, i, value_arr[i]));
                    waitAllRequest();

                }
                break;
            case "CheckboxList":

                value = value.trim();
                value = value.substring(1, value.length() - 1);
                value_arr = value.split(",");
                System.out.println("Size of Value Array is" + value_arr.length);

                for (int i = 0; i < value_arr.length; i++) {
                    LogUtils.info("TYPE: " + type + ", Locator: " + locator + " , Value: " + value_arr[i]);
                    JSClick(String.format(locator, value_arr[i]));
                }
                break;
            case "TextBox":
                //	click(locator, value);
                clearText(locator);
                setText(locator, value);
                break;
            case "RadioButton":
                JSClick(String.format(locator, value));
                break;
            case "DropDown":
                click(locator, value);
                break;
            case "Button":
                click(locator, value);
                break;
            case "CheckBox":
                click(locator, value);
                break;
            case "DatePicker":
                setText(locator, Keys.TAB);
                click(locator);
                clearText(locator);
                setText(locator, value);
                if (locator.contains("registrationdate-datepicker")) {
                    staticSleep(800);
                } else {
                    staticSleep(500);
                }
                setText(locator, Keys.TAB);
                break;

            case "ErrorCatch":
                try {
                    click(locator);
                    //setText(locator, value);
                } catch (Exception | Error e) {
                    LogUtils.info("Error on the Page is handled " + e.getMessage());
                }
                break;
            case "Upload":
                robotUploadFile(value);
                break;
            case "GetText":
                waitForElementPresent(locator);
                try {
                    LogUtils.info("Trying to fetch the text using value attribute");
                    TestContext.getInstance().setData(value, getAttribute(locator, "value"));
                    LogUtils.info("Fetched the text using value attribute");
                } catch (RuntimeException e) {
                    if (e.getMessage().equalsIgnoreCase("Value is null while setting in content")) {
                        LogUtils.info("Failed to fetch the text using value attribute");
                        LogUtils.info("Trying to fetch the text using getText");
                        TestContext.getInstance().setData(value, getElement(locator).getText());
                        LogUtils.info("Fetched the text using getText");
                    } else
                        throw e;
                }
                break;
            case "OnlyTextBox":
                setText(locator, Keys.TAB);
                setText(locator, value);
                break;
            case "ProfileAgeDropdownList":

                break;

            case "Verify":
                verifyText(locator, value);
                break;
            case "Key":
                Keys key = Keys.valueOf(value);
                setText(locator, key);
                LogUtils.info("Performed action: " + key.name() + " on " + locator);
                waitAllRequest();
                break;

            default:
                LogUtils.info("Enter valid element type or check the case of the input-type");
                break;
        }
    }

    public void verifyText(String locator, String expValue) {
        waitForElementVisible(locator);
        waitAllRequest();
        try {
            String actValue = getAttribute(locator, "innerText").trim();
            if (actValue.equals("")) {
                actValue = getAttribute(locator, "value");
            }
            LogUtils.info("Actual value: " + actValue + "  ||  " + "Expected value: " + expValue);
            if (!actValue.equalsIgnoreCase(expValue))
                throw new AssertionError("Values did not match:"
                        + "\nActual value: " + actValue + "  ||  " + "Expected value: " + expValue
                        + "\nLocator: " + locator);
        } catch (Exception | Error e) {
            e.printStackTrace();
            getScreenShot();
            throw e;
        }
    }

    public WebElement findElement(String locator) {
        return getElement(locator);
    }

    public List<WebElement> findElements(String locator) {
        List<WebElement> elements = driver.findElements(getLocator(locator));
        return elements;
    }

    public String getAttribute(String locator, String attribute) {
        waitForElementPresent(locator);
        WebElement element = getElement(locator);
        return element.getAttribute(attribute);
    }

    public void clearByJS(String locator) {
        executeJSScript("arguments[0].value='';", locator);

    }

    public boolean waitUntilElementClickable(String locator) {
        waitForElementPresent(locator);
        waitForElementVisible(locator);
        int retry = 0;
        WebElement element = waitElementToBeClickable(locator);
        while (element == null && retry++ <= 5) {
            try {
                LogUtils.info("Retry : " + retry);
                element = waitElementToBeClickable(locator);
                if (element != null) {
                    LogUtils.info("ENABLED: " + element.isEnabled() + ", getAttribute named disable: " + element.getAttribute("disable"));
                    if (element.getAttribute("disable") == null)
                        return true;
                }
            } catch (Exception ex) {

            }
        }
        return element != null && element.getAttribute("disable") == null;
    }

    public String getCurrentURl() {
        return driver.getCurrentUrl();
    }

    public String getClipboardContent() {
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            Transferable t = cb.getContents(null);
            if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
                return t.getTransferData(DataFlavor.stringFlavor).toString();
            else
                return null;
        } catch (UnsupportedFlavorException | IOException ex) {
            return null;
        }
    }

    public void hoverOver(String locator) {
        Actions act = new Actions(driver);
        act.moveToElement(getElement(locator)).build().perform();
    }

    public void waitForWindowToClose() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
    }

    public void switchToParentWindow() {
        try {
            driver.switchTo().window(parentWindow);
        } catch (Exception e) {
            Allure.step("Switching to parent window", Status.FAILED);
        }
    }


    public void robotUploadFile(String fileName) {

        File file = new File("src/main/resources/media/" + fileName);
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        String currWindow = getWebDriver().getWindowHandle();
        LogUtils.info("Uploading file: " + file.getAbsolutePath());
        // Copy to clipboard

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        staticSleep(1000);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        getWebDriver().switchTo().window(currWindow);

        // Open Goto window(Simulating Cmd + Shift + G)
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        // Paste the clipboard value(Simulating Cmd + V)
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        staticSleep(1000);

        // Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        LogUtils.info("Exiting file upload function");
    }


}
