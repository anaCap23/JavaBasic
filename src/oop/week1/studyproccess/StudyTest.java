package oop.week1.studyproccess;

public class StudyTest {
    public static void main(String[] args) {


        Student student1 = new Student("Jack", "UK");
        Student student2 = new Student("Dan", "IT");

        Subject subject1 = new Subject("math", 10, 10);
        Subject subject2 = new Subject("phis", 10, 20);
        Subject subject3 = new Subject("med", 100,500);

        subject1.showInfo();
        System.out.println(subject1.getMark());
        System.out.println(subject1.getDoneHours());
        subject1.toPass();
        student1.addSubject(subject1);
        student1.toStudy(2);

    }
}
