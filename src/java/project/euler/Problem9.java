package project.euler;

public class Problem9 {

    public int productOfTriplet() {
        for(int i = 1; i < 1000; i++) {
            for(int j = 1; j < 1000; j++) {
                for(int k = 1; k < 1000; k++) {
                    if(Math.pow(i, 2) + Math.pow(j, 2)  == Math.pow(k, 2))
                        if(i + j + k == 1000)
                            return i*j*k;
                }
            }
        }
        return 1;
    }
}
