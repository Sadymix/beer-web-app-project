package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.dao.BeersDAO;
import com.example.project.entity.Beers;
import com.example.project.service.BeersService;

@Controller
@RequestMapping("/beer")
public class BeerController {

	@Autowired
	private BeersService beersService;
	
	
	@GetMapping("/list")
	public String listBeers(Model theModel) {
		
		List<Beers> theBeers = beersService.getBeers();
		
		theModel.addAttribute("beers", theBeers);
		
		return "list-beers";
	}
	
	@RequestMapping(value = "/showAddBeer", method = RequestMethod.GET)
	public String showAddBeer(Model theModel) {
		
		Beers tempBeer = new Beers();
		
		theModel.addAttribute("beers", tempBeer);
		
		return "beer-form";
	}
	
	@PostMapping("/saveBeer")
	public String saveBeer(@ModelAttribute("beer") Beers theBeer) {
		
		beersService.saveBeer(theBeer);
		
		return "redirect:/beer/list";
	}
	
	@GetMapping("/showFormForBeerUpdate")
	public String showFormForBeerUpdate(@RequestParam("beerId") int theBeerId, 
			Model theModel) {
		
		Beers theBeer = beersService.getBeer(theBeerId);
		
		theModel.addAttribute("beers", theBeer);
		
		return "beer-form";
	}
	
	@GetMapping("/delete")
	public String deleteBeer(@RequestParam("beerId") int theBeerId) {
		
		beersService.deleteBeer(theBeerId);
		
		return "redirect:/beer/list";
	}
}
