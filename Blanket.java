class Blanket { 
String material;
 String color;
 double length;
 double width;
double price;
 boolean soft;

    Blanket() {
        material = "sample";
        color = "sample";
        length = 1.0;
        width = 1.0;
        price = 1.0;
        soft = true;
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("price: " + price);
        System.out.println("soft: " + soft);
    }

    Blanket(String material, String color, double length, double width, double price, boolean soft) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.price = price;
        this.soft = soft;
        System.out.println("material: " + this.material);
        System.out.println("color: " + this.color);
        System.out.println("length: " + this.length);
        System.out.println("width: " + this.width);
        System.out.println("price: " + this.price);
        System.out.println("soft: " + this.soft);
    }

}
