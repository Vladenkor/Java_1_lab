package org.example;

import java.util.Objects;

public class Song {
    private String name;
    private String album;
    private GENRES genre;

    public static class Builder {
        private Song song;

        public Builder() {
            song = new Song();
        }

        public Builder setName(String name) {
            song.name = name;
            return this;
        }

        public Builder setAlbum(String album) {
            song.album = album;
            return this;
        }

        public Builder setGenre(GENRES genre) {
            song.genre = genre;
            return this;
        }

        public Song build() {
            return song;
        }
    }

    /**
     * Overriding toString method
     *
     * @return information on the object
     */
    @Override
    public String toString() {
        return "\nSONG: " + "\"" + name + "\" Album: " + album + "Genre: " + genre;
    }

    /**
     * This is the method which tells you whether object are equal or not.
     * @param object
     * @return if objects are equal
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Song song = (Song) object;
        return Objects.equals(name, song.name)
                && Objects.equals(album, song.album)
                && Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, album, genre);
    }


}
