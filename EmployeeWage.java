import java.util.List;
import java.util.ArrayList;

class EmployeeWage implements IEmployeeWage{

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	private List<CompanyEmployeeWage> companyEmployeeWageArray;

	public EmployeeWage() {
		companyEmployeeWageArray = new ArrayList<CompanyEmployeeWage>();
	}

	public void addCompanyEmployeeWage(String company, int wagePerHour, int fullTimeHour, int partTimeHour, int workingHourPerMonth) {
		companyEmployeeWageArray.add(new CompanyEmployeeWage(company, wagePerHour, fullTimeHour, partTimeHour, workingHourPerMonth));
	}

	public void computeEmployeeWage() {
		for(int i=0; i<companyEmployeeWageArray.size(); i++) {
			int totalEmployeeWage = this.calculateTotalWage(companyEmployeeWageArray.get(i));
			System.out.println("Total employee wage for company "+companyEmployeeWageArray.get(i).getCompanyName() + " is " + totalEmployeeWage);
		}
	}

	public static int calculateTotalWage(CompanyEmployeeWage companyEmployeeWage) {
      int totalWage=0, totalHour=0;
      int day=1;
      while(day <= 20 && totalHour < companyEmployeeWage.getWorkingHourPerMonth()) { 
         day++;
         int hour=0;
         int checkTime= (int)Math.floor(Math.random() * 10) % 3;
         switch(checkTime) {
         	case FULL_TIME:
            	hour = companyEmployeeWage.getFullTimeHour();
            	break;
         	case PART_TIME:
            	hour = companyEmployeeWage.getPartTimeHour();
            	break;
         	default:
            	hour=0;
         }
         int wage = companyEmployeeWage.getWagePerHour() * hour;
         totalWage += wage;
         totalHour += hour;
      }
		return totalWage;
   }

   public static void main(String args[]) {
		System.out.println("Welcome to employee wage problem");
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompanyEmployeeWage("Dmart", 10, 8, 4, 100);
		employeeWage.addCompanyEmployeeWage("Smart", 11, 9, 5, 110);
		employeeWage.computeEmployeeWage();
   }

}

