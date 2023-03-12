package demo.jdbc.spring.boot.app.entiites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Product")
public class Product {

	
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String imageurl;
		private String name;
		private int price;
		private String origin;
		@Override
		public String toString() {
			return "Product [id=" + id + ", imageurl=" + imageurl + ", name=" + name + ", price=" + price + ", origin="
					+ origin + "]";
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
		public Product(String imageurl, String name, int price, String origin) {
			super();
			this.imageurl = imageurl;
			this.name = name;
			this.price = price;
			this.origin = origin;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}
}
