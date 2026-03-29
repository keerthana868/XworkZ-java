class PetShopExecutor {
    public static void main(String[] args) {
        PetShop obj = new PetShop();

        obj.addAccessory("Dog Food");
        obj.addAccessory("Cat Food");
        obj.addAccessory("Leash");
        obj.addAccessory("Collar");
        obj.addAccessory("Pet Bed");
        obj.addAccessory("Food Bowl");
        obj.addAccessory("Water Bowl");
        obj.addAccessory("Pet Shampoo");
        obj.addAccessory("Chew Toy");
        obj.addAccessory("Scratching Post");
        obj.addAccessory("Fish Tank");
        obj.addAccessory("Bird Cage");
        obj.addAccessory("Pet Carrier");
        obj.addAccessory("Litter Box");
        obj.addAccessory("Pet Brush");
        obj.addAccessory("Flea Collar");
        obj.addAccessory("Pet Blanket");
        obj.addAccessory("Training Pads");
        obj.addAccessory("Aquarium Filter");
        obj.addAccessory("Pet House");

        System.out.println("All Items:");
        obj.getPetAccessories();

        int index = obj.search("Dog Food");
        System.out.println("Index: " + index);

        obj.update("Dog Food", "Dog Food Updated");
        obj.delete("Pet House");

        System.out.println("Final Data:");
        obj.getPetAccessories();
    }
}

