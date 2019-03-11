package oop.week4;

import java.util.List;

public class TreeOperationImpl implements TreeOperations {

    @Override
    public Integer getAmaunt(Link link) {
        if (link == null){
            return null;
        }

        List<Link> children = link.getChildren();
        if (link.getChildren() == null || children.isEmpty()) {
            return (Integer) link.getData();
        }

        return null;
    }
}
