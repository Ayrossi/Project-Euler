import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.euler.Problem7;

public class Problem7Test {

    Problem7 problem7 = new Problem7();

    @Test
    void testIfPrime() {
        Assertions.assertTrue(problem7.isPrime(5));
        Assertions.assertFalse(problem7.isPrime(4));
        Assertions.assertTrue(problem7.isPrime(7));
        Assertions.assertTrue(problem7.isPrime(13));
        Assertions.assertTrue(problem7.isPrime(29));
        Assertions.assertFalse(problem7.isPrime(46));
    }

    @Test
    void testFindNthNumber() {
        Assertions.assertEquals(13, problem7.findNthPrimeNumber(6));
    }

    @Test
    void logSolution() {
        System.out.println(problem7.findNthPrimeNumber(10001));
    }
}
