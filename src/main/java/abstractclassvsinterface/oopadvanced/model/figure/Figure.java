package abstractclassvsinterface.oopadvanced.model.figure;

import abstractclassvsinterface.oopadvanced.model.behavior.Shape;
import abstractclassvsinterface.oopadvanced.model.state.ColorSupplier;

/**
 * Абстрактный класс Figure.
 * Описывает основные свойства любой фигуры.
 * Здесь есть готовые геттеры и сеттеры для свойств фигуры.
 * Сделано это, чтобы не писать лишний код во всех остальных классах наследуемых от Figure.
 * Ну и конечно потому-что я ленивый =)
 * В любом классе наследуемом от Figure можно будет просто вызвать например:
 * setColor() и getColor(), чтобы сгенерировать цвет и соответсвенно получить его.
 * UPD: не знаю насколько это правильный подход...
 */

public abstract class Figure implements Shape {

    /**
     * Название фигуры.
     */

    private String identification;

    /**
     * Цвет фигуры.
     */

    private String color;

    /**
     * Сеттер для цвета фигуры.
     */

    protected void setColor() {
        color = ColorSupplier.generateColor();
    }

    /**
     * Сеттер для названия фигуры.
     */

    protected void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Геттер для цвета фигуры.
     */

    protected String getColor() {
        return color;
    }

    /**
     * Геттер для названия фигуры.
     */

    protected String getIdentification() {
        return identification;
    }
}
