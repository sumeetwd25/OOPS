
public class TestExam {
	public static void main(String[] args) {
		String op[] = {"aaa","bbb","ccc","ddd"};
		Question q1 = new Question(1,"xxxx",op,"1",2);
		Question q2 = new Question(2,"yyyy",op,"4",2);
		Question q3 = new Question(3,"zzzz",op,"2",2);

		Question q[] = {q1,q2,q3};
		Exam e = new Exam(1,"Mid-term",1,25,q);
		System.out.println(e);
		
//		System.out.println(e.getQuestion()[2].getQue());
//		System.out.println(e.getQuestion()[2].getAns());
	}
}
