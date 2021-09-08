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
			System.out.println("List of wage and total wage of company "+companyEmployeeWageArray.get(i).getCompanyName());
			System.out.println(companyEmployeeWageArray.get(i).getListOfWage());
			System.out.println("Total employee wage for company "+companyEmployeeWageArray.get(i).getCompanyName() + " is " + totalEmployeeWage+"\n");
		}
	}

	public String getTotalWage(String companyName) {
		for(int i=0; i<companyEmployeeWageArray.size(); i++) {
			if(companyEmployeeWageArray.get(i).getCompanyName().equals(companyName))
				return "Total employee wage for company "+ companyEmployeeWageArray.get(i).getCompanyName() + " is " + companyEmployeeWageArray.get(i).getTotalEmpWage();
		}
		return "Company not found";
	}

	public static int calculateTotalWage(CompanyEmployeeWage companyEmployeeWage) {
      int totalWage=0, totalHour=0, day=1;
		List<Integer> employeeWageArray = new ArrayList<Integer>();
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
			employeeWageArray.add(wage);
         totalWage += wage;
         totalHour += hour;
      }
		companyEmployeeWage.setTotalEmpWage(totalWage);
		employeeWageArray.add(totalWage);
		companyEmployeeWage.setListOfWage(employeeWageArray);
		return totalWage;
   }

   public static void main(String args[]) {
		System.out.println("Welcome to employee wage problem\n");
		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addCompanyEmployeeWage("Dmart", 10, 8, 4, 100);
		employeeWage.addCompanyEmployeeWage("Smart", 11, 9, 5, 110);
		employeeWage.computeEmployeeWage();
		System.out.println(employeeWage.getTotalWage("Dmart"));
   }

}

