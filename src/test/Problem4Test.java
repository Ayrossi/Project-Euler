import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import project.euler.Problem4;

import java.util.List;

public class Problem4Test {

    Problem4 problem4 = new Problem4();

    @Test
    void testGetDigits() {
        List<Integer> digits = problem4.getDigitsOfNumber(1234);
        Assertions.assertEquals(1, digits.get(0));
        Assertions.assertEquals(2, digits.get(1));
        Assertions.assertEquals(3, digits.get(2));
        Assertions.assertEquals(4, digits.get(3));
    }

    @Test
    void isNumberPalindrome() {
        Assertions.assertFalse(problem4.isNumberPalindrome(1234));
        Assertions.assertTrue(problem4.isNumberPalindrome(9009));
    }

    @Test
    void findMaxPalindromeNumber() {
        Assertions.assertEquals(9009, problem4.findMaximumPalindromeNumberMadeOfProductsWithTwoDigits());
    }

    @Test
    void logSolution() {
        System.out.println(problem4.findMaximumPalindromeNumberMadeOfProductsWithThreeDigits());
    }
}
