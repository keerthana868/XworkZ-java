class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExamName(String val) {
        if (val != null && !val.isEmpty()) {
            competitiveExamNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getCompetitiveExamNames() {
        for (String v : competitiveExamNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < competitiveExamNames.length; i++)
            if (val != null && val.equals(competitiveExamNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < competitiveExamNames.length; i++) {
                if (competitiveExamNames[i] != null && competitiveExamNames[i].equals(oldVal)) {
                    competitiveExamNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (competitiveExamNames[i] != null && competitiveExamNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    competitiveExamNames[j] = competitiveExamNames[j + 1];
                competitiveExamNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
