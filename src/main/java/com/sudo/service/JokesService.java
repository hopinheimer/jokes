package com.sudo.service;

import java.util.Map;

public interface JokesService {

    public Map<String,Object> nsfwJokeService() throws Exception;

    public Map<String,Object> safeJokeService() throws Exception;
}
