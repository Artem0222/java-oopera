import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor, String librettoText,
                 ArrayList<Actor> listOfActors, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText, listOfActors);
        this.choirSize = choirSize;
    }
public int getChoirSize() {
        return choirSize;
}
@Override
        public void printLibrettoText() {
    System.out.println(getLibrettoText());
}
}
