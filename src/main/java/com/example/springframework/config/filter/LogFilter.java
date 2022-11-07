package com.example.springframework.config.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Slf4j
@Component
@WebFilter(filterName = "LogFilter")
@Order(2)
public class LogFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        long start = new Date().getTime();
        log.info("LogFilter : " + request.getRequestURI() + " start " + new Date());
        filterChain.doFilter(request, response);
        long endTime = new Date().getTime() - start;
        log.info("LogFilter : " + request.getRequestURI() + " " + endTime + "(m/s) end");
    }
}
