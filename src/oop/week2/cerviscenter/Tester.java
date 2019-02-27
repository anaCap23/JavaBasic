package oop.week2.cerviscenter;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // todo create 5 Techins
        // todo create 2 Clients
        // todo create 1 Repair master
        // todo create 1 Admin

        Director director = new Director("NY", 0, 0, new Worker[50]);
        RepairMaster repaire = new RepairMaster("dough", 2000, new Technic[100]);
        Technic technic1 = new Technic(1234, new Date(), "broken", 1000);
        Technic technic2 = new Technic(345, new Date(), "broken", 200);
        Client client1 = new Client("harry", new Technic[1]);
        Client client2 = new Client("rose", new Technic[3]);
        Admin admin = new Admin("mike", 2000, new Technic[100], new Client[50],
                repaire, new Technic[5], director);


        System.out.println("Choose your role");
        System.out.println("1. Director");
        System.out.println("2. Admin");
        System.out.println("3. Client");
        System.out.println("4. Repair master");
        System.out.println("0. Exit");

        int chosen = sc.nextInt();

        while (chosen != 0) {
            if (chosen == 1) {
                System.out.println("You are director. Your options:");
                System.out.println("1. Change location");
                System.out.println("2. HireWorker");
                System.out.println("3. FireWorker");
                System.out.println("4. ShowAllWorkers");
                System.out.println("5. ProcessOrder");
                System.out.println("6. PaySalary");
                System.out.println("7. IncreaseSalary");
                System.out.println("0. Exit");


                int directorDesicion = sc.nextInt();

                if (directorDesicion == 1) {

                    System.out.println("Please, enter new location:");
                    String newLocation = sc.nextLine();
                    director.changeLocation(newLocation);
                    System.out.println("Location has been changed.");

                } else if (directorDesicion == 2) {
                    System.out.println("you want to hire worker");
                    director.hireWorker(new Worker("Jo", 2000));
                    System.out.println("one newey!");

                } else if (directorDesicion == 3) {
                    director.fireWorker();
                    System.out.println("worker has been fired!");

                } else if (directorDesicion == 4) {
                    System.out.println("Workers report: ");
                    director.showAllWorkers();

                } else if (directorDesicion == 5) {
                    director.processOrder(technic1);
                    System.out.println("you count your profit, and payed taxes");

                } else if (directorDesicion == 6) {
                    director.paySalary();

                } else if (directorDesicion == 7) {
                    director.increaseSalary();
                    System.out.println("You are good chif! your workers have +10% salary!");

                } else if (directorDesicion == 0) {
                    break;

                } else {
                    System.out.println("no such an option!");
                }

            } else if (chosen == 2) {
                System.out.println("You are Admin. your options:");
                System.out.println("1. Show all Clients");
                System.out.println("2. Take Tech for repair");
                System.out.println("3. Give technic to repair");
                System.out.println("4. Give repaired technic to the Client");
                System.out.println("0. Exit");

                int adminsDesicion = sc.nextInt();

                if (adminsDesicion == 1) {
                    admin.clientsList();

                } else if (adminsDesicion == 2) {
                    admin.recieveTechFromClient(client1, technic1);

                } else if (adminsDesicion == 3) {
                    admin.giveToRepair();

                } else if (adminsDesicion == 4) {
                    admin.giveThechToClient(3456);//<--todo id

                } else if (adminsDesicion == 0){
                    break;

                } else {
                    System.out.println("try again!");
                }

            } else if (chosen == 3) {
                System.out.println("You are Client. You have such an options");
                System.out.println("1. Give technics to repair");
                System.out.println("2. Take tachnic by ID");
                System.out.println("0. Exit");

                int clientsDesicion = sc.nextInt();

                if (clientsDesicion == 1) {
                    client1.giveTechnicToAdmin(admin);

                } else if (clientsDesicion == 2) {
                    client1.recieveByIdFromAdmin(1234, admin);
                } else if (clientsDesicion == 0 ) {
                    break;
                } else {
                    System.out.println("Try again!");
                }
            } else if (chosen == 4) {
                System.out.println("You are Repair Master. here's your options:");
                System.out.println("1. Repair");
                System.out.println("2. Give repaired technics to Admin");
                System.out.println("0. Exit");

                int repairMasterDesicion = sc.nextInt();

                if (repairMasterDesicion == 1) {
                    repaire.toRepair(new Technic[10]);
                    System.out.println("all technics are ok!");

                } else if (repairMasterDesicion == 2) {
                    repaire.giveTechnic(3456);
                } else if (repairMasterDesicion == 0) {
                    break;
                } else {
                    System.out.println("Try again!");
                }

            } else {
                System.out.println("Error! Try onr more time!");
            }
        }
    }
}

