package com.example.demo.rest;

import com.example.demo.urlHandler.WebScraper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class UserApi {

    @GetMapping("url/{keyword}")
    public String getUrlByKey(@PathVariable String keyword)  {
        WebScraper scrap = new WebScraper();
        return scrap.urlByKey(keyword);
    }
}
