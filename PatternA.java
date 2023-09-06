public class PatternA {
    public static void main(String[] args) {
       
        for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || a==3 || b==1 || b==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Pattern B : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || a==3 || b==1 || b==5 || a==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

        System.out.println("Pattern c : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || b==1 || a==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

        System.out.println("Pattern D : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || b==1 || ((6)==(a+b))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

        System.out.println("Pattern E : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(b==1 || a==3 || a==5 || a==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

        System.out.println("Pattern F : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1 || a==3 || b==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         System.out.println();

        System.out.println("Pattern G : ");
        System.out.println();
         for(int a=1; a<=5; a++){
            for(int b=1; b<=5; b++){
                if(a==1  || b==1 || a==5|| (((3)<a) && ((3)<=b)  )) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
