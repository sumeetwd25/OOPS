import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1. Add new data\n2. Display data\n3. Calculate Percentage\n4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				PersonService.addNewData();
				break;
				
			case 2:
				PersonService.displayData();;
				break;
			
			case 3:
				int mks = PersonService.calcPercentage();
				if(mks!=-1) {
					System.out.println("%(m1,m2,m3) = "+mks);
				}
				else
					System.out.println("Not found");
				break;
			
			case 4:
				System.out.println("Thankyou for visiting!");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=5);
		sc.close();
	}

}
