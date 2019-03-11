package oop.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Link {

    private Object data;
    private String desc;

    private List<Link> children;

    public Link (Object data, String desc){
        this.data = data;
        this.desc = desc;
        this.children = new ArrayList<>();
    }

    public Link(Object data, String desc, Link...children){
        this.data = data;
        this.desc = desc;
        this.children = Arrays.asList(children);
    }

    public void addChild(Link child){
        children.add(child);
    }

    public void setChildren(List<Link> children){
        this.children = children;
    }

    public Object getData() {
        return data;
    }

    public String getDesc() {
        return desc;
    }

    public List<Link> getChildren() {
        return children;
    }

    public void addAll(Link...links) {
        Link[] mas = links;
        for (Lin link : mas) {
            children.add(link);
        }
    }

}
