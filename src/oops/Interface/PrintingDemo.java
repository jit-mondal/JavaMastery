package oops.Interface;
interface Printable{
    public void print();
}
class photo implements Printable{
    @Override
    public void print(){
        System.out.println("Photo printing");
    }
}

class document implements Printable{
    @Override
    public void print(){
        System.out.println("Document printing");
    }
}
public class PrintingDemo {
    public static void main(String[] args) {
        Printable p1=new photo();
        Printable d1=new document();
        p1.print();
        d1.print();
    }
}
