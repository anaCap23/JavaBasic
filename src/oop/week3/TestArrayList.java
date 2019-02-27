package oop.week3;
import oop.week1.studyproccess.Student;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Integer i1 = (23);


        // autoboxing,-->
        Integer i2 = 23;

        // unboxing -->
        int res  = i1 + 78; // i1.. int.Value() + 78;

        Object[] mas = {23,new Student[2], "something"};

        int el1 = (int) mas[1];// Generic


        //              mas                  AL(list);
        //insert       mas[0]               list.add(23);
        //remove       mas[0] = null        list.remove;
        //get          int get = mas[0]     list.get();
        //length       mas.length           list.size();

        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();


    }
}
