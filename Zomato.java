class Zomato{
	public static double search(String foodName){
		double price = 0.0;
		if(foodName=="Masala Dose"){
			price=540.00;
			return price;
		}else if(foodName=="Panner Masala"){
			price=101.00;
			return price;
		}else if(foodName=="Veg Biryani"){
			price=539.00;
			return price;
		}else if(foodName=="Chicken Biryani"){
			price=102.00;
			return price;
		}else if(foodName=="Mutton Rogan Josh"){
			price=538.00;
			return price;
		}else if(foodName=="Gobi Manchurian"){
			price=103.00;
			return price;
		}else if(foodName=="Idli Sambar"){
			price=537.00;
			return price;
		}else if(foodName=="Butter Naan"){
			price=104.00;
			return price;
		}else if(foodName=="Palak Paneer"){
			price=536.00;
			return price;
		}else if(foodName=="Veg Fried Rice"){
			price=105.00;
			return price;
		}else if(foodName=="Chicken Tikka"){
			price=535.00;
			return price;
		}else if(foodName=="Chole Bhature"){
			price=106.00;
			return price;
		}else if(foodName=="Pani Puri"){
			price=534.00;
			return price;
		}else if(foodName=="Samosa Chaat"){
			price=107.00;
			return price;
		}else if(foodName=="Margherita Pizza"){
			price=533.00;
			return price;
		}else if(foodName=="Veg Burger"){
			price=108.00;
			return price;
		}else if(foodName=="French Fries"){
			price=532.00;
			return price;
		}else if(foodName=="Tomato Soup"){
			price=109.00;
			return price;
		}else if(foodName=="Ice Cream Sundae"){
			price=531.00;
			return price;
		}else if(foodName=="Chocolate Brownie"){
			price=110.00;
			return price;
		}else if(foodName=="Mango Milkshake"){
			price=530.00;
			return price;
		}else if(foodName=="Rava Dosa"){
			price=111.00;
			return price;
		}else if(foodName=="Mysore Pak"){
			price=529.00;
			return price;
		}else if(foodName=="Kaju Katli"){
			price=112.00;
			return price;
		}else if(foodName=="Rasmalai"){
			price=528.00;
			return price;
		}else if(foodName=="Gulab Jamun"){
			price=113.00;
			return price;
		}else if(foodName=="Jalebi"){
			price=527.00;
			return price;
		}else if(foodName=="Dal Tadka"){
			price=114.00;
			return price;
		}else if(foodName=="Jeera Rice"){
			price=526.00;
			return price;
		}else if(foodName=="Veg Pulao"){
			price=115.00;
			return price;
		}else if(foodName=="Hyderabadi Biryani"){
			price=525.00;
			return price;
		}else if(foodName=="Tandoori Roti"){
			price=116.00;
			return price;
		}else if(foodName=="Malai Kofta"){
			price=524.00;
			return price;
		}else if(foodName=="Aloo Paratha"){
			price=117.00;
			return price;
		}else if(foodName=="Pav Bhaji"){
			price=523.00;
			return price;
		}else if(foodName=="Vada Pav"){
			price=118.00;
			return price;
		}else if(foodName=="Dahi Puri"){
			price=522.00;
			return price;
		}else if(foodName=="Sev Puri"){
			price=119.00;
			return price;
		}else if(foodName=="Hakka Noodles"){
			price=521.00;
			return price;
		}else if(foodName=="Schezwan Rice"){
			price=120.00;
			return price;
		}else if(foodName=="Chicken 65"){
			price=520.00;
			return price;
		}else if(foodName=="Fish Fry"){
			price=121.00;
			return price;
		}else if(foodName=="Prawn Curry"){
			price=519.00;
			return price;
		}else if(foodName=="Egg Curry"){
			price=112.00;
			return price;
		}else if(foodName=="Lemon Rice"){
			price=518.00;
			return price;
		}else if(foodName=="Curd Rice"){
			price=123.00;
			return price;
		}else if(foodName=="Tamarind Rice"){
			price=517.00;
			return price;
		}else if(foodName=="Veg Manchow Soup"){
			price=124.00;
			return price;
		}else if(foodName=="Sweet Corn Soup"){
			price=516.00;
			return price;
		}else if(foodName=="Hot and Sour Soup"){
			price=125.00;
			return price;
		}else if(foodName=="Paneer Tikka"){
			price=151.00;
			return price;
		}else if(foodName=="Chicken Lollipop"){
			price=126.00;
			return price;
		}else if(foodName=="Veg Spring Roll"){
			price=514.00;
			return price;
		}else if(foodName=="Cheese Sandwich"){
			price=127.00;
			return price;
		}else if(foodName=="Club Sandwich"){
			price=513.00;
			return price;
		}else if(foodName=="Garlic Bread"){
			price=128.00;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
	public static double search(String foodName,int quantity){
		double price = 0.0;
		if(foodName=="Masala Dosa"){
			price= 540.00*quantity;
			return price;
		}else if(foodName=="Paneer Butter Masala"){
			price= 101.00 *quantity;
			return price;
		}else if(foodName=="Veg Biryani"){
			price= 539.00*quantity;
			return price;
		}else if(foodName=="Chicken Biryani"){
			price= 102.00*quantity;
			return price;
		}else if(foodName=="Mutton Rogan Josh"){
			price= 538.00*quantity;
			return price;
		}else if(foodName=="Gobi Manchurian"){
			price= 103.00*quantity;
			return price;
		}else if(foodName=="Idli Sambar"){
			price= 537.00*quantity;
			return price;
		}else if(foodName=="Butter Naan"){
			price= 104.00*quantity;
			return price;
		}else if(foodName=="Palak Paneer"){
			price= 536.00*quantity;
			return price;
		}else if(foodName=="Veg Fried Rice"){
			price= 105.00*quantity;
			return price;
		}else if(foodName=="Chicken Tikka"){
			price= 535.00*quantity;
			return price;
		}else if(foodName=="Chole Bhature"){
			price= 106.00*quantity;
			return price;
		}else if(foodName=="Pani Puri"){
			price= 534.00*quantity;
			return price;
		}else if(foodName=="Samosa Chaat"){
			price= 107.00*quantity;
			return price;
		}else if(foodName=="Margherita Pizza"){
			price= 533.00*quantity;
			return price;
		}else if(foodName=="Veg Burger"){
			price= 108.00*quantity;
			return price;
		}else if(foodName=="French Fries"){
			price= 532.00*quantity;
			return price;
		}else if(foodName=="Tomato Soup"){
			price= 109.00*quantity;
			return price;
		}else if(foodName=="Ice Cream Sundae"){
			price= 531.00*quantity;
			return price;
		}else if(foodName=="Chocolate Brownie"){
			price= 110.00*quantity;
			return price;
		}else if(foodName=="Mango Milkshake"){
			price= 530.00*quantity;
			return price;
		}else if(foodName=="Rava Dosa"){
			price= 111.00*quantity;
			return price;
		}else if(foodName=="Mysore Pak"){
			price= 529.00*quantity;
			return price;
		}else if(foodName=="Kaju Katli"){
			price= 112.00*quantity;
			return price;
		}else if(foodName=="Rasmalai"){
			price= 528.00*quantity;
			return price;
		}else if(foodName=="Gulab Jamun"){
			price= 113.00*quantity;
			return price;
		}else if(foodName=="Jalebi"){
			price= 527.00*quantity;
			return price;
		}else if(foodName=="Dal Tadka"){
			price= 114.00*quantity;
			return price;
		}else if(foodName=="Jeera Rice"){
			price= 526.00*quantity;
			return price;
		}else if(foodName=="Veg Pulao"){
			price= 115.00*quantity;
			return price;
		}else if(foodName=="Hyderabadi Biryani"){
			price= 525.00*quantity;
			return price;
		}else if(foodName=="Tandoori Roti"){
			price= 116.00*quantity;
			return price;
		}else if(foodName=="Malai Kofta"){
			price= 524.00*quantity;
			return price;
		}else if(foodName=="Aloo Paratha"){
			price= 117.00*quantity;
			return price;
		}else if(foodName=="Pav Bhaji"){
			price= 523.00*quantity;
			return price;
		}else if(foodName=="Vada Pav"){
			price= 118.00*quantity;
			return price;
		}else if(foodName=="Dahi Puri"){
			price= 522.00*quantity;
			return price;
		}else if(foodName=="Sev Puri"){
			price= 119.00*quantity;
			return price;
		}else if(foodName=="Hakka Noodles"){
			price= 521.00*quantity;
			return price;
		}else if(foodName=="Schezwan Rice"){
			price= 120.00*quantity;
			return price;
		}else if(foodName=="Chicken 65"){
			price= 520.00*quantity;
			return price;
		}else if(foodName=="Fish Fry"){
			price= 121.00*quantity;
			return price;
		}else if(foodName=="Prawn Curry"){
			price= 519.00*quantity;
			return price;
		}else if(foodName=="Egg Curry"){
			price= 122.00*quantity;
			return price;
		}else if(foodName=="Lemon Rice"){
			price= 518.00*quantity;
			return price;
		}else if(foodName=="Curd Rice"){
			price= 123.00*quantity;
			return price;
		}else if(foodName=="Tamarind Rice"){
			price= 517.00*quantity;
			return price;
		}else if(foodName=="Veg Manchow Soup"){
			price= 124.00*quantity;
			return price;
		}else if(foodName=="Sweet Corn Soup"){
			price= 516.00*quantity;
			return price;
		}else if(foodName=="Hot and Sour Soup"){
			price= 125.00*quantity;
			return price;
		}else if(foodName=="Paneer Tikka"){
			price= 515.00*quantity;
			return price;
		}else if(foodName=="Chicken Lollipop"){
			price= 126.00*quantity;
			return price;
		}else if(foodName=="Veg Spring Roll"){
			price= 514.00*quantity;
			return price;
		}else if(foodName=="Cheese Sandwich"){
			price= 127.00*quantity;
			return price;
		}else if(foodName=="Club Sandwich"){
			price= 513.00*quantity;
			return price;
		}else if(foodName=="Garlic Bread"){
			price= 128.00*quantity;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
}