class RCBExecutor {
    public static void main(String[] args) {
        RCB obj = new RCB();

        obj.addPlayerName("Virat Kohli");
        obj.addPlayerName("Faf du Plessis");
        obj.addPlayerName("Glenn Maxwell");
        obj.addPlayerName("Rajat Patidar");
        obj.addPlayerName("Dinesh Karthik");
        obj.addPlayerName("Mohammed Siraj");
        obj.addPlayerName("Reece Topley");
        obj.addPlayerName("Mahipal Lomror");
        obj.addPlayerName("Shahbaz Ahmed");
        obj.addPlayerName("Anuj Rawat");
        obj.addPlayerName("Karn Sharma");
        obj.addPlayerName("Akash Deep");
        obj.addPlayerName("Wayne Parnell");
        obj.addPlayerName("Josh Hazlewood");
        obj.addPlayerName("Finn Allen");

        System.out.println("All Items:");
        obj.getPlayerNames();

        int index = obj.search("Virat Kohli");
        System.out.println("Index: " + index);

        obj.update("Virat Kohli", "Virat Kohli Updated");
        obj.delete("Finn Allen");

        System.out.println("Final Data:");
        obj.getPlayerNames();
    }
}
