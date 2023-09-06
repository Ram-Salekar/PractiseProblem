import java.util.Scanner;
public class Student extends School {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        String x = sc.next();
        char div =x.charAt(0);
        s1.setDiv(div);
        s1.setObtainMarks(400);
        s1.setRollNo(1);
        s1.setSAttendance(212);
        s1.setSName("Rock");
        System.out.println("Details are follw : ");
        System.out.println(s1.getSchoolName());
        System.out.println(s1.getSName());
        System.out.println(s1.getDiv());
        System.out.println(s1.getRollNo());
        System.out.println(s1.AvgAttendance());
        System.out.println(s1.percentage());



    }
    
}
