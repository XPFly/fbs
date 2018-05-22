package com.flyer.fbs.controller;

import com.flyer.fbs.orm.domain.Article;
import com.flyer.fbs.service.impl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/5/22
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleServiceImpl articleService;

    @RequestMapping("/list")
    public void list(){
        Article article = articleService.findOne("22dfe041117648466ddc11a1b227c5d0");
    }
}
