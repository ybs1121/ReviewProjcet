package com.example.reviewprojcet.repository;

import com.example.reviewprojcet.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepostory extends JpaRepository<Article,Long> {

}
