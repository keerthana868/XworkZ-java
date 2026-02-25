class Hospital {
    public static void bookAppointment(String patientName, String symptom) {
        System.out.println("Appointment is taken for " + patientName);
        System.out.println("Symptom registered: " + symptom);
        
        Nurse.basicCheck(patientName, symptom, 130, false);
    }
}