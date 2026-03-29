class TreeExecutor {
    public static void main(String[] args) {
        Tree obj = new Tree();

        obj.add("Neem"); obj.add("Mango"); obj.add("Banyan"); obj.add("Peepal");
        obj.add("Coconut"); obj.add("Palm"); obj.add("Oak"); obj.add("Pine");
        obj.add("Teak"); obj.add("Eucalyptus");

        obj.getAll();
        obj.update("Neem", "Medicinal Neem");
        obj.delete("Palm");
        obj.getAll();
    }
}