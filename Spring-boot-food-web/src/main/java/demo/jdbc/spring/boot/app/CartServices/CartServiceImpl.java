package demo.jdbc.spring.boot.app.CartServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jdbc.spring.boot.app.DTO.CartDTO;
import demo.jdbc.spring.boot.app.entiites.Cart;
import demo.jdbc.spring.boot.app.repos.CartRepo;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepo cartRepo;
	
	
	@Override
	public String addToCart(CartDTO cartDto) {
		
		System.out.println(cartDto);
		Cart cart = new Cart(
				
				cartDto.getImageurl(),
				cartDto.getName(),
				cartDto.getPrice()
				

				
				);
		cartRepo.save(cart);
		System.out.println(cart.getImageurl());

		return cart.getName();
		
	}


	@Override
	public List<CartDTO> getAllCart() {
		List<Cart> getallcart = cartRepo.findAll();
		List<CartDTO> cartDtoList=new ArrayList<>();
		for(Cart a :getallcart)
		{
			CartDTO cartDto= new CartDTO(
					
					a.getImageurl(),
					a.getName(),
					a.getPrice()

					);
			cartDtoList.add(cartDto);
			
		}	
			
		return cartDtoList;
	

}
	


	@Override
	public int totalPrice() {
		int totalprice=0;
		List<Cart> getallcart = cartRepo.findAll();
		for(Cart a :getallcart)
		{
CartDTO cartDto= new CartDTO(
					
		a.getImageurl(),
		a.getName(),
		a.getPrice()

					);

				totalprice=totalprice+a.getPrice();
		}
		
		return totalprice;
		
	}
}
