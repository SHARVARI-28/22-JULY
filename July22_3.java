/*
Create a Collection “ContactList” using HashMap to store name and phone number 
of contacts added. The program should use appropriate generics (String, Integer) 
and have the following abilities:
a) Check if a particular key exists or not 
b) Check if a particular value exists or not 
c) Use Iterator to loop through the map key set
 */


public class July22_3 {

	public static void main(String[] args) {
		Map<Integer,String>ContactList=new HashMap<>();
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Bob Biswas", 98310983);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Alice", 98765432);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}