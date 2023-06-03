import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class PersonService {
	private static Person[] perarr;
	private static int cnt;
	
	static Scanner sc = new Scanner(System.in);
	
//	Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(bdate1);
	
	static {
		
		String bdate1="12/12/1999";
		String bdate2="1/10/1998";
		String bdate3="18/7/1997";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1=null;
		Date dt2=null;
		Date dt3=null;
		try {
			dt1 = sdf.parse(bdate1);
			dt2 = sdf.parse(bdate2);
			dt3 = sdf.parse(bdate3);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		perarr = new Person[50];
		perarr[0] = new Person(112,"John Wick","1234567890",dt1);
		perarr[1] = new Person(321,"Elon Musk","7534087698",dt2);
		perarr[2] = new Person(983,"Tim Cook","4583456734",dt3);
		cnt=3;
	}
	
	public static void displayPerson() {
		for(int i=0;i<cnt;i++) {
			System.out.println(perarr[i]);
		}
	}
	
	public static void addPerson() {
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		name = sc.nextLine();
		System.out.print("Enter mobile no: ");
		String mob = sc.next();
		System.out.print("Enter birthdate: ");
		String bdt = sc.next();
		Date jdt = null;						//to convert date from string format to java format
		try {
			jdt = new SimpleDateFormat("dd/MM/yyyy").parse(bdt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		perarr[cnt] = new Person(id,name,mob,jdt);
		cnt++;
	}
	
	public static void searchById() {
		System.out.print("\nEnter id: ");
		int id = sc.nextInt();
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPid()==id) {
				System.out.println(perarr[i]);
				return;
			}
		}
		System.out.println("Not found");
	}
	
	public static void searchByName() {
		System.out.print("\nEnter name: ");
		String name = sc.next();
		for(int i=0;i<cnt;i++) {
			if(perarr[i].getPname().equals(name)) {
				System.out.println(perarr[i]);
				return;
			}
		}
		System.out.println("Not found");
	}
	
	public static void searchByMonth() {
		System.out.print("\nEnter month: ");
		int month = sc.nextInt();
		for(int i=0;i<cnt;i++){
			Calendar c = Calendar.getInstance();
			c.setTime(perarr[i].getBdate());
			
			if((c.get(Calendar.MONTH)+1)==month) {			//Calender.MONTH starts with 0 for Jan. So +1
				System.out.println(perarr[i]);
				return;
			}
		}
		System.out.println("Not found");
	}
}
