package com.qa.turtlemint.context;

import com.qa.turtlemint.util.LogUtils;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.testng.Assert;


public class CustomAssert {
    public static LogUtils logUtils = new LogUtils();

    public CustomAssert() {
    }

    public static void assertEqual(String actVal, String exVal, String message) {
        try {
            LogUtils var10000;
            if (message != null) {
                var10000 = logUtils;
                LogUtils.info(message + " Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal, message);
            } else {
                var10000 = logUtils;
                LogUtils.info("Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal);
            }

            Allure.step(message, Status.PASSED);
        } catch (Throwable var4) {
            Allure.step(message, Status.FAILED);
            throw var4;
        }
    }

    public static void assertTrue(Boolean condition, String message) {
        try {
            LogUtils var10000;
            if (message != null) {
                var10000 = logUtils;
                LogUtils.info(message + " Condition :[" + condition + "]");
                Assert.assertTrue(condition, message);
            } else {
                var10000 = logUtils;
                LogUtils.info("Condition" + condition + "]");
                Assert.assertTrue(condition);
            }

            Allure.step(message, Status.PASSED);
        } catch (Throwable var3) {
            Allure.step(message, Status.FAILED);
        }

    }

    public static void assertEqual(int actVal, int exVal, String message) {
        try {
            if (message != null) {
                LogUtils.info(message + " Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal, message);
            } else {
                LogUtils.info("Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal);
            }

            Allure.step(message, Status.PASSED);
        } catch (Throwable var4) {
            Allure.step(message, Status.FAILED);
            throw var4;
        }
    }

    public static void assertEqual(int actVal, int exVal, String message, Boolean flag) {
        try {
            if (message != null) {
                LogUtils.info(message + " Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal, message);
            } else {
                LogUtils.info("Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal);
            }

            if (flag) {
                Allure.step(message, Status.PASSED);
            }

        } catch (Throwable var5) {
            Allure.step(message, Status.FAILED);
            throw var5;
        }
    }

    public static void assertEqual(long actVal, long exVal, String message) {
        try {
            if (message != null) {
                LogUtils.info(message + " Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal, message);
            } else {
                LogUtils.info("Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal);
            }

            Allure.step(message, Status.PASSED);
        } catch (Throwable var6) {
            Allure.step(message, Status.FAILED);
            throw var6;
        }
    }


    public static void assertEqual(Boolean actVal, Boolean exVal, String message) {
        try {
            LogUtils var10000;
            if (message != null) {
                var10000 = logUtils;
                LogUtils.info(message + " Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal, message);
                Allure.step(message, Status.PASSED);
            } else {
                var10000 = logUtils;
                LogUtils.info("Actual :[" + actVal + "], expected :[" + exVal + "]");
                Assert.assertEquals(actVal, exVal);
            }

        } catch (Throwable var4) {
            Allure.step(message, Status.FAILED);
            throw var4;
        }
    }

    public static void assertEqual(Boolean actVal, Boolean exVal) {
        try {
            assertEqual(actVal, exVal, null);
            Allure.step("Boolean value assertion", Status.PASSED);
        } catch (Throwable var3) {
            Allure.step("Boolean value assertion", Status.FAILED);
            throw var3;
        }
    }
}
