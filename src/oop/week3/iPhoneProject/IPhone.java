package oop.week3.iPhoneProject;

public class IPhone {

    private final String version;
    private final String id;
    private final Ram ram;
    private final Screen screen;

    public IPhone(String version, String id, Ram ram, Screen screen) {
        this.version = version;
        this.id = id;
        this.ram = ram;
        this.screen = screen;
    }

    public String getVersion() {
        return version;
    }

    public String getId() {
        return id;
    }

    public Ram getRam() {
        return ram;
    }

    public Screen getScreen() {
        return screen;
    }
}
