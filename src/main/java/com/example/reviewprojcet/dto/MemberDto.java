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
    private Long seq;
    private String id;
    private String password;


    public Member toEntity() {
        return new Member(seq,id,password);
    }
}
