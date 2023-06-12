package main.java.ru.gb.jcore.snakegame;

import java.util.Random;

public class Poison extends Cell{
    private Random random;
    private Snake snake;

    public Poison(Snake snake){
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.POISON_COLOR);  // Создание яда вне поля
        random = new Random();
        this.snake = snake;
    }

    public void appear() {
        int x, y;
        do {
            x = random.nextInt(GameSnake.CANVAS_WIDTH);   // координаты появления еды по х
            y = random.nextInt(GameSnake.CANVAS_HEIGHT); // координаты появления еды по y
        } while (snake.isInSnake(x, y));
        set(x, y);
    }

    public boolean isPoison(int x, int y) {
        return (getX() == x && getY() == y); // проверка на столкновение с едой
    }
}
