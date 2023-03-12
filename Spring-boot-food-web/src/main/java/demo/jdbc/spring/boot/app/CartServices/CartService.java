package demo.jdbc.spring.boot.app.CartServices;

import java.util.List;

import demo.jdbc.spring.boot.app.DTO.CartDTO;

public interface CartService {

	String addToCart(CartDTO cartDto);

	List<CartDTO> getAllCart();

	int totalPrice();

}
