package demo.jdbc.spring.boot.app.DTO;

public class CartDTO {
	
	private String imageurl;
	private String name;
	private int price;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(String imageurl, String name, int price) {
		super();
		this.imageurl = imageurl;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartDTO [imageurl=" + imageurl + ", name=" + name + ", price=" + price + "]";
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
	

}
