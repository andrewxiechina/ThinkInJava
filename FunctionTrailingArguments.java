public class FunctionTrailingArguments {
    // Argument List
    static void printArray(int mark, String... str) {
        if (mark > 0) System.out.print("Marked! ");
        for (Object obj : str) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(3, "A", "B", "C");
        printArray(0, "D", "E", "F");
    }
}
