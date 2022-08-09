package com.sudo.resource;

import com.sudo.service.JokesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Component
public class JokesResourceImpl implements JokesResource{

    Logger LOGGER = LoggerFactory.getLogger(JokesResourceImpl.class);

    @Autowired
    JokesService jokesService;

    @Override
    public Map<String,Object> safeJokesResource() throws Exception{
        LOGGER.info("Servicing safe jokes");
        return jokesService.safeJokeService();
    }

    @Override
    public Map<String,Object> nsfwJokesResource() throws Exception{
        LOGGER.info("Servicing nsfw jokes");
        return jokesService.nsfwJokeService();
    }
}
