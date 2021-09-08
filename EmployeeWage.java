
class EmployeeWage {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

   public static void employeeAttendance(String companyName, int wagePerHour, int fullTimeHour, int partTimeHour) {
		int totalWage=0, totalHour=0;
		int day=1;
		while(day<=20 && totalHour<100) {
			day++;
			int hour=0;
			int checkTime= (int)Math.floor(Math.random() * 10) % 3;
			switch(checkTime) {
         case FULL_TIME:
            hour = fullTimeHour;
            break;
         case PART_TIME:
            hour = partTimeHour;
            break;
         default:
            hour=0;
      	}
      	int wage = wagePerHour * hour;
			totalWage += wage;
			totalHour += hour;
		}
		System.out.println("Company name: "+companyName);
      System.out.println("Employee wage: "+totalWage);
		System.out.println("Total hour: "+totalHour);
   }

   public static void main(String args[]) {
		employeeAttendance("Google", 20, 8, 4);
		employeeAttendance("Microsoft", 25, 9, 5);
      System.out.println("Welcome to employee wage problem");
   }

}

