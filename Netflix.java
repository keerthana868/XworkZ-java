class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String val) {
        if (val != null && !val.isEmpty()) {
            webSeries[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getWebSeries() {
        for (String v : webSeries)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < webSeries.length; i++)
            if (val != null && val.equals(webSeries[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < webSeries.length; i++) {
                if (webSeries[i] != null && webSeries[i].equals(oldVal)) {
                    webSeries[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (webSeries[i] != null && webSeries[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    webSeries[j] = webSeries[j + 1];
                webSeries[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
