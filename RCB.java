class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayerName(String val) {
        if (val != null && !val.isEmpty()) {
            playerNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getPlayerNames() {
        for (String v : playerNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < playerNames.length; i++)
            if (val != null && val.equals(playerNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < playerNames.length; i++) {
                if (playerNames[i] != null && playerNames[i].equals(oldVal)) {
                    playerNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (playerNames[i] != null && playerNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    playerNames[j] = playerNames[j + 1];
                playerNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
