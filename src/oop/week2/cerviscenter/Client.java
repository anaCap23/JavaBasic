package oop.week2.cerviscenter;


public class Client {
    private String name;
    private Technic[] technics;
    private int freePlace = 0;

    public Client(String name, Technic[] technics) {
        this.technics = technics;
        this.name = name;
    }

    public void giveTechnicToAdmin(Admin admin) {
        if (freePlace > 0) {
            admin.recieveTechFromClient(this, technics[freePlace - 1]);
            technics[--freePlace] = null;
        } else {
            System.out.println("no broken technics found!");
        }
    }

    public void recieveByIdFromAdmin(int id, Admin admin) {
        Technic technic = admin.giveThechToClient(id);
        technics[freePlace++] = technic;
        System.out.println("thanx!");

    }

    public Technic[] getTechnics() {
        return technics;
    }

    public void setTechnics(Technic[] technics) {
        this.technics = technics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
