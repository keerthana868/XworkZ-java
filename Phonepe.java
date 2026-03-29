class Phonepe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsuranceName(String val) {
        if (val != null && !val.isEmpty()) {
            insuranceNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getInsuranceNames() {
        for (String v : insuranceNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < insuranceNames.length; i++)
            if (val != null && val.equals(insuranceNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < insuranceNames.length; i++) {
                if (insuranceNames[i] != null && insuranceNames[i].equals(oldVal)) {
                    insuranceNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (insuranceNames[i] != null && insuranceNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    insuranceNames[j] = insuranceNames[j + 1];
                insuranceNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
