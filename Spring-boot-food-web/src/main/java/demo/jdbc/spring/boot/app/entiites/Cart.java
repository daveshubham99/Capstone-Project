package demo.jdbc.spring.boot.app.entiites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String imageurl;
	private String name;
	private int price;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String imageurl, String name, int price) {
		
		
		this.imageurl = imageurl;
		this.name = name;
		this.price = price;
	}
//	public Cart(String imageurl, String name2, int price2) {
//		// TODO Auto-generated constructor stub
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [imageurl=" + imageurl + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
