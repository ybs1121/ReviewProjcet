package com.example.reviewprojcet.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class ProjectDto {

    Long seq;

    String projectName;

    String groupMember;

    String create;

    String recentUpdateTime;

}
