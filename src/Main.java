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



    }
}
