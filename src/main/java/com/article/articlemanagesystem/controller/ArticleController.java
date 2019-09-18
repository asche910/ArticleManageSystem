package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.common.CommonResult;
import com.article.articlemanagesystem.common.ResultCode;
import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.mapper.ArticleMapper;
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
import java.util.Random;

import static com.article.articlemanagesystem.util.PrintUtils.println;


@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleMapper articleMapper;

    @PostMapping("/add")
    public CommonResult publish(Article article, HttpServletRequest request) {
//        User user = (User) request.getSession().getAttribute("user");
//        if (user != null) {
            article.setId(null);
            article.setAuthor("root");
            article.setTime(TimeUtils.getCurrentTime());
            article.setLikenum(0);
            article.setCommentnum(0);
            articleService.publish(article);
            return CommonResult.success("发布成功！", null);
//        }
//        return CommonResult.failed(ResultCode.VALIDATE_FAILED);
    }

    @PostMapping("/update")
    public CommonResult createOrUpdate(Article article){
        Long id = article.getId();
        if (id != null){
            articleService.update(article);
        }else {
            article.setTime(TimeUtils.getCurrentTime());
            articleService.publish(article);
        }
        return CommonResult.success();
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
                           @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
        List<Article> allArticle = articleService.getAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo<>(allArticle);
        return pageInfo;
    }

    @RequestMapping("/delete")
    public CommonResult delete(@RequestParam long id){
        articleService.deleteById(id);
        return CommonResult.success();
    }
}
