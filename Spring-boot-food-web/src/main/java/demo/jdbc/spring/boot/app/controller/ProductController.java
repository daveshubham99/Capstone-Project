package demo.jdbc.spring.boot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.jdbc.spring.boot.app.DTO.ProductDTO;
import demo.jdbc.spring.boot.app.ProductService.ProductService;

@RestController
@CrossOrigin
@RequestMapping ("api/v1/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@PostMapping(path="/save")
	public String saveProduct(@RequestBody ProductDTO productDto )
	{
		System.out.println("init");
		System.out.println(productDto);
		String id = productService.addCustomer(productDto);
		System.out.println(id);
		return id;
		
	}
	
	
	
	@GetMapping(path="/getallproducts")	
	public List<ProductDTO> getAllProducts()
	{
		List<ProductDTO> getAllProducts = productService.getAllProducts();
		
		return getAllProducts;
	}
	 	
	 @ResponseBody
	 @GetMapping(path="/search")
	public List<ProductDTO> search(@RequestParam String searchText)
	{
		 System.out.println(searchText+"this");
		List<ProductDTO> getAllProducts = productService.search(searchText);
		
		return getAllProducts;
	}
	    @ResponseBody
		@GetMapping(path="/tag")
		public List<ProductDTO> saveProduct(@RequestParam String origin )
		{
			System.out.println("init");
			System.out.println(origin);
			List<ProductDTO> getAllProducts = productService.getByTag(origin);
			System.out.println(getAllProducts);
			
			return getAllProducts;
			
		}

}
