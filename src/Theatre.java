public class Theatre {

    public static void main(String[] args) {
        String librettoTextForOpera = "Страстная история любви.";
        String librettoTextForBallet = "Принц влюбляется в прекрасную принцессу.";

        // Создаем трёх актеров, двух режиссёров, одного автора музыки и одного хореографа.
        Actor actor1 = new Actor("Jackie", "Chan", Gender.MALE, 178);
        Actor actor2 = new Actor ("Natalie", "Portman", Gender.FEMALE, 160);
        Actor actor3 = new Actor ("Morgan", "Freeman", Gender.MALE, 185);
        Director director1 = new Director("Christopher", "Nolan", Gender.MALE, 1);
        Director director2 = new Director("Greta", "Gerwig", Gender.FEMALE, 2);
        Person musicAuthor = new Person("Hans", "Zimmer", Gender.MALE);
        Person choreographer = new Person("Polina", "Krutova", Gender.FEMALE);

        // Создаем три спектакля: обычный, оперный и балет
        Show show = new Show("Hamlet", 120, director1);
        Opera opera = new Opera("Carmen", 150, director2, musicAuthor, librettoTextForOpera, 10);
        Ballet ballet = new Ballet("Lake", 90, director2, musicAuthor, librettoTextForBallet, choreographer);

        // Распределяем актёров по спектаклям.
        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor3);
        ballet.addActor(actor1);

        // Для каждого спектакля выводим на экран список актёров.
        System.out.println("Show:");
        show.printListOfActors();
        System.out.println("Opera:");
        opera.printListOfActors();
        System.out.println("Ballet:");
        ballet.printListOfActors();
        System.out.println();

        // Заменяем актёра и выводим список актёров.
        show.replaceActor(actor2, actor1.getSurname());
        System.out.println("Show");
        show.printListOfActors();

        // Попробуем заменить в другом спектакле несуществующего актёра.
        System.out.println();
        ballet.replaceActor(actor2, actor2.getSurname());

        // Для оперного и балетного спектакля выводим на экран текст либретто.
        System.out.println();
        System.out.println("LibrettoText:");
        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}
