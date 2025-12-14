import java.util.ArrayList;

public class Show {

    public String title;
    int duration;
    public Director director;
    ArrayList <Actor> listOfActors = new ArrayList<>();

    public Show (String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void printDirector() {
        System.out.println("Режиссёр - " + director);
    }

    public void printActors() {
        System.out.println("Актёры в спектакле - ");
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст");
        } else {
            for (Actor actor: listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public boolean addActor (Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актёр уже есть в списке");
            return false;
        }
        listOfActors.add(actor);
        return true;
    }

    public boolean replaceActor (Actor newActor, String surnameToReplace) {
for (int i = 0; i < listOfActors.size(); i++) {
    Actor currentActor = listOfActors.get(i);
    if (currentActor.getSurname().equals(surnameToReplace)) {
        listOfActors.set(i, newActor);
        System.out.println("Актёр " + currentActor.getSurname() + "заменён на " + newActor.getSurname());
        return true;
    }
}
System.out.println("Такого актера нет в списке");
return false;
    }
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }
}
