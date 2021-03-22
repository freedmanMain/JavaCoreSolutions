package abstractclassvsinterface.oopadvanced.model.state;

/**
 * Класс генерирует цвет.
 */

public class ColorSupplier {

    /**
     * Массив всех доступных цветов.
     * (можно его расширить, но мне влом =)
     */

    private static final String[] COLORS = new String[]{
            "blue", "yellow", "red", "white",
            "black", "green", "orange", "purple"
    };

    /**
     * Метод генератор цвета.
     * 0...FIGURES.length
     */

    public static String generateColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
