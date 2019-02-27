package oop.design_patterns;

class Host {

    private String ip;

    public Host(String desc) {
        this.ip = desc;
    }

    public String connect() {
        return "connection";
    }

}

