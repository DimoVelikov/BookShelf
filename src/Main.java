public class Main {

    public static void main(String[] args) {

        //    * capitalize("jAVa") => "Java"
//            * capitalize("HTML") => "Html"
//            * capitalize("") => ""   *if argument is empty, it returns an empty String ""


        System.out.println(capitalize(""));
        System.out.println(capitalize("jAVa"));
        System.out.println(capitalize("HTML"));                                               // Test01 completed. Test PASSED!


        System.out.println("----------------------------------");


//     * -Accepts a words to check if it is a part of the title or just an article etc.
//     * - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
//     * -else method returns true
//     * Articles:
//     * "a" , "an", "the"
//     * Coordinate conjunctions:
//     * "and", "but", "for", "nor", "or", "so", "yet"
//     * Most common single-word English prepositions:
//     * "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"
//     * isTitleWord("Apple") => true
//                * isTitleWord("a") => false
//                * isTitleWord("BUT") => false
//                * isTitleWord("THE") => false
//                * isTitleWord("neaR") => false
//                * isTitleWord("java") => true

        System.out.println(isTitleWord("Apple")); // true
        System.out.println(isTitleWord("a")); // false
        System.out.println(isTitleWord("the")); // false
        System.out.println(isTitleWord("and"));// false
        System.out.println(isTitleWord("but"));// false
        System.out.println(isTitleWord("for"));// false
        System.out.println(isTitleWord("nor"));// false
        System.out.println(isTitleWord("or"));// false
        System.out.println(isTitleWord("so"));// false
        System.out.println(isTitleWord("yet"));// false
        System.out.println(isTitleWord("at"));// false
        System.out.println(isTitleWord("by"));// false
        System.out.println(isTitleWord("in"));// false
        System.out.println(isTitleWord("into"));// false
        System.out.println(isTitleWord("near"));// false
        System.out.println(isTitleWord("of"));// false
        System.out.println(isTitleWord("on"));// false
        System.out.println(isTitleWord("to"));// false
        System.out.println(isTitleWord("than"));// false
        System.out.println(isTitleWord("via"));// false

    }

    public static String capitalize(String word) {

        if (word.isEmpty()) {
            return "";
        }

        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

    }


    public static Boolean isTitleWord(String word) {

        if (word.equalsIgnoreCase("a") ||
                word.equalsIgnoreCase("an") ||
                word.equalsIgnoreCase("the") ||
                word.equalsIgnoreCase("and") ||
                word.equalsIgnoreCase("but") ||
                word.equalsIgnoreCase("for") ||
                word.equalsIgnoreCase("nor") ||
                word.equalsIgnoreCase("or") ||
                word.equalsIgnoreCase("so") ||
                word.equalsIgnoreCase("yet") ||
                word.equalsIgnoreCase("at") ||
                word.equalsIgnoreCase("by") ||
                word.equalsIgnoreCase("in") ||
                word.equalsIgnoreCase("into") ||
                word.equalsIgnoreCase("near") ||
                word.equalsIgnoreCase("of") ||
                word.equalsIgnoreCase("on") ||
                word.equalsIgnoreCase("to") ||
                word.equalsIgnoreCase("than") ||
                word.equalsIgnoreCase("via")){
             //    word.equalsIgnoreCase("<pa>")) {
            return false;
        } else {
            return true;
        }

    }
}