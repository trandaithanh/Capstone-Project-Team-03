package entities;

public class Restaurant {
	private String restaurant_id;
	private String restaurant_image;
	private String restaurant_name;
	private String restaurant_address;
	private String district_name;
	private String city_name;
	private int district_id;
	private int city_id;
	private int category_id;
	private int country_id;
	private String category_name;
	private String country_name;
	private String restaurant_list;
	private String restaurant_email;
	private String restaurant_phone;
	private String restaurant_username;
	private int restaurant_status;

	public Restaurant() {

	}

	// public Restaurant(int restaurant_id, String restaurant_name, String
	// restaurant_email, String restaurant_phone,
	// int restaurant_status) {
	// this.restaurant_id = restaurant_id;
	// this.restaurant_name = restaurant_name;
	// this.restaurant_email = restaurant_email;
	// this.restaurant_phone = restaurant_phone;
	// this.restaurant_status = restaurant_status;
	//
	// }
	//
	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone,
			String restaurant_address, String restaurant_city, String restaurant_district, String restaurant_category,
			String restaurant_country) {
		this.restaurant_id = restaurant_id;
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.setRestaurant_address(restaurant_address);
		this.setCity_name(restaurant_city);
		this.setDistrict_name(restaurant_district);
		this.setCategory_name(restaurant_category);
		this.setCountry_name(restaurant_country);
	}

	public Restaurant(String restaurant_id, String restaurant_username) {
		this.restaurant_id = restaurant_id;
		this.restaurant_username = restaurant_username;
	}
	public Restaurant(String restaurant_name, String restaurant_image, String danhmuc) {
		this.restaurant_name = restaurant_name;
		this.restaurant_image = restaurant_image;
		this.restaurant_list = danhmuc;
	}
	//
	// public Restaurant(String restaurant_name, String restaurant_email, String
	// restaurant_phone) {
	// this.restaurant_name = restaurant_name;
	// this.restaurant_email = restaurant_email;
	// this.restaurant_phone = restaurant_phone;
	//
	// }
	//
	// public Restaurant(int restaurant_id, String restaurant_name, String
	// restaurant_email, String restaurant_phone,
	// String restaurant_username, String restaurant_address) {
	// this.restaurant_id = restaurant_id;
	// this.restaurant_name = restaurant_name;
	// this.restaurant_email = restaurant_email;
	// this.restaurant_phone = restaurant_phone;
	// this.restaurant_address = restaurant_address;
	// this.restaurant_username = restaurant_username;
	// }

	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone,
			int restaurant_status, String restaurant_username, String restaurant_address, String restaurant_city,
			String restaurant_district, String restaurant_category, String restaurant_country,
			String restaurant_image) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_username = restaurant_username;
		this.restaurant_address = restaurant_address;
		this.restaurant_status = restaurant_status;
		this.restaurant_id = restaurant_id;
		this.setCity_name(restaurant_city);
		this.setDistrict_name(restaurant_district);
		this.setCategory_name(restaurant_category);
		this.setCountry_name(restaurant_country);
		this.setRestaurant_image(restaurant_image);
	}
	public Restaurant(String restaurant_name, String restaurant_phone,
			  String restaurant_address, String restaurant_city,
			String restaurant_district, String restaurant_category, String restaurant_country,
			String restaurant_image) {
		this.restaurant_name = restaurant_name;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_address = restaurant_address;
		this.setCity_name(restaurant_city);
		this.setDistrict_name(restaurant_district);
		this.setCategory_name(restaurant_category);
		this.setCountry_name(restaurant_country);
		this.setRestaurant_image(restaurant_image);
	}

	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone,
			int restaurant_status, String image) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_status = restaurant_status;
		this.restaurant_id = restaurant_id;
		this.restaurant_image= image;
	}

	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;

		this.restaurant_id = restaurant_id;
	}

	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone,
			int restaurant_status, String restaurant_username, String restaurant_address, String restaurant_city,
			String restaurant_district, String restaurant_category, String restaurant_country) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_username = restaurant_username;
		this.restaurant_address = restaurant_address;
		this.restaurant_status = restaurant_status;
		this.restaurant_id = restaurant_id;
		this.setCity_name(restaurant_city);
		this.setDistrict_name(restaurant_district);
		this.setCategory_name(restaurant_category);
		this.setCountry_name(restaurant_country);

	}

	public Restaurant(String restaurant_id, String restaurant_name, String restaurant_email, String restaurant_phone,
			String restaurant_username, String restaurant_address, int restaurant_city, int restaurant_district,
			String restaurant_category, String restaurant_country) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_username = restaurant_username;
		this.restaurant_address = restaurant_address;
		this.restaurant_id = restaurant_id;
		this.setCity_id(restaurant_city);
		this.setDistrict_id(restaurant_district);
		this.setCategory_name(restaurant_category);
		this.setCountry_name(restaurant_country);
	}

	public Restaurant(String restaurant_id, String restaurant_username, String restaurant_name, String restaurant_email,
			String restaurant_phone, String restaurant_address, String restaurant_city, String restaurant_district,
			String restaurant_country, String restaurant_category, int restaurant_city_id, int restaurant_district_id,
			int restaurant_country_id, int restaurant_category_id, String image) {
		this.restaurant_name = restaurant_name;
		this.restaurant_email = restaurant_email;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_username = restaurant_username;
		this.restaurant_address = restaurant_address;
		this.restaurant_id = restaurant_id;
		this.setCity_name(restaurant_city);
		this.setDistrict_name(restaurant_district);
		this.setCountry_name(restaurant_country);
		this.setCategory_name(restaurant_category);
		this.city_id = restaurant_city_id;
		this.district_id = restaurant_district_id;
		this.country_id = restaurant_country_id;
		this.category_id = restaurant_category_id;
		this.setRestaurant_image(image);
	}

	public String getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(String restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getRestaurant_image() {
		return restaurant_image;
	}

	public void setRestaurant_image(String restaurant_image) {
		this.restaurant_image = restaurant_image;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getRestaurant_address() {
		return restaurant_address;
	}

	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public int getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getRestaurant_list() {
		return restaurant_list;
	}

	public void setRestaurant_list(String restaurant_list) {
		this.restaurant_list = restaurant_list;
	}

	public String getRestaurant_email() {
		return restaurant_email;
	}

	public void setRestaurant_email(String restaurant_email) {
		this.restaurant_email = restaurant_email;
	}

	public String getRestaurant_phone() {
		return restaurant_phone;
	}

	public void setRestaurant_phone(String restaurant_phone) {
		this.restaurant_phone = restaurant_phone;
	}

	public String getRestaurant_username() {
		return restaurant_username;
	}

	public void setRestaurant_username(String restaurant_username) {
		this.restaurant_username = restaurant_username;
	}

	public int getRestaurant_status() {
		return restaurant_status;
	}

	public void setRestaurant_status(int restaurant_status) {
		this.restaurant_status = restaurant_status;
	}
	
	

	

}
