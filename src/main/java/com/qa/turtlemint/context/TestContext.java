package com.qa.turtlemint.context;

import com.qa.turtlemint.util.LogUtils;

import java.util.HashMap;
import java.util.Map;

public class TestContext {
    CustomAssert asserts = new CustomAssert();
    private static TestContext textContent;
    private final Map<String, Object> data = new HashMap<>();

    private TestContext() {
    }

    public static TestContext getInstance() {
        if (textContent == null) {
            textContent = new TestContext();
        }
        return textContent;
    }

    public String getData(String key) {
        if (!data.containsKey(key)) {
            CustomAssert.assertTrue(false, "No value for key " + key + " In TestContext");
        }
        return data.get(key).toString();
    }

    public Object get(String key) {
        return data.get(key);
    }

    public void setData(String key, Object value) {
        LogUtils.debug("setData: KEY: " + key + ", VALUE: " + value);
        if (value == null) {
            throw new RuntimeException("Value is null while setting in content");
        }
        data.put(key, value);
    }
}
