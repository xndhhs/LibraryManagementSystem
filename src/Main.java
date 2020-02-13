
public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", "1234", "Andrei", "Ionescu");
        User user2 = new User("user2", "5678", "Virgil", "Popescu");
        User user3 = new User("user3", "1357", "Marius", "Mihailescu");
        User user4 = new User("user4", "2468", "Daniel", "Anton");

        User[] userVector = {user1, user2, user3, user4};
        Book book1 = new Book("Leonardo da Vinci", "Walter", "Isaacson", "Publica", 1, "RO", "Biografie", "Biografie");
        Book book2 = new Book("Jobs", "Walter", "Isaacson", "Publica", 1, "EN", "Biografie", "Biografie");
        Book book3 = new Book("Letters from a Stoic", "Seneca", "Seneca", "All", 1, "EN", "Filosofie", "Filosofie antica");
        Book book4 = new Book("Ecce homo", "Friedrich", "Nietzsche", "Humanitas", 1, "RO", "Filosofie", "Filosofie contemporana");
        Book book5 = new Book("Clean code", "Robert", "Martin", "Princeton", 1, "EN",  "Dezvoltare personala", "IT");
        Book book6 = new Book("Gandire rapida, gandire lenta", "Daniel", "Khanemann", "Litera", 1, "RO", "Dezvoltare personala", "Psihologie");
        Book book7 = new Book("Scurta istorie a timpului", "Stephen", "Hawking", "Humanitas", 1, "RO", "Stiinta", "Fizica");
        Book book8 = new Book("Originea speciilor", "Charles", "Darwin", "Litera", 1, "RO", "Stiinta", "Biologie");
        Book book9 = new Book("Taiko", "Eiji", "Yoshikawa", "RAO", 2, "RO", "Fictiune", "Istoric");
        Book book10 = new Book("Lord of the Rings", "J.R.R", "Tolkien", "RAO", 3, "EN",  "Fictiune", "Fantasy");
        Book book11 = new Book("Remains of the day", "Kazuo", "Ishiguro", "Penguin", 1, "EN",  "Fictiune", "Contemporana");
        Book book12 = new Book("Fundatia", "Isaac", "Asimov", "Humanitas", 3, "RO", "Fictiune", "Sci Fi");
        Book book13 = new Book("To kill a mockingbird", "Harper", "Lee", "Penguin", 1, "EN", "Fictiune", "Moderna");
        Book book14 = new Book("La rasarit de Eden", "John", "Steinbeck", "Humanitas", 1, "RO", "Fictiune", "Moderna");
        Book book15 = new Book("Divina Comedie", "Dante", "Alighieri", "Humanitas", 1, "RO", "Fictiune", "Clasici");
        Book[] bookVector = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15};

        Library library = new Library(bookVector, userVector);

        int position;
        do {
            position = library.doLogin();
            library.showMenu(position);
        } while ( position >= 0 );

    }
}
