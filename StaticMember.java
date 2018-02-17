class Mug {
    int mark;

    public Mug(int mark) {
        this.mark = mark;
    }
}

public class StaticMember {
    static Mug m1 = new Mug(1);
    public static void main(String[] args) {
        System.out.println(m1.mark);
    }
}