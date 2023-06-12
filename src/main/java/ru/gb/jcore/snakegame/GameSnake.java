package main.java.ru.gb.jcore.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameSnake extends JFrame {  //наш класс должен быть наследником класса JFrame
    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "GAME OVER";
    final static int CELL_SIZE = 20;  //размер ячеейки
    final static int CANVAS_WIDTH = 30; //ширина
    final static int CANVAS_HEIGHT = 25; // высота

    final static Color SNAKE_COLOR = Color.darkGray; //цвет змейки
    final static Color FOOD_COLOR = Color.green; //цвет еды
    final static Color POISON_COLOR = Color.red; // цвет яда
    final static int KEY_LEFT = 37; // налево
    final static int KEY_UP = 38; // вверх
    final static int KEY_RIGHT = 39; // направо
    final static int KEY_DOWN = 40; // вниз
    final int START_SNAKE_SIZE = 5;
    final int START_SNAKE_X = CANVAS_WIDTH/2;
    final int START_SNAKE_Y = CANVAS_HEIGHT/2;
    final int SNAKE_DELAY = 150;  // задержка в скорости змейки
    int snakeSize = 0;
    int currentDelay = SNAKE_DELAY;
    static boolean gameOver = false;


    Canvas canvas; // игровое поле
    Snake snake; // змейка
    Food food; // еда
    Poison poison; // яд

    public static void main(String[] args){
        new GameSnake().game();
    }

    public GameSnake() {
        setTitle(TITLE_OF_PROGRAM); //передаем название программы
        setDefaultCloseOperation(EXIT_ON_CLOSE); // окончание программы

        canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH, CELL_SIZE * CANVAS_HEIGHT));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas); //связать с канвой
        pack(); // в данном методе происходит связывание
        setLocationRelativeTo(null); // окошко будет посередине экрана
        setResizable(false); // запрет на разворачивания окна
        setVisible(true); // видимость окошка
        }

        private void game(){
            snake = new Snake(
                    START_SNAKE_X,
                    START_SNAKE_Y,
                    START_SNAKE_SIZE,
                    KEY_RIGHT);
            food = new Food(snake);
            snake.setFood(food);
            poison = new Poison(snake);
            snake.setPoison(poison);

            while ((!gameOver)){
                snake.move();
                if(snake.size() > snakeSize){
                    snakeSize = snake.size();
                    setTitle(TITLE_OF_PROGRAM + ":" + snakeSize);
                }

                if(food.isEaten()){
                    food.appear();
                    poison.appear();
                }

                if(food.isEaten()){
                    food.appear();
                    poison.appear();
                    if (snake.size() % 3 == 0){
                        currentDelay = -2;
                    }
                }

                canvas.repaint();
                sleep(SNAKE_DELAY);
            }

            setTitle(GAME_OVER_MSG);


        }

        public void sleep(long ms){  //задержка
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        class Canvas extends JPanel {
            @Override
            public void paint(Graphics g){
                super.paint(g);
                Graphics2D g2D = (Graphics2D) g;
                g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                if ((!gameOver)){
                    snake.paint(g2D);
                    food.paint(g2D);
                    poison.paint(g2D);
                }
                else {
                    g.setColor(Color.RED);
                    g.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 40));
                    g.drawString(GAME_OVER_MSG, CANVAS_WIDTH * 6, CANVAS_HEIGHT * 10);
                    g.drawString("Score: " + snakeSize, CANVAS_WIDTH * 2, CANVAS_HEIGHT * 3);
                    canvas.setBackground(Color.BLACK);
                }
            }
        }



}


