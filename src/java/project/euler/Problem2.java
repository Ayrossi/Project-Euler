package project.euler;

public class Problem2 {

    public int calculateNthFibonnaciNumber(int index) {
        if(index == 1)
            return 1;
        if(index == 2)
            return 2;
        return calculateNthFibonnaciNumber(index - 1) + calculateNthFibonnaciNumber(index - 2);
    }

    public int calculateSumOfEvenFibonnaciNumberUntil(int maximum) {
        int sum = 0;
        for(int i = 1; i < maximum; i++ ) {
            int fibonnaci = calculateNthFibonnaciNumber(i);
            if(fibonnaci%2 == 0) {
                sum += fibonnaci;
            }
        }
        return sum;
    }

}
