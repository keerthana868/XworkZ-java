class SingerExecutor {
    public static void main(String[] args) {
        Singer obj = new Singer();

        obj.add("Arijit"); obj.add("Sonu"); obj.add("Shreya"); obj.add("Lata");
        obj.add("Kishore"); obj.add("Neha"); obj.add("Udit"); obj.add("Atif");
        obj.add("KK"); obj.add("Sunidhi");

        obj.getAll();
        obj.update("KK", "Krishnakumar");
        obj.delete("Neha");
        obj.getAll();
    }
}