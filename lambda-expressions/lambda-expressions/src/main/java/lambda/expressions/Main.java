package lambda.expressions;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// private int number = 8;
	public static void main(String[] args) {
			HotelService hotelService = new HotelService();
			List<Hotel> hotelList = hotelService.filterHotels(new FilterCondition() {
				public Boolean testCondition(Hotel hotel) {
					return hotel.getHotelType() == HotelType.FIVE_STAR;
				}	
			}
			);
//			System.out.println("hotelList : "+hotelList);
			// in lambda we can access the local variable and these variables considered as final variables and the reference or value(primitive) saved not reference
			
			hotelList = hotelService.filterHotels(new FilterCondition() {
				public Boolean testCondition(Hotel hotel) {
					return hotel.getRating() >= 5;
				}
				
			});
			
//			System.out.println("hotelList : "+hotelList);
			
			FilterCondition condition = (Hotel h1 )-> h1.getRating() >= 8;
			
			
			hotelList = hotelService.filterHotels((Hotel h1 )-> h1.getHotelType() == HotelType.FIVE_STAR);
			
			System.out.println("hotelList on the basic of hotel type : "+hotelList);
			
			hotelList = hotelService.filterHotels(condition);
			
			System.out.println("hotelList on the basic of rating : "+hotelList);
			
			hotelList = hotelService.filterHotels(getLambdaExp());
			
			System.out.println("hotelList on the basic of hoteltype : "+hotelList);
		
		}

	
		public static FilterCondition getLambdaExp() {
			int number = 8;
			List<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(12345);
//			FilterCondition condition = hotel -> {
//				System.out.println("size of the list : "+list.size());
//				return hotel.getHotelType() == HotelType.FOUR_STAR;
//			};
			
			FilterCondition condition = hotel -> {
				System.out.println("size of the list : "+list.size());
				return hotel.getRating() == number;
			};
			
//			number++; // give error as we cant update a final variable so by default the lambda consider it as a 
			
//			list = new ArrayList<>(); we can't do this as it change the reference of the variable and in lambda it use final varialbes
			list.add(24);
			list.add(24);
			list.add(24);
			return condition;
		}
	}
