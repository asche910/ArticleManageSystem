package com.article.articlemanagesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.article.articlemanagesystem.mapper")
public class ArticlemanagesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticlemanagesystemApplication.class, args);
    }

}
