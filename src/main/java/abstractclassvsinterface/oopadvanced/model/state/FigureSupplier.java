package abstractclassvsinterface.oopadvanced.model.state;

import abstractclassvsinterface.oopadvanced.model.figure.*;

/**
 * Класс - генератор фигур.
 */

public class FigureSupplier {

    /**
     * Массив всех достпуных фигур.
     */

    private static final Figure[] FIGURES = new Figure[]{
            new Circle(), new Rectangle(), new Square(),
            new RightTriangle(), new IsoscelesTrapezoid()
    };

    /**
     * Метод генератор фигуры.
     * 0...FIGURES.length
     */

    public static Figure generateFigure() {
        return FIGURES[(int) (Math.random() * FIGURES.length)].getFigure();
    }
}
