package memorywrappersstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanExpressionTest {
    BooleanExpression obj = new BooleanExpression();
    @Test
    public void boolean_expression_test () {

        //Assert true.

        assertTrue(obj.booleanExpression(true,true,false,false));
        assertTrue(obj.booleanExpression(true,false,false,true));
        assertTrue(obj.booleanExpression(false,true,true,false));
        assertTrue(obj.booleanExpression(false,false,true,true));

        //Assert false.

        assertFalse(obj.booleanExpression(false,false,false,false));
        assertFalse(obj.booleanExpression(true,false,false,false));
        assertFalse(obj.booleanExpression(true,false,true,true));
        assertFalse(obj.booleanExpression(false,false,true,false));
    }
}