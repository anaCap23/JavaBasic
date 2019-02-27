package oop.uni;

public class Group {

    private int freePlace = 0;
    private String groupName;
    private Student[] students = new Student[24];

    public Group(String groupName){this.groupName = groupName;}

    public void addStudent(Student greenStudent){
        students[freePlace++] = greenStudent;
    }

    public Student deleteLastStudent(){
        students[--freePlace] = null;
        return null;
    }
}
