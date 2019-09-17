package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.common.ResultCode;
import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.service.ArticleService;
import com.article.articlemanagesystem.util.TimeUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping("/publish")
    public CommonResult publish(Article article, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            article.setId(null);
            article.setAuthor(user.getUser());
            article.setTime(TimeUtils.getCurrentTime());
            article.setLikenum(0);
            article.setCommentnum(0);
            articleService.publish(article);
            return CommonResult.success("发布成功！", null);
        }
        return CommonResult.failed(ResultCode.VALIDATE_FAILED);
    }

    @RequestMapping("/find/id")
    public CommonResult findById(Long id) {
        Article article = articleService.findById(id);
        return CommonResult.success(article);
    }

    @RequestMapping("/find/title")
    public CommonResult findByTitle(@RequestParam(name = "title") String title) {
        List<Article> articles = articleService.findByTitle(title);
        return CommonResult.success(articles);
    }

    @RequestMapping("/find/author")
    public CommonResult findByAuthor(@RequestParam(name = "authorId") String authorUsername) {
        List<Article> articles = articleService.findByAuthor(authorUsername);
        return CommonResult.success(articles);
    }

    @RequestMapping("/all")
    public PageInfo getAll(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                           @RequestParam(name = "pageSize", defaultValue = "5") int pageSize) {
        List<Article> allArticle = articleService.getAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo<>(allArticle);
        return pageInfo;
    }
}
