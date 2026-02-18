class Dominos{ 

	public static double search(String foodName){
		double price = 0.0;

		if(foodName=="Margherita Classic"){
			price=512.00;
			return price;
		}else if(foodName=="Farmhouse Delight"){
			price=129.00;
			return price;	
		}else if(foodName=="Pepperoni Feast"){
			price=511.00;
			return price;
		}else if(foodName=="Veggie Supreme"){
			price=130.00;
			return price;
		}else if(foodName=="Cheese Burst Special"){
			price=510.00;
			return price;
		}else if(foodName=="BBQ Chicken Pizza"){
			price=131.00;
			return price;
		}else if(foodName=="Paneer Tikka Pizza"){
			price=509.00;
			return price;
		}else if(foodName=="Mexican Green Wave"){
			price=132.00;
			return price;
		}else if(foodName=="Hawaiian Paradise"){
			price=508.00;
			return price;
		}else if(foodName=="Four Cheese Fusion"){
			price=133.00;
			return price;
		}else if(foodName=="Spicy Jalapeno Pizza"){
			price=507.00;
			return price;
		}else if(foodName=="Mushroom Magic"){
			price=134.00;
			return price;
		}else if(foodName=="Corn & Capsicum Pizza"){
			price=506.00;
			return price;
		}else if(foodName=="Tandoori Chicken Pizza"){
			price=135.00;
			return price;
		}else if(foodName=="Peri Peri Veg Pizza"){
			price=505.00;
			return price;
		}else if(foodName=="Garlic Chicken Pizza"){
			price=136.00;
			return price;
		}else if(foodName=="Italian Herb Pizza"){
			price=504.00;
			return price;
		}else if(foodName=="Spinach & Feta Pizza"){
			price=137.00;
			return price;
		}else if(foodName=="Smoked Sausage Pizza"){
			price=503.00;
			return price;
		}else if(foodName=="Butter Chicken Pizza"){
			price=138.00;
			return price;
		}else if(foodName=="Cheesy Mushroom Blast"){
			price=502.00;
			return price;
		}else if(foodName=="Onion Overload Pizza"){
			price=139.00;
			return price;
		}else if(foodName=="Sweet Corn Delight"){
			price=501;
			return price;
		}else if(foodName=="Double Cheese Pizza"){
			price=140.00;
			return price;
		}else if(foodName=="Chicken Supreme Pizza"){
			price=500.00;
			return price;
		}else if(foodName=="Veg Extravaganza"){
			price=141.00;
			return price;
		}else if(foodName=="Chilli Paneer Pizza"){
			price=499.00;
			return price;
		}else if(foodName=="Bacon & Cheese Pizza"){
			price=142.00;
			return price;
		}else if(foodName=="Mediterranean Veg Pizza"){
			price=498.00;
			return price;
		}else if(foodName=="Thai Veg Pizza"){
			price=143.00;
			return price;
		}else if(foodName=="Chicken Tikka Supreme"){
			price=497.00;
			return price;
		}else if(foodName=="Desi Masala Pizza"){
			price=144.00;
			return price;
		}else if(foodName=="Schezwan Chicken Pizza"){
			price=496.00;
			return price;
		}else if(foodName=="Pesto Veggie Pizza"){
			price=145.00;
			return price;
		}else if(foodName=="Meat Lovers Pizza"){
			price=495.00;
			return price;
		}else if(foodName=="Tomato Basil Pizza"){
			price=146.00;
			return price;
		}else if(foodName=="Alfredo Chicken Pizza"){
			price=494.00;
			return price;
		}else if(foodName=="Nacho Cheese Pizza"){
			price=147.00;
			return price;
		}else if(foodName=="Zesty Capsicum Pizza"){
			price=493.00;
			return price;
		}else if(foodName=="Smoky BBQ Veg Pizza"){
			price=148.00;
			return price;
		}else if(foodName=="Triple Layer Cheese Pizza"){
			price=492.00;
			return price;
		}else if(foodName=="Hot & Spicy Chicken Pizza"){
			price=149.00;
			return price;
		}else if(foodName=="Tangy Tomato Pizza"){
			price=491.00;
			return price;
		}else if(foodName=="Crispy Veg Crunch Pizza"){
			price=150.00;
			return price;
		}else if(foodName=="Cottage Cheese Pizza"){
			price=490.00;
			return price;
		}else if(foodName=="Exotic Veg Feast"){
			price=151;
			return price;
		}else if(foodName=="Loaded Meat Pizza"){
			price=489.00;
			return price;
		}else if(foodName=="Jalapeno Popper Pizza"){
			price=152.00;
			return price;
		}else if(foodName=="Spinach Corn Supreme"){
			price=488.00;
			return price;
		}else if(foodName=="Garlic Parmesan Pizza"){
			price=153.00;
			return price;
		}else if(foodName=="Cheesy Burst Deluxe"){
			price=487.00;
			return price;
		}else if(foodName=="Fiery Mexican Pizza"){
			price=154.00;
			return price;
		}else if(foodName=="Classic Italian Pizza"){
			price=486.00;
			return price;
		}else if(foodName=="Ultimate Chicken Feast"){
			price=155.00;
			return price;
		}else if(foodName=="Royal Maharaja Pizza"){
			price=485.00;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}

	public static double search(String foodName,int quantity){
		double price = 0.0;

		if(foodName=="Margherita Classic"){
			price= 512.00*quantity;
			return price;
		}else if(foodName=="Farmhouse Delight"){
			price= 129.00*quantity;
			return price;	
		}else if(foodName=="Pepperoni Feast"){
			price= 511.00*quantity;
			return price;
		}else if(foodName=="Veggie Supreme"){
			price= 130.00*quantity;
			return price;
		}else if(foodName=="Cheese Burst Special"){
			price= 510.00*quantity;
			return price;
		}else if(foodName=="BBQ Chicken Pizza"){
			price= 131.00*quantity;
			return price;
		}else if(foodName=="Paneer Tikka Pizza"){
			price= 509.00*quantity;
			return price;
		}else if(foodName=="Mexican Green Wave"){
			price= 132.00*quantity;
			return price;
		}else if(foodName=="Hawaiian Paradise"){
			price= 508.00*quantity;
			return price;
		}else if(foodName=="Four Cheese Fusion"){
			price= 133.00*quantity;
			return price;
		}else if(foodName=="Spicy Jalapeno Pizza"){
			price= 507.00*quantity;
			return price;
		}else if(foodName=="Mushroom Magic"){
			price= 134.00*quantity;
			return price;
		}else if(foodName=="Corn & Capsicum Pizza"){
			price= 506.00*quantity;
			return price;
		}else if(foodName=="Tandoori Chicken Pizza"){
			price= 135.00*quantity;
			return price;
		}else if(foodName=="Peri Peri Veg Pizza"){
			price= 505.00*quantity;
			return price;
		}else if(foodName=="Garlic Chicken Pizza"){
			price= 136.00*quantity;
			return price;
		}else if(foodName=="Italian Herb Pizza"){
			price= 504.00*quantity;
			return price;
		}else if(foodName=="Spinach & Feta Pizza"){
			price= 137.00*quantity;
			return price;
		}else if(foodName=="Smoked Sausage Pizza"){
			price= 503.00*quantity;
			return price;
		}else if(foodName=="Butter Chicken Pizza"){
			price= 138.00*quantity;
			return price;
		}else if(foodName=="Cheesy Mushroom Blast"){
			price= 502.00*quantity;
			return price;
		}else if(foodName=="Onion Overload Pizza"){
			price= 139.00*quantity;
			return price;
		}else if(foodName=="Sweet Corn Delight"){
			price= 501.00*quantity;
			return price;
		}else if(foodName=="Double Cheese Pizza"){
			price= 140.00*quantity;
			return price;
		}else if(foodName=="Chicken Supreme Pizza"){
			price= 500.00*quantity;
			return price;
		}else if(foodName=="Veg Extravaganza"){
			price= 141.00*quantity;
			return price;
		}else if(foodName=="Chilli Paneer Pizza"){
			price= 499.00*quantity;
			return price;
		}else if(foodName=="Bacon & Cheese Pizza"){
			price= 142.00*quantity;
			return price;
		}else if(foodName=="Mediterranean Veg Pizza"){
			price= 498.00*quantity;
			return price;
		}else if(foodName=="Thai Veg Pizza"){
			price= 143.00*quantity;
			return price;
		}else if(foodName=="Chicken Tikka Supreme"){
			price= 497.00*quantity;
			return price;
		}else if(foodName=="Desi Masala Pizza"){
			price= 144.00*quantity;
			return price;
		}else if(foodName=="Schezwan Chicken Pizza"){
			price= 496.00*quantity;
			return price;
		}else if(foodName=="Pesto Veggie Pizza"){
			price= 145.00*quantity;
			return price;
		}else if(foodName=="Meat Lovers Pizza"){
			price= 495.00*quantity;
			return price;
		}else if(foodName=="Tomato Basil Pizza"){
			price= 146.00*quantity;
			return price;
		}else if(foodName=="Alfredo Chicken Pizza"){
			price= 494.00*quantity;
			return price;
		}else if(foodName=="Nacho Cheese Pizza"){
			price= 147.00*quantity;
			return price;
		}else if(foodName=="Zesty Capsicum Pizza"){
			price= 493.00*quantity;
			return price;
		}else if(foodName=="Smoky BBQ Veg Pizza"){
			price= 148.00*quantity;
			return price;
		}else if(foodName=="Triple Layer Cheese Pizza"){
			price= 492.00*quantity;
			return price;
		}else if(foodName=="Hot & Spicy Chicken Pizza"){
			price= 149.00*quantity;
			return price;
		}else if(foodName=="Tangy Tomato Pizza"){
			price= 491.00*quantity;
			return price;
		}else if(foodName=="Crispy Veg Crunch Pizza"){
			price= 150.00*quantity;
			return price;
		}else if(foodName=="Cottage Cheese Pizza"){
			price= 490.00*quantity;
			return price;
		}else if(foodName=="Exotic Veg Feast"){
			price= 151.00*quantity;
			return price;
		}else if(foodName=="Loaded Meat Pizza"){
			price= 489.00*quantity;
			return price;
		}else if(foodName=="Jalapeno Popper Pizza"){
			price= 152.00*quantity;
			return price;
		}else if(foodName=="Spinach Corn Supreme"){
			price= 488.00*quantity;
			return price;
		}else if(foodName=="Garlic Parmesan Pizza"){
			price= 153.00*quantity;
			return price;
		}else if(foodName=="Cheesy Burst Deluxe"){
			price= 487.00*quantity;
			return price;
		}else if(foodName=="Fiery Mexican Pizza"){
			price= 154.00*quantity;
			return price;
		}else if(foodName=="Classic Italian Pizza"){
			price= 486.00*quantity;
			return price;
		}else if(foodName=="Ultimate Chicken Feast"){
			price= 155.00*quantity;
			return price;
		}else if(foodName=="Royal Maharaja Pizza"){
			price= 485.00*quantity;
			return price;
		}else{
			System.out.println("No match found");
		}
		return price;
	}
}



	