import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.euler.Problem2;

class Problem2Test {

    Problem2 problem2 = new Problem2();

    @Test
    void calculateNthFibonnaciNumberSimpleCase() {

        Assertions.assertEquals(8, problem2.calculateNthFibonnaciNumber(5));
        Assertions.assertEquals(34, problem2.calculateNthFibonnaciNumber(8));
    }

    @Test
    void calculateSum() {
        Assertions.assertEquals(44, problem2.calculateSumOfEvenFibonnaciNumberUntil(10));
    }

    @Test
    void logSolution() {
        int fibonnaci = 0;
        int i = 1;
        while(true) {

            if(problem2.calculateNthFibonnaciNumber(i) > 4_000_000)
                break;
            fibonnaci += problem2.calculateNthFibonnaciNumber(i);
            i++;
        }
        System.out.println(problem2.calculateSumOfEvenFibonnaciNumberUntil(i));

    }
}
