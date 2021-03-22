package abstractclassvsinterface.oopadvanced.model.figure;

/**
 * Класс прямоугольный треугольник.
 */

public class RightTriangle extends Figure {

    /**
     * Поля legA и legB (катеты прямоугольного треугольника).
     */

    private double legA;
    private double legB;

    /**
     * Обычный пустой конструктор. его пришлось описать т.к
     * невозможно будет создать обьект класса в классе FigureSupplier.
     */

    public RightTriangle() {

    }

    /**
     * Перегруженный конструктор, который будет вызываться в методе getFigure().
     * Как здесь видно я обращаюсь к сеттерам родительского класса,
     * которые в свою очередь будут инициализировать цвет фигуры рандомно.
     * UPD: это работает =)
     */

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
        setColor();
        setIdentification("right triangle");
    }

    /**
     * Метод для рассчета гипотенузы прямоугольного треугольника.
     */

    public double hypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    /**
     * Блок перегруженных методов из наследуемого интерфейса Shape.
     */

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, legA: " + legA + " units, legB: "
                + legB + "units, color: " + getColor());
    }

    @Override
    public double area() {
        return (legA * legB) / 2;
    }

    @Override
    public Figure getFigure() {
        return new RightTriangle(Math.random() * 50, Math.random() * 50);
    }
}
