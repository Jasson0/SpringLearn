package com.leon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * Created by leon on 2018/2/24.
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String say(@PathVariable int id) {
        return girlProperties.getCupSize() + id;
    }

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String say2(@RequestParam(value = "id", required = false, defaultValue = "0") int id) {
        return girlProperties.getCupSize() + id;
    }
}
