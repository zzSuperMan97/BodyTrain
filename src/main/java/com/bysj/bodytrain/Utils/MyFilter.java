package com.bysj.bodytrain.Utils;


import com.bysj.bodytrain.Models.Users;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

/**
  * @Author zhoulin
  * @Date 2020/2/24 15:33
  * @version 1.0
   */
@Order(1)
@WebFilter(filterName = "MyFilter",urlPatterns ="/*",initParams ={@WebInitParam(name = "URL",value = "http://localhost:10460")})
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        Users users = (Users) req.getSession().getAttribute("users");
        String a=req.getRequestURI();
        if(a.contains(".css") || a.contains(".js") || a.contains(".png")|| a.contains(".jpg")){
            //如果发现是css或者js文件，直接放行
            filterChain.doFilter(servletRequest, servletResponse);
        }
        if(users == null ) {
            req.getRequestDispatcher("/login.html").forward(req,res);

        }

    }

    @Override
    public void destroy() {
        System.out.println("灭亡");
    }
}
