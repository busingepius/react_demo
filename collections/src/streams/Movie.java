/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 09/03/2024
 * Time : 08:27
 * Project Name : streams
 */
package streams;

public class Movie {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.likes = likes;
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Genre getGenre() {
        return genre;
    }

    public static String getLikesAndTitle() {
        return "123";
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        String s = String.format("%.2f",1002.0);
        return STR."Movie{ title=\{title}, likes=\{likes}, genre=\{genre} }";
    }
}

enum Genre {COMEDY, ACTION, THRILLER};
