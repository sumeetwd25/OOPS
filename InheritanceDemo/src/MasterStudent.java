
public class MasterStudent extends Student{
	int m4, m5, sp_course_mk;
	
	public MasterStudent() {
		System.out.println("in masterstudent default constructor");
	}

	public MasterStudent(String type, String pname, String mobile,int m1, int m2, int m3, int m4, int m5, int sp_course_mk) {
		super(type,pname,mobile, m1, m2, m3);
		this.m4 = m4;
		this.m5 = m5;
		this.sp_course_mk = sp_course_mk;
		System.out.println("in masterstudent pameterized constructor");
	}

	@Override
	public String toString() {
		return super.toString()+" MasterStudent [m4=" + m4 + ", m5=" + m5 + ", sp_course_mk=" + sp_course_mk + "]";
	}
	
}
