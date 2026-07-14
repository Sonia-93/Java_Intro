public class HelloWorld {
    public static void main(String[] args) {
        System.out.print ln("Hello world");
        int a=10;
        System.out.println(a);
        final int b=20;
        b=10; // This line will cause a compilation error because 'b' is declared as final and cannot be reassigned.
        System.out.println(b);

    }
}
 