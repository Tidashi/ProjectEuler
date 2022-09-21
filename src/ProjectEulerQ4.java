import java.sql.SQLOutput;
import java.util.Scanner;

public class ProjectEulerQ4 {
    public static void main(String[] args) {
        int num=0;
        int largest = 0;
        int a = 999;
        int b = 999;
        for (int i = 999; i > 100; i--) {
            for (int p = 999; p > 100; p--) {
                num = i *p;
                //System.out.println("checking if " + num);

                if(isPalindrome(Integer.toString(num))){
                    if(largest < num){
                        largest = num;

                    }


                }





            }


        }
        System.out.println(largest);




    }
    public static boolean isPalindrome(String a) {

            int l = a.length()-1;
            for(int g = 0; g < a.length(); g++){


                if(a.charAt(g) != a.charAt(l)){


                    return false;
                }
                l--;
            }

        return true;
    }


    }
