package demo.jdbc.spring.boot.app.ProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import demo.jdbc.spring.boot.app.DTO.ProductDTO;
import demo.jdbc.spring.boot.app.entiites.Product;
import demo.jdbc.spring.boot.app.repos.ProductRepo;


@Service
public class ProductServiceImpl implements ProductService{

	


	@Autowired
	ProductRepo productRepo;
	
	@Override
	public String addCustomer(ProductDTO productDto) {
			Product product = new Product(
				
					productDto.getImageurl(),
					productDto.getName(),
					productDto.getPrice(),
					productDto.getOrigin()
				
				
				
				);
			System.out.println(product);
			
		productRepo.save(product);
		return product.getName();
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		List<Product> getAllProduct = productRepo.findAll();
		List<ProductDTO> listOfProducts = new ArrayList<>();
		for (Product a : getAllProduct)
		{
			ProductDTO productDto = new ProductDTO(
					
					
					a.getImageurl(),
					a.getName(),
					a.getPrice(),
					a.getOrigin()
					);
			listOfProducts.add(productDto);
		}
		return listOfProducts;

	}

	@Override
	public List<ProductDTO> getByTag(String origin) {
		System.out.println(origin);
		String indian = origin;
		System.out.println(indian);
		List<Product> getAllProduct = productRepo.findByOrigin(indian);
		List<ProductDTO> listOfProducts = new ArrayList<>();
		for (Product a : getAllProduct)
		{
			ProductDTO productDto = new ProductDTO(
					
					
					a.getImageurl(),
					a.getName(),
					a.getPrice(),
					a.getOrigin()
					);
			listOfProducts.add(productDto);
		}
		System.out.println(listOfProducts);
		return listOfProducts;
	}

	@Override
	public List<ProductDTO> search(String searchText) {
		System.out.println(searchText);
		
		List<Product> getAllProduct = productRepo.findByName(searchText);
		List<ProductDTO> listOfProducts = new ArrayList<>();
		for (Product a : getAllProduct)
		{
			ProductDTO productDto = new ProductDTO(
					
					
					a.getImageurl(),
					a.getName(),
					a.getPrice(),
					a.getOrigin()
					);
			listOfProducts.add(productDto);
		}
		System.out.println(listOfProducts);
		return listOfProducts;
	}

	


}