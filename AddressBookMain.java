import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		AddressBook abook1 = new AddressBook();
		for(int i=0;i<2;i++)
		{
		Person p1 = new Person();
		System.out.println("Enter First Name:");
		p1.firstname = sc.next();
		
		System.out.println("Enter the last name: ");
		p1.lastname = sc.next();
		System.out.println("Enter the address");
		p1.address = sc.next();
		System.out.println("Enter the City: ");
		p1.city = sc.next();
		System.out.println("Enter the State: ");
		p1.state = sc.next();
		System.out.println("Enter the zip: ");
		p1.zip = sc.nextInt();
		System.out.println("Enter the mob.no: ");
		
		p1.phoneno = sc.nextInt();
		System.out.println("Enter the email: ");
		p1.email = sc.next();
		
		System.out.println("Thank You");
		
		abook1.addPerson(p1);
		}
		for(int i=0;i<2;i++)
		{
		System.out.println(abook1.viewAllPerson().get(i).firstname);
		}
		System.out.println("Choose 1.Edit\n 2.Delete");
		int option = sc.nextInt();
		System.out.println("Enter fname");
		String nameofperson = sc.next();
		switch (option) {
		case 1: 
			
			
			for(int i=0;i<abook1.viewAllPerson().size();i++)
			{
				if(nameofperson.equalsIgnoreCase(abook1.viewAllPerson().get(i).firstname))
				{
					System.out.println("Which detail you want to change\n 1.First Name\n 2.Last Name\n"
							+ "3.Address\n 4. City\n 5.State \n 6. zip \n 7. phone no\n 8.email");
					int choose = sc.nextInt();
					switch(choose) {
					case 1:
						System.out.println("New First Name:");
						abook1.viewAllPerson().get(i).firstname = sc.next();
						break;
					case 2:
						System.out.println("New Last Name:");
						abook1.viewAllPerson().get(i).lastname = sc.next();
						break;
					case 3:
						System.out.println("New Address:");
						abook1.viewAllPerson().get(i).address = sc.next();
						break;
					case 4:
						System.out.println("New City:");
						abook1.viewAllPerson().get(i).city = sc.next();
						break;
					case 5:
						System.out.println("New State:");
						abook1.viewAllPerson().get(i).state = sc.next();
						break;
					case 6:
						System.out.println("New zip:");
						abook1.viewAllPerson().get(i).zip = sc.nextInt();
						break;
					case 7:
						System.out.println("New phone no:");
						abook1.viewAllPerson().get(i).phoneno = sc.nextInt();
						break;
					case 8:
						System.out.println("New Email:");
						abook1.viewAllPerson().get(i).email = sc.next();
						break;
					}
				}
			}
			break;
			case 2 :
				for(int i=0;i<abook1.viewAllPerson().size();i++)
				{
					if(nameofperson.equalsIgnoreCase(abook1.viewAllPerson().get(i).firstname))
					{
						abook1.viewAllPerson().remove(i);
					}
				}
				break;
		}
		for(int i=0;i<abook1.viewAllPerson().size();i++)
		{
			System.out.println(abook1.viewAllPerson().get(i).firstname);
		}
		
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
