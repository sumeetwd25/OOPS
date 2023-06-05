
public class Exam {
	private int eno;
	private String ename;
	private int dur;
	private int mks;
	private Question question[];
	
	public Exam() {
		eno=0;
		ename=null;
		dur=0;
		mks=0;
		question = new Question[3];
	}
	
	public Exam(int eno, String ename, int dur, int mks, Question[] question) {	
		this.eno = eno;
		this.ename = ename;
		this.dur = dur;
		this.mks = mks;
		this.question = question;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDur() {
		return dur;
	}

	public void setDur(int dur) {
		this.dur = dur;
	}

	public int getMks() {
		return mks;
	}

	public void setMks(int mks) {
		this.mks = mks;
	}

	public Question[] getQuestion() {
		return question;
	}

	public void setQuestion(Question[] question) {
		this.question = question;
	}
	
	public String toString() {
		String str="";
		for(int i=0;i<question.length;i++) {
			str += question[i]+"\n";
		}
		return "Exam number: "+eno+"\nExam name: "+ename+"\nExam duration: "+dur+"\nTotal marks: "+mks+"\n\nQuestions:\n\n"+str;
	}
}
