package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.Module;
import com.article.articlemanagesystem.mapper.ArticleMapper;
import com.article.articlemanagesystem.service.ArticleService;
import com.article.articlemanagesystem.service.ModuleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.article.articlemanagesystem.util.PrintUtils.println;

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
    private String articles(Model model, @RequestParam(defaultValue = "1") int pageNum){
        List<Article> articles = articleService.getAll(pageNum, 10);
        PageInfo pageInfo = new PageInfo<>(articles);

        model.addAttribute("articles", articles);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("totalPage", pageInfo.getPages());
        return "articles";
    }

    @GetMapping("/article/{id}")
    public String viewArticle(Model model, @PathVariable long id){
        println("id: " + id);
        Article article = articleService.findById(id);
        String content = article.getContent();
        content = content.replaceAll("src=\"//upload-images", "src=\"http://asche.top/asapi/forward?url=https://upload-images");
        article.setContent(content);
        model.addAttribute("article", article);
        return "article";
    }

    @GetMapping("/modify")
    public String newArticle(Model model, Long id){
        List<Module> modules = moduleService.getAll();
        model.addAttribute("modules", modules);
        if (id != null){
            Article article = articleService.findById(id);
            model.addAttribute("article", article);
        }
        return "modify";
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
