import java.util.Date;
import java.text.SimpleDateFormat;

public class Person {
	private int pid;
	private String pname;
	private String pmob;
	private Date bdate;
	
	public Person() {
		pid=0;
		pname=null;
		pmob=null;
		bdate=null;
	}
	
	public Person(int pid, String pname, String pmob, Date bdate) {
		this.pid=pid;
		this.pname=pname;
		this.pmob=pmob;
		this.bdate=bdate;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid=pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public void setPname(String pname) {
		this.pname=pname;
	}
	
	public String getPmob() {
		return pmob;
	}
	
	public void setPmob(String pmob) {
		this.pmob=pmob;
	}
	
	public Date getBdate() {
		return bdate;
	}
	
	public void setBdate(Date bdate) {
		this.bdate=bdate;
	}
	
	public String toString() {
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		String dt = sdt.format(this.bdate);
		return "\nId: "+this.pid+"\nName: "+pname+"\nMobile no: "+this.pmob+"\nBirthdate: "+dt;
	}
}
