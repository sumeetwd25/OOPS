
public class Question {
	private int qno;
	private String que;
	private String opt[];
	private String ans;
	private int mks;
	public Question(int qno, String que, String[] opt, String ans, int mks) {
		this.qno = qno;
		this.que = que;
		this.opt = opt;
		this.ans = ans;
		this.mks = mks;
	}
	
	public int getQno() {
		return qno;
	}
	
	public void setQno(int qno) {
		this.qno = qno;
	}
	
	public String getQue() {
		return que;
	}
	
	public void setQue(String que) {
		this.que = que;
	}
	
	public String[] getOpt() {
		return opt;
	}
	public void setOpt(String[] opt) {
		this.opt = opt;
	}
	
	public String getAns() {
		return ans;
	}
	
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	public int getMks() {
		return mks;
	}
	
	public void setMks(int mks) {
		this.mks = mks;
	}
	
	public String toString() {
		String str="";
		for(int i=0;i<opt.length;i++) {
			str += (i + 1) + ") " + opt[i] + "\t";
		}
		
		return "Que "+qno+". "+que+"\nOptions: "+str+"\nAnswer: "+ans+"\nMarks: "+mks+"\n";
	}
}
