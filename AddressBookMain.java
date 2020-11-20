import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("Enter First Name:");
		p1.firstname = sc.nextLine();
		System.out.println("Enter the last name: ");
		p1.lastname = sc.nextLine();
		System.out.println("Enter the address");
		p1.address = sc.nextLine();
		System.out.println("Enter the City: ");
		p1.city = sc.nextLine();
		System.out.println("Enter the State: ");
		p1.state = sc.nextLine();
		System.out.println("Enter the zip: ");
		p1.zip = sc.nextInt();
		System.out.println("Enter the mob.no: ");
		p1.phoneno = sc.nextInt();
		System.out.println("Enter the email: ");
		p1.email = sc.next();
		System.out.println("Thank You");
		AddressBook abook1 = new AddressBook();
		abook1.addPerson(p1);


	}

}

 class Person{
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zip;
	int phoneno;
	String email;	
}
 
 class AddressBook{
	 ArrayList<Person> contactDetails = new ArrayList<Person>();
	 
	 public void addPerson(Person pobj) {
		 contactDetails.add(pobj);
	 }
	 
	 public ArrayList<Person> viewAllPerson(){
		 return contactDetails;
	 }
 }
