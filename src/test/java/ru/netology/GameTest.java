package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void tetWhenFirstPlayerWin2() {
        Player vanya = new Player(1, "Ваня", 100);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(vanya);
        game.register(mitya);
        int actual = game.round("Митя", "Ваня");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tetWhenFirstPlayerWinWeak() {
        Player vanya = new Player(1, "Ваня", 100);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(vanya);
        game.register(mitya);
        int actual = game.round("Ваня", "Митя");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void tetWhenFirstPlayerDraw2() {
        Player venya = new Player(1, "Веня", 120);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(venya);
        game.register(mitya);
        int actual = game.round("Веня", "Митя");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tetWhenFirstPlayerNotExist2() {
        Player vanya = new Player(1, "Ваня", 100);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(vanya);
        game.register(mitya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Саша", "Ваня")
        );
    }

    @Test
    public void tetWhenFirstPlayerNotExist1() {
        Player vanya = new Player(1, "Ваня", 100);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(vanya);
        game.register(mitya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Митя", "Вова")
        );
    }

    @Test
    public void tetWhenFirstPlayerWin1() {
        Player vanya = new Player(1, "Ваня", 100);
        Player petya = new Player(2, "Петя", 90);
        Game game = new Game();

        game.register(vanya);
        game.register(petya);
        int actual = game.round("Петя", "Ваня");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tetWhenFirstPlayerNotExist3() {
        Player vanya = new Player(1, "Ваня", 100);
        Player mitya = new Player(2, "Митя", 120);
        Game game = new Game();

        game.register(vanya);
        game.register(mitya);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Вова", "Ваня"));

    }


}