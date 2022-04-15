package com.example.reviewprojcet.entity;

import com.example.reviewprojcet.dto.ProjectDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long seq;

    @Column(nullable = false)
    String projectName;

    @Column(nullable = false)
    String groupMember;

    @Column(nullable = false)
    String creater;

    @Column(nullable = false)
    String recentUpdateTime;



}
