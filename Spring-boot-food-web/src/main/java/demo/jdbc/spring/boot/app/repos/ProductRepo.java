package demo.jdbc.spring.boot.app.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.jdbc.spring.boot.app.DTO.SaveCustomer;
import demo.jdbc.spring.boot.app.entiites.CustomerEntity;
import demo.jdbc.spring.boot.app.entiites.Product;


public interface ProductRepo extends JpaRepository<Product, Integer>{
	Product save(Product product);

	

	List<Product> findByOrigin(String origin);



	List<Product> findByName(String searchText);




}
