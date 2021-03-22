package abstractclassvsinterface.oopadvanced.model.figure;

/**
 * Класс описывающий квадрат.
 */

public class Square extends Figure {

    /**
     * Приватное поле стороны квадрата.
     * В каждом классе их кол-во и сущность будет разная.
     */

    private double side;

    /**
     * Обычный пустой конструктор. его пришлось описать т.к
     * невозможно будет создать обьект класса в классе FigureSupplier.
     */

    public Square() {

    }

    /**
     * Перегруженный конструктор, который будет вызываться в методе getFigure().
     * Как здесь видно я обращаюсь к сеттерам родительского класса,
     * которые в свою очередь будут инициализировать цвет фигуры рандомно.
     * UPD: надеюсь это будет работать =)
     */

    public Square(double side) {
        this.side = side;
        setColor();
        setIdentification("square");
    }

    /**
     * Блок перегруженных методов из наследуемого интерфейса Shape.
     */

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, side length: " + side + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Figure getFigure() {
        return new Square(Math.random() * 50);
    }
}
