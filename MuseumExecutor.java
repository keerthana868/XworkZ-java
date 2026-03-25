class MuseumExecutor{
    public static void main(String[] args){
        Museum obj = new Museum();

        boolean v1 = obj.addMonument("Taj Mahal");
        boolean v2 = obj.addMonument("Qutub Minar");
        boolean v3 = obj.addMonument("Red Fort");
        boolean v4 = obj.addMonument("Hampi");
        boolean v5 = obj.addMonument("Ajanta Caves");
        boolean v6 = obj.addMonument("Ellora Caves");
        boolean v7 = obj.addMonument("Charminar");
        boolean v8 = obj.addMonument("Gateway of India");
        boolean v9 = obj.addMonument("Konark Sun Temple");
        boolean v10 = obj.addMonument("Meenakshi Temple");
        boolean v11 = obj.addMonument("India Gate");
        boolean v12 = obj.addMonument("Lotus Temple");
        boolean v13 = obj.addMonument("Sanchi Stupa");
        boolean v14 = obj.addMonument("Mysore Palace");
        boolean v15 = obj.addMonument("Gol Gumbaz");
        boolean v16 = obj.addMonument("Victoria Memorial");
        obj.getHistoricalMonuments();
    }
}
