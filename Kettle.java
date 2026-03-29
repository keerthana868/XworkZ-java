class Kettle {
    private String items[] = new String[15];
    int index;

    public boolean add(String val) {
        if (val != null && !val.isEmpty()) {
            items[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getAll() {
        for (String v : items)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < items.length; i++)
            if (val != null && val.equals(items[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].equals(oldVal)) {
                    items[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (items[i] != null && items[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    items[j] = items[j + 1];
                items[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
