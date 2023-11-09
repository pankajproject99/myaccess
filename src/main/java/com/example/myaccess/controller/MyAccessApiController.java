package com.example.myaccess.controller;

import com.example.myaccess.model.RequestCreateUser;
import com.example.myaccess.model.ResponseCreateUser;
import com.example.myaccess.service.MyAccessApiService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MyAccessApiController {
    @Autowired
    MyAccessApiService myAccessApiService;

    @GetMapping("/ping")
    public ResponseEntity<String> myAccessPing() {
        return ResponseEntity.ok("success");
    }

    @PostMapping("/Users")
    public ResponseEntity<ResponseCreateUser> createUsers(@RequestBody RequestCreateUser requestCreateUser) {
        log.info("Create user controller" + requestCreateUser);
        return ResponseEntity.ok(myAccessApiService.createUsers(requestCreateUser));
    }
}
