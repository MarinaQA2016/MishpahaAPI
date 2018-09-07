package ru.stqa.selenium.api;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.stqa.selenium.SuiteConfiguration;
import ru.stqa.selenium.factory.WebDriverPool;

import java.io.IOException;
import java.net.URL;

/**
 * Base class for TestNG-based test classes
 */
public class UnAuthorizedApiBase extends ApiBase{

  public static HttpHeaders headers;

  @BeforeSuite
  public void initTestSuite() throws IOException {
    headers = new HttpHeaders();
    restTemplate = new RestTemplate();
    requestEntity = new HttpEntity<>("headers");
  }



}
