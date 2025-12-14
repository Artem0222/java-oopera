import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreograph;

    public Ballet (String title, int duration, Director director, String musicAuthor, String librettoText,
                    ArrayList<Actor> listOfActors, String choreograph) {
        super(title, duration, director, musicAuthor, librettoText, listOfActors);
        this.choreograph = choreograph;
    }
    public String getChoreograph() {
        return choreograph;
    }
    @Override
    public void printLibrettoText() {
        System.out.println(getLibrettoText());
    }
}
