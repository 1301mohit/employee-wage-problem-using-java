
class EmployeeWage {

	public static int employeeWage(int hour) {
		int wagePerHour=20;
		return wagePerHour * hour;
	}

   public static void employeeAttendance() {
      int fullTime=1;
		int partTime=2;
		int hour=0;
      int checkTime= (int)Math.floor(Math.random() * 10) % 3;
      if(checkTime == fullTime)
			hour = 8;
		else if(checkTime == partTime)
			hour = 4;
      else
         System.out.println("Absent");
		int wage = employeeWage(hour);
      System.out.println("Employee wage: "+wage);
   }

   public static void main(String args[]) {
      System.out.println("Welcome to employee wage problem");
      employeeAttendance();
   }

}

