package com.example.reviewprojcet.dto;


import com.example.reviewprojcet.entity.Article;
import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class ArticleDto {

    String title;

    String context;

    String id;

    public Article toEntity(String id){
        return new Article(null,id,title,context,null);
    }
}
