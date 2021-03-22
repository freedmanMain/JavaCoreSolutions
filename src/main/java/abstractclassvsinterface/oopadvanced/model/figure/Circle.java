package abstractclassvsinterface.oopadvanced.model.figure;

public class Circle extends Figure {

    /**
     * Поле radius (радиус круга).
     */

    private double radius;

    /**
     * Обычный пустой конструктор. его пришлось описать т.к
     * невозможно будет создать обьект класса в классе FigureSupplier.
     */

    public Circle() {

    }

    /**
     * Перегруженный конструктор, который будет вызываться в методе getFigure().
     * Как здесь видно я обращаюсь к сеттерам родительского класса,
     * которые в свою очередь будут инициализировать цвет фигуры рандомно.
     * UPD: это работает =)
     */

    public Circle(double radius) {
        this.radius = radius;
        setColor();
        setIdentification("circle");
    }

    /**
     * Блок перегруженных методов из наследуемого интерфейса Shape.
     */

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Figure getFigure() {
        return new Circle(Math.random() * 50);
    }
}
