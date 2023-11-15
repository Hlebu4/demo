package library;


public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Esenin","The Dark Man" , 124 , 25 , true) ;

        System.out.println("Book1 Author - " + book1.author );
        System.out.println("Book1 name - " + book1.name );

    }


}
