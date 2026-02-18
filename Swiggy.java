class Swiggy{
	public static double search(String foodName){
		double price = 0.0;
		if(foodName=="White Sauce Pasta"){
			price=512.00;
			return price;
		}else if(foodName=="Red Sauce Pasta"){
			price=129.00;
			return price;	
		}else if(foodName=="Lasagna"){
			price=511.00;
			return price;
		}else if(foodName=="Mac and Cheese"){
			price=130.00;
			return price;
		}else if(foodName=="Caesar Salad"){
			price=510.00;
			return price;
		}else if(foodName=="Greek Salad"){
			price=131.00;
			return price;
		}else if(foodName=="Tandoori Chicken"){
			price=509.00;
			return price;
		}else if(foodName=="Butter Chicken"){
			price=132.00;
			return price;
		}else if(foodName=="Kadai Paneer"){
			price=508.00;
			return price;
		}else if(foodName=="Kadai Chicken"){
			price=133.00;
			return price;
		}else if(foodName=="Veg Kofta"){
			price=507.00;
			return price;
		}else if(foodName=="Matar Paneer"){
			price=134.00;
			return price;
		}else if(foodName=="Rajma Masala"){
			price=506.00;
			return price;
		}else if(foodName=="Kadhi Pakora"){
			price=135.00;
			return price;
		}else if(foodName=="Upma"){
			price=505.00;
			return price;
		}else if(foodName=="Pongal"){
			price=136.00;
			return price;
		}else if(foodName=="Appam"){
			price=504.00;
			return price;
		}else if(foodName=="Puttu"){
			price=137.00;
			return price;
		}else if(foodName=="Kerala Parotta"){
			price=503.00;
			return price;
		}else if(foodName=="Chilli Paneer"){
			price=138.00;
			return price;
		}else if(foodName=="Chilli Chicken"){
			price=502.00;
			return price;
		}else if(foodName=="Fried Momos"){
			price=139.00;
			return price;
		}else if(foodName=="Steamed Momos"){
			price=501;
			return price;
		}else if(foodName=="Thukpa"){
			price=140.00;
			return price;
		}else if(foodName=="Falooda"){
			price=500.00;
			return price;
		}else if(foodName=="Kulfi"){
			price=141.00;
			return price;
		}else if(foodName=="Rabri"){
			price=499.00;
			return price;
		}else if(foodName=="Basundi"){
			price=142.00;
			return price;
		}else if(foodName=="Shahi Tukda"){
			price=498.00;
			return price;
		}else if(foodName=="Moong Dal Halwa"){
			price=143.00;
			return price;
		}else if(foodName=="Carrot Halwa"){
			price=497.00;
			return price;
		}else if(foodName=="Badam Milk"){
			price=144.00;
			return price;
		}else if(foodName=="Lassi"){
			price=496.00;
			return price;
		}else if(foodName=="Buttermilk"){
			price=145.00;
			return price;
		}else if(foodName=="Masala Tea"){
			price=495.00;
			return price;
		}else if(foodName=="Filter Coffee"){
			price=146.00;
			return price;
		}else if(foodName=="Cold Coffee"){
			price=494.00;
			return price;
		}else if(foodName=="Cappuccino"){
			price=147.00;
			return price;
		}else if(foodName=="Espresso"){
			price=493.00;
			return price;
		}else if(foodName=="Blueberry Cheesecake"){
			price=148.00;
			return price;
		}else if(foodName=="Strawberry Shake"){
			price=492.00;
			return price;
		}else if(foodName=="Pineapple Juice"){
			price=149.00;
			return price;
		}else if(foodName=="Watermelon Juice"){
			price=491.00;
			return price;
		}else if(foodName=="Orange Juice"){
			price=150.00;
			return price;
		}else if(foodName=="Veg Thali"){
			price=490.00;
			return price;
		}else if(foodName=="Non Veg Thali"){
			price=151;
			return price;
		}else if(foodName=="Dal Makhani"){
			price=489.00;
			return price;
		}else if(foodName=="Bhindi Masala"){
			price=152.00;
			return price;
		}else if(foodName=="Baingan Bharta"){
			price=488.00;
			return price;
		}else if(foodName=="Stuffed Capsicum"){
			price=153.00;
			return price;
		}else if(foodName=="Corn Cheese Balls"){
			price=487.00;
			return price;
		}else if(foodName=="Nachos with Salsa"){
			price=154.00;
			return price;
		}else if(foodName=="Mexican Burrito"){
			price=486.00;
			return price;
		}else if(foodName=="Tacos"){
			price=155.00;
			return price;
		}else if(foodName=="Sushi Roll"){
			price=485.00;
			return price;
		}else if(foodName=="Ramen Bowl"){
			price=156.00;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
	public static double search(String foodName,int quantity){
		double price = 0.0;
		if(foodName=="White Sauce Pasta"){
			price= 512.00*quantity;
			return price;
		}else if(foodName=="Red Sauce Pasta"){
			price= 129.00*quantity;
			return price;
		}else if(foodName=="Lasagna"){
			price= 511.00*quantity;
			return price;
		}else if(foodName=="Mac and Cheese"){
			price= 130.00*quantity;
			return price;
		}else if(foodName=="Caesar Salad"){
			price= 510.00*quantity;
			return price;
		}else if(foodName=="Greek Salad"){
			price= 131.00*quantity;
			return price;
		}else if(foodName=="Tandoori Chicken"){
			price= 509.00*quantity;
			return price;
		}else if(foodName=="Butter Chicken"){
			price= 132.00*quantity;
			return price;
		}else if(foodName=="Kadai Paneer"){
			price= 508.00*quantity;
			return price;
		}else if(foodName=="Kadai Chicken"){
			price= 133.00*quantity;
			return price;
		}else if(foodName=="Veg Kofta"){
			price= 507.00*quantity;
			return price;
		}else if(foodName=="Matar Paneer"){
			price= 134.00*quantity;
			return price;
		}else if(foodName=="Rajma Masala"){
			price= 506.00*quantity;
			return price;
		}else if(foodName=="Kadhi Pakora"){
			price= 135.00*quantity;
			return price;
		}else if(foodName=="Upma"){
			price= 505.00*quantity;
			return price;
		}else if(foodName=="Pongal"){
			price= 136.00*quantity;
			return price;
		}else if(foodName=="Appam"){
			price= 504.00*quantity;
			return price;
		}else if(foodName=="Puttu"){
			price= 137.00*quantity;
			return price;
		}else if(foodName=="Kerala Parotta"){
			price= 503.00*quantity;
			return price;
		}else if(foodName=="Chilli Paneer"){
			price= 138.00*quantity;
			return price;
		}else if(foodName=="Chilli Chicken"){
			price= 502.00*quantity;
			return price;
		}else if(foodName=="Fried Momos"){
			price= 139.00*quantity;
			return price;
		}else if(foodName=="Steamed Momos"){
			price= 501.00*quantity;
			return price;
		}else if(foodName=="Thukpa"){
			price= 140.00*quantity;
			return price;
		}else if(foodName=="Falooda"){
			price= 500.00*quantity;
			return price;
		}else if(foodName=="Kulfi"){
			price= 141.00*quantity;
			return price;
		}else if(foodName=="Rabri"){
			price= 499.00*quantity;
			return price;
		}else if(foodName=="Basundi"){
			price= 142.00*quantity;
			return price;
		}else if(foodName=="Shahi Tukda"){
			price= 498.00*quantity;
			return price;
		}else if(foodName=="Moong Dal Halwa"){
			price= 143.00*quantity;
			return price;
		}else if(foodName=="Carrot Halwa"){
			price= 497.00*quantity;
			return price;
		}else if(foodName=="Badam Milk"){
			price= 144.00*quantity;
			return price;
		}else if(foodName=="Lassi"){
			price= 496.00*quantity;
			return price;
		}else if(foodName=="Buttermilk"){
			price= 145.00*quantity;
			return price;
		}else if(foodName=="Masala Tea"){
			price= 495.00*quantity;
			return price;
		}else if(foodName=="Filter Coffee"){
			price= 146.00*quantity;
			return price;
		}else if(foodName=="Cold Coffee"){
			price= 494.00*quantity;
			return price;
		}else if(foodName=="Cappuccino"){
			price= 147.00*quantity;
			return price;
		}else if(foodName=="Espresso"){
			price= 493.00*quantity;
			return price;
		}else if(foodName=="Blueberry Cheesecake"){
			price= 148.00*quantity;
			return price;
		}else if(foodName=="Strawberry Shake"){
			price= 492.00*quantity;
			return price;
		}else if(foodName=="Pineapple Juice"){
			price= 149.00*quantity;
			return price;
		}else if(foodName=="Watermelon Juice"){
			price= 491.00*quantity;
			return price;
		}else if(foodName=="Orange Juice"){
			price= 150.00*quantity;
			return price;
		}else if(foodName=="Veg Thali"){
			price= 490.00*quantity;
			return price;
		}else if(foodName=="Non Veg Thali"){
			price= 151.00*quantity;
			return price;
		}else if(foodName=="Dal Makhani"){
			price= 489.00*quantity;
			return price;
		}else if(foodName=="Bhindi Masala"){
			price= 152.00*quantity;
			return price;
		}else if(foodName=="Baingan Bharta"){
			price= 488.00*quantity;
			return price;
		}else if(foodName=="Stuffed Capsicum"){
			price= 153.00*quantity;
			return price;
		}else if(foodName=="Corn Cheese Balls"){
			price= 487.00*quantity;
			return price;
		}else if(foodName=="Nachos with Salsa"){
			price= 154.00*quantity;
			return price;
		}else if(foodName=="Mexican Burrito"){
			price= 486.00*quantity;
			return price;
		}else if(foodName=="Tacos"){
			price= 155.00*quantity;
			return price;
		}else if(foodName=="Sushi Roll"){
			price= 485.00*quantity;
			return price;
		}else if(foodName=="Ramen Bowl"){
			price= 156.00*quantity;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
	
}