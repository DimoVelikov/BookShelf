public class Main {
    public static void main(String[] args) {

        //test1
        Shelf.addBook(1, "Kerry Fisher", "Silent Wife", 210);
        Shelf.addBook(2, "Boo Walker", "Red  Mountain", 116);
        Shelf.addBook(3, "Rachel Hanna", "Wisteria Island", 300);
        Shelf.addBook(4, "M.L. Rose", "The Lost Sister", 310);
        Shelf.addBook(5, "James Hunt", "Missing Pieces", 322);

         //test2
        System.out.println(Shelf.getTheBooks());

        //test3
        System.out.println(Shelf.isShelfEmpty());

        //test4
        System.out.println(Shelf.getTitleByID(1));

        //test5
        System.out.println(Shelf.getAllBooksForAuthor("Kerry Fisher"));

        //test6
        System.out.println(Shelf.findBookByPartialTitle("Red"));

        //test7
        System.out.println(Shelf.isIDUnique(3));

        //test8
        //System.out.println(Shelf.removeBook(3));

        //test9
        // System.out.println(Shelf.removeBook("Kerry Fisher"));

        //test10
        System.out.println(Shelf.isShelfEmpty());

        //test11
        //   System.out.println(Shelf.clearBookShelf());




     /*   Shelf.isShelfEmpty();
        Shelf.findBookByPartialTitle("");
        Shelf.getAllBooksForAuthor("");
        Shelf.getTheBooks();
        Shelf.getTitleByID(2);
        Shelf.isIDUnique(2);
        Shelf.removeBook(1);
        Shelf.isShelfEmpty();
        Shelf.removeBook("");
        Shelf.clearBookShelf();
*/
    }
}
