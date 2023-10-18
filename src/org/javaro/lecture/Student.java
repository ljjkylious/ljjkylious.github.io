package org.javaro.lecture;
public class Student {
	String studNo, name;
	int totSubject;
	Exam [] exam;
	public Student(String studNo, String name, int totSubject)
	{
		this.studNo = studNo;
		this.name = name;
		this.totSubject = totSubject;
		exam = new Exam[totSubject];
		for(int i=0;i<exam.length;i++) {
			exam[i] = new Exam();
		}
	}
	public void setStudNo(String studNo) {
		this.studNo=studNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getGPA() {
		int sum=0;
		for(int i=0;i<exam.length;i++)
			sum=sum + this.exam[i].getScore();
		return sum;
	}
	public void printGPA() {
		for(int i=0;i<exam.length;i++) {
			System.out.println("과목명:"+this.exam[i].getSubject()+",점수="+this.exam[i].getScore());
		}
		System.out.println("과목합계="+this.getGPA());
	}
}