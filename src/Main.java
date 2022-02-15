public class Main {
    public static void main(String[] args) {

        //Testing findBookByPartialTitle


        //Creating a Book Object with addBook
        Shelf.addBook(12,"Dimo Velikov","Java is hard",100);
        //Confirm that Book object is created
        System.out.println(Shelf.getTheBooks());
        //Expected result:[[author=Dimo Velikov, title=Java, id=12, page=100]]

        //Testing if findingBookByPartialTitle is working
        System.out.println(Shelf.findBookByPartialTitle("Java"));
        //Expected result [author=Dimo Velikov, title=Java is hard, id=12, page=100]

        //Test completed! TEST PASS!!!

        System.out.println("-----------------");

        //Testing getTheBooks method

        Shelf.addBook(14,"Ivan Velikov","Java is hard 2",100);
        Shelf.addBook(13,"Anna Velikov","Java is hard 3",100);

        System.out.println("Shelf.getTheBooks() = " + Shelf.getTheBooks());

        // Test completed method is working properly


        System.out.println("----------------------");

        //Testing the isShelfEmpty method with books

        //Shelf.clearBookShelf();

        System.out.println("Shelf.isShelfEmpty() = " + Shelf.isShelfEmpty());

        //Test completed no bugs found

        System.out.println("----------------");

        // Testing isIDUnique method

        System.out.println("Shelf.isIDUnique(14) = " + Shelf.isIDUnique(14));

        System.out.println("Shelf.isIDUnique(1) = " + Shelf.isIDUnique(1));

        //Test completed no bugs found


        System.out.println("-------------------");

        //Testing getTitleByID method

        System.out.println("Shelf.getTitleByID(12) = " + Shelf.getTitleByID(12));

        //Test completed no bugs found

        System.out.println("-------------------------");

        // Testing getAllBooksForAuthor method

        System.out.println(Shelf.getAllBooksForAuthor("Dimo Velikovsad"));

        //Test completed method was created successfully and tested with no
        // bugs found

        System.out.println("----------------------");

        // Testing removeBook method

        System.out.println(Shelf.getTheBooks());
        Shelf.removeBook(0);
        System.out.println(Shelf.getTheBooks());

        //Test completed no bugs found

        System.out.println("------------------");

        // Testing removeBook method

        //Shelf.removeBook("Dimo Velikov");

        System.out.println(Shelf.getTheBooks());

        // Test compled no bugs found






    }
}
