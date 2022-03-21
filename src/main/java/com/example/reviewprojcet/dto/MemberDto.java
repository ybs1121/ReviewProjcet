package com.example.reviewprojcet.dto;

import com.example.reviewprojcet.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class MemberDto {
    private String id;
    private String password;
    private String email;

    public Member toEntity() {
        return new Member(null,id,password,email);
    }
}
