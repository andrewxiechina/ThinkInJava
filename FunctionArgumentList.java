public class FunctionArgumentList {
    // Argument List
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        printArray(a);

        Double b[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        printArray(b);
    }
}
