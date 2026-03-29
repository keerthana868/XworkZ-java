class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlace(String val) {
        if (val != null && !val.isEmpty()) {
            places[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getPlaces() {
        for (String v : places)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < places.length; i++)
            if (val != null && val.equals(places[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < places.length; i++) {
                if (places[i] != null && places[i].equals(oldVal)) {
                    places[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (places[i] != null && places[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    places[j] = places[j + 1];
                places[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

