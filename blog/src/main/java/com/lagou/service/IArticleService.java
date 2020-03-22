package com.lagou.service;

import com.lagou.pojo.Article;

import java.util.List;

/**
 * @author wangdm
 * @description 博客crud相关api
 */
public interface IArticleService {
    /**
     * 根据页数查询列表  每页固定展示3条记录
     * @param page
     * @return
     */
    List<Article> queryByPage(String page);
}
