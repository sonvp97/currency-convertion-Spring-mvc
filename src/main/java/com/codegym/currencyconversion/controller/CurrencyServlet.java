package com.codegym.currencyconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Controller
public class CurrencyServlet {
    @GetMapping("/show")
    public String show(@RequestParam int usd,int vnd, Model model){
        int vnd1 = usd*vnd;
        model.addAttribute("vnd",vnd1);
        return "currency";
    }
    @GetMapping("/Currency")
    public String currency(){
        return "index";
    }
}
