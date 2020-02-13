import java.util.Scanner;

public class Library {
    public Book[] books;
    public User[] users;


    public Library(Book[] books, User[] users) {
        this.books = books;
        this.users = users;
    }


    public int doLogin() {
        int noOfTries = 3;
        int position = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            boolean exists = false;
            System.out.println("Enter user name:");
            String user = scanner.next();
            System.out.println("Enter password:");
            String pass = scanner.next();
            for (int i = 0; i < users.length; i++) {
                if (users[i].name.equals(user) && users[i].pass.equals(pass)) {
                    position = i;
                    exists = true;
                }
            }
            if (!exists) {
                noOfTries--;
                System.out.println("User name and/or password incorrect");
                System.out.println("You have " + (noOfTries) + " tries left");
                System.out.println();
            }
        } while ( position == -1 && noOfTries > 0 );
        System.out.println();
        if (noOfTries == 0) {
            System.out.println("Account has been blocked!");
        } else {
            System.out.println("Welcome, " + users[position].userName + " " + users[position].userSurname + "!");
        }
        return position;
    }
    /////////////////////////////////////Main Menu///////////////////////////////////////////////////////////////////

    public void showMenu(int position) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from the menu:");
        System.out.println("1.View my profile");
        System.out.println("2.Lend a book");
        System.out.println("3.Return a book");
        System.out.println("4.Log out");
        System.out.println("Choose your option:");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                viewProfile(position);
                System.out.println("Do you wish to make another operation?");
                String again = scanner.next();
                if (again.equalsIgnoreCase("yes")) {
                    showMenu(position);
                }
                break;
            case 2:
                System.out.println("Do you wish to make another operation?");
                again = scanner.next();
                if (again.equalsIgnoreCase("yes")) {
                    showMenu(position);
                }
            case 3:
                System.out.println("Do you wish to make another operation?");
                again = scanner.next();
                if (again.equalsIgnoreCase("yes")) {
                    showMenu(position);
                }
                break;
            case 4:
                position = doLogin();
                showMenu(position);
                break;
        }
    }

    /////////////////////////////////////View Profile////////////////////////////////////////////////////////////
    public void viewProfile(int position) {
        System.out.println("Name: " + users[position].userName);
        System.out.println("Surname: " + users[position].userSurname);
        if (users[position].bookLent.length == 0) {
            System.out.println("Books lent: No books lent now");
            System.out.println("Lending date: - ");
            System.out.println("Return date: - ");
        } else {
            System.out.println("Books lent: " + users[position].bookLent);
            System.out.println("Lending date: " + users[position].lendingDate);
            System.out.println("Return date: " + users[position].returnDate);
        }
    }

    /////////////////////////////////////Lend a book////////////////////////////////////////////////////////////
    public void lendBook(int position) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose from the menu:");
        System.out.println("1.Browse books");
        System.out.println("2.Lend a book");
        int option = scanner.nextInt();
        if (option == 1) {
            sortBooks();
        } else if (option == 2) {

        }
    }

    /////////////////////////////////////Browse by type////////////////////////////////////////////////////////////
    public void sortBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show books by: ");
        System.out.println("1.by author");
        System.out.println("2.by category");
        System.out.println("3.by subcategory");
        System.out.println("4.by language");
        System.out.println("5.view only available books");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }

    /////////////////////////////////////Browse by author/////////////////////////////////////////////////////////
    public void browseByAuthor() {

    }

    /////////////////////////////////////Browse by category///////////////////////////////////////////////////////
    public void browseByCategory() {

    }

    /////////////////////////////////////Browse by subcategory////////////////////////////////////////////////////
    public void browseBySucategory() {

    }

    /////////////////////////////////////Browse by language//////////////////////////////////////////////////////
    public void browseByLanguage() {

    }

    /////////////////////////////////////Show stocks////////////////////////////////////////////////////////////

    public void showStocks() {

    }
}