package oop.week1.studyproccess;

public class Student {

    private String name;
    private String address;
    private int age;
    private Subject[] subjects;
    private int freePlace = 0;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.subjects = new Subject[1000];
    }

    public void toStudy(int hoursToStudy) {
        for (int i = 0; i < freePlace; i++) {
            subjects[i].setDoneHours(subjects[i].getDoneHours() + hoursToStudy);
        }
    }

    public void addSubject(Subject subject) {
        subjects[freePlace++] = subject;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {return age;}
}
