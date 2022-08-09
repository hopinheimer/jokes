package com.sudo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping(path = "/sudo")
public interface JokesResource {

    @GetMapping("/get_safe_jokes")
    public @ResponseBody Map<String,Object> safeJokesResource() throws Exception;

    @GetMapping("/get_nfsw")
    public @ResponseBody Map<String,Object> nsfwJokesResource() throws Exception;
}
