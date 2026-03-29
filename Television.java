class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannelName(String val) {
        if (val != null && !val.isEmpty()) {
            channelNames[index++] = val;
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public void getChannelNames() {
        for (String v : channelNames)
            if (v != null) System.out.println(v);
    }

    public int search(String val) {
        for (int i = 0; i < channelNames.length; i++)
            if (val != null && val.equals(channelNames[i])) return i;
        return -1;
    }

    public boolean update(String oldVal, String newVal) {
        boolean updated = false;
        if (newVal != null) {
            for (int i = 0; i < channelNames.length; i++) {
                if (channelNames[i] != null && channelNames[i].equals(oldVal)) {
                    channelNames[i] = newVal;
                    updated = true;
                }
            }
        }
        if (!updated) System.out.println("Not found");
        return updated;
    }

    public boolean delete(String val) {
        for (int i = 0; i < index; i++) {
            if (channelNames[i] != null && channelNames[i].equals(val)) {
                for (int j = i; j < index - 1; j++)
                    channelNames[j] = channelNames[j + 1];
                channelNames[--index] = null;
                return true;
            }
        }
        System.out.println("Not found");
        return false;
    }
}

