package com.sudo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class JokesServiceImpl implements JokesService{

    //private RestTemplate restTemplate;

    private static String jokeApiBaseUrl = "https://v2.jokeapi.dev/joke/Any";

    Logger LOGGER = LoggerFactory.getLogger(JokesServiceImpl.class);

    public Map<String,Object> safeJokeService() throws Exception{
        Map<String,Object> response = new HashMap<>();
         RestTemplate restTemplate = new RestTemplate();
        try{
           response = restTemplate.getForObject(jokeApiBaseUrl+"?safe-mode=1",Map.class);
            LOGGER.info("{}",response);
        }catch (RestClientException ignore){
        }
         return response;
    }

    public Map<String,Object> nsfwJokeService() throws Exception{

        RestTemplate restTemplate = new RestTemplate();
        Map<String,Object> response = new HashMap<>();

        try{
            response = restTemplate.getForObject(jokeApiBaseUrl+"?safe-mode=0",Map.class);
            LOGGER.info("{}",response);
        }catch (RestClientException ignore){
        }

        return response;
    }
}
