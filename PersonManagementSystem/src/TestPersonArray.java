import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n1. Display all person\n2. Add a person\n3. Search person by id\n4. Search person by name\n5. Search person by birth month\n6. Exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				PersonService.displayPerson();
				break;
				
			case 2:
				PersonService.addPerson();;
				break;
			
			case 3:
				PersonService.searchById();
				break;
				
			case 4:
				PersonService.searchByName();
				break;
				
			case 5:
				PersonService.searchByMonth();
				break;
				
			case 6:
				sc.close();
				System.out.println("Thankyou for visiting!");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=6);
	}

}
