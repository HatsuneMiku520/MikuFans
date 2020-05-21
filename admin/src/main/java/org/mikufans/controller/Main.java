package org.mikufans.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author admin
 * @Main
 * @2020/4/14
 */
@RestController
@RequestMapping("/main")
public class Main {

    @GetMapping("login")
    public String login(String username, String password){
        return "index";
    }





}
