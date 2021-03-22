import abstractclassvsinterface.oopadvanced.model.figure.Figure;
import abstractclassvsinterface.oopadvanced.model.state.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[20];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.generateFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
