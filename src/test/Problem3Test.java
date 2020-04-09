import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.euler.Problem3;

public class Problem3Test {

    Problem3 problem3 = new Problem3();

    @Test
    void testIfPrime() {
        Assertions.assertTrue(problem3.isPrime(5));
        Assertions.assertTrue(problem3.isPrime(7));
        Assertions.assertTrue(problem3.isPrime(13));
        Assertions.assertTrue(problem3.isPrime(29));
        Assertions.assertFalse(problem3.isPrime(46));
        Assertions.assertFalse(problem3.isPrime(4));
    }

    @Test
    void testFindPrimeFactors() {
        Assertions.assertEquals(4, problem3.findPrimeFactors(13195 ).size());
        Assertions.assertTrue(problem3.findPrimeFactors(13195 ).contains(5));
        Assertions.assertTrue(problem3.findPrimeFactors(13195 ).contains(7));
        Assertions.assertTrue(problem3.findPrimeFactors(13195 ).contains(13));
        Assertions.assertTrue(problem3.findPrimeFactors(13195 ).contains(29));
    }

    @Test
    void testFindLargestPrimeFactor() {
        Assertions.assertEquals(29, problem3.findLargestPrimeFactor(13195));
        Assertions.assertNotEquals(13, problem3.findLargestPrimeFactor(13195));
    }

    @Test
    void logSolution() {
        System.out.println(problem3.findLargestPrimeFactor(600851475143L));
    }
}
