import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FriendsService {

	private static Friend [] arr;
	private static int cnt=0;
	static {
		arr=new Friend[10];
		String dbt1="21/12/1999";
		String dbt2="1/9/1999";
		String dbt3="26/10/1999";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d1=null;
		Date d2=null;
		Date d3=null;

		try {
			d1 = sdf.parse(dbt1);
			d2 = sdf.parse(dbt2);
			d3 = sdf.parse(dbt3);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		arr[0]= new Friend (1,"sid","pune","123545",d1);
		arr[1]= new Friend (2,"sandya","mumbai","545664",d2);
		arr[2]= new Friend (3,"sumedh","dhule","12354545",d3);
		cnt=3;
	}

	public static void insertData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter mob");
		String mob=sc.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter date");
		String dbt=sc.next();
		Date d1=null;
		try
		{
			d1=sdf.parse(dbt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		arr[cnt]=new Friend (id,name,city,mob,d1);
		cnt++;
		
	}

	public static void display() {
		for(int i=0;i<cnt;i++)
		{
			System.out.println(arr[i]);
			System.out.println();
		}
		
	}

	public static String searchByName(String name) {
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getFname().equals(name))
			{
				return arr[i].getMob();
			}
		}
		return null;
		
	}

	public static Friend searchByCity(String city) {
		for(int i=0;i<cnt;i++)
		{
			if(arr[i].getCity().equals(city))
			{
				return arr[i];
			}
		}
		return null;
	}
	
}
