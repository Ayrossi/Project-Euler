package project.euler;

import java.util.*;
import java.util.stream.Collectors;

public class Problem4 {

    public boolean isNumberPalindrome(int number) {
        List<Integer> digits = getDigitsOfNumber(number);
        List<Integer>  reversedDigits = new ArrayList<>(digits);
        Collections.reverse(reversedDigits);
        return (digits).equals(reversedDigits);
    }

    /**
     *
     * @param number
     * @return Returns the given number divided
     *         into a list containing its digits
     */
    public List<Integer> getDigitsOfNumber(int number) {
        List<Integer> digits = new ArrayList<>();
        while(number > 0) {
            digits.add(number%10);
            number /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public int findMaximumPalindromeNumberMadeOfProductsWithTwoDigits() {
        int maximum = 0;
        for(int i = 10; i <= 99; i++) {
            for(int j = 10; j <= 99; j++) {
                if(isNumberPalindrome(i*j) && (i*j) > maximum) {
                    maximum = i*j;
                }
            }
        }
        return maximum;
    }

    public int findMaximumPalindromeNumberMadeOfProductsWithThreeDigits() {
        int maximum = 0;
        for(int i = 100; i <= 999; i++) {
            for(int j = 100; j <= 999; j++) {
                if(isNumberPalindrome(i*j) && (i*j) > maximum) {
                    maximum = i*j;
                }
            }
        }
        return maximum;
    }
}
