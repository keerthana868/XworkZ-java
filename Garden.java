class Garden {
    int gardenId;
    Flower flower;

    Garden() {}

    Garden(int gardenId, Flower flower) {
        System.out.println("Constructor is started");
        this.gardenId = gardenId;
        this.flower = flower;
        System.out.println("Constructor is ended");
    }

    public boolean addFlower(Flower flower) {
        boolean isFlowerSaved = false;
        System.out.println("Add Flower Method started:");
        this.flower = flower;
        isFlowerSaved = true;
        System.out.println("Add Flower Method ended:");
        return isFlowerSaved;
    }

    public void getFlower() {
        System.out.println("Flower info:");
        System.out.println("Name: " + flower.name);
        System.out.println("Color: " + flower.color);
        System.out.println("Fragrance: " + flower.fragrance);
        System.out.println("Petal Count: " + flower.petalCount);
        System.out.println("Price: " + flower.price);
        System.out.println("Season: " + flower.season);
    }
}