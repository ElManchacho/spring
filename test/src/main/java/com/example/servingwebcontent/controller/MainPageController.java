package com.example.servingwebcontent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @GetMapping({"/","/main"})
	public String MainPage() {
		return "MainPage";
	}


}
