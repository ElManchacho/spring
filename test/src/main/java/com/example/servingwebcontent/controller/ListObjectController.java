package com.example.servingwebcontent.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.servingwebcontent.DTO.Objet;

@Controller
public class ListObjectController {

	
	ArrayList<Objet> objects = new ArrayList<Objet>();

    @GetMapping({"/list"})
	public String ListObject(Model model) {
		this.objects.add(new Objet("Objet 1"));
		this.objects.add(new Objet("Objet 2"));
		this.objects.add(new Objet("Objet 3"));
		model.addAttribute("objects", objects);
		return "ListObject";
	}


}
