package com.article.articlemanagesystem.service.impl;

import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.ArticleExample;
import com.article.articlemanagesystem.mapper.ArticleMapper;
import com.article.articlemanagesystem.service.ArticleService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

/*    @Autowired
    private LikeMapper likeMapper;*/

    @Override
    public void publish(Article article) {
        articleMapper.insert(article);
    }

    @Override
    public Article findById(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Article> findByTitle(String title) {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andTitleLike(title);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public List<Article> findByAuthor(String  authorUsername) {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andAuthorLike(authorUsername);
        List<Article> articles = articleMapper.selectByExample(articleExample);
        return articles;
    }

    @Override
    public List<Article> getAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Article> articles = articleMapper.selectByExample(new ArticleExample());
        return articles;
    }

    @Override
    public void deleteById(Long id) {
        articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Article article) {
        articleMapper.updateByPrimaryKey(article);
    }

}
