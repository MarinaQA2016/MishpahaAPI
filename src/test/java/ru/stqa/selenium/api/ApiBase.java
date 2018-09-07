package ru.stqa.selenium.api;

import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Inka on 21-Jun-18.
 */
public class ApiBase {
    public static RestTemplate restTemplate;
    public HttpEntity<String> requestEntity;
    static public String url = "https://mishpahug-backend.herokuapp.com";
}
