class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String val) {
        if (val != null && !val.isEmpty()) {
            equipments[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getEquipments() {
        for (String v : equipments)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < equipments.length; i++)
            if (val != null && val.equals(equipments[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < equipments.length; i++) {
                if (equipments[i] != null && equipments[i].equals(oldVal)) {
                    equipments[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (equipments[i] != null && equipments[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    equipments[j] = equipments[j + 1];
                equipments[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}



