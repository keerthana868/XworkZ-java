class GoaExecutor {
    public static void main(String[] args) {
        Goa obj = new Goa();

        obj.addBeachName("Baga");
        obj.addBeachName("Calangute");
        obj.addBeachName("Anjuna");
        obj.addBeachName("Vagator");
        obj.addBeachName("Colva");
        obj.addBeachName("Palolem");
        obj.addBeachName("Candolim");
        obj.addBeachName("Morjim");
        obj.addBeachName("Arambol");
        obj.addBeachName("Agonda");
        obj.addBeachName("Miramar");
        obj.addBeachName("Sinquerim");
        obj.addBeachName("Mandrem");
        obj.addBeachName("Butterfly");
        obj.addBeachName("Ashwem");
        obj.addBeachName("Cavelossim");
        obj.addBeachName("Betalbatim");
        obj.addBeachName("Majorda");
        obj.addBeachName("Dona Paula");

        System.out.println("All Items:");
        obj.getBeachNames();

        int index = obj.search("Baga");
        System.out.println("Index: " + index);

        obj.update("Baga", "Baga Updated");
        obj.delete("Dona Paula");

        System.out.println("Final Data:");
        obj.getBeachNames();
    }
}

