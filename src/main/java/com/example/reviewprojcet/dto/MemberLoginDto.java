package com.example.reviewprojcet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class MemberLoginDto {

    private String id;
    private String password;
}
