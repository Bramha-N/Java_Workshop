public class Uc4EmpWage{

	public static final int fullTime=1;
	public static final int partTime=2;
	public static final int empRatePerHour=20;

	public static void main(String[] args) {
		
		int empHrs=0;
		int empWage=0;
		int random= (int)Math.floor(Math.random()*10)%3;
		System.out.println(random);

		switch (random){
			case partTime:
				 empHrs=8;
				 System.out.println("Employee is present for partTime");
				break;
			case fullTime:
				 empHrs=9;
				 System.out.println("Employee is present for fullTime");
				break;	 
			default:
				System.out.println("Absent");
				empHrs=0;		 
		}
		empWage = empHrs * empRatePerHour;
		System.out.println("Employee wage : " +empWage);				
	}
}