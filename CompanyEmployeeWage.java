public class CompanyEmployeeWage {

	private final String companyName;
	private final int wagePerHour;
	private final int fullTimeHour;
	private final int partTimeHour;
	private final int workingHourPerMonth;
	private int totalEmpWage;

	public CompanyEmployeeWage(String companyName, int wagePerHour, int fullTimeHour, int partTimeHour, int workingHourPerMonth) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.fullTimeHour = fullTimeHour;
		this.partTimeHour = partTimeHour;
		this.workingHourPerMonth = workingHourPerMonth;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public int getWagePerHour() {
		return this.wagePerHour;
	}

	public int getFullTimeHour() {
		return this.fullTimeHour;
	}

	public int getPartTimeHour() {
		return this.partTimeHour;
	}

	public int getWorkingHourPerMonth() {
		return workingHourPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+companyName+"is: "+totalEmpWage;
	}

}
