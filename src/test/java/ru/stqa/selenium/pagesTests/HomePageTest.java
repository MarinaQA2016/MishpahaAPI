package ru.stqa.selenium.pagesTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.stqa.selenium.util.*;

import ru.stqa.selenium.pages.HomePageHelper;

public class HomePageTest extends TestBase {

  private HomePageHelper homepage;
  static String url = "https://mishpahug-backend.herokuapp.com/user/staticfields";
  static String url2 = "https://mishpahug-backend.herokuapp.com/user/profile";

  @BeforeMethod
  public void initPageObjects() {

    homepage = PageFactory.initElements(driver, HomePageHelper.class);
    driver.get(baseUrl);

  }

  @Test
  public void startApplicationTest() {

    System.out.println("Number of version: " + driver.findElement(By.xpath("//*[contains(text(),'version')]")).getText());
    Assert.assertFalse("".equals(homepage.header.getText()));
  }

  @Test
  public void apiVerifictionTest(){
    HttpHeaders headers = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    HttpEntity<String> requestEntity = new HttpEntity<>("headers");
    ResponseEntity<PostDTO> response = restTemplate.getForEntity(url,PostDTO.class);
    System.out.println("Common Information: " + response.getBody());
    headers.add("Authorization", "Basic bWFyaW5hQDEyMy5jb206bWFyaW5h");
    HttpEntity<String> requestEntity1 = new HttpEntity<>(headers);
    ResponseEntity<UserProfileDTO> response1 = restTemplate.exchange(url2, HttpMethod.GET, requestEntity1, UserProfileDTO.class);
    System.out.println("Profile Information: " + response1.getBody());

  }
}
