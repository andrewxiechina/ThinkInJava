import java.util.ArrayList;
//class Apple {
//    Apple() {
//
//    }
//}
//
//class Orange {
//
//}

class Fuji extends Apple {

}

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Fuji());
    }
}