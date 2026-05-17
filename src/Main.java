public class Main {
    public static void main(String[] args) {
        Author fedor = new Author("Fedor", "Dostoevsky");
        Author mihail = new Author("Mihail", "Bulgakov");

        Book crime = new Book("Crime and Punishment", fedor, 1865);
        Book master = new Book("Master and Margarita", mihail, 1940);

        crime.setYearRelease(1866);

        System.out.println("--|| Мастер и маргарита ||--");
        System.out.println("crime.getTitle() = " + crime.getTitle());
        System.out.println("crime.getAuthor().getFirstName() = " + crime.getAuthor().getFirstName());
        System.out.println("crime.getAuthor().getLastName() = " + crime.getAuthor().getLastName());
        System.out.println("crime.getYearRelease() = " + crime.getYearRelease());

        System.out.println();

        System.out.println("--|| Преступление и наказание ||--");
        System.out.println("master.getTitle() = " + master.getTitle());
        System.out.println("master.getAuthor().getFirstName() = " + master.getAuthor().getFirstName());
        System.out.println("master.getAuthor().getLastName() = " + master.getAuthor().getLastName());
        System.out.println("master.getYearRelease() = " + master.getYearRelease());
    }
}
