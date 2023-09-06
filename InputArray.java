import java.util.Scanner;
import java.util.Random;

public class InputArray {
  public static void main (String [] args){
   Scanner sc = new Scanner (System.in);
   int x =1;
   while(x<=3){
   System.out.println("Enter the size of array : ");
  int size =sc.nextInt();
   if(size>0 && size <11){
      int [] arr = new int [size];
       for(int a=0; a<size; a++){
        arr[a]=a;
          }
     System.out.println("The array is : ");
            
       for(int a=0; a<size; a++){
       System.out.print(arr[a]+" ");
          }
   x=4;
}
else{
System.out.println("you Enter Wrong size : ");
System.out.println("Attempt Remain : "+(3-x));
x++;
}
}
if(x<3){
System.out.println("Attempt over : ");
}
}
}

       

  
