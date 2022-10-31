package com.example.springframework.config.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@WebFilter(filterName = "CORSFilter")
@Order(1)
public class CORSFilter extends OncePerRequestFilter {
	@Override
	protected void doFilterInternal (HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		response.addHeader ("Access-Control-Allow-Origin", "*");
		response.setHeader ("Access-Control-Allow-Methods", "POST, GET, PUT, PATCH, DELETE, OPTIONS");
		response.setHeader ("Access-Control-Max-Age", "3600");

		if (request.getMethod ().equals ("OPTIONS")) {
			response.setHeader ("Access-Control-Allow-Headers", "*");
			response.flushBuffer ();
		} else {
			response.setHeader ("Access-Control-Allow-Headers", "Authorization, Origin, X-Requested-With, Content-PaymentType, Content-Disposition, Accept");
			filterChain.doFilter (request, response);
		}
	}
}


