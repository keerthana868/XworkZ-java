class FreeBusTravel {
    int travelId;
    Aadhar aadhar;

    FreeBusTravel() {}

    FreeBusTravel(int travelId, Aadhar aadhar) {
        System.out.println("Constructor is started");
        this.travelId = travelId;
        this.aadhar = aadhar;
        System.out.println("Constructor is ended");
    }

    public boolean addAadhar(Aadhar aadhar) {
        boolean isAadharSaved = false;
        System.out.println("Add Aadhar Method started:");
        this.aadhar = aadhar;
        isAadharSaved = true;
        System.out.println("Add Aadhar Method ended:");
        return isAadharSaved;
    }

    public void getAadhar() {
        System.out.println("Aadhar info:");
        System.out.println("Name: " + aadhar.name);
        System.out.println("Aadhar Number: " + aadhar.aadharNumber);
        System.out.println("Age: " + aadhar.age);
        System.out.println("Address: " + aadhar.address);
        System.out.println("Gender: " + aadhar.gender);
        System.out.println("Mobile Number: " + aadhar.mobileNumber);
    }
}