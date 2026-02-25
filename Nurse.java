class Nurse {
    public static void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse is checking patient: " + patientName);
        System.out.println("BP: " + bp);
        System.out.println("Sugar present: " + sugar);
        
        Doctor.treat(patientName, symptom);
    }
}