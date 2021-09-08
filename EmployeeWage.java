
class EmployeeWage {

	public static int employeeWage(int hour) {
		int wagePerHour=20;
		return wagePerHour * hour;
	}

   public static void employeeAttendance() {
		int totalWage=0, totalHour=0;
		int day=1;
		while(day<=20 && totalHour<100) {
			day++;
			final int FULL_TIME=1;
      	final int PART_TIME=2;
			int hour=0;
			int checkTime= (int)Math.floor(Math.random() * 10) % 3;
			switch(checkTime) {
         case FULL_TIME:
            hour = 8;
            break;
         case PART_TIME:
            hour = 4;
            break;
         default:
            hour=0;
      	}
      	int wage = employeeWage(hour);
			totalWage += wage;
			totalHour += hour;
		}
      System.out.println("Employee wage: "+totalWage);
		System.out.println("Total hour: "+totalHour);
   }

   public static void main(String args[]) {
      System.out.println("Welcome to employee wage problem");
      employeeAttendance();
   }

}

