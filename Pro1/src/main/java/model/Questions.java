package model;

public class Questions {
	public String ques;
	public String optA;
	public String optB;
	public String optC;
	public String optD;
	public String ans;
	
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getOptA() {
		return optA;
	}
	public void setOptA(String optA) {
		this.optA = optA;
	}
	public String getOptB() {
		return optB;
	}
	public void setOptB(String optB) {
		this.optB = optB;
	}
	public String getOptC() {
		return optC;
	}
	public void setOptC(String optC) {
		this.optC = optC;
	}
	public String getOptD() {
		return optD;
	}
	public void setOptD(String optD) {
		this.optD = optD;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Quiz [ques=" + ques + ", optA=" + optA + ", optB=" + optB + ", optC=" + optC + ", optD=" + optD
				+ ", ans=" + ans + "]";
	}
}
