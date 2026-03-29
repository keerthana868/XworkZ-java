class NetflixExecutor {
    public static void main(String[] args) {
        Netflix obj = new Netflix();

        obj.addWebSeries("Stranger Things");
        obj.addWebSeries("Money Heist");
        obj.addWebSeries("The Witcher");
        obj.addWebSeries("Breaking Bad");
        obj.addWebSeries("Dark");
        obj.addWebSeries("Friends");
        obj.addWebSeries("The Crown");
        obj.addWebSeries("Narcos");
        obj.addWebSeries("Ozark");
        obj.addWebSeries("You");
        obj.addWebSeries("Lucifer");
        obj.addWebSeries("Black Mirror");
        obj.addWebSeries("The Office");
        obj.addWebSeries("Peaky Blinders");
        obj.addWebSeries("Vikings");
        obj.addWebSeries("Elite");
        obj.addWebSeries("Sex Education");
        obj.addWebSeries("Wednesday");

        System.out.println("All Items:");
        obj.getWebSeries();

        int index = obj.search("Stranger Things");
        System.out.println("Index: " + index);

        obj.update("Stranger Things", "Stranger Things Updated");
        obj.delete("Wednesday");

        System.out.println("Final Data:");
        obj.getWebSeries();
    }
}

		