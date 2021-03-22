package oop.robotroute;

public class RobotRoute {

    /**
     * У нас есть наш хороший друг Робот Джони, который заблудился на детской площадке.
     * Его позиция представлена двумя целыми координатами:
     * X и Y. X - горизонтальная ось, а Y - вертикальная.
     * (Помните, как вы их рисовали в школе?)
     * К сожалению, у него есть какая-то неизвестная случайная начальная позиция.
     * Он очень хочет домой! Есть координаты toX и toY, которые будут направлением домой.
     * Надеюсь, вы сможете что-нибудь придумать.
     */

    public void moveRobot(Robot robot, int toX, int toY) {
        wayToHorizontal(robot, toX);
        wayToVertical(robot, toY);
    }

    /**
     * Метод который определит в какую сторону
     * по оси y двигать робота.
     * Все просто:
     * toY < robot.y - двигаемся вниз
     * toY > robot.y - двигаемся вверх
     */

    private void wayToVertical(Robot robot, int y) {
        if (y < robot.getY()) {
            setDirection(robot, Direction.DOWN);
            moveToVertical(robot, y);
        } else {
            setDirection(robot, Direction.UP);
            moveToVertical(robot, y);
        }
    }

    /**
     * Метод который определит в какую сторону
     * по оси x двигать робота.
     * Все просто:
     * toX < robot.x - двигаемся влево
     * toX > robot.x - двигаемся вправо
     */

    private void wayToHorizontal(Robot robot, int x) {
        if (x < robot.getX()) {
            setDirection(robot, Direction.LEFT);
            moveToHorizontal(robot, x);
        } else {
            setDirection(robot, Direction.RIGHT);
            moveToHorizontal(robot, x);
        }
    }

    /**
     * Простой метод, который перемещает робота
     * в зависимости от текущего направления по оси x
     */

    private void moveToHorizontal(Robot robot, int target) {
        while (robot.getX() != target) {
            robot.stepForward();
        }
    }

    /**
     * Простой метод, который перемещает робота
     * в зависимости от текущего направления по оси y
     */

    private void moveToVertical(Robot robot, int target) {
        while (robot.getY() != target) {
            robot.stepForward();
        }
    }

    /**
     * Цель метода - определить в какую сторону смотреть роботу!
     * Не имеет значения какой метод из класса Robot вызвать
     * .turnLeft() или .turnRight() т.к наша цель
     * просто получить правильное направление в
     * зависимости от координат toX и toY !!!
     */

    private void setDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
