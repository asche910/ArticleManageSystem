package com.article.articlemanagesystem.service;

import com.article.articlemanagesystem.entity.Comment;

import java.util.List;

public interface CommentService {

    void publish(Comment comment);

    Comment findById(Integer id);

    List<Comment> findByArticleId(Long articleId);

    List<Comment> findByAuthor(String authorUsername);

    List<Comment> getAll(Integer pageNum, Integer pageSize);

    void deleteById(Integer id);

    void update(Comment article);

}
