import java.util.Scanner;

public class TeamService {
	public static Team[] tlist;
	public static int cnt;
	static {
		tlist = new Team[10];
		cnt = 0;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void displayTeams() {
		for(int i=0; i<cnt;i++) {
				System.out.println(tlist[i]);
		}
	}
	
	public static void addNewTeam() {
		System.out.print("\nEnter team id: ");
		int tid = sc.nextInt();
		System.out.print("Enter team name: ");
		String tnm = sc.next();
		System.out.print("Enter captain id: ");
		int cid = sc.nextInt();
		System.out.print("Enter captain name: ");
		String cname = sc.next();
		System.out.print("Enter captain skill: ");
		String cskill = sc.next();
		
		Player cap = new Player(cid,cname,cskill);
		Player[] arr = new Player[3];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter player id: ");
			int pid = sc.nextInt();
			System.out.print("Enter player name: ");
			String pname = sc.next();
			System.out.print("Enter player skill: ");
			String pskill = sc.next();
			arr[i] = new Player(pid,pname,pskill);
		}
		
		tlist[cnt] = new Team(tid,tnm,cap,arr);
		cnt++;
	}
	
	public static void searchByCaptain() {
		System.out.print("\nEnter captain name: ");
		String cap = sc.next();
		for(int i=0;i<cnt;i++)
			if(tlist[i].getCapt().getPname().equals(cap)) {
				System.out.println(tlist[i]);
		}
	}
	
	public static void searchBySkill() {
		System.out.println("\nEnter skill: ");
		String skl = sc.next();
		for(int i=0;i<cnt;i++)
			for(int j=0;j<tlist[i].getPlist().length;j++) {
				if(tlist[i].getPlist()[j].getSkill().equals(skl)) {
					System.out.println(tlist[i].getPlist()[j].getPname());
				}
			}		
	}
}
