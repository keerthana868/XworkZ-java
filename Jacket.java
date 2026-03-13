class Jacket { 

 String brand;
 String color;
 String size;
 double price;
 boolean waterproof;

    Jacket() {
        brand = "sample";
        color = "sample";
        size = "sample";
        price = 1.0;
        waterproof = true;
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("waterproof: " + waterproof);
    }

    Jacket(String brand, String color, String size, double price, boolean waterproof) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.waterproof = waterproof;
        System.out.println("brand: " + this.brand);
        System.out.println("color: " + this.color);
        System.out.println("size: " + this.size);
        System.out.println("price: " + this.price);
        System.out.println("waterproof: " + this.waterproof);
    }

}
