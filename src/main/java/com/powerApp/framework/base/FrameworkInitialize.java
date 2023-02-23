package com.powerApp.framework.base;

import com.powerApp.framework.config.Settings;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/**
 * Created by Ibi on 15/12/2022.
 */
public class FrameworkInitialize extends Base {

    public static void initializeBrowser(String environmentType, String Os, BrowserTypes browserType) throws MalformedURLException {
        RemoteWebDriver driver = null;
        System.out.println("\nTests are running in : " + environmentType + "\n" +
                "The Browser running is : " + browserType + "\n" +
                "The Operating system is : " + Os + "\n");
        if (environmentType.equalsIgnoreCase("local") || environmentType.equalsIgnoreCase("grid")) {
            switch (browserType) {
                case Chrome: {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                    DesiredCapabilities caps = new DesiredCapabilities().chrome();
                    HashMap<String, Object> chromePreferences = new HashMap<>();
                    chromePreferences.put("profile.password_manager_enabled", false);
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--test-type");
                    options.addArguments("chrome.switches", "--disable-extensions");
                    options.addArguments("chrome.switches", "--disable-extensions --disable-extensions-file-access-check --disable-extensions-http-throttling");
                    options.addArguments("--no-default-browser-check");
                    options.setExperimentalOption("prefs", chromePreferences);

                    if (environmentType.equalsIgnoreCase("local")) {
                        driver = new  ChromeDriver(options);
                    } else if (environmentType.equalsIgnoreCase("grid")) {
                        driver = new RemoteWebDriver(new URL(Settings.SeleniumGridHub), caps);//cap
                    }

                    LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                    Settings.logs.Write("Starting Chrome browser");
                    break;
                }
                case Firefox: {
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\browser\\geckodriver.exe");
                    DesiredCapabilities caps = new DesiredCapabilities().firefox();
                    caps.setBrowserName("firefox");

                    if (environmentType.equalsIgnoreCase("local")) {
                        driver = new FirefoxDriver(caps);
                    } else if (environmentType.equalsIgnoreCase("grid")) {
                        driver = new RemoteWebDriver(new URL(Settings.SeleniumGridHub), caps);
                    }

                    LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                    Settings.logs.Write("Starting Firefox browser");
                    break;
                }
                case IE: {
                    DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                    caps.setCapability(CapabilityType.VERSION, "10");
                    caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                    caps.setCapability(
                            InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                            true);
                    InternetExplorerOptions options = new InternetExplorerOptions();
                    options.merge(caps);
                    options.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
                    options.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, true);
                    options.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);

                    System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/browser/IEDriverServer.exe");
                    if (environmentType.equalsIgnoreCase("local")) {
                        driver = new InternetExplorerDriver(options);
                    } else if (environmentType.equalsIgnoreCase("grid")) {
                        driver = new RemoteWebDriver(new URL(Settings.SeleniumGridHub), options);
                    }

                    LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                    Settings.logs.Write("Starting IE browser");
                    break;
                }
            }
        }
    }
}
