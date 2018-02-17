// Java initialize (member) values by default, effective after object is created

public class InitialValues {
    boolean b;
    int i;
    char c;
    double d;
    InitialValues o;
    public static void main(String[] args) {
        InitialValues obj = new InitialValues();
        System.out.println(obj.b);
        System.out.println(obj.i);
        System.out.println(obj.d);
        System.out.println("\"" + obj.c + "\"" );
        System.out.println(obj.o);
    }
}
