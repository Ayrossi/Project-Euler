package project.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

    public boolean isPrime(long number) {
        for(int i = 2; i < number; i++) {
            if(number%i == 0) return false;
        }
        return true;
    }

    public long findNthPrimeNumber(int nthNumber) {
        List<Long> primes = new ArrayList<>();
        for(long i = 2; primes.size() != nthNumber ; i++) {
            if(isPrime(i)) primes.add(i);
        }
        return primes.get(primes.size() - 1);
    }
}
