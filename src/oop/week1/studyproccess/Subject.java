package oop.week1.studyproccess;

public class Subject {

        private String name;
        private int hoursInSemester;
        private int doneHours;

        public Subject(String name, int hoursInSemester, int doneHours) {
                this.name = name;
                this.hoursInSemester = hoursInSemester;
                this.doneHours = doneHours;

        }

        public void toPass() {
                int mark = getMark();
                if (mark >= 5) {
                        System.out.println("Passed!");
                } else {
                        System.out.println("Fail!");
                }
        }

        public void showInfo() {
                System.out.println("Subject name - " + name + ";" + " hours in semester - "
                        + hoursInSemester + ";" + " studying hours - " + doneHours + ";");
        }

        public int getMark(){
                if (doneHours > hoursInSemester){
                        return 5;
                } else if (doneHours == hoursInSemester){
                        return 4;
                } else {
                        return 0;
                }
        }

        public String getName() {
                return name;
        }

        public int getHoursInSemester() {
                return hoursInSemester;
        }

        public int getDoneHours() {
                return doneHours;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setDoneHours(int doneHours) {
                this.doneHours = doneHours;
        }
}





