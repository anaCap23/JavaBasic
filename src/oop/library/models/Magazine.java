package oop.library.models;

import java.time.LocalDate;

public class Magazine extends Edition {
    private LocalDate dateOfEdit;
    private String serialNumber;

    public Magazine(String year, String author, String path, String name, LocalDate dateOfEdit, String serialNumber) {
        super(year, author, path, name);
        this.dateOfEdit = dateOfEdit;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "[Magazine]" + " - "  + getYear() + " - " + getAuthor() + " - " + getPath() + " - " + getName()
                + " - " + getDatoOfEdit() + " - " + getSerialNumber();
    }

    public LocalDate getDatoOfEdit() {
        return dateOfEdit;
    }

    public void setDatoOfEdit(LocalDate datoOfEdit) {
        this.dateOfEdit = datoOfEdit;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}