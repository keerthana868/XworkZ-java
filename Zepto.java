class Zepto{ 

	public static double search(String foodName){
		double price = 0.0;

		if(foodName=="Kadai Paneer"){
			price=156.00;
			return price;
		}else if(foodName=="Shahi Paneer"){
			price=157.00;
			return price;
		}else if(foodName=="Palak Paneer"){
			price=158.00;
			return price;
		}else if(foodName=="Malai Kofta"){
			price=159.00;
			return price;
		}else if(foodName=="Veg Kofta Curry"){
			price=160.00;
			return price;
		}else if(foodName=="Butter Chicken"){
			price=161.00;
			return price;
		}else if(foodName=="Kadai Chicken"){
			price=162.00;
			return price;
		}else if(foodName=="Chicken Curry"){
			price=163.00;
			return price;
		}else if(foodName=="Mutton Curry"){
			price=164.00;
			return price;
		}else if(foodName=="Fish Curry"){
			price=165.00;
			return price;
		}else if(foodName=="Prawn Masala"){
			price=166.00;
			return price;
		}else if(foodName=="Tandoori Chicken Full"){
			price=167.00;
			return price;
		}else if(foodName=="Chicken Tikka"){
			price=168.00;
			return price;
		}else if(foodName=="Paneer Tikka"){
			price=169.00;
			return price;
		}else if(foodName=="Veg Seekh Kebab"){
			price=170.00;
			return price;
		}else if(foodName=="Chicken Seekh Kebab"){
			price=171.00;
			return price;
		}else if(foodName=="Mutton Seekh Kebab"){
			price=172.00;
			return price;
		}else if(foodName=="Hummus with Pita"){
			price=173.00;
			return price;
		}else if(foodName=="Falafel Plate"){
			price=174.00;
			return price;
		}else if(foodName=="Greek Salad"){
			price=175.00;
			return price;
		}else if(foodName=="Caesar Salad"){
			price=176.00;
			return price;
		}else if(foodName=="Russian Salad"){
			price=177.00;
			return price;
		}else if(foodName=="Fruit Salad Bowl"){
			price=178.00;
			return price;
		}else if(foodName=="Tomato Soup"){
			price=179.00;
			return price;
		}else if(foodName=="Sweet Corn Soup"){
			price=180.00;
			return price;
		}else if(foodName=="Hot & Sour Soup"){
			price=181.00;
			return price;
		}else if(foodName=="Manchow Soup"){
			price=182.00;
			return price;
		}else if(foodName=="Cream of Mushroom Soup"){
			price=183.00;
			return price;
		}else if(foodName=="Veg Clear Soup"){
			price=184.00;
			return price;
		}else if(foodName=="Chicken Clear Soup"){
			price=185.00;
			return price;
		}else if(foodName=="Masala Dosa"){
			price=186.00;
			return price;
		}else if(foodName=="Plain Dosa"){
			price=187.00;
			return price;
		}else if(foodName=="Mysore Dosa"){
			price=188.00;
			return price;
		}else if(foodName=="Rava Dosa"){
			price=189.00;
			return price;
		}else if(foodName=="Onion Uttapam"){
			price=190.00;
			return price;
		}else if(foodName=="Idli Sambar"){
			price=191.00;
			return price;
		}else if(foodName=="Medu Vada"){
			price=192.00;
			return price;
		}else if(foodName=="Pongal"){
			price=193.00;
			return price;
		}else if(foodName=="Upma"){
			price=194.00;
			return price;
		}else if(foodName=="Poori Bhaji"){
			price=195.00;
			return price;
		}else if(foodName=="Aloo Paratha"){
			price=196.00;
			return price;
		}else if(foodName=="Paneer Paratha"){
			price=197.00;
			return price;
		}else if(foodName=="Gobhi Paratha"){
			price=198.00;
			return price;
		}else if(foodName=="Butter Naan"){
			price=199.00;
			return price;
		}else if(foodName=="Garlic Naan"){
			price=200.00;
			return price;
		}else if(foodName=="Tandoori Roti"){
			price=201.00;
			return price;
		}else if(foodName=="Lachha Paratha"){
			price=202.00;
			return price;
		}else if(foodName=="Rumali Roti"){
			price=203.00;
			return price;
		}else if(foodName=="Pav Bhaji"){
			price=204.00;
			return price;
		}else if(foodName=="Vada Pav"){
			price=205.00;
			return price;
		}else if(foodName=="Misal Pav"){
			price=206.00;
			return price;
		}else if(foodName=="Samosa"){
			price=207.00;
			return price;
		}else if(foodName=="Kachori"){
			price=208.00;
			return price;
		}else if(foodName=="Dhokla"){
			price=209.00;
			return price;
		}else if(foodName=="Khaman"){
			price=210.00;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
	
	public static double search(String foodName,int quantity){
		double price = 0.0;

		if(foodName=="Kadai Paneer"){
			price=156.00*quantity;
			return price;
		}else if(foodName=="Shahi Paneer"){
			price=157.00*quantity;
			return price;
		}else if(foodName=="Palak Paneer"){
			price=158.00*quantity;
			return price;
		}else if(foodName=="Malai Kofta"){
			price=159.00*quantity;
			return price;
		}else if(foodName=="Veg Kofta Curry"){
			price=160.00*quantity;
			return price;
		}else if(foodName=="Butter Chicken"){
			price=161.00*quantity;
			return price;
		}else if(foodName=="Kadai Chicken"){
			price=162.00*quantity;
			return price;
		}else if(foodName=="Chicken Curry"){
			price=163.00*quantity;
			return price;
		}else if(foodName=="Mutton Curry"){
			price=164.00*quantity;
			return price;
		}else if(foodName=="Fish Curry"){
			price=165.00*quantity;
			return price;
		}else if(foodName=="Prawn Masala"){
			price=166.00*quantity;
			return price;
		}else if(foodName=="Tandoori Chicken Full"){
			price=167.00*quantity;
			return price;
		}else if(foodName=="Chicken Tikka"){
			price=168.00*quantity;
			return price;
		}else if(foodName=="Paneer Tikka"){
			price=169.00*quantity;
			return price;
		}else if(foodName=="Veg Seekh Kebab"){
			price=170.00*quantity;
			return price;
		}else if(foodName=="Chicken Seekh Kebab"){
			price=171.00*quantity;
			return price;
		}else if(foodName=="Mutton Seekh Kebab"){
			price=172.00*quantity;
			return price;
		}else if(foodName=="Hummus with Pita"){
			price=173.00*quantity;
			return price;
		}else if(foodName=="Falafel Plate"){
			price=174.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Greek Salad"){
			price=175.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Caesar Salad"){
			price=176.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Russian Salad"){
			price=177.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Fruit Salad Bowl"){
			price=178.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Tomato Soup"){
			price=179.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Sweet Corn Soup"){
			price=180.00*quantity*quantity*quantity;
			return price;
		}else if(foodName=="Hot & Sour Soup"){
			price=181.00*quantity;
			return price;
		}else if(foodName=="Manchow Soup"){
			price=182.00*quantity*quantity;
			return price;
		}else if(foodName=="Cream of Mushroom Soup"){
			price=183.00*quantity*quantity;
			return price;
		}else if(foodName=="Veg Clear Soup"){
			price=184.00*quantity*quantity;
			return price;
		}else if(foodName=="Chicken Clear Soup"){
			price=185.00*quantity*quantity;
			return price;
		}else if(foodName=="Masala Dosa"){
			price=186.00*quantity*quantity;
			return price;
		}else if(foodName=="Plain Dosa"){
			price=187.00*quantity*quantity;
			return price;
		}else if(foodName=="Mysore Dosa"){
			price=188.00*quantity*quantity;
			return price;
		}else if(foodName=="Rava Dosa"){
			price=189.00*quantity;
			return price;
		}else if(foodName=="Onion Uttapam"){
			price=190.00*quantity;
			return price;
		}else if(foodName=="Idli Sambar"){
			price=191.00*quantity;
			return price;
		}else if(foodName=="Medu Vada"){
			price=192.00*quantity;
			return price;
		}else if(foodName=="Pongal"){
			price=193.00*quantity;
			return price;
		}else if(foodName=="Upma"){
			price=194.00*quantity;
			return price;
		}else if(foodName=="Poori Bhaji"){
			price=195.00*quantity;
			return price;
		}else if(foodName=="Aloo Paratha"){
			price=196.00*quantity;
			return price;
		}else if(foodName=="Paneer Paratha"){
			price=197.00*quantity;
			return price;
		}else if(foodName=="Gobhi Paratha"){
			price=198.00*quantity;
			return price;
		}else if(foodName=="Butter Naan"){
			price=199.00*quantity;
			return price;
		}else if(foodName=="Garlic Naan"){
			price=200.00*quantity;
			return price;
		}else if(foodName=="Tandoori Roti"){
			price=201.00*quantity;
			return price;
		}else if(foodName=="Lachha Paratha"){
			price=202.00*quantity;
			return price;
		}else if(foodName=="Rumali Roti"){
			price=203.00*quantity;
			return price;
		}else if(foodName=="Pav Bhaji"){
			price=204.00*quantity;
			return price;
		}else if(foodName=="Vada Pav"){
			price=205.00*quantity;
			return price;
		}else if(foodName=="Misal Pav"){
			price=206.00*quantity;
			return price;
		}else if(foodName=="Samosa"){
			price=207.00*quantity;
			return price;
		}else if(foodName=="Kachori"){
			price=208.00*quantity;
			return price;
		}else if(foodName=="Dhokla"){
			price=209.00*quantity;
			return price;
		}else if(foodName=="Khaman"){
			price=210.00*quantity;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
}
	
	
	

	
	
	
