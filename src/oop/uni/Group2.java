package oop.uni;

import java.util.ArrayList;
import java.util.Arrays;

public class Group2 {

        private int freePlace = 0;
        private String groupName;
        private ArrayList<Student> students = new ArrayList<>();

        public Group2(String groupName){this.groupName = groupName;}

        public void addStudent(Student greenStudent){
            students.add(greenStudent);
        }

        public Student deleteLastStudent(){
            return students.remove(students.size() - 1);
        }

        public Student[] filterByName(String name){
         ArrayList<Student> res = new ArrayList<>();

         int curr = 0;
            for (int i = 0; i < freePlace; i++) {
                Student student = students.get(i);
                if(student.getName().equals(name)){
                    res.add(student);
                }
            }
            return res.toArray(new Student[res.size()]);

        }
        public Student[] sort(){
            Student[] forSort = toArray(students);
            Arrays.sort(forSort);
            return forSort;
        }

        private Student[] toArray(ArrayList<Student> al) {
            return al.toArray(new Student[al.size()]);
        }


    }