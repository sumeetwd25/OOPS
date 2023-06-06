
public class Student extends Person {
     private int m1,m2,m3;
     public Student() {
    	 System.out.println("in student class default constructor");
     }
     
     public Student(String type,String pname,String mobile,int m1,int m2,int m3) {
    	 //to call Parent parametrized constructor 
    	 super(type,pname,mobile);
    	 System.out.println("in student class parametrized  constructor");
    	 this.m1=m1;
    	 this.m2=m2;
    	 this.m3=m3;
     }

     public String toString() {
    	 return super.toString()+" m1: "+m1+" m2: "+m2+" m3: "+m3;
     }
     
     public int calcGrade() {
 		return (m1+m2+m3)/3;
 	}
}
