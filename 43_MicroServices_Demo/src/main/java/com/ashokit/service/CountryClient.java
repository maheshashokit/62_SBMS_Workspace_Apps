package com.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.model.Country;

@Service
public class CountryClient {
    RestTemplate restTemplate = new RestTemplate();

    @Async
    public CompletableFuture<List<Country>> getCountriesByLanguage(String language) {
    	System.out.println("Current Thread::::" + Thread.currentThread().getName());
        String url = "https://restcountries.eu/rest/v2/lang/" + language + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return CompletableFuture.completedFuture(Arrays.asList(response));
    }

    @Async
    public CompletableFuture<List<Country>> getCountriesByRegion(String region) {
    	System.out.println("Current Thread-1::::" + Thread.currentThread().getName());
        String url = "https://restcountries.eu/rest/v2/region/" + region + "?fields=name";
        Country[] response = restTemplate.getForObject(url, Country[].class);

        return CompletableFuture.completedFuture(Arrays.asList(response));
    }
}