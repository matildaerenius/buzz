package com.matildaerenius.config;

import io.jsonwebtoken.JwtException;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JwtValidator extends OncePerRequestFilter {

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws ServletException, IOException {

        String header = req.getHeader(jwtProvider.getJwtHeader());

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            try {
                String email = jwtProvider.getEmailFromJwtToken(token);
                Authentication auth = new UsernamePasswordAuthenticationToken(
                        email, null, List.of()
                );
                SecurityContextHolder.getContext().setAuthentication(auth);
            } catch (JwtException e) {
                res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid JWT");
                return;
            }
        }

        chain.doFilter(req, res);
    }

}
