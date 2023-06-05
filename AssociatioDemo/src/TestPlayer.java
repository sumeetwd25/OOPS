import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n1. Display teams\n2. Add new team\n3. Search team by captain\n4. Search player by skill\n5. Exit");
			System.out.print("Enter the choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				TeamService.displayTeams();
				break;
			case 2:
				TeamService.addNewTeam();
				break;
			case 3:
				TeamService.searchByCaptain();
				break;
			case 4:
				TeamService.searchBySkill();
				break;
			case 5:
				System.out.println("Thankyou for visiting!");
				return;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(choice!=5);
		sc.close();
	}

}
