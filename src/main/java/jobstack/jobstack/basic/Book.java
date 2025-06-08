package jobstack.jobstack.basic;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String title;
    private String author;

    public static void main(String[] args){
        Book book =new Book();

        //값 설정
        book.setTitle("title");
        book.setAuthor("jiwon");
        //값 가져옴
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
    /*
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
*/

}