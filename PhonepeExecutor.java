class PhonepeExecutor {
    public static void main(String[] args) {
        Phonepe obj = new Phonepe();

        obj.addInsuranceName("Health Insurance");
        obj.addInsuranceName("Life Insurance");
        obj.addInsuranceName("Vehicle Insurance");
        obj.addInsuranceName("Travel Insurance");
        obj.addInsuranceName("Home Insurance");
        obj.addInsuranceName("Accident Insurance");
        obj.addInsuranceName("Term Plan");
        obj.addInsuranceName("ULIP Plan");
        obj.addInsuranceName("Child Plan");
        obj.addInsuranceName("Pension Plan");
        obj.addInsuranceName("Fire Insurance");
        obj.addInsuranceName("Marine Insurance");
        obj.addInsuranceName("Crop Insurance");
        obj.addInsuranceName("Bike Insurance");
        obj.addInsuranceName("Car Insurance");
        obj.addInsuranceName("Family Floater");
        obj.addInsuranceName("Senior Citizen Plan");
        obj.addInsuranceName("Dental Insurance");
        obj.addInsuranceName("Vision Insurance");
        obj.addInsuranceName("Critical Illness");
        obj.addInsuranceName("Personal Loan Cover");
        obj.addInsuranceName("Mobile Insurance");
        obj.addInsuranceName("Laptop Insurance");
        obj.addInsuranceName("Shop Insurance");
        obj.addInsuranceName("Business Insurance");
        obj.addInsuranceName("Pet Insurance");
        obj.addInsuranceName("Wedding Insurance");

        System.out.println("All Items:");
        obj.getInsuranceNames();

        int index = obj.search("Health Insurance");
        System.out.println("Index: " + index);

        obj.update("Health Insurance", "Health Insurance Updated");
        obj.delete("Wedding Insurance");

        System.out.println("Final Data:");
        obj.getInsuranceNames();
    }
}

		