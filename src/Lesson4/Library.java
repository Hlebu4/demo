package Lesson4;


public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Lermontov" , "Borodino" , 35 , 456 , true);

        System.out.println("book1 author - " + book1.author );
        System.out.println("book1 name - " + book1.name);
        System.out.println("book1 pages - " + book1.pages);
        System.out.println("book1 number in catalog - " + book1.numberInCatalog);
        System.out.println("book1 in library - " + book1.inLibrary);

        Book book2 = new Book("Tolstoy" , "Anna Karenina");
        book2.pages = 137;
        book2.numberInCatalog = 74;
        book2.inLibrary = false;

        System.out.println("book2 author - " + book2.author );
        System.out.println("book2 name - " + book2.name);
        System.out.println("book2 pages - " + book2.pages);
        System.out.println("book2 number in catalog - " + book2.numberInCatalog);
        System.out.println("book2 in library - " + book2.inLibrary );


    }


}
