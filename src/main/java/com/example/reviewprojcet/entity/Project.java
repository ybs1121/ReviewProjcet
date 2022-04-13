package com.example.reviewprojcet.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
