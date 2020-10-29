package com.sunshine.community.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GithubUser {
    private String login;
    private Long id;
    private String name;
    private String bio;
    private String avatarUrl;
}
