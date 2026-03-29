class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String val) {
        if (val != null && !val.isEmpty()) {
            passengers[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getPassengers() {
        for (String v : passengers)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < passengers.length; i++)
            if (val != null && val.equals(passengers[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < passengers.length; i++) {
                if (passengers[i] != null && passengers[i].equals(oldVal)) {
                    passengers[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (passengers[i] != null && passengers[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    passengers[j] = passengers[j + 1];
                passengers[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

