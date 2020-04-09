import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.euler.Problem1;

class Problem1Test {

    Problem1 firstProblem = new Problem1();

    @Test
    void simpleCase() {
        int n = 10;
        long result = firstProblem.findMultiplesOfThreeOrFiveUntil(n);
        Assertions.assertEquals(23, result);
    }

    @Test
    void logSolution(){
        System.out.println(firstProblem.findMultiplesOfThreeOrFiveUntil(1000));
    }

}
