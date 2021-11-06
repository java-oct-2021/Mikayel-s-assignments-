package com.dojo.prodcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.prodcat.models.Category;
import com.dojo.prodcat.models.Product;
import com.dojo.prodcat.repositories.CategoryRepository;
import com.dojo.prodcat.repositories.ProductRepository;

@Service
public class TheService {

	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;

	
	public List<Category> getAllC(){
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category p) {
		return this.cRepo.save(p);
	}
	
	public void deleteC(Long id) {
		this.cRepo.deleteById(id);
	}
	
	public Category getOneC(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Category updtC(Category updt) {
		return this.cRepo.save(updt);
	}
	
	public List<Category> findCategoryWhichNot(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public void addCategoryToProd(Product product, Category category) {
		List<Category> existCat = product.getCats();
		existCat.add(category);
		this.pRepo.save(product);		
		
	}
	
	public void addProdToCat(Category category, Product product) {
		List<Product> existProd = category.getProducts();
		existProd.add(product);
		this.cRepo.save(category);
		
	}

	public List<Product> getAll(){
		return this.pRepo.findAll();
	}
	
	public Product createProduct(Product p) {
		return this.pRepo.save(p);
	}
	
	public void deleteP(Long id) {
		this.pRepo.deleteById(id);
	}
	
	public Product getOneP(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public Product updtP(Product updt) {
		return this.pRepo.save(updt);
	}
	
	public List<Product> findProductWhichNot(Category category){
		return this.pRepo.findByCatsNotContains(category);
	}
}
