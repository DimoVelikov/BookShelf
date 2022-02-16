import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Utility static method: capitalize
         * accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
         * if argument is empty, it returns an empty String ""
         * capitalize("jAVa") => "Java"
         * capitalize("HTML") => "Html"
         * capitalize("") => ""
         * This method will be used in setAuthor(), setTitle() methods
         */

        System.out.println(Book.capitalize("jAVa"));
        System.out.println(Book.capitalize("HTML"));
        System.out.println(Book.capitalize(""));


        System.out.println("------------------------------------------------------------------------------------------");

        /**
         * Utility static method: isTitleWord
         * -This method will be used in setTitle() method
         * -Accepts a words to check if it is a part of the title or just an article etc.
         * - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
         * -else method returns true
         * Articles:
         * "a" , "an", "the"
         * Coordinate conjunctions:
         * "and", "but", "for", "nor", "or", "so", "yet"
         * Most common single-word English prepositions:
         * "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"
         * <p>
         * isTitleWord("Apple") => true
         * isTitleWord("a") => false
         * isTitleWord("BUT") => false
         * isTitleWord("THE") => false
         * isTitleWord("neaR") => false
         * isTitleWord("java") => true
         */

        System.out.println(Book.isTitleWord("a"));
        System.out.println(Book.isTitleWord("an"));
        System.out.println(Book.isTitleWord("the"));
        System.out.println(Book.isTitleWord("and"));
        System.out.println(Book.isTitleWord("but"));
        System.out.println(Book.isTitleWord("for"));
        System.out.println(Book.isTitleWord("nor"));
        System.out.println(Book.isTitleWord("or"));
        System.out.println(Book.isTitleWord("so"));
        System.out.println(Book.isTitleWord("yet"));
        System.out.println(Book.isTitleWord("at"));
        System.out.println(Book.isTitleWord("by"));
        System.out.println(Book.isTitleWord("in"));
        System.out.println(Book.isTitleWord("into"));
        System.out.println(Book.isTitleWord("near"));
        System.out.println(Book.isTitleWord("of"));
        System.out.println(Book.isTitleWord("on"));
        System.out.println(Book.isTitleWord("to"));
        System.out.println(Book.isTitleWord("than"));
        System.out.println(Book.isTitleWord("via"));

        System.out.println(Book.isTitleWord("Apple"));
        System.out.println(Book.isTitleWord("a"));
        System.out.println(Book.isTitleWord("BUT"));
        System.out.println(Book.isTitleWord("THE"));
        System.out.println(Book.isTitleWord("neaR"));
        System.out.println(Book.isTitleWord("java"));

        System.out.println("------------------------------------------------------------------");

        /**
         * setAuthor method will be used to set value to private author of the Book
         *
         * @param author : String
         *               Conditions:
         *               => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
         *               2) static unknownAuthors is incremented by one.
         *               => Each word in Book author's name should be capitalized. CALL capitalize method
         *               Example:
         *               Book b = new Book();
         *               b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
         *               b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
         *               b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
         */

        Book b = new Book();
        b.setAuthor("mArufJon temirov");
        System.out.println(b);

        System.out.println("------------------------------------------------------------------");

        /**
         * setTitle method will be used to set value to private title of the Book
         *
         * @param title : string
         *              Conditions:
         *              => if title is single word, capitalize it and assign to this.title.
         *              => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
         *              => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
         *              See full list in isTitleWord method, they need to be all lowercase.
         *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
         *              -> Call capitalize method to capitalize title words.
         *              => First word is always capitalized regardless if it is article etc.
         *              Ex:
         *              Book book = new Book();
         *              book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
         *              <p>
         *              book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
         */

        Book book = new Book();
        book.setTitle("the Chronicles OF TrumP");
        System.out.println(book);
        book.setTitle("");
        System.out.println(book);
        book.setTitle("MaruF The cool");
        System.out.println(book);
        book.setTitle("t");
        System.out.println(book);







    }






}
