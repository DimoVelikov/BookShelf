public class IsTitleWordNewCodes {

    public static Boolean isTitleWord(String word) {

        boolean result=true;
        String[] nonTitleWords={"a" , "an", "the","and", "but", "for", "nor", "or", "so", "yet","at",
                "by", "in", "into", "near", "of", "on", "to", "than", "via"};

        for (String each : nonTitleWords) {
            if(word.equals(each)){
                result=false;
                break;
            }
        }
        return result;

    }
}
