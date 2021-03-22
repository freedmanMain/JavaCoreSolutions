package abstractclassvsinterface.oopadvanced.model.behavior;

import abstractclassvsinterface.oopadvanced.model.figure.Figure;

/**
 * Интрефейс Shape:
 * Описывает поведение форм обьектов.
 * Выводит основную информацию.
 * Расчитывает площадь.
 */

public interface Shape {

    /**
     * Выводит информацию о фигуре.
     */

    void draw();

    /**
     * Расчитывает площадь.
     */

    double area();

    /**
     * Генерирует рандомную фигуру.
     */

    Figure getFigure();
}
