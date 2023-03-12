package demo.jdbc.spring.boot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import demo.jdbc.spring.boot.app.CustomerService.CustomerService;
import demo.jdbc.spring.boot.app.DTO.LoginDTO;
import demo.jdbc.spring.boot.app.DTO.SaveCustomer;

@RestController
@CrossOrigin
@RequestMapping ("api/v1/customer")
public class CustomerController {
 
	@Autowired
	CustomerService customerService;
	
	boolean admincheck=false;
	boolean userlogin=false;
	
	@PostMapping(path="/userregister")
	public String userRegister(@RequestBody SaveCustomer saveCustomer) {
		
		
		System.out.println(saveCustomer.getName());
		
		String status = customerService.userRegister(saveCustomer);
		
		return status;
		
		
	}
	@PostMapping(path="/userlogin")
	public String userLogin(@RequestBody LoginDTO loginDto) {
		
		
		System.out.println(loginDto.getEmail());
		
		String status = customerService.userLogin(loginDto);
		userlogin = true;
		
		return status;
		
		
	}
	@PostMapping(path="/admincheck")
	public String checkAdmin(@RequestBody LoginDTO loginDto)
	{
		System.out.println("in");
		System.out.println(loginDto.getEmail());
		System.out.println(loginDto.getPassword());
		if(loginDto.getEmail().equals("admin")&&loginDto.getPassword().equals("1832"))
		{
			admincheck=true;
			return "admin exist";
			
		}

		return "admin not exist";
	}
	@GetMapping(path="/isadminlogin")
		public  boolean isadminlogin()
		{
			if(admincheck==true)
			{
				System.out.println("return");
			return true;
			
			}
			return false;
		}
		@GetMapping(path="/isadminlogout")
		public  boolean isadminlogout()
		{
			
				
			return false;
			
			
			
			
		}
		@GetMapping(path="/islogin")
		public  boolean islogin()
		{
			if(userlogin==true)
			{
				System.out.println("return");
			return true;
			
			}
			return false;
		}
		
		
		@GetMapping(path="/logout")
		public  boolean islogout()
		{
			
				
			return false;
			
			
			
			
		}
	
	
	
}
