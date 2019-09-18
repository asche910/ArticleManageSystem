package com.article.articlemanagesystem.controller;

import com.article.articlemanagesystem.entity.Article;
import com.article.articlemanagesystem.entity.Comment;
import com.article.articlemanagesystem.entity.Module;
import com.article.articlemanagesystem.entity.User;
import com.article.articlemanagesystem.mapper.ArticleMapper;
import com.article.articlemanagesystem.service.ArticleService;
import com.article.articlemanagesystem.service.CommentService;
import com.article.articlemanagesystem.service.ModuleService;
import com.article.articlemanagesystem.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static com.article.articlemanagesystem.util.PrintUtils.println;

@Controller
public class MainController {

    @Autowired
    private ModuleService moduleService;

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        // Object user = request.getSession().getAttribute("user");
        List<Article> articles = articleService.getAll(1, 1);
        PageInfo pageInfoArticle = new PageInfo<>(articles);

        List<User> users = userService.getAllUser(1, 1);
        PageInfo pageInfoUser = new PageInfo<>(users);

        List<Comment> comments = commentService.getAll(1, 1);
        PageInfo pageInfoComment = new PageInfo<>(comments);

        model.addAttribute("module", moduleService.getAll().size());
        model.addAttribute("article", pageInfoArticle.getTotal());
        model.addAttribute("user", pageInfoUser.getTotal());
        model.addAttribute("comment", pageInfoComment.getTotal());
        return "index";
      /*  if (user == null){
            return "login";
        }else {
            return "home";
        }*/
    }

    @GetMapping("/modules")
    private String modules(Model model) {
        List<Module> modules = moduleService.getAll();
        model.addAttribute("modules", modules);
        return "modules";
    }

    @GetMapping("/articles")
    private String articles(Model model, @RequestParam(defaultValue = "1") int pageNum) {
        List<Article> articles = articleService.getAll(pageNum, 10);
        PageInfo pageInfo = new PageInfo<>(articles);

        model.addAttribute("articles", articles);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("totalPage", pageInfo.getPages());
        return "articles";
    }

    @GetMapping("/article/{id}")
    public String viewArticle(Model model, @PathVariable long id) {
        println("id: " + id);
        Article article = articleService.findById(id);
        String content = article.getContent();
        content = content.replaceAll("src=\"//upload-images", "src=\"http://asche.top/asapi/forward?url=https://upload-images");
        article.setContent(content);
        model.addAttribute("article", article);
        return "article";
    }

    @GetMapping("/modify")
    public String newArticle(Model model, Long id) {
        List<Module> modules = moduleService.getAll();
        model.addAttribute("modules", modules);
        if (id != null) {
            Article article = articleService.findById(id);
            model.addAttribute("article", article);
        }
        return "modify";
    }

    @GetMapping("/query")
    public String query(Model model, String title, String username) {
        List<Article> tempList = new ArrayList<>();
        List<Article> articles = new ArrayList<>();
        if (title != null && !title.equals("")) {
            tempList = articleService.findByTitle(title);
        }
        if (username != null && !username.equals("")) {
            if (tempList.isEmpty()) {
                articles = articleService.findByAuthor(username);
            } else {
                for (Article article : tempList) {
                    if (article.getAuthor().contains(username)) {
                        articles.add(article);
                    }
                }
            }
        }else {
            articles = tempList;
        }
        model.addAttribute("articles", articles);
        return "articles";
    }

    @GetMapping("/users")
    private String users(Model model, @RequestParam(defaultValue = "1") int pageNum) {
        List<User> users = userService.getAllUser(pageNum, 10);
        PageInfo pageInfo = new PageInfo<>(users);

        model.addAttribute("users", users);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("totalPage", pageInfo.getPages());
        return "users";
    }

    @GetMapping("/queryUser")
    private String queryUser(Model model, String user, String name){
        List<User> tempList = new ArrayList<>();
        List<User> users = new ArrayList<>();
        if (user != null && !user.equals("")) {
            tempList = userService.findLikeUserName(user);
        }
        if (name != null && !name.equals("")) {
            if (tempList.isEmpty()) {
                users = userService.findLikeName(name);
            } else {
                for (User user1 : tempList) {
                    if (user1.getName().contains(name)) {
                        users.add(user1);
                    }
                }
            }
        }else {
            users = tempList;
        }
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/comments")
    private String comments(Model model, @RequestParam(defaultValue = "1") int pageNum) {
        List<Comment> comments = commentService.getAll(pageNum, 10);
        PageInfo pageInfo = new PageInfo<>(comments);

        model.addAttribute("comments", comments);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("totalPage", pageInfo.getPages());
        return "comments";
    }

    @GetMapping("/queryComment")
    private String queryComment(Model model, Long articleId, String username){
        List<Comment> tempList = new ArrayList<>();
        List<Comment> comments = new ArrayList<>();
        if (articleId != null && articleId != 0) {
            tempList = commentService.findByArticleId(articleId);
        }
        if (username != null && !username.equals("")) {
            if (tempList.isEmpty()) {
                comments = commentService.findByAuthor(username);
            } else {
                for (Comment comment : tempList) {
                    if (comment.getNameauthor().contains(username)) {
                        comments.add(comment);
                    }
                }
            }
        }else {
            comments = tempList;
        }
        model.addAttribute("comments", comments);
        return "comments";
    }
}
