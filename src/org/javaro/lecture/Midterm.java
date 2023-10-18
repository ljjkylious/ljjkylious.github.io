package org.javaro.lecture;

public class Midterm {
	public static void main(String[] args) {
        Student stud1 = new Student("201901", "홍길동", 3);

        stud1.exam[0].setSubject("자바");
        stud1.exam[1].setSubject("C");
        stud1.exam[2].setSubject("C++");
        stud1.exam[0].setScore(88);
        stud1.exam[1].setScore(91);
        stud1.exam[2].setScore(92);
        stud1.printGPA();
    }
}
