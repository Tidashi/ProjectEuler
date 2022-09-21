/*
Find the sum of all the primes below two million.
*/
import java.math.BigInteger;
import java.util.*;
public class ProjectEulerQ10 {
    public static void main(String[] args){
        BigInteger total =  new BigInteger("0");
        List<Integer> listofprimes = sieveOfEratosthenes(2000000);
        BigInteger sum = new BigInteger("0");
        for(int i = 0; i < listofprimes.size(); i++) {
            sum = sum.add(BigInteger.valueOf(listofprimes.get(i).intValue()));
        }
        System.out.println(sum);


    }
    public static List<Integer> sieveOfEratosthenes(int n)
    {
        List<Integer> primenumbers = new ArrayList<>();
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true){
                primenumbers.add(i);
            }

        }
        return primenumbers;
    }

}
