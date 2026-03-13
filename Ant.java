class Ant { 
   
   String color;
   int legs;
   boolean queen;

    Ant() {
        color = "sample";
        legs = 1;
        queen = true;
        System.out.println("color: " + color);
        System.out.println("legs: " + legs);
        System.out.println("queen: " + queen);
    }

    Ant(String color, int legs, boolean queen) {
        this.color = color;
        this.legs = legs;
        this.queen = queen;
        System.out.println("color: " + this.color);
        System.out.println("legs: " + this.legs);
        System.out.println("queen: " + this.queen);
    }

}
