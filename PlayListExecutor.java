class PlayListExecutor {
    public static void main(String[] args) {
        PlayList obj = new PlayList();

        obj.addSongName("Shape of You");
        obj.addSongName("Blinding Lights");
        obj.addSongName("Perfect");
        obj.addSongName("Levitating");
        obj.addSongName("Peaches");
        obj.addSongName("Stay");
        obj.addSongName("Senorita");
        obj.addSongName("Closer");
        obj.addSongName("Believer");
        obj.addSongName("Faded");
        obj.addSongName("Happier");
        obj.addSongName("Counting Stars");
        obj.addSongName("On My Way");
        obj.addSongName("Let Me Love You");
        obj.addSongName("Cheap Thrills");

        System.out.println("All Items:");
        obj.getSongNames();

        int index = obj.search("Shape of You");
        System.out.println("Index: " + index);

        obj.update("Shape of You", "Shape of You Updated");
        obj.delete("Cheap Thrills");

        System.out.println("Final Data:");
        obj.getSongNames();
    }
}

