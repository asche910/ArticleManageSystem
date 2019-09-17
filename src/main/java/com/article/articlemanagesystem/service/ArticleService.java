package com.article.articlemanagesystem.service;

import com.article.articlemanagesystem.entity.Article;

import java.util.List;

public interface ArticleService {

    void publish(Article article);

    Article findById(Long id);

    List<Article> findByTitle(String title);

    List<Article> findByAuthor(String authorUsername);

    List<Article> getAll(Integer pageNum, Integer pageSize);

    void deleteById(Long id);

    void update(Article article);
}
