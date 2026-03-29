class ArchitectExecutor {
    public static void main(String[] args) {
        Architect obj = new Architect();

        obj.addInteriorDesign("Minimalist");
        obj.addInteriorDesign("Modern");
        obj.addInteriorDesign("Contemporary");
        obj.addInteriorDesign("Industrial");
        obj.addInteriorDesign("Scandinavian");
        obj.addInteriorDesign("Bohemian");
        obj.addInteriorDesign("Traditional");
        obj.addInteriorDesign("Rustic");
        obj.addInteriorDesign("Art Deco");
        obj.addInteriorDesign("Mid-Century");
        obj.addInteriorDesign("Transitional");

        System.out.println("All Items:");
        obj.getInteriorDesignNames();

        int index = obj.search("Minimalist");
        System.out.println("Index: " + index);

        obj.update("Minimalist", "Minimalist Updated");
        obj.delete("Transitional");

        System.out.println("Final Data:");
        obj.getInteriorDesignNames();
    }
}
