class EmployeeWage {

   public static void employeeAttendance() {
      int isFullTime=1;
      int checkTime= (int)Math.floor(Math.random() * 10) % 2;
      if(checkTime == isFullTime) 
         System.out.println("Present");
      else
         System.out.println("Absent");
   }

   public static void main(String args[]) {
      System.out.println("Welcome to employee wage problem");
      employeeAttendance();
   }
}

