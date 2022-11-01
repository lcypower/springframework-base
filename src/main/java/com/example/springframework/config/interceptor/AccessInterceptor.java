package com.example.springframework.config.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AccessInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.println("AccessInterceptor in~~~~");
        return true;
    }


}
