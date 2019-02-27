package oop.week2.cerviscenter;

import java.util.Date;

public class Technic {
    private long id;
    private Date timestamp;
    private String condition;
    private double priceOfTech;

    public Technic(long id, Date timestamp, String condition, double priceOfTech) {
        this.id = id;
        this.timestamp = timestamp;
        this.condition = condition;
        this.priceOfTech = priceOfTech;
    }

    public void showInfo(long id, String condition, double priceOfTech, Date timestamp) {
        System.out.format("id: %d , condition %s , price: %f, date: %s", id, condition, priceOfTech, timestamp);
    }

    public long getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getCondition() {
        return condition;
    }

    public double getpriceOfTech() {
        return priceOfTech;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setpriceOfTech(double priceOfTech) {
        this.priceOfTech = priceOfTech;
    }
}
