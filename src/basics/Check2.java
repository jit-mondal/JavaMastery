public class Check2 {
    int a,b; // class variable or instance variable

    void test()
    {
        System.out.println("Welcome to test");
        System.out.println("a="+a+ "And  b ="+b);
    }

    void test(int a)
    {
        System.out.println("Welcome to test");
        System.out.println("a="+a+ "And  b ="+b);
    }

    void test(int a,float b)
    {
        System.out.println("Welcome to test");
        System.out.println("a="+a+ "And  b ="+b);
       // return a;
    }


    Check2(int x, int y) {
        a=x;
        b=y;
        System.out.println("Sum: " + (x + y));
    }

    Check2(float x, int y) {

        System.out.println("Sum: " + (x + y));
    }
    Check2(int x, float y) {

        System.out.println("Sum: " + (x + y));
    }

    Check2(float x, float y) {

        System.out.println("Sum: " + (x + y));
    }


    public static void main(String[] args) {

       // System.out.println(a); ??
        Check2 c3 = new Check2(5, 7);
        c3.test();

    }
}