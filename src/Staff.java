import java.util.Scanner;

public class Staff {
	
		private Person [] staffList;
		
		
		public Staff() {
			

			Scanner scan = new Scanner(System.in);
			
			System.out.println("What is your first name?");
			String firstName = scan.next();
			//add to super


			System.out.println("What is your last name?");
			String lastName  = scan.next();
			//add to super
			
	
		
			staffList = new Person[1];
			
			staffList[0] = new PaidAdvisor();
		}
			
		
	public void payday() {
		float hoursSpecial;
		float hoursOvertime;
		float hoursReg = 0;
		float hours;
		
		Scanner scan = new Scanner(System.in);
		

		System.out.println("How many hours did you work this week?");
		hours = scan.nextFloat();
		
	

		System.out.println("How many special session hours did you work this week?");
		hoursSpecial = scan.nextFloat();

		if (hours - hoursSpecial <= 30) {
			hours = hoursReg;
		}

		if (hours - hoursSpecial > 30) {
			hoursOvertime = hours - hoursSpecial - 30;
			hoursReg = hours - hoursOvertime - hoursSpecial;
		}
		
		double amount; 
	
		for(int count=0;count<staffList.length; count++)
		{
			
		System.out.print(staffList[count]);
		
				amount =staffList[count].calculatePay();
			
					System.out.println("Paid: " + amount);
				
				
		}
	}}
	



