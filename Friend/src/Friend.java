import java.util.Date;
import java.text.SimpleDateFormat;
public class Friend {

	
	int fid;
	String fname;
	String city;
	String mob;
	Date dbt;
	
	public Friend()
	{
		this(0,null,null,null,null);
	}
	public Friend(int fid, String fname, String city, String mob, Date dbt) {
		
		this.fid = fid;
		this.fname = fname;
		this.city = city;
		this.mob = mob;
		this.dbt = dbt;
	}
	
	

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Date getDbt() {
		return dbt;
	}

	public void setDbt(Date dbt) {
		this.dbt = dbt;
	}
	
	public String toString() {
		SimpleDateFormat sdb=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdb.format(this.dbt);
		return "Friend fid=" + fid + "\nfname=" + fname + "\ncity=" + city + "\nmob=" + mob + "\ndbt=" + date ;
	}

	
}
