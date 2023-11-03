package PlayList48;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList(new ArrayList<>());
    }

    public boolean addSong(String title, double duration) {
        Song song = songs.findSong(title);
        if (song != null) {
            return false;
        }
        song = new Song(title, duration);
        return songs.add(song);
    }

    public boolean addToPlayList(int number, LinkedList playList) {
        if (songs.songs.size() >= number && number > 0) {
            return playList.add(songs.songs.get(number - 1));
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList playList) {
        Song song = songs.findSong(title);
        if ((song) != null) {
            return playList.add(song);
        }
        return false;
    }

    public static class SongList {
        private final ArrayList<Song> songs;

        public SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        private boolean add(Song song) {
            Song currSong = findSong(song.getTitle());
            if (currSong != null) {
                return false;
            }
            return songs.add(song);
        }

        private Song findSong(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
    }

    public static void main(String... args) {
        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList playList = new LinkedList();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);
    }
}