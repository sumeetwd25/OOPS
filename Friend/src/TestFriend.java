import java.util.Scanner;

public class TestFriend {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do{
		System.out.println("1.ADD\n2.display\n3.searchByCity\n4.searchByName\n5.exit");
		choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			FriendsService.insertData();
			break;
		case 2:
			FriendsService.display();
			break;
		case 3:
			System.out.println("Enter City name");
			String city=sc.next();
			Friend fri=FriendsService.searchByCity(city);
			if(fri!=null)
			{
				System.out.println("Friend : "+fri);
			}
			else
				System.out.println("not fount");
			break;
		case 4:
			System.out.println("Enter Name");
			String name =sc.next();
			String mob=FriendsService.searchByName(name);
			if(mob!=null)
			{
				System.out.println("mob : "+mob);
			}
			else
				System.out.println("not fount");
			break;

		default:
			sc.close();
			break;
		}
		}while(choice!=5);
		

	}

}
