import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluatePlus() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new PlusOperator());

        assertEquals(5d, expression.evaluate());
    }
    @Test
    public void testEvaluateMinus() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new MinusOperator());

        assertEquals(-1d, expression.evaluate());
    }
    @Test
    public void testEvaluateMultiply() throws Exception {
        Expression expression = new Expression(new Expression(2d), new Expression(3d), new MultiplyOperator());

        assertEquals(6d, expression.evaluate());
    }
    @Test
    public void testEvaluateDivide() throws Exception {
        Expression expression = new Expression(new Expression(6d), new Expression(3d), new DivideOperator());

        assertEquals(2d, expression.evaluate());
    }

    @Test
    public void testEvaluateCombine() throws Exception {
        Expression right = new Expression(new Expression(2d), new Expression(3d), new MultiplyOperator());
        Expression left = new Expression(new Expression(6d), new Expression(3d), new DivideOperator());
        Expression expression = new Expression( right , left , new PlusOperator());

        assertEquals(8d, expression.evaluate());
    }
}

