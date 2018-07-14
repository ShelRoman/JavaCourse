import org.junit.*;

import static org.junit.Assert.*;


public class EQSolverTest {
    @Test
    public void testSolveResult() {
        assertArrayEquals(new double[]{6.0, 2.0}, EQSolver.solveEQ(1, -8, 12), 0.05);

    }

    @Test
    public void testSolveNaN() {
        assertArrayEquals(new double[]{Double.NaN, Double.NaN}, EQSolver.solveEQ(5, 0, 30), 0.05);
    }

    @Test
    public void testSolveInfinity() {
        assertArrayEquals(new double[]{Double.POSITIVE_INFINITY, Double.NaN}, EQSolver.solveEQ(0, -8, 30), 0.05);
    }

}
