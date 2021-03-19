package memorywrappersstring;

public class BooleanExpression {

    /**
     * Implement the booleanExpression
     * (boolean a, boolean b, boolean c, boolean d) method
     * which returns true if any two of its four arguments
     * are true and rest have false value.
     * In all other cases, the method must return false.
     * */

    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0) == 2;
    }
}
