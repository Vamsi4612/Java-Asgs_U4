package com.masai;

public class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	double getPercentage() {
		int total = (phisicsMarks+chemistryMarks+mathsMarks);
		float p = total*100/300;
		return p;
	}

	public ScienceStudent(int phisicsMarks, int chemistryMarks, int mathsMarks) {
		super();
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
//		this.name = "";
//		this.address = "";
	}

	

}
