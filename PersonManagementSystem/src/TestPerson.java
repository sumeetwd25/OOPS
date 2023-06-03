import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
//		PersonService.displayPerson();
//		PersonService.addPerson();
//		PersonService.searchById();
//		PersonService.searchByMonth();
//		PersonService.searchByName();
		
		Person obj = new Person(462,"Ash Ketchum","1029384756",new Date());
		System.out.println(obj);
		
		Person obj2 = new Person();
		obj2.setPid(908);
		obj2.setPname("Tony Stark");
		obj2.setPmob("5647382910");
		obj2.setBdate(new Date());
		System.out.println(obj2);
	}

}
