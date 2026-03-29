class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String val) {
        if (val != null && !val.isEmpty()) {
            petAccessories[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getPetAccessories() {
        for (String v : petAccessories)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < petAccessories.length; i++)
            if (val != null && val.equals(petAccessories[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < petAccessories.length; i++) {
                if (petAccessories[i] != null && petAccessories[i].equals(oldVal)) {
                    petAccessories[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (petAccessories[i] != null && petAccessories[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    petAccessories[j] = petAccessories[j + 1];
                petAccessories[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
