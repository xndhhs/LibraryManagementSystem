import java.util.Date;

public class User {
    public String name;
    public String pass;
    public String userName;
    public String userSurname;
    public Date lendingDate;
    public Date returnDate;
    public Book[] bookLent; // [null][null][null][null][null]

    public User() {
        //default
    }

    public User(String name, String pass, String userName, String userSurname, Date lendingDate, Date returnDate) {
        this.name = name;
        this.pass = pass;
        this.userName = userName;
        this.userSurname = userSurname;
        this.bookLent = new Book[5];
        this.lendingDate = lendingDate;
        this.returnDate = returnDate;
    }
    public User(String name, String pass, String userName, String userSurname) {
        this.name = name;
        this.pass = pass;
        this.userName = userName;
        this.userSurname = userSurname;
        this.bookLent = new Book[5];
    }

    public User(String name, String pass) { //for admin
        this.name = name;
        this.pass = pass;
    }
}