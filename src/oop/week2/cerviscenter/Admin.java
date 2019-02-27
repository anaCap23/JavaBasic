package oop.week2.cerviscenter;

import java.util.Arrays;

public class Admin extends Worker {
    private Technic[] technics;
    private Technic[] repairedTechnics;
    private Client[] clients;
    private Director director;
    private RepairMaster repairMaster;
    private int freePlaceTechnic = 0;
    private int freePlaceClient = 0;
    private int freePlaceRepairedTechnic = 0;

    public Admin(String name, double salary, Technic[] technics, Client[] clients,
                 RepairMaster repairMaster, Technic[] repairedTechnics, Director director) {
        super(name, salary);
        this.technics = technics;
        this.clients = clients;
        this.repairMaster = repairMaster;
        this.repairedTechnics = repairedTechnics;
        this.director = director;
    }

    public void recieveTechFromClient(Client client, Technic technic) {
        clients[freePlaceClient++] = client;
        technics[freePlaceTechnic++] = technic;
        director.processOrder(technic);
        System.out.println("Technics has been recieved. The prise will be " + (technic.getpriceOfTech() / 10));
    }

    public void giveToRepair() {
        repairMaster.recieveTechnic(technics);
        technics = new Technic[100];
        System.out.println("Technics on repair!");
    }

    public void recieveFromRepair(int id) {
        Technic technic = repairMaster.giveTechnic(id);
        repairedTechnics[freePlaceRepairedTechnic++] = technic;
    }

    public Technic giveThechToClient(int id) {
        for (int i = 0; i < freePlaceRepairedTechnic; i++) {
            if (repairedTechnics[i].getId() == id) {
                Technic technic = technics[i];
                repairedTechnics[i] = repairedTechnics[freePlaceRepairedTechnic - 1];
                repairedTechnics[--freePlaceRepairedTechnic] = null;
                return technic;
            }
        }
        System.out.println("client got the technic!");
        return null;
    }

    public void clientsList() {
        System.out.println(Arrays.toString(clients));
    }

//    public void showReport(){
//        System.out.println("enter a date, you want report from: ");
//        startDate = sc.nextInt();
//    }

    public Technic[] getTechnics() {
        return technics;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setTechnics(Technic[] technics) {
        this.technics = technics;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
