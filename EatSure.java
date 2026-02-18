class EatSure{ 

	public static double search(String foodName){
		double price = 0.0;

		if(foodName=="Classic Veg Burger"){
			price=101.00;
			return price;
		}else if(foodName=="Double Chicken Burger"){
			price=102.00;
			return price;
		}else if(foodName=="Crispy Fish Burger"){
			price=103.00;
			return price;
		}else if(foodName=="Paneer Zinger Burger"){
			price=104.00;
			return price;
		}else if(foodName=="BBQ Beef Burger"){
			price=105.00;
			return price;
		}else if(foodName=="Spicy Lamb Burger"){
			price=106.00;
			return price;
		}else if(foodName=="Mushroom Swiss Burger"){
			price=107.00;
			return price;
		}else if(foodName=="Aloo Tikki Burger"){
			price=108.00;
			return price;
		}else if(foodName=="Grilled Chicken Sandwich"){
			price=109.00;
			return price;
		}else if(foodName=="Club Sandwich Deluxe"){
			price=110.00;
			return price;
		}else if(foodName=="Veg Cheese Sandwich"){
			price=111.00;
			return price;
		}else if(foodName=="Tuna Mayo Sandwich"){
			price=112.00;
			return price;
		}else if(foodName=="Egg Salad Sandwich"){
			price=113.00;
			return price;
		}else if(foodName=="Chicken Shawarma Roll"){
			price=114.00;
			return price;
		}else if(foodName=="Veg Spring Roll"){
			price=115.00;
			return price;
		}else if(foodName=="Chicken Spring Roll"){
			price=116.00;
			return price;
		}else if(foodName=="Paneer Kathi Roll"){
			price=117.00;
			return price;
		}else if(foodName=="Egg Kathi Roll"){
			price=118.00;
			return price;
		}else if(foodName=="Chicken Nuggets"){
			price=119.00;
			return price;
		}else if(foodName=="Fish Fingers"){
			price=120.00;
			return price;
		}else if(foodName=="French Fries Large"){
			price=121.00;
			return price;
		}else if(foodName=="Peri Peri Fries"){
			price=122.00;
			return price;
		}else if(foodName=="Cheese Garlic Bread"){
			price=123.00;
			return price;
		}else if(foodName=="Stuffed Garlic Bread"){
			price=124.00;
			return price;
		}else if(foodName=="Nachos with Salsa"){
			price=125.00;
			return price;
		}else if(foodName=="Loaded Nachos"){
			price=126.00;
			return price;
		}else if(foodName=="Veg Momos"){
			price=127.00;
			return price;
		}else if(foodName=="Chicken Momos"){
			price=128.00;
			return price;
		}else if(foodName=="Fried Momos"){
			price=129.00;
			return price;
		}else if(foodName=="Tandoori Momos"){
			price=130.00;
			return price;
		}else if(foodName=="Veg Manchurian"){
			price=131.00;
			return price;
		}else if(foodName=="Gobi Manchurian"){
			price=132.00;
			return price;
		}else if(foodName=="Chicken Manchurian"){
			price=133.00;
			return price;
		}else if(foodName=="Paneer Chilli"){
			price=134.00;
			return price;
		}else if(foodName=="Chilli Chicken"){
			price=135.00;
			return price;
		}else if(foodName=="Veg Hakka Noodles"){
			price=136.00;
			return price;
		}else if(foodName=="Chicken Hakka Noodles"){
			price=137.00;
			return price;
		}else if(foodName=="Schezwan Noodles"){
			price=138.00;
			return price;
		}else if(foodName=="Veg Fried Rice"){
			price=139.00;
			return price;
		}else if(foodName=="Chicken Fried Rice"){
			price=140.00;
			return price;
		}else if(foodName=="Egg Fried Rice"){
			price=141.00;
			return price;
		}else if(foodName=="Paneer Fried Rice"){
			price=142.00;
			return price;
		}else if(foodName=="Veg Biryani"){
			price=143.00;
			return price;
		}else if(foodName=="Chicken Biryani"){
			price=144.00;
			return price;
		}else if(foodName=="Mutton Biryani"){
			price=145.00;
			return price;
		}else if(foodName=="Egg Biryani"){
			price=146.00;
			return price;
		}else if(foodName=="Hyderabadi Dum Biryani"){
			price=147.00;
			return price;
		}else if(foodName=="Veg Pulao"){
			price=148.00;
			return price;
		}else if(foodName=="Jeera Rice"){
			price=149.00;
			return price;
		}else if(foodName=="Steamed Rice"){
			price=150.00;
			return price;
		}else if(foodName=="Dal Tadka"){
			price=151.00;
			return price;
		}else if(foodName=="Dal Fry"){
			price=152.00;
			return price;
		}else if(foodName=="Rajma Masala"){
			price=153.00;
			return price;
		}else if(foodName=="Chole Masala"){
			price=154.00;
			return price;
		}else if(foodName=="Paneer Butter Masala"){
			price=155.00;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}

	public static double search(String foodName,int quantity){
		double price = 0.0;

		if(foodName=="Classic Veg Burger"){
			price=101.00*quantity;
			return price;
		}else if(foodName=="Double Chicken Burger"){
			price=102.00*quantity;
			return price;
		}else if(foodName=="Crispy Fish Burger"){
			price=103.00*quantity;
			return price;
		}else if(foodName=="Paneer Zinger Burger"){
			price=104.00*quantity;
			return price;
		}else if(foodName=="BBQ Beef Burger"){
			price=105.00*quantity;
			return price;
		}else if(foodName=="Spicy Lamb Burger"){
			price=106.00*quantity;
			return price;
		}else if(foodName=="Mushroom Swiss Burger"){
			price=107.00*quantity;
			return price;
		}else if(foodName=="Aloo Tikki Burger"){
			price=108.00*quantity;
			return price;
		}else if(foodName=="Grilled Chicken Sandwich"){
			price=109.00*quantity;
			return price;
		}else if(foodName=="Club Sandwich Deluxe"){
			price=110.00*quantity;
			return price;
		}else if(foodName=="Veg Cheese Sandwich"){
			price=111.00*quantity;
			return price;
		}else if(foodName=="Tuna Mayo Sandwich"){
			price=112.00*quantity;
			return price;
		}else if(foodName=="Egg Salad Sandwich"){
			price=113.00*quantity;
			return price;
		}else if(foodName=="Chicken Shawarma Roll"){
			price=114.00*quantity;
			return price;
		}else if(foodName=="Veg Spring Roll"){
			price=115.00*quantity;
			return price;
		}else if(foodName=="Chicken Spring Roll"){
			price=116.00*quantity;
			return price;
		}else if(foodName=="Paneer Kathi Roll"){
			price=117.00*quantity;
			return price;
		}else if(foodName=="Egg Kathi Roll"){
			price=118.00*quantity;
			return price;
		}else if(foodName=="Chicken Nuggets"){
			price=119.00*quantity;
			return price;
		}else if(foodName=="Fish Fingers"){
			price=120.00*quantity;
			return price;
		}else if(foodName=="French Fries Large"){
			price=121.00*quantity;
			return price;
		}else if(foodName=="Peri Peri Fries"){
			price=122.00*quantity;
			return price;
		}else if(foodName=="Cheese Garlic Bread"){
			price=123.00*quantity;
			return price;
		}else if(foodName=="Stuffed Garlic Bread"){
			price=124.00*quantity;
			return price;
		}else if(foodName=="Nachos with Salsa"){
			price=125.00*quantity;
			return price;
		}else if(foodName=="Loaded Nachos"){
			price=126.00*quantity;
			return price;
		}else if(foodName=="Veg Momos"){
			price=127.00*quantity;
			return price;
		}else if(foodName=="Chicken Momos"){
			price=128.00*quantity;
			return price;
		}else if(foodName=="Fried Momos"){
			price=129.00*quantity;
			return price;
		}else if(foodName=="Tandoori Momos"){
			price=130.00*quantity;
			return price;
		}else if(foodName=="Veg Manchurian"){
			price=131.00*quantity;
			return price;
		}else if(foodName=="Gobi Manchurian"){
			price=132.00*quantity;
			return price;
		}else if(foodName=="Chicken Manchurian"){
			price=133.00*quantity;
			return price;
		}else if(foodName=="Paneer Chilli"){
			price=134.00*quantity;
			return price;
		}else if(foodName=="Chilli Chicken"){
			price=135.00*quantity;
			return price;
		}else if(foodName=="Veg Hakka Noodles"){
			price=136.00*quantity;
			return price;
		}else if(foodName=="Chicken Hakka Noodles"){
			price=137.00*quantity;
			return price;
		}else if(foodName=="Schezwan Noodles"){
			price=138.00*quantity;
			return price;
		}else if(foodName=="Veg Fried Rice"){
			price=139.00*quantity;
			return price;
		}else if(foodName=="Chicken Fried Rice"){
			price=140.00*quantity;
			return price;
		}else if(foodName=="Egg Fried Rice"){
			price=141.00*quantity;
			return price;
		}else if(foodName=="Paneer Fried Rice"){
			price=142.00*quantity;
			return price;
		}else if(foodName=="Veg Biryani"){
			price=143.00*quantity;
			return price;
		}else if(foodName=="Chicken Biryani"){
			price=144.00*quantity;
			return price;
		}else if(foodName=="Mutton Biryani"){
			price=145.00*quantity;
			return price;
		}else if(foodName=="Egg Biryani"){
			price=146.00*quantity;
			return price;
		}else if(foodName=="Hyderabadi Dum Biryani"){
			price=147.00*quantity;
			return price;
		}else if(foodName=="Veg Pulao"){
			price=148.00*quantity;
			return price;
		}else if(foodName=="Jeera Rice"){
			price=149.00*quantity;
			return price;
		}else if(foodName=="Steamed Rice"){
			price=150.00*quantity;
			return price;
		}else if(foodName=="Dal Tadka"){
			price=151.00*quantity;
			return price;
		}else if(foodName=="Dal Fry"){
			price=152.00*quantity;
			return price;
		}else if(foodName=="Rajma Masala"){
			price=153.00*quantity;
			return price;
		}else if(foodName=="Chole Masala"){
			price=154.00*quantity;
			return price;
		}else if(foodName=="Paneer Butter Masala"){
			price=155.00*quantity;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
}
