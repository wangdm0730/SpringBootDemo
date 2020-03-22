package com.lagou.controller;

import com.lagou.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangdm
 * @description 博客查询系统控制器
 */
@Controller
public class BlogController {
    @Autowired
    private IArticleService articleService;

    @RequestMapping("/toBlogPage")
    public String toBlogPage(Model model, HttpServletRequest httpServletRequest){
        String page = httpServletRequest.getParameter("page");
        model.addAttribute("articleList",articleService.queryByPage(page));
        model.addAttribute("currentDate", new Date());
        return "client/index";
    }
}
