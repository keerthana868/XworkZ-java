class FoodStreet {
    int foodStreetId;
    Stall stall;

    FoodStreet() {}

    FoodStreet(int foodStreetId, Stall stall) {
        System.out.println("Constructor is started");
        this.foodStreetId = foodStreetId;
        this.stall = stall;
        System.out.println("Constructor is ended");
    }

    public boolean addStall(Stall stall) {
        boolean isStallSaved = false;
        System.out.println("Add Stall Method started:");
        this.stall = stall;
        isStallSaved = true;
        System.out.println("Add Stall Method ended:");
        return isStallSaved;
    }

    public void getStall() {
        System.out.println("Stall info:");
        System.out.println("Stall Name: " + stall.stallName);
        System.out.println("Food Type: " + stall.foodType);
        System.out.println("Owner Name: " + stall.ownerName);
        System.out.println("Rating: " + stall.rating);
        System.out.println("Opening Time: " + stall.openingTime);
        System.out.println("Average Price: " + stall.averagePrice);
    }
}