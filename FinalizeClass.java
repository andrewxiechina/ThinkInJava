// finalize() is used to check all conditions are met when Garbage Collection delete an object

class Book {
    boolean checkedOut = false;

    void checkIn() {
        checkedOut = false;
    }

    void checkOut() {
        checkedOut = true;
    }

    Book() {
        checkedOut = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkedOut == true) {
            System.out.println("Error: book cleaned before checked out.");
        }
        super.finalize();
    }
}

public class FinalizeClass {
    public static void main(String args[]) {
        new Book();
        System.gc();
    }
}
