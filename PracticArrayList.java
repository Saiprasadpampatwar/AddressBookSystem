import java.util.ArrayList;
import java.util.Scanner;

public class PracticArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Person1> list = new ArrayList<Person1>();
		for(int i =0;i<2;i++)
		{
		Person1 person2 = new Person1();
		person2.name = sc.next();
		list.add(person2);
		}
		for(int i =0;i<2;i++)
		{
		System.out.println((list.get(i)).name);
		}

	}

}
class Person1{
	String name;
	String lastname;
	
	
	String getname() {
		return this.name;
	}
}
