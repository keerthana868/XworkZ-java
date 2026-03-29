class MuseumExecutor {
    public static void main(String[] args) {
        Museum obj = new Museum();

        obj.addMonument("Taj Mahal");
        obj.addMonument("Qutub Minar");
        obj.addMonument("Red Fort");
        obj.addMonument("Hampi");
        obj.addMonument("Ajanta Caves");
        obj.addMonument("Ellora Caves");
        obj.addMonument("Charminar");
        obj.addMonument("Gateway of India");
        obj.addMonument("Konark Sun Temple");
        obj.addMonument("Meenakshi Temple");
        obj.addMonument("India Gate");
        obj.addMonument("Lotus Temple");
        obj.addMonument("Sanchi Stupa");
        obj.addMonument("Mysore Palace");
        obj.addMonument("Gol Gumbaz");
        obj.addMonument("Victoria Memorial");

        System.out.println("All Items:");
        obj.getHistoricalMonuments();

        int index = obj.search("Taj Mahal");
        System.out.println("Index: " + index);

        obj.update("Taj Mahal", "Taj Mahal Updated");
        obj.delete("Victoria Memorial");

        System.out.println("Final Data:");
        obj.getHistoricalMonuments();
    }
}

