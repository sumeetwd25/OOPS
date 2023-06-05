
public class Team {
	private int tid;
	private String tname;
	private Player capt;
	private Player[] plist;
	
	public Team() {
		tid = 0;
		tname = null;
		capt = null;
		plist = null;
	}
	
	public Team(int tid, String tname, Player capt, Player[] plist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.capt = capt;
		this.plist = plist;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player getCapt() {
		return capt;
	}
	public void setCapt(Player capt) {
		this.capt = capt;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	
	public String toString() {
		String str="";
		for(int i=0;i<plist.length;i++) {
			str+=plist[i].toString()+"\n";
		}
		
		return "\nTeam Id: "+tid+" Team Name: "+tname+"\nCaptain"+capt+"\nPlayer List: \n"+str;
	}
}
