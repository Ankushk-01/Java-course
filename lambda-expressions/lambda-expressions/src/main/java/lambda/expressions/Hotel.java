package lambda.expressions;

public class Hotel {
	private int price;
	private int rating;
	private HotelType hotelType;
	
	Hotel(int price,int rating,HotelType hotelType){
		this.price = price;
		this.hotelType = hotelType;
		this.rating = rating;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setHotelType(HotelType type) {
		this.hotelType = type;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getRating() {
		return rating;
	}
	
	public HotelType getHotelType() {
		return hotelType;
	}
	@Override
	public String toString() {
		return "Hotel [price=" + getPrice() + ", rating=" + getRating() + ", hotelType=" + getHotelType() + "]";
	}
	
	
}
