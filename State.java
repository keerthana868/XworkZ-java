class State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighwayName(String val) {
        if (val != null && !val.isEmpty()) {
            highwayNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getHighwayNames() {
        for (String v : highwayNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < highwayNames.length; i++)
            if (val != null && val.equals(highwayNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < highwayNames.length; i++) {
                if (highwayNames[i] != null && highwayNames[i].equals(oldVal)) {
                    highwayNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (highwayNames[i] != null && highwayNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    highwayNames[j] = highwayNames[j + 1];
                highwayNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

