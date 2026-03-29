class UniverseExecutor {
    public static void main(String[] args) {
        Universe obj = new Universe();

        obj.addGalaxy("Milky Way");
        obj.addGalaxy("Andromeda");
        obj.addGalaxy("Triangulum");
        obj.addGalaxy("Whirlpool");
        obj.addGalaxy("Sombrero");
        obj.addGalaxy("Pinwheel");
        obj.addGalaxy("Cartwheel");
        obj.addGalaxy("Black Eye");
        obj.addGalaxy("Cigar");
        obj.addGalaxy("Sunflower");
        obj.addGalaxy("Tadpole");
        obj.addGalaxy("Hoag's Object");
        obj.addGalaxy("Large Magellanic Cloud");
        obj.addGalaxy("Small Magellanic Cloud");
        obj.addGalaxy("Centaurus A");
        obj.addGalaxy("Messier 81");
        obj.addGalaxy("Messier 82");

        System.out.println("All Items:");
        obj.getGalaxies();

        int index = obj.search("Milky Way");
        System.out.println("Index: " + index);

        obj.update("Milky Way", "Milky Way Updated");
        obj.delete("Messier 82");

        System.out.println("Final Data:");
        obj.getGalaxies();
    }
}

