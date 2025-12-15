import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected Person choreograph;

    public Ballet (String title, int duration, Director director, String musicAuthor, String librettoText,
                    ArrayList<Actor> listOfActors, Person choreograph) {
        super(title, duration, director, musicAuthor, librettoText, listOfActors);
        this.choreograph = choreograph;
    }
    public Person getChoreograph() {

        return choreograph;
    }
    @Override
    public void printLibrettoText() {
        System.out.println(getLibrettoText());
    }
}
