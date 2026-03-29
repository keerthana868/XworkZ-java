class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProductName(String val) {
        if (val != null && !val.isEmpty()) {
            productNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getProductNames() {
        for (String v : productNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < productNames.length; i++)
            if (val != null && val.equals(productNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < productNames.length; i++) {
                if (productNames[i] != null && productNames[i].equals(oldVal)) {
                    productNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (productNames[i] != null && productNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    productNames[j] = productNames[j + 1];
                productNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
