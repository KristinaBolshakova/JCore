package main.java.ru.gb.jcore.snakegame;

import java.util.Random;

public class Food extends Cell {

    private Random random;
    private Snake snake;

    public Food(Snake snake) {
        super(-1, -1, GameSnake.CELL_SIZE, GameSnake.FOOD_COLOR);  // Создание еды вне поля
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

    public boolean isEaten() {
        return getX() == -1;  // проверка нахождения еды на поле
    }

    public void eat() { // удаление съеденой еды с поля
        set(-1, -1);
    }

    public boolean isFood(int x, int y) {
        return (getX() == x && getY() == y); // проверка на столкновение с едой
    }
}

