class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String val) {
        if (val != null && !val.isEmpty()) {
            historicalMonuments[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getHistoricalMonuments() {
        for (String v : historicalMonuments)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < historicalMonuments.length; i++)
            if (val != null && val.equals(historicalMonuments[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < historicalMonuments.length; i++) {
                if (historicalMonuments[i] != null && historicalMonuments[i].equals(oldVal)) {
                    historicalMonuments[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (historicalMonuments[i] != null && historicalMonuments[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    historicalMonuments[j] = historicalMonuments[j + 1];
                historicalMonuments[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

