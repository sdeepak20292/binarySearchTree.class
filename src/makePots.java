public class makePots {

    public static int numberPots(int reqR, int reqB, int reqC, int avR, int avB, int avC, int PR, int PB
    , int PC, int rupees){
        int numberofPots = 0;

        while(rupees >= 0){

            if(avR < reqR){
                rupees = rupees - reqR*PR;
                avR += reqR;
            }

            if(avB < reqB){
                rupees = rupees - reqB*PB;
                avB += reqB;
            }

            if(avC < reqC) {
                rupees = rupees - reqC*PC;
                avC += reqC;
            }

            if(rupees < 0){
                break;
            }

            avR -= reqR;
            avB -= reqB;
            avC -= reqC;
            numberofPots += 1;
        }
        return numberofPots;
    }

    public static void main (String[] args) {
        System.out.println(numberPots(2, 0, 1, 1, 10 ,1 , 1, 10, 1, 21));
    }
}
