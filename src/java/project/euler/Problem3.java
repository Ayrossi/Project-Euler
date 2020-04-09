package project.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {


    /**
     *
     * @param  number The number which may be prime
     * @return true if number is prime, false otherwise
     */
    public boolean isPrime(long number) {
        for(int i = 2; i < number; i++) {
            if(number%i == 0) return false;
        }
        return true;
    }

    /**
     *
     * @param number The number for which we want
     *               to calculate the prime factors
     * @return Returns a list that contains the prime factors
     *         for the given number
     */
    public List<Integer> findPrimeFactors(long number) {
        List<Integer> primeFactors = new ArrayList<>();
        for(long i = 2; number > 2; i++) {
            if(isPrime(i) && number%i == 0) {
                number = number/i;
                primeFactors.add((int) i);
            }
        }
        return primeFactors;
    }

    /**
     *
     * @param number
     * @return Returns the largest prime factor
     *         of the given number
     */
    public int findLargestPrimeFactor(long number) {
        return findPrimeFactors(number).stream().mapToInt(x -> x).max().getAsInt();
    }
}
