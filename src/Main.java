public class Main {

    public static void main(String[] args) {
        Autor bulgakov = new Autor("Михаил", "Булгаков");
        System.out.println(bulgakov);

        Autor zusac = new Autor("Маркус", "Зусак");
        System.out.println(zusac);

        Book masterAndMargarita = new Book("Мастер и Маргарита", 1967, bulgakov);
        System.out.println(masterAndMargarita);

        masterAndMargarita.setPublicationYear(2022);
        System.out.println(masterAndMargarita);

        Book theBookThief = new Book("Книжный вор", 2005, zusac);
        System.out.println(theBookThief);

        System.out.println(bulgakov.equals(zusac));
        System.out.println(masterAndMargarita.equals(theBookThief));

        System.out.println(bulgakov.hashCode());
        System.out.println(theBookThief.hashCode());
    }
}