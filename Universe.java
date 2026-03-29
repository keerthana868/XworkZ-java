class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String val) {
        if (val != null && !val.isEmpty()) {
            galaxies[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getGalaxies() {
        for (String v : galaxies)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < galaxies.length; i++)
            if (val != null && val.equals(galaxies[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < galaxies.length; i++) {
                if (galaxies[i] != null && galaxies[i].equals(oldVal)) {
                    galaxies[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (galaxies[i] != null && galaxies[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    galaxies[j] = galaxies[j + 1];
                galaxies[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
