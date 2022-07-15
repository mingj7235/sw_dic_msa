package com.example.swuserservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final Environment env;

    @GetMapping ("/health-check")
    public String check () {
        return String.format("It's working. Port : %s", env.getProperty("local.server.port"));
    }
}
