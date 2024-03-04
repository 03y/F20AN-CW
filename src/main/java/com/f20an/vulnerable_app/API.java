package com.f20an.vulnerable_app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

// @Controller
// @ResponseBody
@RestController
public class API {
    private static final Logger logger = LogManager.getLogger();

    @RequestMapping("/")
    public String hello(RedirectAttributes redirectAttributes, HttpServletRequest request, Model model) {
        logger.info("Request User-Agent: " + request.getHeader("User-Agent"));

        return "hello world from spring boot";
    }
}
