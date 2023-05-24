package com.codeup.bigfootspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{n1}/and/{n2}")
    @ResponseBody
    public String add(@PathVariable int n1, @PathVariable int n2) {
        return String.valueOf(n1+n2);
    }

    @GetMapping("/subtract/{n1}/from/{n2}")
    @ResponseBody
    public String subtract(@PathVariable int n1, @PathVariable int n2) {
        return String.valueOf(n2-n1);
    }

    @GetMapping("/multiply/{n1}/and/{n2}")
    @ResponseBody
    public String multiply(@PathVariable int n1, @PathVariable int n2) {
        return String.valueOf(n1*n2);
    }

    @GetMapping("/divide/{n1}/by/{n2}")
    @ResponseBody
    public String divide(@PathVariable int n1, @PathVariable int n2) {
        return String.valueOf(n1/n2);
    }
}
