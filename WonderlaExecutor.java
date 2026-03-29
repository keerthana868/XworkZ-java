class WonderlaExecutor {
    public static void main(String[] args) {
        Wonderla obj = new Wonderla();

        obj.addWaterGame("Wave Pool");
        obj.addWaterGame("Lazy River");
        obj.addWaterGame("Rain Disco");
        obj.addWaterGame("Boomerang");
        obj.addWaterGame("Harakiri");
        obj.addWaterGame("Fun Racers");
        obj.addWaterGame("Twister");
        obj.addWaterGame("Y-Scream");
        obj.addWaterGame("Drop Loop");
        obj.addWaterGame("Water Pendulum");
        obj.addWaterGame("Kiddies Pool");
        obj.addWaterGame("Aqua Dance");
        obj.addWaterGame("Cyclone");
        obj.addWaterGame("Aqua Funnel");
        obj.addWaterGame("Splash Pad");
        obj.addWaterGame("Family Slide");
        obj.addWaterGame("Mat Racer");
        obj.addWaterGame("Multi Play");
        obj.addWaterGame("Rapid River");
        obj.addWaterGame("Water Coaster");

        System.out.println("All Items:");
        obj.getWaterGames();

        int index = obj.search("Wave Pool");
        System.out.println("Index: " + index);

        obj.update("Wave Pool", "Wave Pool Updated");
        obj.delete("Water Coaster");

        System.out.println("Final Data:");
        obj.getWaterGames();
    }
}




