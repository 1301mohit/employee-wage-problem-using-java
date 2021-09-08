public interface IEmployeeWage {

   public void addCompanyEmployeeWage(String company, int wagePerHour, int fullTimeHour, int partTimeHour, int workingHourPerMonth);
   public void computeEmployeeWage();
	public String getTotalWage(String companyName);

}
