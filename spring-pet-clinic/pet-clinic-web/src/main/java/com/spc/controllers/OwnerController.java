package com.spc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spc.services.*;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners", this.ownerService.findAll());
		return "owners/index";
	}
	
	@RequestMapping("find")
	public String findOwners() {
		return "notImplemented";
	}
}
