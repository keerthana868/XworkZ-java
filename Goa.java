class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeachName(String val) {
        if (val != null && !val.isEmpty()) {
            beachNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getBeachNames() {
        for (String v : beachNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < beachNames.length; i++)
            if (val != null && val.equals(beachNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < beachNames.length; i++) {
                if (beachNames[i] != null && beachNames[i].equals(oldVal)) {
                    beachNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (beachNames[i] != null && beachNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    beachNames[j] = beachNames[j + 1];
                beachNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

