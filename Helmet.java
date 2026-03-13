class Helmet { 
    String brand;
	String color;
	double weight;

    Helmet() {
        brand = "sample";
        color = "sample";
        weight = 1.0;
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("weight: " + weight);
    }

    Helmet(String brand, String color, double weight) {
        this.brand = brand;
        this.color = color;
        this.weight = weight;
        System.out.println("brand: " + this.brand);
        System.out.println("color: " + this.color);
        System.out.println("weight: " + this.weight);
    }

}
