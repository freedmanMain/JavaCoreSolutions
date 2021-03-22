package abstractclassvsinterface.oopadvanced.model.figure;

/**
 * Класс равнобедренной трапеции.
 */

public class IsoscelesTrapezoid extends Figure {

    /**
     * Поля baseA и baseB (основы трапеции).
     */

    private double baseA;
    private double baseB;
    private double side;

    /**
     * Обычный пустой конструктор. его пришлось описать т.к
     * невозможно будет создать обьект класса в классе FigureSupplier.
     */

    public IsoscelesTrapezoid() {

    }

    /**
     * Перегруженный конструктор, который будет вызываться в методе getFigure().
     * Как здесь видно я обращаюсь к сеттерам родительского класса,
     * которые в свою очередь будут инициализировать цвет фигуры рандомно.
     * UPD: это работает =)
     */

    public IsoscelesTrapezoid(double baseA, double baseB, double side) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
        setColor();
        setIdentification("isosceles trapezoid");
    }

    /**
     * Блок перегруженных методов из наследуемого интерфейса Shape.
     */

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double area() {
        double S = (baseA + baseB + side * side) / 2;
        return Math.sqrt(S * (S - baseA) * (S - baseB) * (S - side));
    }

    @Override
    public Figure getFigure() {
        return new IsoscelesTrapezoid(Math.random() * 50,
                Math.random() * 50, Math.random() * 50);
    }
}
