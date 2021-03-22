package abstractclassvsinterface.oopadvanced.model.figure;

import abstractclassvsinterface.oopadvanced.model.state.FigureSupplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    Figure[] figures = new Figure[50];

    public void create_figures() {
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.generateFigure();
        }
    }
    @Test
    public void figure_test () {

    }
}