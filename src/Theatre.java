import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Мария", "Ивановна", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Пётр", "Петров", Gender.MALE, 190);

        Director director1 = new Director("Василий", "Балабанов", Gender.MALE, 5);
        Director director2 = new Director("Стивен", "Спилберг", Gender.MALE, 10);

        String musicAutor = "Моцарт";
        Person choreograph = new Person("Афанасий", "Петров", Gender.MALE);

        Show show1 = new Show("Гамлет", 180, director1, new ArrayList<>());

        Opera opera1 = new Opera("название оперы", 180, director2, "Моцарт",
                "описание либрето", new ArrayList<>(), 30 );
        Ballet ballet1 = new Ballet("название балета", 150, director1, musicAutor,
                "текст либрето", new ArrayList<>(), choreograph );

        show1.addActor(actor1);
        show1.addActor(actor2);

        opera1.addActor(actor3);
        opera1.addActor(actor2);

        ballet1.addActor(actor1);
        ballet1.addActor(actor3);

        ballet1.addActor(actor1);

        show1.printActors();

        opera1.printActors();

        ballet1.printActors();
Actor newActor = new Actor("Саша", "Гагарин", Gender.MALE, 175);
        opera1.replaceActor(newActor, "Гагарин");

        opera1.printLibrettoText();
        ballet1.printLibrettoText();
    }
}
