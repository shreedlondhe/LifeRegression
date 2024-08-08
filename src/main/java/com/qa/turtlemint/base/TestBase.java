package com.qa.turtlemint.base;

import com.qa.turtlemint.util.LogUtils;
import com.qa.turtlemint.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/qa/turtlemint/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void initialization() {
        String browserName = prop.getProperty("browser");
        LogUtils.info("Browser name: " + browserName);
        if (browserName.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--remote-allow-origins=*");
            options.setBrowserVersion("126");
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("--incognito");
            options.addArguments("--disable-application-cache");
          driver = new ChromeDriver(options);

            String osName = System.getProperty("os.name");
            LogUtils.info("osName: " + osName);
            if (osName.toLowerCase().contains("linux")) {
//					WebDriverManager.chromedriver().setup();
                options.addArguments("--headless");
                options.addArguments("--incognito");
                options.addArguments(("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
                        + "AppleWebKit/537.36 (KHTML, like Gecko)"
                        + "Chrome/103.0.0.0 Safari/537.36"));
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
//				options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
//				WebDriver driver = new ChromeDriver(options);

            }
              // driver = new ChromeDriver(options);

            Dimension newDimension = new Dimension(1200, 800);
            driver.manage().window().setSize(newDimension);
            Dimension currentDimension = driver.manage().window().getSize();
            int height = currentDimension.getHeight();
            int width = currentDimension.getWidth();
            System.out.println("Current height: " + height);
            System.out.println("Current width: " + width);
            driver.manage().deleteAllCookies();

            driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_time, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.implicit_wait));


           // driver.get(System.getProperty("url")); // Only for Jenkins Uncomment this line
          driver.get(prop.getProperty("localurl"));
        }

    }
}
