class GardenExecutorRef {
    public static void main(String[] args) {

        Flower flower = new Flower();
        flower.name = "Rose";
        flower.color = "Red";
        flower.fragrance = "Strong";
        flower.petalCount = 32;
        flower.price = 10.5;
        flower.season = "Winter";

        Garden garden = new Garden();
        garden.flower = flower;

        garden.getFlower();
    }
}