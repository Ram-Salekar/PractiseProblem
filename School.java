public abstract class School {
   private String SName;
   private final String SchoolName ="Ragiv gandhi E-learning ";
   private final  int TotalAttendace =365;
   private int SAttendance;
   private int rollNo;
   private char div;
   private int obtainMarks;
   private final int totalMarks =500;

  public void setSName(String sName) {
      SName = sName;
  }
  public void setObtainMarks(int obtainMarks) {
      this.obtainMarks = obtainMarks;
  }
  public void setSAttendance(int sAttendance) {
      SAttendance = sAttendance;
  }
  public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
  }


   public void setDiv(char div) {
       this.div = div;
   }
   public int getObtainMarks() {
       return obtainMarks;
   }
   public String getSName() {
       return SName;
   }
   public int getSAttendance() {
       return SAttendance;
   }
   public char getDiv() {
       return div;
   }
   public int getRollNo() {
       return rollNo;
   }
   public String getSchoolName() {
       return SchoolName;
   }
   public double AvgAttendance(){
   
    double avg =((this.SAttendance*100)/this.TotalAttendace);
    return avg;
   }
   public double percentage (){
    double avg =((this.obtainMarks*100)/this.totalMarks);
    return avg;
   }


}
