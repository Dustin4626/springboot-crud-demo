package com.dustin.springbootcrudsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dustin.springbootcrudsample.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/emps")
	public String name(Model model) {
		model.addAttribute("emps", dao.getAll());
		return "emp/list";
	}
}
