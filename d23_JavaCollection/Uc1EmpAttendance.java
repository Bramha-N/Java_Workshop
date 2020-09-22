public class Uc1EmpAttendance{

	public static final int fullTime=1;
	//public static final int partTime=2;
	//public static final int empRatePerHour=20;

	public static void main(String[] args) {
		
	//	int empHrs=0;
	//	int empWage=0;

		int random= (int)Math.floor(Math.random()*10)%2;
		if (random == fullTime)
			System.out.print("Employee is present.");
		//	empHrs=8;
		//else if (random == fullTime)
		//	empHrs=9;
		else
			System.out.print("Employee is absent.");
		//	empHrs=0;
		//	empWage = empHrs * empRatePerHour;
		//System.out.println("Employee wage : " +empWage);				
	}
}