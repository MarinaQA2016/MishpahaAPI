package ru.stqa.selenium.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

/**
 * Base class for TestNG-based test classes
 */
public class AuthorizedApiBase extends ApiBase{

  public static HttpHeaders headers;

  static public String authorization = "Basic bWFyaW5hQDEyMy5jb206bWFyaW5h";

  @BeforeSuite
  public void initTestSuite() throws IOException {
    headers = new HttpHeaders();
    restTemplate = new RestTemplate();
    headers.add("Authorization", authorization);
    requestEntity = new HttpEntity<>(headers);
  }



}
