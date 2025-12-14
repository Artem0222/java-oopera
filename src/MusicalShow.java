import java.util.ArrayList;

public class MusicalShow extends Show{
    private String musicAuthor;
    private String librettoText;

    public MusicalShow (String title, int duration, Director director, String musicAuthor, String librettoText,
                        ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public  void printLibrettoText() {
        System.out.println(librettoText);
    }
    public String getMusicAuthor() {
        return musicAuthor;
    }
    public String getLibrettoText() {
        return librettoText;
    }
}
