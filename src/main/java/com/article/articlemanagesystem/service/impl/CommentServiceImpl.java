package com.article.articlemanagesystem.service.impl;

import com.article.articlemanagesystem.entity.Comment;
import com.article.articlemanagesystem.entity.CommentExample;
import com.article.articlemanagesystem.mapper.CommentMapper;
import com.article.articlemanagesystem.service.CommentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void publish(Comment article) {
        commentMapper.insert(article);
    }

    @Override
    public Comment findById(Integer id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Comment> findByArticleId(Long articleId) {
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andArticleidEqualTo(articleId);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        return comments;
    }

    @Override
    public List<Comment> findByAuthor(String authorUsername) {
        CommentExample commentExample = new CommentExample();
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andNameauthorEqualTo(authorUsername);
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        return comments;
    }

    @Override
    public List<Comment> getAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Comment> comments = commentMapper.selectByExample(new CommentExample());
        return comments;
    }

    @Override
    public void deleteById(Integer id) {
        commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Comment article) {
        commentMapper.updateByPrimaryKey(article);
    }

}
