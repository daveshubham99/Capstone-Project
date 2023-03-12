package demo.jdbc.spring.boot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jdbc.spring.boot.app.CartServices.CartService;
import demo.jdbc.spring.boot.app.DTO.CartDTO;
@RestController
@CrossOrigin
@RequestMapping ("api/v1/product")
public class CartController {
	@Autowired
	CartService cartService;
	
	@PostMapping(path="/savecart")
	public String addToCaart(@RequestBody CartDTO cartDto)
	{
		System.out.println(cartDto+"this");
		String message = cartService.addToCart(cartDto);
		
		
		return message;
		
	}
	@GetMapping(path="/getallcart")
	public List<CartDTO> getAllCart()
	{
		List<CartDTO> allCart = cartService.getAllCart();
		return allCart;
		
	}
	
	@GetMapping(path="/totalprice")
	public int totalPrice()
	{
		System.out.println("invoke");
		
		int total =cartService.totalPrice();

		return total;
		
	}
	
}
