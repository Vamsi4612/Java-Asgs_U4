package com.masai;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;
	
	@Override
	double getPercentage() {
		int total = (historyMarks+civicsMarks);
		float p = total*100/200;
		return p;
	}

	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	
	
	
}
