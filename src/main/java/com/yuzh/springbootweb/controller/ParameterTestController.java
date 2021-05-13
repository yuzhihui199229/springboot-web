package com.yuzh.springbootweb.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ParameterTestController {
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id, @PathVariable("username")String name, @PathVariable Map<String,Object> pv, @RequestHeader("User-Agent")String userAgent,@RequestHeader Map<String,String> header) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("userAgent", userAgent);
        map.put("header", header);
        return map;
    }

    @PostMapping("/params}")
    public Map<String,Object> getParams(@RequestParam("id") Integer id, @RequestBody User user, HttpServletRequest request) {
        return null;
    }
}
