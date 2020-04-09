package project.euler;

public class Problem5 {

    public int getSmallestNumber(){
        int i = 20;
        while(true) {
            for(int j = 1; j <= 20; j++) {
                if(i%j != 0) {
                    break;
                }
                if(j == 20) {
                    return i;
                }
            }
            i++;
        }
    }
}
