import java.util.Scanner;

public class PersonService {
	private static Person[] perarr;
	private static int cnt;
	static {
		perarr = new Person[10];
		cnt=0;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void addNewData() {

		System.out.print("\nEnter name: ");
		String pname = sc.next();
		System.out.print("Enter mobile number: ");
		String pmob = sc.next();
		System.out.print("Enter m1: ");
		int m1 = sc.nextInt();
		System.out.print("Enter m2: ");
		int m2 = sc.nextInt();
		System.out.print("Enter m3: ");
		int m3 = sc.nextInt();
		
		int ch=0;
		do {
			System.out.println("1. Master student 2. PHD student 3.Exit");
			System.out.print("Select choice: ");
			ch = sc.nextInt();
			if(ch==1) {
				System.out.print("Enter m4: ");
				int m4 = sc.nextInt();
				System.out.print("Enter m5: ");
				int m5 = sc.nextInt();
				System.out.print("Enter sp. subject mks: ");
				int sp_sub_mk = sc.nextInt();
				perarr[cnt] = new MasterStudent("sm",pname,pmob,m1,m2,m3,m4,m5,sp_sub_mk);
				cnt++;
				return;
			}
			if(ch==2) {
				System.out.print("Enter thesis: ");
				String thesis = sc.next();
				System.out.print("Enter sp. course mks: ");
				int sp_course_mk = sc.nextInt();
				perarr[cnt] = new PHDStudent("sp",pname,pmob,m1,m2,m3,thesis,sp_course_mk);
				cnt++;
				return;
			}
			if(ch==3) {
				break;
			}
			else {
				System.out.println("invalid choice");
			}
		}while(ch!=3);
		
		perarr[cnt] = new Student("s",pname,pmob,m1,m2,m3);
		cnt++;
	}
	
	public static void displayData() {
		for(int i=0;i<cnt;i++) {
			System.out.println(perarr[i]);
		}
	}
	
	public static int calcPercentage() {
		System.out.print("\nEnter id: ");
		String id = sc.next();
		Student obj = searchById(id);
		if(obj!=null) {
			return obj.calcGrade();
		}
		return -1;
	}
	
	public static Student searchById(String id) {
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPid().equals(id)) {
				if(perarr[i] instanceof Student) {
					return (Student) perarr[i];
				}
			}
		}
		return null;
	}
}
