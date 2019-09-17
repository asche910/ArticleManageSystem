package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.Module;
import com.article.articlemanagesystem.mapper.ArticleMapper;
import com.article.articlemanagesystem.service.ArticleService;
import com.article.articlemanagesystem.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public String home(HttpServletRequest request){
        Object user = request.getSession().getAttribute("user");
        return "index";

      /*  if (user == null){
            return "login";
        }else {
            return "home";
        }*/
    }

    @GetMapping("/modules")
    private String modules(Model model){
        List<Module> modules = moduleService.getAll();
        model.addAttribute("modules", modules);
        return "modules";
    }

    @GetMapping("/articles")
    private String articles(Model model){
        List<Article> articles = articleService.getAll(0, 20);
        model.addAttribute("articles", articles);
        return "articles";
    }

    @GetMapping("/users")
    private String users(){
        return "users";
    }

    @GetMapping("/comments")
    private String comments(){
        return "comments";
    }


}
