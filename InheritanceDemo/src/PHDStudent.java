
public class PHDStudent extends Student{
	private String thesis;
	private int sp_sub_mk;
	
	public PHDStudent() {
		System.out.println("in phdstudent default constructor");
	}
	
	public PHDStudent(String type, String pname, String mobile, int m1, int m2, int m3, String thesis, int sp_sub_mk) {
		super(type,pname,mobile,m1,m2,m3);
		this.thesis = thesis;
		this.sp_sub_mk = sp_sub_mk;
		System.out.println("in phdstudent parameterized constructor");
	}

	@Override
	public String toString() {
		return super.toString()+" PHDStudent [thesis=" + thesis + ", sp_sub_mk=" + sp_sub_mk + "]";
	}
	
}
