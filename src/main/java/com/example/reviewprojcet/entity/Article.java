package com.example.reviewprojcet.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long seq;

    @Column(nullable = false)
    String id;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String context;

    @Column
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    LocalDate regDate;
}
