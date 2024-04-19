package com.org.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class restController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public ResponseEntity<String> getDetails(){
        return new ResponseEntity<>("HelloWord", HttpStatus.OK);
    }
}
