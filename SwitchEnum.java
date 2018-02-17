//enum Spiciness {
//    NOT, MILD, HOT
//}

public class SwitchEnum {
    public  static void main(String[] args) {
        Spiciness s = Spiciness.HOT;

        switch (s) {
            case HOT: System.out.println("Yeah!!");
            case NOT: System.out.println("No...");
            default: System.out.println("OK...");
        }
    }
}
