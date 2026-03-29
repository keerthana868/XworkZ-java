class PastaExecutor {
    public static void main(String[] args) {

        Pasta p = new Pasta();

        p.add("Spaghetti");
        p.add("Penne");
        p.add("Fusilli");
        p.add("Macaroni");
        p.add("Lasagna");
        p.add("Ravioli");
        p.add("Fettuccine");
        p.add("Tortellini");
        p.add("Linguine");
        p.add("Rigatoni");

        System.out.println("All Pasta Items:");
        p.getAll();

        String searchItem = "Lasagna";
        int index = p.search(searchItem);
        System.out.println("Index of " + searchItem + " is: " + index);

        System.out.println("Updating item...");
        boolean isUpdated = p.update("Lasagna", "Cheese Lasagna");
        System.out.println("Is updated: " + isUpdated);

        System.out.println("After Update:");
        p.getAll();

        System.out.println("Deleting item...");
        boolean isDeleted = p.delete("Rigatoni");
        System.out.println("Is deleted: " + isDeleted);

        System.out.println("After Deletion:");
        p.getAll();
    }
}