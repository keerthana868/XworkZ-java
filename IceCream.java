class IceCream {
    int iceCreamId;
    Flavour flavour;

    IceCream() {}

    IceCream(int iceCreamId, Flavour flavour) {
        System.out.println("Constructor is started");
        this.iceCreamId = iceCreamId;
        this.flavour = flavour;
        System.out.println("Constructor is ended");
    }

    public boolean addFlavour(Flavour flavour) {
        boolean isFlavourSaved = false;
        System.out.println("Add Flavour Method started:");
        this.flavour = flavour;
        isFlavourSaved = true;
        System.out.println("Add Flavour Method ended:");
        return isFlavourSaved;
    }

    public void getFlavour() {
        System.out.println("Flavour info:");
        System.out.println("Name: " + flavour.name);
        System.out.println("Type: " + flavour.type);
        System.out.println("Price: " + flavour.price);
        System.out.println("Calories: " + flavour.calories);
        System.out.println("Availability: " + flavour.availability);
        System.out.println("Rating: " + flavour.rating);
    }
}