package qa.conf;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import qa.enums.Browser;
import qa.util.DriverFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

@Configuration
@ComponentScan(basePackages = "qa")
@PropertySource("classpath:/application.properties")
public class DriverConfig {

    @Value("${driver.type}")
    private Browser driverType;

    @Value("${element.wait.timeout.seconds}")
    private int webDriverWaitTimeOut;

    @Autowired
    private DriverFactory driverFactory;
    
    @Bean
    public WebDriver webDriver() throws MalformedURLException {
        return driverFactory.get(driverType);
    }


    @Bean
    public WebDriverWait waitFor() throws MalformedURLException {
        return new WebDriverWait(webDriver(),Duration.ofSeconds(webDriverWaitTimeOut));
    }


}
