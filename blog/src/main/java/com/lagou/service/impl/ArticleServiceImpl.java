package com.lagou.service.impl;

import com.lagou.dao.ArticleDao;
import com.lagou.pojo.Article;
import com.lagou.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdm
 * @description 业务实现类
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public List<Article> queryByPage(String page) {
        List<Article> all = new ArrayList<>();
        if (StringUtils.isEmpty(page)){
            page="1";
        }
        Integer param = Integer.valueOf(page);
        //分页查询
        Page<Article> articlePage = articleDao.findAll(PageRequest.of(param - 1, 3));
        all = articlePage.getContent();
        return all;
    }
}
