package lambda.expressions;

import java.util.List;

public class Main {
	public static void main(String[] args) {
			HotelService hotelService = new HotelService();
			List<Hotel> hotelList = hotelService.filterHotels(new FilterCondition() {
				public Boolean testCondition(Hotel hotel) {
					return hotel.getHotelType() == HotelType.FIVE_STAR;
				}	
			}
			);
			System.out.println("hotelList : "+hotelList);
			
			hotelList = hotelService.filterHotels(new FilterCondition() {
				public Boolean testCondition(Hotel hotel) {
					return hotel.getRating() >= 5;
				}
				
			});
			
			System.out.println("hotelList : "+hotelList);
			
			hotelList = hotelService.filterHotels((Hotel h1 )-> h1.getHotelType() == HotelType.FIVE_STAR);
			
			System.out.println("hotelList : "+hotelList);
		
		}
	}
