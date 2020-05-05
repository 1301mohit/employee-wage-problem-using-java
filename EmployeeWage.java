
class EmployeeWage {

	public static int employeeWage() {
		int wagePerHour=20;
      int fullDayHour=8;
		return wagePerHour * fullDayHour;
	}

   public static void employeeAttendance() {
      int isFullTime=1;
      int checkTime= (int)Math.floor(Math.random() * 10) % 2;
      if(checkTime == isFullTime) {
         int wage = employeeWage();
			System.out.println("Employee wage: "+wage);
		}
      else
         System.out.println("Absent");
   }

   public static void main(String args[]) {
      System.out.println("Welcome to employee wage problem");
      employeeAttendance();
   }
}

