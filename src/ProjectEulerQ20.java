import java.math.BigInteger;

//need to change total to big integer prolly
import java.math.BigInteger;
public class ProjectEulerQ20 {
    public static void main(String[]args){
        BigInteger total = BigInteger.valueOf(1);
        for(int i = 1; i < 100; i++){
            total = total.multiply(BigInteger.valueOf(i));
        }
        System.out.println(add(total));
    }
    static BigInteger add(BigInteger a) {
        BigInteger count = BigInteger.valueOf(0);
         BigInteger digit = BigInteger.valueOf(0);

        while (a.signum()==1) {
            digit = a.remainder(BigInteger.valueOf(10));
            count = count.add(digit);
             a= a.divide(BigInteger.valueOf(10));



        }
        return count;
    }

}
