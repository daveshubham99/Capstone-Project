package demo.jdbc.spring.boot.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.jdbc.spring.boot.app.DTO.SaveCustomer;
import demo.jdbc.spring.boot.app.entiites.CustomerEntity;

public interface Customerrepo extends JpaRepository<CustomerEntity, Integer> {

	CustomerEntity save(SaveCustomer saveCustomer);
	CustomerEntity findByEmail(String email);

}
