package oop.week2.cerviscenter;

import java.util.Arrays;

public class Director {
    private String location;
    private int profit;
    private int tax;
    private Worker[] workers;
    private int freePlaceWorker = 0;
    private int workersSalary;

    public Director(String location, int profit, int tax, Worker[] workers) {
        this.location = location;
        this.profit = profit;
        this.tax = tax;
        this.workers = workers;
    }


    public void changeLocation(String location) {
        this.location = location;
    }

    public void hireWorker(Worker worker) {
        workers[freePlaceWorker++] = worker;
    }

    public void fireWorker() {
        workers[--freePlaceWorker] = null;
    }

    public void showAllWorkers() {
        System.out.println(Arrays.toString(workers));
    }

    public void processOrder(Technic technic) {
        profit += ((int) (technic.getpriceOfTech() / 10));
        if (profit <= 1000 && profit >= 0) {
            tax = (profit / 10);
        } else if (profit > 1000) {
            tax = (profit / 15);
        }
    }

    public void paySalary() {
        double totalSalary = 0;
        for (int i = 0; i < freePlaceWorker; i++) {
            totalSalary += workers[i].getSalary();
        }

        if (totalSalary <= profit) {
            profit -= totalSalary;
            System.out.println("Total paid - " + totalSalary);
        } else {
            System.out.println("Not enough money to pay salaries.");
        }
    }

//    public void report() {
//        profit, cleanProfit;
//    }

    public void increaseSalary() { //+10%
        for (int i = 0; i < freePlaceWorker; i++) {
            workers[i].setSalary(workers[i].getSalary() * 1.1);
        }
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
