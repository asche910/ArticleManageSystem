package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.common.ResultCode;
import com.article.articlemanagesystem.entity.Comment;
import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.service.CommentService;
import com.article.articlemanagesystem.util.TimeUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@SuppressWarnings("Duplicates")
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/publish")
    public CommonResult publish(Comment comment, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            comment.setId(null);
            comment.setUserauthor(user.getUser());
            comment.setTime(TimeUtils.getCurrentTime());
            comment.setLikenum(0);
            commentService.publish(comment);
            return CommonResult.success("发布成功！", null);
        }
        return CommonResult.failed(ResultCode.VALIDATE_FAILED);
    }

    @RequestMapping("/find/id")
    public CommonResult findById(int id) {
        Comment article = commentService.findById(id);
        return CommonResult.success(article);
    }

    @RequestMapping("/find/articleId")
    public CommonResult findByArticleId(@RequestParam(name = "articleId") Long articleId) {
        List<Comment> articles = commentService.findByArticleId(articleId);
        return CommonResult.success(articles);
    }

    @RequestMapping("/find/author")
    public CommonResult findByAuthor(@RequestParam(name = "username") String username) {
        List<Comment> articles = commentService.findByAuthor(username);
        return CommonResult.success(articles);
    }

    @RequestMapping("/all")
    public PageInfo getAll(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                           @RequestParam(name = "pageSize", defaultValue = "5") int pageSize) {
        List<Comment> allArticle = commentService.getAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo<>(allArticle);
        return pageInfo;
    }
}
