package demo.jdbc.spring.boot.app.DTO;

public class ProductDTO {
	private String imageurl;
	private String name;
	private int price;
	private String origin;
	@Override
	public String toString() {
		return "ProductDTO [imageurl=" + imageurl + ", name=" + name + ", price=" + price + ", origin=" + origin + "]";
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
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(String imageurl, String name, int price, String origin) {
		super();
		this.imageurl = imageurl;
		this.name = name;
		this.price = price;
		this.origin = origin;
	}

}
