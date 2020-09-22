package test;
import java.util.Scanner;

class File{
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNumber;
	
	public File(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
	
}
}
public class AddressBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many entries do you wants to add ?");
		int entries;
		
		for (int i=0;i<sc.nextInt();i++) {
		
		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();
		
		
		System.out.println("Enter last name : ");
		String lastName = sc.nextLine();
		
		System.out.println("Enter address : ");
		String address = sc.nextLine();
		
		System.out.println("Enter city : ");
		String city = sc.nextLine();
		
		System.out.println("Enter state : ");
		String state = sc.nextLine();
		
		System.out.println("Enter zip code : ");
		int zip = sc.nextInt();
		
		System.out.println("Enter phone number : ");
		int phoneNumber = sc.nextInt();
		
		System.out.println("First name : " +firstName);
		System.out.println("Last name : " +lastName);
		System.out.println("Address : " +address);
		System.out.println("City : " +city);
		System.out.println("State : " +state);
		System.out.println("Zip code : " +zip);
		System.out.println("Phone number : " +phoneNumber);
		
		
	
	}

}
