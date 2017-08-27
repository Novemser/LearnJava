package FactoryDesignPattern;

/**
 * 用工厂方法设计模式实现的游戏
 * Created by hugansen on 2016/8/1.
 */


interface Game {
    boolean move();
}

interface GameFactory {
    Game createGame();
}

class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game createGame() {
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {

    @Override
    public Game createGame() {
        return new Chess();
    }
}

public class Games {
    private static void playGame(GameFactory factory) {
        Game game = factory.createGame();
        while (game.move()) ;
    }

    public static void main(String... args) {
        playGame(new ChessFactory());
        playGame(new CheckersFactory());
    }
}
