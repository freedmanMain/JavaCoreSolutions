package abstractclassvsinterface.oopadvanced.model.figure;

/**
 * Класс прямоугольник.
 */

public class Rectangle extends Figure {

    /**
     * Поля length и width, которые есть у любого прямоугольника.
     */

    private double length;
    private double width;

    /**
     * Обычный пустой конструктор. его пришлось описать т.к
     * невозможно будет создать обьект класса в классе FigureSupplier.
     */

    public Rectangle() {

    }

    /**
     * Перегруженный конструктор, который будет вызываться в методе getFigure().
     * Как здесь видно я обращаюсь к сеттерам родительского класса,
     * которые в свою очередь будут инициализировать цвет фигуры рандомно.
     * UPD: это работает =)
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        setColor();
        setIdentification("rectangle");
    }

    /**
     * Блок перегруженных методов из наследуемого интерфейса Shape.
     */

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, length: " + length + " units, width: "
                + width + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public Figure getFigure() {
        return new Rectangle(Math.random() * 50, Math.random() * 50);
    }
}
