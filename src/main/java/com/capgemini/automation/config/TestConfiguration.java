package com.capgemini.automation.config;


import com.capgemini.automation.screens.LandingScreen;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.yml")
@ComponentScan(basePackages = {"com.capgemini.automation"})
public class TestConfiguration {
    @Autowired
    private Environment environment;

    @Autowired
    public WebDriver webDriver;

    @Bean(name = "webDriver")
    public WebDriver webDriver() {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();

        return webDriver;
    }

    @Bean
    public String urlSitename() {
        String urlSitename = environment.getProperty("url.site_name");
        return urlSitename;
    }

    @Bean
    @DependsOn("webDriver")
    public LandingScreen landingScreen() {
        return new LandingScreen(webDriver);
    }
}
