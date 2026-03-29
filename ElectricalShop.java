class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String val) {
        if (val != null && !val.isEmpty()) {
            appliances[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getAppliances() {
        for (String v : appliances)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < appliances.length; i++)
            if (val != null && val.equals(appliances[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < appliances.length; i++) {
                if (appliances[i] != null && appliances[i].equals(oldVal)) {
                    appliances[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (appliances[i] != null && appliances[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    appliances[j] = appliances[j + 1];
                appliances[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

