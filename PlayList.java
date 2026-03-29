class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSongName(String val) {
        if (val != null && !val.isEmpty()) {
            songNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getSongNames() {
        for (String v : songNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < songNames.length; i++)
            if (val != null && val.equals(songNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < songNames.length; i++) {
                if (songNames[i] != null && songNames[i].equals(oldVal)) {
                    songNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (songNames[i] != null && songNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    songNames[j] = songNames[j + 1];
                songNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}
