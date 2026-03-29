class Wonderla {
    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String val) {
        if (val != null && !val.isEmpty()) {
            waterGames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getWaterGames() {
        for (String v : waterGames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < waterGames.length; i++)
            if (val != null && val.equals(waterGames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < waterGames.length; i++) {
                if (waterGames[i] != null && waterGames[i].equals(oldVal)) {
                    waterGames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (waterGames[i] != null && waterGames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    waterGames[j] = waterGames[j + 1];
                waterGames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
