public class ProjectEulerQ7 {
    public static void main(String[] args){
        int cap = 10001;
        int initial = 0;
        int start = 2;
        while(initial < cap){
            if(isPrime(start)){
                initial++;

                //  System.out.println(initial);
            }
            if(initial == 10001){
                break;
            }
            ++start;


        }
        System.out.println(start);

    }
    public static boolean isPrime(int a){
        for(int j = 2; j < a; j++){
            if(a%j == 0){
                //  System.out.println(a + " is not prime not counting");
                return false;
            }

        }
        // System.out.println(a + " is prime adding to initial");
        return true;


    }
}
