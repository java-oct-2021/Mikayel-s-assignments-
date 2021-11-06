package com.dojo.prodcat.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dojo.prodcat.models.Category;
import com.dojo.prodcat.models.Product;
import com.dojo.prodcat.services.TheService;
@Controller
public class MainController {
	
	@Autowired
	private TheService tService;


	@GetMapping("/products/new")
	public String newProd(@ModelAttribute("newProd") Product product) {
		return "newproduct.jsp";
	}
	
	@PostMapping("/newproducts")
	public String createProd(@ModelAttribute("newProd") Product product) {
		this.tService.createProduct(product);
		return "redirect:/products/new";
		
	}
		
	@GetMapping("/categories/new")
	public String newCat(@ModelAttribute("newCategory") Category category) {
		return "newcategory.jsp";
	}
	
	@PostMapping("/newCategory")
	public String createCategory(@ModelAttribute("newCategory") Category category) {
		this.tService.createCategory(category);
		return "redirect:/categories/new";		
	}
	
	@GetMapping("/products/{id}")
	public String prodInfo(@PathVariable("id") Long id, @ModelAttribute("newProd") Product product, Model model) {
		Product showP = this.tService.getOneP(id);
		model.addAttribute("notInP", this.tService.findCategoryWhichNot(showP));
		model.addAttribute("product", showP);
		return "showproducts.jsp";
		
	}

	@GetMapping("/categories/{id}")
	public String catInfo(@PathVariable("id") Long id, Model model) {
		Category catToShow = this.tService.getOneC(id);
		model.addAttribute("notInCat", this.tService.findProductWhichNot(catToShow));
		model.addAttribute("category", catToShow);
		return "showcategories.jsp";
	}
	
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("cats") Long id, @PathVariable("id") Long pId) {
		Product productToAddToCat = this.tService.getOneP(pId);
		Category catToAddToProd = this.tService.getOneC(id);
		this.tService.addCategoryToProd(productToAddToCat, catToAddToProd);
		return "redirect:/products/{id}";
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdToCat(@RequestParam("prods") Long id, @PathVariable("id") Long cId) {
		Product productToAddToCat = this.tService.getOneP(id);
		Category catToAddToProd = this.tService.getOneC(cId);
		this.tService.addProdToCat(catToAddToProd, productToAddToCat);
		return "redirect:/categories/{id}";
	}
	


}
