package com.lagou.dao;

import com.lagou.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author wangdm
 * @description  dao方法
 */
public interface ArticleDao extends CrudRepository<Article,Integer>, JpaRepository<Article,Integer> {

}
