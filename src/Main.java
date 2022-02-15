public class Main {

    public void setAuthor(String author) {

        if(author.isEmpty()){
            author="Unknown";
            unknownAuthors++;
        }else{
            author= capitalize(author);
        }
        this.author=author;


    }

}
