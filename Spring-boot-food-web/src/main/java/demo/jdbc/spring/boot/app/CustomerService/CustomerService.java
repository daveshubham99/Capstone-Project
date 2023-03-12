package demo.jdbc.spring.boot.app.CustomerService;

import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.app.DTO.LoginDTO;
import demo.jdbc.spring.boot.app.DTO.SaveCustomer;


public interface CustomerService {

	String userRegister(SaveCustomer saveCustomer);

	String userLogin(LoginDTO loginDto);

	String adminLogin(LoginDTO loginDto);

}
