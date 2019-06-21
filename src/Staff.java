public class Staff {
	
		private Person[] staffList;
		
		
		public Staff() {
		
			String firstName; 
			String lastName;
		
			staffList = new Person[1];
			
			staffList[0] = new PaidAdvisor(firstName, lastName);
			
		
	public void payday() {
		double amount; 
	
			
		System.out.print(staffList);
		
				amount =staffList.pay();
			
					System.out.println("Paid: " + amount);
				
				
		}
	}
	



