class FoodStreetExecutorConst {
    public static void main(String[] args) {

        Stall stall = new Stall();
        stall.stallName = "Spicy Bites";
        stall.foodType = "Street Food";
        stall.ownerName = "Ravi";
        stall.rating = 4.5;
        stall.openingTime = "5 PM";
        stall.averagePrice = 150.0;

        FoodStreet foodStreet = new FoodStreet(301, stall);

        foodStreet.getStall();
    }
}