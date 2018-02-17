// Autoboxing is the automatic conversion that the Java compiler makes between the
// primitive types and their corresponding object wrapper classes. For example,
// converting an int to an Integer, a double to a Double, and so on. If the
// conversion goes the other way, this is called unboxing.

public class AutoBoxing {
    public static void main(String[] args) {
        Integer[] a = {
          new Integer(1),
          new Integer(2),
          3
        };

        for (int i : a) {
            System.out.println(i);
        }
    }
}
