class AirAsiaExecutor {
    public static void main(String[] args) {
        AirAsia obj = new AirAsia();

        obj.addPassenger("Rahul");
        obj.addPassenger("Ananya");
        obj.addPassenger("Arjun");
        obj.addPassenger("Sneha");
        obj.addPassenger("Vikram");
        obj.addPassenger("Priya");
        obj.addPassenger("Kiran");
        obj.addPassenger("Rohit");
        obj.addPassenger("Pooja");
        obj.addPassenger("Amit");
        obj.addPassenger("Neha");
        obj.addPassenger("Suresh");
        obj.addPassenger("Meena");
        obj.addPassenger("Ajay");
        obj.addPassenger("Divya");
        obj.addPassenger("Varun");
        obj.addPassenger("Kavya");
        obj.addPassenger("Manoj");
        obj.addPassenger("Deepa");
        obj.addPassenger("Nikhil");
        obj.addPassenger("Swathi");
        obj.addPassenger("Harsha");
        obj.addPassenger("Ramesh");
        obj.addPassenger("Lakshmi");
        obj.addPassenger("Tejas");
        obj.addPassenger("Bhavana");
        obj.addPassenger("Karthik");
        obj.addPassenger("Shreya");
        obj.addPassenger("Yash");
        obj.addPassenger("Ishita");

        System.out.println("All Items:");
        obj.getPassengers();

        int index = obj.search("Rahul");
        System.out.println("Index: " + index);

        obj.update("Rahul", "Rahul Updated");
        obj.delete("Ishita");

        System.out.println("Final Data:");
        obj.getPassengers();
    }
}
