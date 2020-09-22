public class Uc5EmpWage{

	public static final int fullTime=1;	
	public static final int partTime=2;
	public static final int empRatePerHour=20;
	public static final int workingDays=20;

	public static void main(String[] args) 
	{
		
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		//int totalEmphrs=0;

		for(int day =0; day <= workingDays; day++) //&& for(int hrs =0; hrs <= 100; hrs++);
		{	

		 int random= (int)Math.floor(Math.random()*10)%3;
		 System.out.println(random);

		 switch (random)
		 {
			case partTime:
				 empHrs=4;
				 System.out.println("Employee is present for partTime");
				break;
			case fullTime:
				 empHrs=8;
				 System.out.println("Employee is present for fullTime");
				break;	 
			default:
				System.out.println("Absent");
				empHrs=0;		 
		 }
			empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Employee wage : " +empWage);

			//totalEmphrs += empHrs;
			//System.out.println("Total Hours : " +totalEmphrs);				
	    }
	    	System.out.println("Total Employee wage : " +totalEmpWage);
	}    	
}