public class SquareArray{
 public static void main (String [] args){
  int [] arr = new int [10];
for(int a=0; a<10; a++){
  int x =a+1;
  arr[a]=x*x;
}
System.out.println("The array is : ");

for(int a=0; a<10; a++){
  System.out.print(arr[a]+" ");
}
}
}

