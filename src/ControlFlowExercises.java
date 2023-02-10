public class ControlFlowExercises {

    public static void main(String[] args){

//        long i = 2;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
        for(int i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for(int z = 0; z <= 100; z+=2){
            System.out.println(z);
        }



//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);



        do {
            System.out.println(i);
            i *= i;
        } while (i < 1000000);

    }

}
