public class Morning1020 {
    // int[] intAry = {3,5,8,2,1} ascending order.
    static String name;

    String firstName;
    public void sum() {
        System.out.println("Sum" + this.firstName);
    }
    public static void main(String[] args) {
        name = "Hong";
        int[] intAry = {3,5,8,2,1};
        int temp = 0;
        int loopTimes = intAry.length - 1;
        for(int j=0; j<loopTimes; j++) 
            for(int i=0; i<loopTimes; i++) {
                if(intAry[i]>intAry[i+1]){
                    temp = intAry[i];
                    intAry[i] = intAry[i+1];
                    intAry[i+1] = temp;
                }
            }

        for(int j : intAry) {
            System.out.println(j);
        }
    }

}