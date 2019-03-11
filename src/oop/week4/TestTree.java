package oop.week4;


import java.sql.Array;
import java.util.Arrays;

public class TestTree {
    public static void main(String[] args) {

        Link emp1 = new Link(1, "eml1");
        Link emp2 = new Link(1, "eml2");
        Link emp3 = new Link(1, "eml3");
        Link emp4 = new Link(1, "eml4");
        Link emp5 = new Link(1, "eml5");
        Link emp6 = new Link(1, "eml6");

        Link manager1 = new Link(2, "mng1");
        manager1.addChild(emp1);
        manager1.addChild(emp2);

        Link manager2 = new Link(2, "mng2");
        manager2.setChildren(Arrays.asList(emp3, emp4));

        Link manager3 = new Link(2, "mng3", emp5, emp6);

        Link manager4 = new Link(2, "mng4");

        Link dir1 = new Link(4, "dir1", manager1, manager2,manager3, manager4);

    }}