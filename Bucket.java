class Bucket { 
   String material;
   int capacity;
   String color;
   double price;
   boolean hasHandle;

    Bucket() {
        material = "sample";
        capacity = 1;
        color = "sample";
        price = 1.0;
        hasHandle = true;
        System.out.println("material: " + material);
        System.out.println("capacity: " + capacity);
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("hasHandle: " + hasHandle);
    }

    Bucket(String material, int capacity, String color, double price, boolean hasHandle) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
        this.hasHandle = hasHandle;
        System.out.println("material: " + this.material);
        System.out.println("capacity: " + this.capacity);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println("hasHandle: " + this.hasHandle);
    }

}
