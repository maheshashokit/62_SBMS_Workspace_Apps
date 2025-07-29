package com.ashokit.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.Country;
import com.ashokit.service.CountryClient;

@RestController
@RequestMapping("api/countries")
public class CountryResource {
    
    private final CountryClient countryClient;

    public CountryResource(CountryClient countryClient) {
        this.countryClient = countryClient;
    }

    @GetMapping("/")
    public List<String> getAllEuropeanFrenchSpeakingCountries() throws Throwable {
        CompletableFuture<List<Country>> countriesByLanguageFuture = countryClient.getCountriesByLanguage("fr");
        CompletableFuture<List<Country>> countriesByRegionFuture = countryClient.getCountriesByRegion("europe");
        List<String> europeanFrenchSpeakingCountries;
        try {
            europeanFrenchSpeakingCountries = new ArrayList<>(countriesByLanguageFuture.get().stream().map(Country::getName).collect(Collectors.toList()));
            europeanFrenchSpeakingCountries.retainAll(countriesByRegionFuture.get().stream().map(Country::getName).collect(Collectors.toList()));
        } catch (Throwable e) {
            throw e.getCause();
        }

        return europeanFrenchSpeakingCountries;
    }
}
