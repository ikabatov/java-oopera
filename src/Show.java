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
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surname + " не найден в спектакле");
        }
    }
}


