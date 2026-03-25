class ArchitectExecutor{
    public static void main(String[] args){
        Architect obj = new Architect();

        boolean v1 = obj.addInteriorDesign("Minimalist");
        boolean v2 = obj.addInteriorDesign("Modern");
        boolean v3 = obj.addInteriorDesign("Contemporary");
        boolean v4 = obj.addInteriorDesign("Industrial");
        boolean v5 = obj.addInteriorDesign("Scandinavian");
        boolean v6 = obj.addInteriorDesign("Bohemian");
        boolean v7 = obj.addInteriorDesign("Traditional");
        boolean v8 = obj.addInteriorDesign("Rustic");
        boolean v9 = obj.addInteriorDesign("Art Deco");
        boolean v10 = obj.addInteriorDesign("Mid-Century");
        boolean v11 = obj.addInteriorDesign("Transitional");
        obj.getInteriorDesignNames();
    }
}
