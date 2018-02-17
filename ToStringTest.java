class Shape {
    int height, width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Shape s = new Shape(5, 10);
        System.out.println(s);
    }
}
