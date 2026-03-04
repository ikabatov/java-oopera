import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть.");
        } else {
            listOfActors.add(actor);
        }
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        int index = 0;
        int amountSurname = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                amountSurname += 1;
                index = i;
            }
        }

        if (amountSurname == 0) {
            System.out.println("Актёр с фамилией " + surname + " не найден в спектакле");
        } else if (amountSurname == 1) {
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Найдено несколько актёров с фамилией " + surname + ". Замена не выполнена.");
        }
    }

    public void printFullNameDirector() {
        director.printFullName();
    }
}


