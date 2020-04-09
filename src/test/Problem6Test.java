import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.euler.Problem6;

public class Problem6Test {

    Problem6 problem6 = new Problem6();

    @Test
    void testSumOfSquares() {
        Assertions.assertEquals(385, problem6.sumOfSquaresUntil(10));
    }

    @Test
    void testSquareOfSum() {
        Assertions.assertEquals(3025, problem6.squareOfSumUntil(10));
    }

    @Test
    void logSolution() {
        System.out.println(problem6.sumSquareDifference(100));
    }
}
