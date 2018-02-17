// Interface factory design pattern

interface Game {
    boolean move();
}

interface GameFactory {
    Game createGame();
}

class Go implements Game {
    @Override
    public boolean move() {
        System.out.println("Go makes a move.");
        return true;
    }
}

class GoFactory implements GameFactory {
    @Override
    public Game createGame() {
        Game g = new Go();
        return g;
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        GoFactory f = new GoFactory();
        Game g = f.createGame();
        g.move();
    }
}
