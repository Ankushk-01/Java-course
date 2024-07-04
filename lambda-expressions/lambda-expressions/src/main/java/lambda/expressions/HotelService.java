package lambda.expressions;

import java.util.List;
import java.util.ArrayList;

public class HotelService {
	static List<Hotel> hotelList = new ArrayList<Hotel>();
	HotelService(){
		hotelList.add(new Hotel(20_000,5,HotelType.FOUR_STAR));
		hotelList.add(new Hotel(35_000,8,HotelType.FIVE_STAR));
		hotelList.add(new Hotel(30_000,8,HotelType.FIVE_STAR));
		hotelList.add(new Hotel(10_000,4,HotelType.THREE_STAR));
		hotelList.add(new Hotel(40_000,8,HotelType.FIVE_STAR));
	}
//	private static List<Hotel> getHotelLessThen30() {
//		List<Hotel> resultHotel = new ArrayList<Hotel>();
//		for( Hotel hotel : hotelList) {
//			if(isRateLess30Hotel(hotel)) {
//				resultHotel.add(hotel);
//			}
//		}
//		return resultHotel;
//	}
//	private static boolean isRateLess30Hotel(Hotel hotel) {
//		return hotel.getPrice() <= 30_000;
//	}
//	public static List<Hotel> getFiveStarHotel(){
//		List<Hotel> resultHotel = new ArrayList<Hotel>();
//		for( Hotel hotel : hotelList) {
//			if(isFiveStarHotel(hotel)) {
//				resultHotel.add(hotel);
//			}
//		}
//		return resultHotel;
//	}
//	private static boolean isFiveStarHotel(Hotel hotel) {
//		return hotel.getHotelType()== HotelType.FIVE_STAR;
//	}
	
	public List<Hotel> filterHotels(FilterCondition condition ){
		List<Hotel> resultHotel = new ArrayList<Hotel>();
		for( Hotel hotel : hotelList) {
			if(condition.testCondition(hotel)) {
				resultHotel.add(hotel);
			}
		}
		return resultHotel;
	}
}
