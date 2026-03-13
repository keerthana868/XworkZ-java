class Pocket { 
 String type;
 int capacity;
 boolean zipper;

    Pocket() {
        type = "sample";
        capacity = 1;
        zipper = true;
        System.out.println("type: " + type);
        System.out.println("capacity: " + capacity);
        System.out.println("zipper: " + zipper);
    }

    Pocket(String type, int capacity, boolean zipper) {
        this.type = type;
        this.capacity = capacity;
        this.zipper = zipper;
        System.out.println("type: " + this.type);
        System.out.println("capacity: " + this.capacity);
        System.out.println("zipper: " + this.zipper);
    }

}
