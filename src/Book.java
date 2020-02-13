public class Book implements Comparable<Book>{

    public String title;
    public String authorName;
    public String authorSurname;
    public String publisher;
    public int noOfVolumes;
    public String language;
    public String category;
    public String subcategory;

    public Book() {
        //default
    }

    public Book(String title, String authorName, String authorSurname, String publisher, int noOfVolumes, String language, String category, String subcategory) {
        this.title = title;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.publisher = publisher;
        this.noOfVolumes = noOfVolumes;
        this.language = language;
        this.category = category;
        this.subcategory = subcategory;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}

//ordonarera trebuie sa fie o conventie - in functie de ce parametru faci sortarea
//compareTo compara elem baza c[entru care ai scris comparable cu cea care e declari intre paranteze
//max.compareTo()
//if this.categorie<Books.categorie return -1
//1.compari 2 carti
//2.algoritm de sortare
//3.extindere pe alte caracteristici
