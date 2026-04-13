class FreeBusTravelExecutorConst {
    public static void main(String[] args) {

        Aadhar aadhar = new Aadhar();
        aadhar.name = "Sita";
        aadhar.aadharNumber = "1234-5678-9012";
        aadhar.age = 28;
        aadhar.address = "Bangalore";
        aadhar.gender = "Female";
        aadhar.mobileNumber = 9876543210L;

        FreeBusTravel travel = new FreeBusTravel(1101, aadhar);

        travel.getAadhar();
    }
}