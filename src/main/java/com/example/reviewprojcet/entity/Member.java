package com.example.reviewprojcet.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long seq;

    @Column(nullable = false)
    String id;

    @Column(nullable = false)
    String password;


}
