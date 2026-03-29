class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeamName(String val) {
        if (val != null && !val.isEmpty()) {
            teamNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getTeamNames() {
        for (String v : teamNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < teamNames.length; i++)
            if (val != null && val.equals(teamNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < teamNames.length; i++) {
                if (teamNames[i] != null && teamNames[i].equals(oldVal)) {
                    teamNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (teamNames[i] != null && teamNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    teamNames[j] = teamNames[j + 1];
                teamNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

