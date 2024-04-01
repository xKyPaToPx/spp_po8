import java.util.ArrayList;

public class Catalog {
    private ArrayList<Book> bookList;
    Catalog(){
        bookList = new ArrayList<>();
    }
    public static class Book{
        private String bookName;
        private String readerName;
        private String dateOfIssue;
        Book(String _bookName, String _readerName, String _dateOfIssue){
            bookName=_bookName;
            readerName=_readerName;
            dateOfIssue=_dateOfIssue;
        }
        @Override
        public String toString(){
            return new String("-------------\nbook name: "+bookName+"\nreader name: "+readerName+"\ndate of issue: "+dateOfIssue+"\n");
        }

        public String getBookName() {
            return bookName;
        }

        public String getDateOfIssue() {
            return dateOfIssue;
        }

        public String getReaderName() {
            return readerName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public void setDateOfIssue(String dateOfIssue) {
            this.dateOfIssue = dateOfIssue;
        }

        public void setReaderName(String readerName) {
            this.readerName = readerName;
        }
    }
    @Override
    public String toString(){
        String result = "";
        for(Book book: bookList){
            result+=book.toString();
        }
        return result;
    }
    public void addBook(String _bookName, String _readerName, String _dateOfIssue){
        Book book = new Book(_bookName, _readerName, _dateOfIssue);
        bookList.add(book);
    }
    public void addBook(Book book){
        bookList.add(book);
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}
