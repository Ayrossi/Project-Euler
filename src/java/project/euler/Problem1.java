package project.euler;

public class Problem1 {

    /**
     *
     * @param  maximum The given upper limit
     * @return Returns all multiples of three OR five until
     *         a given maximum number.
     */
    public long findMultiplesOfThreeOrFiveUntil(int maximum) {
        long sum = 0;
        for(int i = 1 ; i < maximum ; i++) {
            if(i%3 == 0) {
                sum += i;
                continue; //prevent adding twice for numbers like 15
            }
            if(i%5 == 0)
                sum += i;
        }
        return sum;
    }
}
