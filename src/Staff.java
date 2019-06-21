import java.util.Scanner;

public class Staff {
	
		private Person[] staffList;
		
		
		public Staff() {
		
			String firstName; 
			String lastName;
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("What is your first name?");
			 String Person.getFirstName() = scan.next();
			//add to super


			System.out.println("What is your last name?");
			lastName  = scan.next();
			//add to super
			
			staffList = new Person[1];
			
			staffList[0] = new PaidAdvisor(firstName, lastName);
			
		
	public void payday() {
		double amount; 
	
			
		System.out.print(staffList);
		
				amount =staffList.pay();
			
					System.out.println("Paid: " + amount);
				
				
		}
	}
	



