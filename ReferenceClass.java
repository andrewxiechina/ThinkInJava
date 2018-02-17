public class ReferenceClass {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for (int i = 0; i < 5; i++) {
            a2[i] = i*10;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a1[i]);
        }
    }
}