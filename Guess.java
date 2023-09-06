import java.util.Scanner;
import java.util.Random;
public class Guess {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num= r.nextInt(1,100);
       
        boolean tries= true;
        System.out.println("Enter the num : ");

        while (tries){
            int a =sc.nextInt();
              int x =num-a;
            if(a==num){
                System.out.println("Your guess is right : ");
                System.out.println("The number is : "+a);
                tries =false;
            }
          

            else if(x>0 && x<10) {
                System.out.println(" Enter high");

            }
            else if (x>0 && x>10){
                System.out.println(" Enter more higher");
            }
            else if (x<0 && x<(-10)){
                System.out.println(" Enter more lower");
            }
            else if (x<0 && x>(-10)){
                System.out.println(" Enter Low ");
            }
            
        }


    }
}
