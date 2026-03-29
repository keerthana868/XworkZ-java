class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriorDesign(String val) {
        if (val != null && !val.isEmpty()) {
            interiorDesignNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getInteriorDesignNames() {
        for (String v : interiorDesignNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < interiorDesignNames.length; i++)
            if (val != null && val.equals(interiorDesignNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < interiorDesignNames.length; i++) {
                if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(oldVal)) {
                    interiorDesignNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (interiorDesignNames[i] != null && interiorDesignNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    interiorDesignNames[j] = interiorDesignNames[j + 1];
                interiorDesignNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

