package oops.encapsulation;

public class Library {
    private int bookCount=0;

    Library(int book){
        setBookCount(book);
    }

    public void setBookCount(int bookCount) {
        if (bookCount<=100 && bookCount>=0){
            this.bookCount=bookCount;
            System.out.println("books added : "+bookCount);
        }
        else {
            System.out.println("Invalid number of books ");
        }
    }

    public void addBook(int book){
        if(book+bookCount>=0 && book+bookCount<=100){
            bookCount=bookCount+book;
            System.out.println("after add total Books : " + getBookCount());
        }
        else {
            System.out.println("Invalid Number of Books ");
        }
    }

    public void removeBook(int book){
        if(bookCount-book>=0){
            bookCount=bookCount-book;
            System.out.println("after remove total Books : " + getBookCount());
        }
        else {
            System.out.println("Invalid Number of Books ");
        }
    }

    public int getBookCount() {
        return bookCount;
    }
    public void bookDetails(){
        System.out.println("No of Books Is : "+getBookCount());
    }

    public static void main(String[] args){
        Library S1=new Library(100);
        System.out.println("books :" +S1.getBookCount());
        S1.removeBook(100);
        S1.addBook(50);
    }
}
