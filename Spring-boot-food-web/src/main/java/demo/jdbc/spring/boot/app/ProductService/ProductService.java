package demo.jdbc.spring.boot.app.ProductService;

import java.util.List;

import demo.jdbc.spring.boot.app.DTO.ProductDTO;



public interface ProductService {

	String addCustomer(ProductDTO productDto);

	List<ProductDTO> getAllProducts();

	List<ProductDTO> getByTag(String tag);

	List<ProductDTO> search(String searchText);

	
}
