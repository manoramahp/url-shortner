package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by manorama on 12/21/17.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/url")
    public String shortUrl(@RequestParam(value="url")String url) {
        String shortnedUrl = null;
        return shortnedUrl;
    }

    @RequestMapping("/stats")
    public String stats(@RequestParam(value="url")String url) {
        String stats = null;
        return stats;
    }

}
