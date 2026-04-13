class IceCreamExecutorConst {
    public static void main(String[] args) {

        Flavour flavour = new Flavour();
        flavour.name = "Chocolate";
        flavour.type = "Dessert";
        flavour.price = 120.0;
        flavour.calories = 250;
        flavour.availability = "Available";
        flavour.rating = 4.7;

        IceCream iceCream = new IceCream(1401, flavour);

        iceCream.getFlavour();
    }
}