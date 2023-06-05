
public class Player {
	private int pid;
	private String pname;
	private String skill;

	public Player() {
		pid = 0;
		pname = null;
		skill = null;
	}

	public Player(int pid, String pname, String skill) {
		this.pid = pid;
		this.pname = pname;
		this.skill = skill;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String toString() {
		return "Id: "+pid+" Name: "+pname+" Skill: "+skill;
	}
}
