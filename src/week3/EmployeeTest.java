package week3;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.name = "worker1";
        emp1.salary = 1000;

        Employee emp2 = new Employee();
        emp2.name = "worker2";
        emp2.salary = 2000;

        Employee emp3 = new Employee();
        emp3.name = "worker3";
        emp3.salary = 3000;

        Employee[] empArr = new Employee[3];
        empArr[0] = emp1;
        empArr[1] = emp2;
        empArr[2] = emp3;

        int sum = 0;

        for(int i = 0; i < empArr.length; i++){
            sum += empArr[i].salary;

        }

        System.out.println("you must pay salary of " + sum);
    }
}
