enum Spiciness {
    NOT, MILD, HOT
}

public class SimpleEnum {
    public  static void main(String[] args) {
        System.out.println(Spiciness.HOT);
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", " + s.ordinal());
    }
}
