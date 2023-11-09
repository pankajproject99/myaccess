package com.example.myaccess.model;

import lombok.Data;

import java.util.List;

@Data
public class RequestCreateUser {
    String username;
    List<String> groups;
}
