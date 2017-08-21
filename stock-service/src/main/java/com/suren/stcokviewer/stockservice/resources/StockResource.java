package com.suren.stcokviewer.stockservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yahoofinance.quotes.stock.StockQuote;

import java.util.List;

/**
 * Created by Surendirababu Janarthanan on 8/15/2017.
 */
@RestController
@RequestMapping("/rest/stock")
public class StockResource {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{username}")
    public List<String> getStock(@PathVariable("username") final String username)
    {

    ResponseEntity<List<String>> responseEntity = restTemplate.exchange("http://localhost:8300/rest/db/" + username, HttpMethod.GET,null, new ParameterizedTypeReference<List<String>>() {
       });
    List<String> response= responseEntity.getBody();
    return response;
    }
}
