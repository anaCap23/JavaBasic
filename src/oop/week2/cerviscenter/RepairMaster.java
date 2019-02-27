package oop.week2.cerviscenter;

public class RepairMaster extends Worker {
    private Technic[] technicArray;
    private int freePlace = 0;

    public RepairMaster(String name, double salary, Technic[] technicArray) {
        super(name, salary);
        this.technicArray = technicArray;
    }

    public void toRepair(Technic[] technics) {
        for (int i = 0; i < freePlace; i++) {
            technics[i].setCondition("fixed");
        }
        System.out.println("all technics are fixed!");
    }

    public void recieveTechnic(Technic[] technics) {
        for (Technic technic: technics) {
            technicArray[freePlace++] = technic;

        }
    }

    public Technic giveTechnic(int id) {
        for (int i = 0; i < freePlace; i++) {
            if (technicArray[i].getId() == id) {
                Technic technic = technicArray[i];
                technicArray[i] = technicArray[freePlace - 1];
                technicArray[--freePlace] = null;
                return technic;
            }
        }
        return null;
        //find by id, delete from technicArray and return to admin
    }

    public Technic[] getTechnicArray() {
        return technicArray;
    }

    public void setFreePlace(int freePlace) {
        this.freePlace = freePlace;
    }

    public void setTechnicArray(Technic[] technicArray) {
        this.technicArray = technicArray;
    }
}
