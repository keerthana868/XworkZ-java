class Coffee { 

    String type;
	double price;

    Coffee() {
        type = "sample";
        price = 1.0;
        System.out.println("type: " + type);
        System.out.println("price: " + price);
    }

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
        System.out.println("type: " + this.type);
        System.out.println("price: " + this.price);
    }

}
