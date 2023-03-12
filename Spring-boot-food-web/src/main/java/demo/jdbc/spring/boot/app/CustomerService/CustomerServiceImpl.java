package demo.jdbc.spring.boot.app.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.app.DTO.LoginDTO;
import demo.jdbc.spring.boot.app.DTO.SaveCustomer;
import demo.jdbc.spring.boot.app.entiites.CustomerEntity;
import demo.jdbc.spring.boot.app.repos.Customerrepo;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	Customerrepo customerRepo;
	
	
	@Override
	public String userRegister(SaveCustomer saveCustomer) {
		
		CustomerEntity customer = new CustomerEntity(
				
				
				saveCustomer.getName(),
				saveCustomer.getEmail(),
				saveCustomer.getPassword(),
				saveCustomer.getPhoneNo(),
				saveCustomer.getAddress()
				
				
				);
		customerRepo.save(customer);
		
		
		return customer.getName();
	}


	@Override
	public String userLogin(LoginDTO loginDto) {
		CustomerEntity customer = customerRepo.findByEmail(loginDto.getEmail());
		if(customer!=null)
		{
			return "true";
		}
		else {
			
		
				return "false";
		}
		}
	@Override
	public String adminLogin(LoginDTO loginDto) {
		
		if((loginDto.getEmail()).equals("admin@gmail.com")&&(loginDto.getPassword().equals("admin123")))
		{
			return "true";
		}
		else {
			
		
				return "false";
		}
		}

}
