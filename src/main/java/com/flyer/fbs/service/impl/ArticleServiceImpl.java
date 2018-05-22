package com.flyer.fbs.service.impl;

import com.flyer.fbs.orm.domain.Article;
import com.flyer.fbs.orm.mapper.ArticleMapper;
import com.flyer.fbs.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/5/22
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public List<Article> findList(Article article) {
        return articleMapper.findList(article);
    }

    @Override
    public Article findOne(String uuid) {
        return articleMapper.findOne(uuid);
    }

    @Override
    public Integer count(Article article) {
        return articleMapper.count(article);
    }

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public List<Article> findAllByType(String typeId) {
        return articleMapper.findAllByType(typeId);
    }

    @Override
    public List<Article> maxClickNumber() {
        return articleMapper.maxClickNumber();
    }

    @Override
    public void increaseClickNumber(String uuid) {
        articleMapper.increaseClickNumber(uuid);
    }

    @Override
    public void increaseCommentNumber(String uuid) {
        articleMapper.increaseCommentNumber(uuid);
    }

}
