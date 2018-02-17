import java.util.ArrayList;
class Apple {
    Apple() {

    }
}

class Orange {

}

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Orange()); //Mix apple with orange
    }
}
