package oop.week1.contactlist;

public class Contact {

    private String name;
    private String number;
    private String operator;

    public Contact(String name, String number, String operator) {
        this.name = name;
        this.number = number;
        this.operator = operator;
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getOperator() {
        return operator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
