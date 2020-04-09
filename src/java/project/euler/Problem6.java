package project.euler;

public class Problem6 {

    public long sumOfSquaresUntil(int number) {
        long squaredSum = 0;
        for(int i = 1; i <= number; i++) {
            squaredSum += Math.pow(i, 2);
        }
        return squaredSum;
    }

    public long squareOfSumUntil(int number) {
        long sum = (number*(number +1))/2;
        return (long) Math.pow(sum, 2);
    }

    public long sumSquareDifference(int number) {
        return Math.abs(squareOfSumUntil(number) - sumOfSquaresUntil(number));
    }
}
