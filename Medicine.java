class Medicine {
    int id;
    String name;
    double price;
    int dosage;
    String salt;
    double phValue;
    String manufacturer;
    int expiryMonths;
    double potency;
    int batchCode;
    String sideEffect;
    boolean prescription;

    Medicine(int id) {
        this.id = id;
        System.out.println("Med Id: " + id);
    }

    Medicine(String name) {
        this.name = name;
        System.out.println("Med: " + name);
    }

    Medicine(double price) {
        this.price = price;
        System.out.println("Cost: " + price);
    }

    Medicine(int dosage, String salt) {
        this.dosage = dosage;
        this.salt = salt;
        System.out.println("Dose: " + dosage);
        System.out.println("Salt: " + salt);
    }

    Medicine(double phValue, String manufacturer, int expiryMonths) {
        this.phValue = phValue;
        this.manufacturer = manufacturer;
        this.expiryMonths = expiryMonths;
        System.out.println("pH: " + phValue);
        System.out.println("Made by: " + manufacturer);
        System.out.println("Life: " + expiryMonths);
    }

    Medicine(double potency, int batchCode) {
        this.potency = potency;
        this.batchCode = batchCode;
        System.out.println("Potency: " + potency);
        System.out.println("Batch: " + batchCode);
    }

    Medicine(String sideEffect, boolean prescription) {
        this.sideEffect = sideEffect;
        this.prescription = prescription;
        System.out.println("Effect: " + sideEffect);
        System.out.println("Rx: " + prescription);
    }
}