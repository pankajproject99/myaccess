package com.example.myaccess.service;

import com.example.myaccess.controller.MyAccessApiController;
import com.example.myaccess.model.RequestCreateUser;
import com.example.myaccess.model.ResponseCreateUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyAccessApiService {
    public ResponseCreateUser createUsers(RequestCreateUser requestCreateUser) {
        log.info("Create user service");
        return new ResponseCreateUser("janus username");
    }
}
