package com.sunshine.community.model;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String bio;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
